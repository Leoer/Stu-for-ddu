package chinesehandle.support;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import before_customization_2.details.ServicePlanBase;

public class FileUtil {

	public static final String NOT_TRANSLATED = "Not translated";
	
	public static final String NO_MS_DATE = "No ms.date";
	
	public static final String REDIRECTED = "Redirected";
	
	public static final String DELETED = ServicePlanBase.DELETED;
	
	public static synchronized Map<String, String> getFileMap(Map<String, String> updateFileMap, Map<String, String> redirectedFileMap) {
		String excelPath = ServiceBase.getProperties().getProperty("file_list_path");
		
		Map<String, String> fileMap = new HashMap<String, String>();
		
		try {

			FileInputStream excelFile = new FileInputStream(new File(excelPath));
			XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			int rowCount = 0;
			while (rowIterator.hasNext()) {
				Row currentRow = rowIterator.next();

				String col1 = "";
				String col2 = "";
				
				if(currentRow.getCell(0) != null) {
				    col1 = currentRow.getCell(0).getStringCellValue().trim().replace("\\", "/");
				}
				
				if(currentRow.getCell(1) != null) {
					col2 = currentRow.getCell(1).getStringCellValue().trim().replace("\\", "/"); 
				}
				
				if(!col1.equals("")) {
					if(rowCount != 0) {
						if(col2.contains(REDIRECTED) || col2.contains(DELETED)) {
							redirectedFileMap.put(col1, col2);
						} else {
							updateFileMap.put(col1, col2);
						}
					}
				} else {
					break;
				}
				
				rowCount++;
			}

			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fileMap;
	}
	
	public static synchronized void writeMsDateInfoToExcel(List<String> msDateInfoList) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("ms.date");
		
		CellStyle style = workbook.createCellStyle();
	    style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    
	    CellStyle style2 = workbook.createCellStyle();
	    style2.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());
	    style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
	    boolean isCommentAllVoid = true;
	    int not_translated_count = 0;
	    int size = msDateInfoList.size();
		for(int i=0; i<size; i++) {
			String msDateInfo = msDateInfoList.get(i);
			
			String[] msDateInfoArr = msDateInfo.split(",");
			
			String fileName = msDateInfoArr[0];
			String msDate = msDateInfoArr[1];
			String comment = msDateInfoArr[2];
			
			if(!comment.trim().equals("")) {
				isCommentAllVoid = false;
			}
			
			Row row = sheet.createRow(i);
			Cell cell_0 = row.createCell(0);
			cell_0.setCellValue(fileName); 
			
			if(FileUtil.NOT_TRANSLATED.equals(comment)) {
				not_translated_count++;
				cell_0.setCellStyle(style);
			}
			
			Cell cell_1 = row.createCell(1);
			cell_1.setCellValue(msDate); 
			
			if(FileUtil.NO_MS_DATE.equals(msDate)) {
				cell_1.setCellStyle(style2);
			}
			
			Cell cell_2 = row.createCell(2);
			cell_2.setCellValue(comment);
			
			if(FileUtil.NOT_TRANSLATED.equals(comment)) {
				cell_2.setCellStyle(style);
			}
		}
		
		//-----------------------------
		CellStyle style3 = workbook.createCellStyle();
		style3.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());
		style3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		Row row = sheet.createRow(size + 1);
		row.setHeight((short)800); 
		Cell cell_3 = row.createCell(3);
		cell_3.setCellValue("Not translated: " + not_translated_count); 
		cell_3.setCellStyle(style3); 
		//----------------------------
		
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(3);
		
		if(!isCommentAllVoid) {
			sheet.autoSizeColumn(2);
		}
		

		try {
			FileOutputStream outputStream = new FileOutputStream(new File(ServiceBase.getProperty("ms_date_file_path")));
			workbook.write(outputStream);
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <fileName, msDate(String)>
	 * 
	 * @return
	 */
	public static synchronized Map<String, String> getMsDateMap() {
		Set<String> fileList = ServiceBase.getUpdatedFileSet();
		
		String repoPath = ServiceBase.getProperty("zh_cn_repo_path");
		
		Map<String, String> map = new HashMap<String, String>();

		for (String fileName : fileList) {

			String fileAbsPath = "";
			if (fileName.startsWith("includes")) {
				fileAbsPath = repoPath + "/" + fileName;
			} else {
				fileAbsPath = repoPath + "/articles/" + fileName;
			}

			File file = new File(fileAbsPath);
			if (!file.exists()) {
				map.put(fileName, NOT_TRANSLATED);
			} else {
				BufferedReader reader = null;
				try {
					reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));

					String line = null;
					
					boolean foundMsDate = false;
					
					while ((line = reader.readLine()) != null) {
						if (line.contains("ms.date")) {
							foundMsDate = true;
							
							line = line.replace("ms.date:", "").trim();

							map.put(fileName, line);
							break;
						}
					}
					
					if(!foundMsDate) {
						map.put(fileName, NO_MS_DATE);
					}

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if(reader != null) {
						try {
							reader.close();
							reader = null;
						} catch (IOException e) {
						}
					}
				}
			}

		}
		return map;
	}
	
	
	public static synchronized void moveBackFiles(String fromPath, String moveToPath) {
		Set<String> fileList = ServiceBase.getUpdatedFileSet();

		for (String fileName : fileList) {
			fileName = fileName.replace("\\", "/");
			
			if (fileName.startsWith("includes")) {
				
				FileUtil.readAndMoveFile(new File(fromPath + "/" + fileName), new File(moveToPath + "/" + fileName));
				
			} else {

				File toPathFolder = new File(moveToPath + "/articles/" + fileName.substring(0, fileName.lastIndexOf("/")));
				toPathFolder.mkdirs();

				FileUtil.readAndMoveFile(new File(fromPath + "/" + fileName), new File(moveToPath + "/articles/" + fileName));
			}
		}

		System.out.println("Moving backup files is done...\n");
	}
	
	public static synchronized void deleteRedirectedFiles() {
		String repoPath = ServiceBase.getProperty("zh_cn_repo_path");
		
		for(String fileName: ServiceBase.getRedirectedFileSet()) {
			
			String fileAbsPath = "";
			if (fileName.startsWith("includes")) {
				fileAbsPath = repoPath + "/" + fileName;
			} else {
				fileAbsPath = repoPath + "/articles/" + fileName;
			}

			File file = new File(fileAbsPath);
			if(file.exists()) {
				file.delete();
			}
		}
		
	}
	
	public static synchronized void updateRedirectionJsonFile(String globalRedirectionFile, String enusRedirectionFile, Collection<String> redirectedFiles) { 
		List<RedirectedObject> globalRedirectionList = parseRedirectionJsonFile(globalRedirectionFile);
		
		List<RedirectedObject> newRedirectedList = new ArrayList<RedirectedObject>();
		
		for(String fileName: redirectedFiles) {
			if(!fileName.endsWith(".yml") && !fileName.startsWith("includes")) {
				// search final redirected url
				RedirectedObject redirectedObj = searchRedirectedObj("/articles/" + fileName, globalRedirectionList);
				
				if(redirectedObj != null) {
					redirectedObj.setSourcePath("articles/" + fileName);
					
					if(redirectedObj.getRedirectUrl().startsWith("/azure")) {
						redirectedObj.setRedirectUrl(redirectedObj.getRedirectUrl().substring(6));
					}
					
					newRedirectedList.add(redirectedObj);
				} else {
					System.err.println("Did not find redirection url for file: " + fileName);
				}
			}
		}
		
		if(newRedirectedList.size() > 0) {
			Collections.sort(newRedirectedList);
			
			// add final redirected url to zh-cn json file
			checkAndWriteJsonObj(enusRedirectionFile, newRedirectedList);
			
			System.out.println("Adding redirected files done...\n");
		}
		
	}
	
	public static synchronized void updateRedirectionJsonFile() {
		String globalRedirectionFile = ServiceBase.getProperty("global_repo_path") + "/.openpublishing.redirection.json";
		
		List<RedirectedObject> globalRedirectionList = parseRedirectionJsonFile(globalRedirectionFile);
		
		List<RedirectedObject> newRedirectedList = new ArrayList<RedirectedObject>();
		
		for(String fileName: ServiceBase.getRedirectedFileSet()) {
			if(!fileName.endsWith(".yml") && !fileName.startsWith("includes")) {
				// search final redirected url
				RedirectedObject redirectedObj = searchRedirectedObj("/articles/" + fileName, globalRedirectionList);
				
				if(redirectedObj != null) {
					redirectedObj.setSourcePath("articles/" + fileName);
					
					if(redirectedObj.getRedirectUrl().startsWith("/azure")) {
						redirectedObj.setRedirectUrl(redirectedObj.getRedirectUrl().substring(6));
					}
					
					newRedirectedList.add(redirectedObj);
				} else {
					System.err.println("Did not find redirection url for file: " + fileName);
				}
			}
		}
		
		if(newRedirectedList.size() > 0) {
			Collections.sort(newRedirectedList);
			
			String zhcnRedirectionFile = ServiceBase.getProperty("zh_cn_repo_path") + "/.openpublishing.redirection.json";
			
			// add final redirected url to zh-cn json file
			checkAndWriteJsonObj(zhcnRedirectionFile, newRedirectedList);
			
			System.out.println("Adding redirected files done...\n");
		}
	}
	
	private static synchronized RedirectedObject searchRedirectedObj(String fileName, List<RedirectedObject> globalRedirectionList) {
//		System.out.println(fileName);
		
		for(RedirectedObject rediObj: globalRedirectionList) {
//			if(rediObj.getSourcePath().contains("")) {
//				System.out.println(rediObj.getSourcePath());
//			}
			
			if(fileName.equalsIgnoreCase(rediObj.getSourcePath())) {

				String redirectUrl = rediObj.getRedirectUrl();
				
				if(redirectUrl.startsWith("http")) {
					return rediObj;
				} else {
					String newFileName = "/articles" + redirectUrl.replace("/azure", "") + ".md";
					
					RedirectedObject newRedirectionObj = searchRedirectedObj(newFileName, globalRedirectionList);
					
					if(newRedirectionObj == null) {
						return rediObj;
					} else {
						return newRedirectionObj;
					}
				}
			}
		}
		
		// no redirection object
		return null;
	}
	
	private static synchronized void checkAndWriteJsonObj(String redirectionFile, List<RedirectedObject> redirectionList) {
		List<RedirectedObject> zhcnRedirectionList = parseRedirectionJsonFile(redirectionFile);
		
		String appendRedirectionObj = "";
		
		for(RedirectedObject newObj: redirectionList) {
			boolean redirecitonObjExisted = false;
			
			for(RedirectedObject existingObj: zhcnRedirectionList) {
				if(newObj.getSourcePath().equalsIgnoreCase(existingObj.getSourcePath())) {
					redirecitonObjExisted = true;
				}
			}
		
			if(redirecitonObjExisted) {
				System.err.println("Redirection url already existed: " + newObj.getSourcePath());
				continue;
			} else {
				appendRedirectionObj = appendRedirectionObj + newObj.toString();
			}
		}
		
		appendNewToRedirectionJsonFile(appendRedirectionObj, redirectionFile);
	}
	
	
	private static synchronized List<RedirectedObject> parseRedirectionJsonFile(String fileName) {
		List<RedirectedObject> redirectedObjList = new ArrayList<RedirectedObject>();
		
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader(fileName));
			 
			JSONObject jsonObject =  (JSONObject) obj;
			
			JSONArray redirections = (JSONArray) jsonObject.get("redirections");
			
			for(Object redirection: redirections) {
				JSONObject subObj = (JSONObject)redirection;
				
				RedirectedObject rediObj = new RedirectedObject();
				rediObj.setSourcePath((String)subObj.get("source_path_from_root"));
				rediObj.setRedirectUrl((String)subObj.get("redirect_url"));
				rediObj.setRedirectDocumentId(String.valueOf(subObj.get("redirect_document_id"))); 
				
				redirectedObjList.add(rediObj);
	        }
		} catch (Exception e) {
			System.out.println("Error: " + fileName);
			e.printStackTrace();
		}
		
		return redirectedObjList;
	}
	
	public static synchronized void appendNewToRedirectionJsonFile(String appendText, String fileAbsolutePath){
		BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileAbsolutePath), "utf-8"));

            List<String> allContentList = new ArrayList<String>(16000);
            
            String line = null;
            while ((line = reader.readLine()) != null) {
            	if(!line.trim().equals("")) {
            		allContentList.add(line + "\r\n");
            	}
            }

            String strContent = "";
            // size-3 to remove last 3  ->   "}," and "]" and "}" 
            for(int i=0, size=allContentList.size(); i<size-3; i++) {
            	strContent += allContentList.get(i); 
            }
            
            strContent += appendText;
            strContent += "    }\r\n";
            strContent += "  ]\r\n";
            strContent += "}";
            
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAbsolutePath), "utf-8"));
            writer.write(strContent);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                    writer = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (reader != null) {
                    reader.close();
                    reader = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
	
	public static synchronized void readAndMoveFiles(String fromPath, String moveToPath) {
		Set<String> fileList = ServiceBase.getUpdatedFileSet();

		for (String fileName : fileList) {
			fileName = fileName.replace("\\", "/");
			
			if (fileName.startsWith("includes")) {
				
				File toPathFolder = new File(moveToPath + "/" + fileName.substring(0, fileName.lastIndexOf("/"))); 
				toPathFolder.mkdirs();

				FileUtil.readAndMoveFile(new File(fromPath + "/" + fileName), new File(moveToPath + "/" + fileName));
				
			} else {

				File toPathFolder = new File(moveToPath + "/" + fileName.substring(0, fileName.lastIndexOf("/")));
				toPathFolder.mkdirs();

				FileUtil.readAndMoveFile(new File(fromPath + "/articles/" + fileName), new File(moveToPath + "/" + fileName));
			}
		}

		System.out.println("Copying files to " + moveToPath + " is done...\n");
	}
	
	public static synchronized void readAndMoveFile(File fromFile, File toFile) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        if(fromFile.exists() == false) {
        	System.err.println("Exception --> " + fromFile.getAbsolutePath() + ": File not exists.");
        	return;
        }
        
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fromFile), "utf-8"));

            String allContent = "";
            String line = null;

            while ((line = reader.readLine()) != null) {
            	
            	// 10/21/2020, replace \*\*\*\* from translated articles
            	for(String[] replacementWords: ServiceBase.ReplacementList) {
            		String repalceFrom = replacementWords[0];
            		String repalceTo = replacementWords[1];
            		
            		line = line.replace(repalceFrom, repalceTo);
            	}
            	
                allContent = allContent + line + "\r\n";
            }

            if(!toFile.exists()) {
            	toFile.getParentFile().mkdirs();
            }

            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(toFile), "utf-8"));
            writer.write(allContent);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                    writer = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (reader != null) {
                    reader.close();
                    reader = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	public static synchronized void writeToFile(String content, String fileAbsolutePath){
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAbsolutePath), "utf-8"));
			writer.write(content);
		} catch (Exception e) {
			
		} finally {
			if (writer != null) {
				try {
					writer.close();
					writer = null;
				} catch (IOException e) {
					
				}
			}
		}
	}
	
}
