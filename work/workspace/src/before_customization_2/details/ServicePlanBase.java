package before_customization_2.details;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle; 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import customization.support.ConfigureSupport2;

public class ServicePlanBase {

	public static String EXCLE_FILE_PATH;
	public static String GLOBAL_REPO_PATH;
	public static String GLOBAL_BACKUP_FOLDER;
	public static boolean IGNORE_METEDATA_CHANGE = false;
	
	public static final String DELETED = "Deleted";
	
	public static final String NEW = "New";
	
	public static final String CHANGED = "Changed";
	
	public static final String METEDATE_CHANGED = "Metedata Changed";
	
	public static final String Diff_COUNT = "Diff Count: ";
	
	public static int UPDATE_TYPE_UPDATE = 0;
	
	public static int UPDATE_TYPE_DELETE = 1;
	
	public static int UPDATE_TYPE_ADDED = 2;
	
	private String service;
	
	private List<FileStatus> changedFileList; 
	
	public ServicePlanBase(String service) {
		this.service = service;
		
		this.changedFileList = findChangedFilesList();
	}
	
	public List<FileStatus> getChangedFilesList() {
		return changedFileList;
	}
	
	public String getService() {
		return service;
	}
	
	public synchronized List<FileStatus> findChangedFilesList() {
		// get changed files: changed/deleted/added
		List<FileStatus> changedFileList = new ArrayList<FileStatus>(500);
		
		try {
			System.out.println("========================================================");
			System.out.println("Start to create customization plan -> " + service + ".");  
			
			// get local backup files
			List<String> backupFileList = getAllBackupFiles(service);
			
			System.out.println("Get all backup files done."); 
			
			// get global files
			List<String> globalFileList = getAllGlobalFiles(service);
			
			System.out.println("Get all global files done."); 
			
			for(String backupFile: backupFileList) {
				String globalFilePath = ServicePlanBase.GLOBAL_REPO_PATH + backupFile;
				String backupFilsPath = ServicePlanBase.GLOBAL_BACKUP_FOLDER + backupFile;
				
				File globalFile = new File(globalFilePath);
				if(globalFile.exists()) {
					// changed
					 String compareResult = ServicePlanBase.compare(backupFilsPath, globalFilePath);
					 
					 if(compareResult.equals(ServicePlanBase.METEDATE_CHANGED)) {
						if (!IGNORE_METEDATA_CHANGE) {
							FileStatus fileStatus = new FileStatus();
							fileStatus.setFilePath(backupFile);
							fileStatus.setFileStatus(ServicePlanBase.CHANGED);
							fileStatus.setFileComment(ServicePlanBase.METEDATE_CHANGED);

							changedFileList.add(fileStatus);
						}
					 } else if(compareResult.contains(ServicePlanBase.Diff_COUNT)) {
						 FileStatus fileStatus = new FileStatus();
						 fileStatus.setFilePath(backupFile); 
						 fileStatus.setFileStatus(ServicePlanBase.CHANGED);
						 fileStatus.setDiffCount(Integer.parseInt(compareResult.split(":")[1].trim())); 
						 
						 changedFileList.add(fileStatus);
					 }
				} else {
					 FileStatus fileStatus = new FileStatus();
					 fileStatus.setFilePath(backupFile);
					 fileStatus.setFileStatus(ServicePlanBase.DELETED);
					 
					 changedFileList.add(fileStatus);
				}
			}
			
			// added
			globalFileList.removeAll(backupFileList);
			
			for(String globalFile: globalFileList) {
				FileStatus fileStatus = new FileStatus();
				fileStatus.setFilePath(globalFile);
				fileStatus.setFileStatus(ServicePlanBase.NEW);
				 
				changedFileList.add(fileStatus);
			}
			
			System.out.println("Get changed list done."); 
			
			// remove useless files from changed list
			changedFileList = filterChangedList(ConfigureSupport2.getClassNameByService(service), changedFileList);
			
			Collections.sort(changedFileList);
			
			System.out.println("Filter changed list done."); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return changedFileList;
	}

	private synchronized static int compare_details(List<String> list_1, List<String> list_2) {
		int size_1=list_1.size();
		int size_2=list_2.size();
		
		int diffCount = 0;
		
		int index_1 = 0;
		int index_2 = 0;
		int update_type = -1;
		
		for(; index_1<size_1 && index_2<size_2; ) {
			// same line, same content
			if(list_1.get(index_1).equals(list_2.get(index_2))) {
				index_1++;
				index_2++;
				update_type = -1;
				continue;
			} else {
				int current_index_2 = index_2;
				
				for(; index_2<size_2; index_2++) {
					if(list_1.get(index_1).equals(list_2.get(index_2))) {
						update_type = UPDATE_TYPE_ADDED;
						break;
					}
				}  
				
				if(update_type == UPDATE_TYPE_ADDED) {
					diffCount++;
					index_1++;
					index_2++;
					update_type = -1;
				} else {
					index_2 = current_index_2;
					
					int current_index_1 = index_1;
					
					for(; index_1<size_1; index_1++) {
						if(list_1.get(index_1).equals(list_2.get(index_2))) {
							update_type = UPDATE_TYPE_DELETE;
 							break;
						}
					}
					
					if(update_type == UPDATE_TYPE_DELETE) {
						diffCount++;
						
						index_1++;
						index_2++;
						update_type = -1;
					} else {
						diffCount++;
						
						index_1 = current_index_1;
						// is update_type_change
						index_1++;
						index_2++;
						update_type = UPDATE_TYPE_UPDATE;
					}
				}
			}
		}
		
		// body_2 comes to the end, but body_1 doesn't
		if(index_1 < size_1 && index_2 == size_2) {
			diffCount++;
		// body_1 comes to the end, but body_2 doesn't
		} else if(index_1 == size_1 && index_2 < size_2) {
			diffCount++;
		}
		
		return diffCount;
	}
	
	public synchronized static String compare(String file_1, String file_2) {
		BufferedReader reader_1 = null;
		BufferedReader reader_2 = null;

        try {
        	reader_1 = new BufferedReader(new InputStreamReader(new FileInputStream(file_1), "utf-8"));
        	reader_2 = new BufferedReader(new InputStreamReader(new FileInputStream(file_2), "utf-8"));

        	//---------------------------------------------
            List<String> list_1 = new ArrayList<String>();
            List<String> list_1_metedata = new ArrayList<String>();
            List<String> list_1_body = new ArrayList<String>();
            
            String line = null;
            while ((line = reader_1.readLine()) != null) {
            	list_1.add(line);
            }
            
            int i = 1;
            int size = list_1.size();
            
            // metedata exist
            if(size>0 && list_1.get(0).trim().endsWith("---")) {
            	// set metedata list
            	list_1_metedata.add(list_1.get(0));
            	
            	// start from 1
            	for(; i<size; i++) {
            		list_1_metedata.add(list_1.get(i));
            		
            		if(list_1.get(i).trim().endsWith("---")) {
            			break;
            		} 
            	}
            	
            	i++;
            	
            	// set body list
                for(; i<size; i++) {
                	list_1_body.add(list_1.get(i)); 
                }
            } else {
            	// metedata not exist, only set body list
            	list_1_body.addAll(list_1);
            }
            
            //---------------------------------------------
            List<String> list_2 = new ArrayList<String>();
            List<String> list_2_metedata = new ArrayList<String>();
            List<String> list_2_body = new ArrayList<String>();
            
            while ((line = reader_2.readLine()) != null) {
            	list_2.add(line);
            }
            
            i = 1;
            size = list_2.size();
            
            // metedata exist
            if(size>0 && list_2.get(0).trim().endsWith("---")) {
            	// set metedata list
            	list_2_metedata.add(list_2.get(0));
            	
            	// start from 1
            	for(; i<size; i++) {
            		list_2_metedata.add(list_2.get(i));
            		
            		if(list_2.get(i).trim().endsWith("---")) {
            			break;
            		} 
            	}
            	
            	i++;
            	
            	// set body list
                for(; i<size; i++) {
                	list_2_body.add(list_2.get(i)); 
                }
            } else {
            	// metedata not exist, only set body list
            	list_2_body.addAll(list_2);
            }
            
            // compare
            if(!list_1.equals(list_2)) { 
            	if(!list_1_metedata.equals(list_2_metedata) && list_1_body.equals(list_2_body)) { 
            		return METEDATE_CHANGED;
            	} else {
           			return Diff_COUNT + compare_details(list_1_body, list_2_body);
            	}
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader_1 != null) {
                	reader_1.close();
                	reader_1 = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            try {
                if (reader_2 != null) {
                	reader_2.close();
                	reader_2 = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		
        return CHANGED;
	}
	
	public synchronized static void writeToExcel(List<FileStatus> changedFileList, XSSFWorkbook workbook, String sheetName) {
		XSSFSheet sheet = workbook.createSheet(sheetName); 
		
		XSSFFont font1 = workbook.createFont();
		font1.setFontName("Bookman Old Style"); 
		font1.setFontHeight(11); 
		
		CellStyle deletedstyle = workbook.createCellStyle();
		deletedstyle.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
		deletedstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		deletedstyle.setBorderBottom(BorderStyle.THIN);
		deletedstyle.setBorderTop(BorderStyle.THIN);
		deletedstyle.setBorderLeft(BorderStyle.THIN);
		deletedstyle.setBorderRight(BorderStyle.THIN);
		deletedstyle.setFont(font1); 
	    
	    CellStyle new_style = workbook.createCellStyle();
	    new_style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
	    new_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    new_style.setBorderBottom(BorderStyle.THIN);
	    new_style.setBorderTop(BorderStyle.THIN);
	    new_style.setBorderLeft(BorderStyle.THIN);
	    new_style.setBorderRight(BorderStyle.THIN);
	    new_style.setFont(font1);
	    
	    CellStyle metedatastyle = workbook.createCellStyle();
	    metedatastyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
	    metedatastyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    metedatastyle.setBorderBottom(BorderStyle.THIN);
	    metedatastyle.setBorderTop(BorderStyle.THIN);
	    metedatastyle.setBorderLeft(BorderStyle.THIN);
	    metedatastyle.setBorderRight(BorderStyle.THIN);
	    metedatastyle.setBorderRight(BorderStyle.THIN);
	    metedatastyle.setFont(font1);
	    
	    // -----------------------------------------------------
	    CellStyle headerstyle = workbook.createCellStyle();
	    headerstyle.setFillForegroundColor(IndexedColors.YELLOW1.getIndex());
	    headerstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    headerstyle.setBorderBottom(BorderStyle.THIN);
	    headerstyle.setBorderTop(BorderStyle.THIN);
	    headerstyle.setBorderLeft(BorderStyle.THIN);
	    headerstyle.setBorderRight(BorderStyle.THIN);
	    headerstyle.setFont(font1);
	    
	    CellStyle bodystyle = workbook.createCellStyle();
	    bodystyle.setBorderBottom(BorderStyle.THIN);
	    bodystyle.setBorderTop(BorderStyle.THIN);
	    bodystyle.setBorderLeft(BorderStyle.THIN);
	    bodystyle.setBorderRight(BorderStyle.THIN);
	    bodystyle.setFont(font1);
		
		Row row = sheet.createRow(0);
		Cell cell_one = row.createCell(0);
		cell_one.setCellValue("Files"); 
		cell_one.setCellStyle(headerstyle); 
		
		Cell cell_two = row.createCell(1);
		cell_two.setCellValue("Status");
		cell_two.setCellStyle(headerstyle); 
		
		Cell cell_three = row.createCell(2);
		cell_three.setCellValue("Details");
		cell_three.setCellStyle(headerstyle); 
		
		CellStyle back_style = workbook.createCellStyle();
		back_style.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
		back_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		back_style.setBorderBottom(BorderStyle.THIN);
		back_style.setBorderTop(BorderStyle.THIN);
		back_style.setBorderLeft(BorderStyle.THIN);
		back_style.setBorderRight(BorderStyle.THIN);
		back_style.setAlignment(HorizontalAlignment.CENTER_SELECTION); 
		back_style.setLocked(true);
		
		Cell cell_four = row.createCell(3);
		cell_four.setCellFormula("HYPERLINK(\"#\'" + "Customization Info" + "\'!A1\", \"" + "-          BACK          -" + "\")");
		cell_four.setCellValue("-          BACK          -"); 
		cell_four.setCellStyle(back_style); 
		
		row.setHeight((short)450);
	    //------------------------------------------------------
	    
		for(int i=0, size=changedFileList.size(); i<size; i++) {
			FileStatus fileStatus = changedFileList.get(i);
			
			// row 0 has been created. so use i + 1 here
			row = sheet.createRow(i + 1);
			Cell cell_0 = row.createCell(0);
			cell_0.setCellValue(fileStatus.getFilePath()); 
			cell_0.setCellStyle(bodystyle); 
			
			Cell cell_1 = row.createCell(1);
			cell_1.setCellValue(fileStatus.getFileStatus()); 
			cell_1.setCellStyle(bodystyle); 
			
			if(fileStatus.getFileStatus().equals(NEW)) {
				cell_1.setCellStyle(new_style); 
			} else if(fileStatus.getFileStatus().equals(DELETED)) {
				cell_1.setCellStyle(deletedstyle); 
			}
			
			Cell cell_2 = row.createCell(2);
			if(fileStatus.getFileComment() != null) {
				cell_2.setCellValue(fileStatus.getFileComment());
			} else {
				if(fileStatus.getDiffCount() > 0) {
					cell_2.setCellValue(Diff_COUNT + fileStatus.getDiffCount());
				}
			}
			
			cell_2.setCellStyle(bodystyle); 
			
			if(fileStatus.getFileComment() != null && fileStatus.getFileComment().equals(METEDATE_CHANGED)) {
				cell_2.setCellStyle(metedatastyle);
			}
		}
		
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
	}
	
	public synchronized static void writeToExcel(String excelPath, List<ServicePlanBase> servicePlanList) throws IOException { 
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// show Statistics info 
		createStatisticsSheet(workbook, servicePlanList);
		
		for(ServicePlanBase servicePlan: servicePlanList) {
			
			writeToExcel(servicePlan.getChangedFilesList(), workbook, servicePlan.getService()); 
		}
		
		try {
			FileOutputStream outputStream = new FileOutputStream(new File(excelPath));
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("========================================================");
		System.out.println("Write to file done.");
	}
	
	
	
	private synchronized static void createStatisticsSheet(XSSFWorkbook workbook, List<ServicePlanBase> servicePlanList) throws IOException { 
		XSSFSheet sheet = workbook.createSheet("Customization Info"); 
		
		XSSFFont font1 = workbook.createFont();
		font1.setFontName("Bookman Old Style"); 
		font1.setFontHeight(16); 
		
		CellStyle blankStyle = workbook.createCellStyle();
		blankStyle.setBorderLeft(BorderStyle.THIN);
		
	    CellStyle row1style = workbook.createCellStyle();
	    row1style.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
	    row1style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    row1style.setBorderBottom(BorderStyle.THIN);
	    row1style.setBorderTop(BorderStyle.THIN);
	    row1style.setBorderLeft(BorderStyle.THIN);
	    row1style.setBorderRight(BorderStyle.THIN);
	    row1style.setFont(font1);
	    row1style.setAlignment(HorizontalAlignment.CENTER);
	    
		XSSFFont font2 = workbook.createFont();
		font2.setFontName("Bookman Old Style"); 
		font2.setFontHeight(13); 
	    
	    CellStyle row2style = workbook.createCellStyle();
	    row2style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
	    row2style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    row2style.setBorderBottom(BorderStyle.THIN);
	    row2style.setBorderTop(BorderStyle.THIN);
	    row2style.setBorderLeft(BorderStyle.THIN);
	    row2style.setBorderRight(BorderStyle.THIN);
	    row2style.setFont(font2); 
	    row2style.setAlignment(HorizontalAlignment.CENTER);
	    
	    // row 1st
	    Row row_0 = sheet.createRow(0);
	    row_0.setHeight((short)600);
	    
		Cell cell_4 = row_0.createCell(3);
		cell_4.setCellValue("Customization Plan");
		cell_4.setCellStyle(row1style); 
		
		Cell cell_5 = row_0.createCell(4);
		cell_5.setCellValue("Batch 1st");
		cell_5.setCellStyle(row1style); 
		Cell cell_6 = row_0.createCell(5);
		cell_6.setCellStyle(row1style); 
		Cell cell_7 = row_0.createCell(6);
		cell_7.setCellStyle(row1style); 
		Cell cell_8 = row_0.createCell(7);
		cell_8.setCellStyle(row1style); 
		
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 4, 7));
		
		Cell cell_9 = row_0.createCell(8);
		cell_9.setCellValue("Batch 2nd");
		cell_9.setCellStyle(row1style); 
		
		Cell cell_10 = row_0.createCell(9);
		cell_10.setCellStyle(row1style); 
		Cell cell_11 = row_0.createCell(10);
		cell_11.setCellStyle(row1style); 
		Cell cell_12 = row_0.createCell(11);
		cell_12.setCellStyle(row1style); 
		
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 8, 11));
		
		// row 2nd
		Row row_1 = sheet.createRow(1);
		row_1.setHeight((short)600);
		
		Cell row1cell3 = row_1.createCell(3);
		row1cell3.setCellStyle(blankStyle); 
		Cell row1cell4 = row_1.createCell(4);
		row1cell4.setCellValue("articles");
		row1cell4.setCellStyle(row2style); 
		Cell row1cell5 = row_1.createCell(5);
		row1cell5.setCellStyle(row2style); 
		
		sheet.addMergedRegion(new CellRangeAddress(1, 2, 3, 3));
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 4, 5));
		
		Cell row1cell6 = row_1.createCell(6);
		row1cell6.setCellValue("includes");
		row1cell6.setCellStyle(row2style); 
		Cell row1cell7 = row_1.createCell(7);
		row1cell7.setCellStyle(row2style); 
		
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 6, 7));
		
		Cell row1cell8 = row_1.createCell(8);
		row1cell8.setCellValue("articles");
		row1cell8.setCellStyle(row2style); 
		Cell row1cell9 = row_1.createCell(9);
		row1cell9.setCellStyle(row2style); 
		
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 8, 9));
		
		Cell row1cell10 = row_1.createCell(10);
		row1cell10.setCellValue("includes");
		row1cell10.setCellStyle(row2style); 
		Cell row1cell11 = row_1.createCell(11);
		row1cell11.setCellStyle(row2style); 
		
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 10, 11));
		
		// row 3rd
		Row row_2 = sheet.createRow(2);
		row_2.setHeight((short)600);
		
		String updateStr = " updated ";
		String newStr = "    new    ";
		
		Cell row2cell3 = row_2.createCell(3);
		row2cell3.setCellStyle(blankStyle); 
		Cell row2cell4 = row_2.createCell(4);
		row2cell4.setCellStyle(row2style); 
		row2cell4.setCellValue(updateStr);
		Cell row2cell5 = row_2.createCell(5);
		row2cell5.setCellStyle(row2style); 
		row2cell5.setCellValue(newStr);
		Cell row2cell6 = row_2.createCell(6);
		row2cell6.setCellStyle(row2style); 
		row2cell6.setCellValue(updateStr);
		Cell row2cell7 = row_2.createCell(7);
		row2cell7.setCellStyle(row2style); 
		row2cell7.setCellValue(newStr);
		Cell row2cell8 = row_2.createCell(8);
		row2cell8.setCellStyle(row2style); 
		row2cell8.setCellValue(updateStr);
		Cell row2cell9 = row_2.createCell(9);
		row2cell9.setCellStyle(row2style); 
		row2cell9.setCellValue(newStr);
		Cell row2cell10 = row_2.createCell(10);
		row2cell10.setCellStyle(row2style); 
		row2cell10.setCellValue(updateStr);
		Cell row2cell11 = row_2.createCell(11);
		row2cell11.setCellStyle(row2style); 
		row2cell11.setCellValue(newStr);
		
		XSSFFont bodyFont = workbook.createFont();
		bodyFont.setFontName("Bookman Old Style"); 
		bodyFont.setFontHeight(13); 
	    
	    CellStyle bodystyle_0 = workbook.createCellStyle();
	    bodystyle_0.setBorderBottom(BorderStyle.THIN);
	    bodystyle_0.setBorderTop(BorderStyle.THIN);
	    bodystyle_0.setBorderLeft(BorderStyle.THIN);
	    bodystyle_0.setBorderRight(BorderStyle.THIN);
	    bodystyle_0.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
	    bodystyle_0.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    bodystyle_0.setFont(bodyFont); 
		
	    CellStyle bodystyle_1 = workbook.createCellStyle();
	    bodystyle_1.setBorderBottom(BorderStyle.THIN);
	    bodystyle_1.setBorderTop(BorderStyle.THIN);
	    bodystyle_1.setBorderLeft(BorderStyle.THIN);
	    bodystyle_1.setBorderRight(BorderStyle.THIN);
	    bodystyle_1.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
	    bodystyle_1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    bodystyle_1.setFont(bodyFont); 
	    bodystyle_1.setAlignment(HorizontalAlignment.CENTER);
	    
	    CellStyle bodystyle_2 = workbook.createCellStyle();
	    bodystyle_2.setBorderBottom(BorderStyle.THIN);
	    bodystyle_2.setBorderTop(BorderStyle.THIN);
	    bodystyle_2.setBorderLeft(BorderStyle.THIN);
	    bodystyle_2.setBorderRight(BorderStyle.THIN);
	    bodystyle_2.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
	    bodystyle_2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    bodystyle_2.setFont(bodyFont); 
	    bodystyle_2.setAlignment(HorizontalAlignment.CENTER);
		
		int j=3;
		int allCount = 0;
		for(ServicePlanBase servicePlan: servicePlanList) {
			List<FileStatus> fileStatusList = servicePlan.getChangedFilesList();
			
			int newFileCount = 0;
			for(FileStatus fileStatus: fileStatusList) {
				if(fileStatus.getFileStatus().equals(ServicePlanBase.NEW)) {
					newFileCount ++;
				}
			}
			
			Row row = sheet.createRow(j);
			Cell rowcell4 = row.createCell(3);
			rowcell4.setCellStyle(bodystyle_0); 
			rowcell4.setCellFormula("HYPERLINK(\"#\'" + servicePlan.getService() + "\'!A1\", \"" + servicePlan.getService() + "\")");
			
			Cell rowcell5 = row.createCell(4);
			int allFileCount = fileStatusList.size();
			if(allFileCount != 0) {
			    rowcell5.setCellValue(allFileCount - newFileCount);
			}
			rowcell5.setCellStyle(bodystyle_1); 
			
			Cell rowcell6 = row.createCell(5);
			if(newFileCount != 0) {
				rowcell6.setCellValue(newFileCount);
			}
			rowcell6.setCellStyle(bodystyle_1); 
			
			Cell rowcell7 = row.createCell(6);
			rowcell7.setCellStyle(bodystyle_1); 
			
			Cell rowcell8 = row.createCell(7);
			rowcell8.setCellStyle(bodystyle_1); 
			
			Cell rowcell9 = row.createCell(8);
			rowcell9.setCellStyle(bodystyle_2); 
			Cell rowcell10 = row.createCell(9);
			rowcell10.setCellStyle(bodystyle_2); 
			Cell rowcell11 = row.createCell(10);
			rowcell11.setCellStyle(bodystyle_2); 
			Cell rowcell12 = row.createCell(11);
			rowcell12.setCellStyle(bodystyle_2); 
			
			row.setHeight((short)600);
			
			allCount += allFileCount;
			j++;
		}
		
		CellStyle rowjStyle1 = workbook.createCellStyle();
		rowjStyle1.setBorderBottom(BorderStyle.THIN);
		rowjStyle1.setBorderTop(BorderStyle.THIN);
		rowjStyle1.setBorderLeft(BorderStyle.THIN);
		rowjStyle1.setBorderRight(BorderStyle.THIN);
		rowjStyle1.setFont(font2); 
		rowjStyle1.setAlignment(HorizontalAlignment.CENTER);
		
		Row rowj = sheet.createRow(j);
		rowj.setHeight((short)600);
		
		Cell rowjcell3 = rowj.createCell(3);
		rowjcell3.setCellValue("Total"); 
		rowjcell3.setCellStyle(rowjStyle1);
		
		Cell rowjcell4 = rowj.createCell(4);
		rowjcell4.setCellValue(allCount); 
		Cell rowjcell5 = rowj.createCell(5);
		Cell rowjcell6 = rowj.createCell(6);
		Cell rowjcell7 = rowj.createCell(7);
		Cell rowjcell8 = rowj.createCell(8);
		Cell rowjcell9 = rowj.createCell(9);
		Cell rowjcell10 = rowj.createCell(10);
		Cell rowjcell11 = rowj.createCell(11);
		
		rowjcell4.setCellStyle(rowjStyle1); 
		rowjcell5.setCellStyle(rowjStyle1); 
		rowjcell6.setCellStyle(rowjStyle1); 
		rowjcell7.setCellStyle(rowjStyle1); 
		rowjcell8.setCellStyle(rowjStyle1); 
		rowjcell9.setCellStyle(rowjStyle1); 
		rowjcell10.setCellStyle(rowjStyle1); 
		rowjcell11.setCellStyle(rowjStyle1); 
		
		sheet.addMergedRegion(new CellRangeAddress(j, j, 4, 7));
		sheet.addMergedRegion(new CellRangeAddress(j, j, 8, 11));
		
	    //==============================================================
	    CellStyle newStyle = workbook.createCellStyle();
	    newStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
	    newStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    newStyle.setBorderBottom(BorderStyle.THIN);
	    newStyle.setBorderTop(BorderStyle.THIN);
	    newStyle.setBorderLeft(BorderStyle.THIN);
	    newStyle.setBorderRight(BorderStyle.THIN);
	    font2.setFontHeight(12);
	    newStyle.setFont(font2); 

		Row row = sheet.getRow(0);
		Cell cell_one = row.createCell(0);
		cell_one.setCellValue("Service Name"); 
		cell_one.setCellStyle(row1style); 
		
		Cell cell_two = row.createCell(1);
		cell_two.setCellValue("All Files");
		cell_two.setCellStyle(row1style); 
		
		int i=1;
		for(ServicePlanBase servicePlan: servicePlanList) {
			row = sheet.getRow(i);
			Cell cell_0 = row.createCell(0);
			cell_0.setCellValue(servicePlan.getService()); 
			cell_0.setCellStyle(newStyle); 
			
			Cell cell_1 = row.createCell(1);
			cell_1.setCellValue(servicePlan.getChangedFilesList().size());
			cell_1.setCellStyle(newStyle); 
			
			i++;
		}
	    
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
		sheet.autoSizeColumn(7);
		sheet.autoSizeColumn(8);
		sheet.autoSizeColumn(9);
		sheet.autoSizeColumn(10);
		sheet.autoSizeColumn(11);
	}
	
	// eg: /articles/active-directory/authentication/howto-mfa-mfasettings.md
	public synchronized static void getAllFilesIncludingSubFolder(List<String> fileList, String folderName) {
        File folder = new File(folderName); 
        
        if(folder.exists()) {
	        for (File file : folder.listFiles()) {
	            if (file.isFile()) {
	                if(file.getName().endsWith(".md") || file.getName().endsWith(".yml")) {
	                	fileList.add(file.getAbsolutePath().replace("\\", "/").replace(GLOBAL_REPO_PATH, "").replace(GLOBAL_BACKUP_FOLDER, ""));
	                }
	            } else {
	                getAllFilesIncludingSubFolder(fileList, file.getAbsolutePath());
	            }
	        }
        }
    }
	
	public synchronized static void getAllFiles(List<String> fileList, String folderName) {
        File folder = new File(folderName); 
        
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                if(file.getName().endsWith(".md") || file.getName().endsWith(".yml")) {
                	fileList.add(file.getAbsolutePath().replace("\\", "/").replace(GLOBAL_REPO_PATH, "").replace(GLOBAL_BACKUP_FOLDER, ""));
                }
            } 
        }
    }
	
	protected synchronized List<String> getAllBackupFiles(String service) {
		List<String> backupFileList = new ArrayList<String>(1000);
		
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + service);
		
		return backupFileList;
	}
	
	protected synchronized List<String> getAllGlobalFiles(String service) {
		List<String> globalFileList = new ArrayList<String>(1000);
		
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + service);
		
		return globalFileList;
	}
	
	private synchronized static List<String> getChildClassUselessFiles(String className){
		List<String> uselessFileInfoList = new ArrayList<String>(100);

		try {
			Class<?> clazz = Class.forName(className);

			Class<?>[] clazzArr = clazz.getClasses();

			for (Class<?> childClazz : clazzArr) {
				
				try {
					Method method = childClazz.getMethod("getUselessFiles");
	
					Object obj = method.invoke(childClazz.newInstance());
	
					@SuppressWarnings("unchecked")
					List<String> uselessFilesList = (List<String>) obj;
	
					String currentService = ConfigureSupport2.getServiceByClassName(childClazz.getName());
					
					currentService = currentService.replace("\\", "/").trim();
	
					for (String uselessFile : uselessFilesList) {
						if (!uselessFile.trim().equals("")) {
							uselessFileInfoList.add(currentService + "/" + uselessFile.trim());
						}
					}
				} catch(NoSuchMethodException ne) {
					// ignore
				}
			}
		} catch (Exception e) {
//			e.printStackTrace();
		}

		return uselessFileInfoList;
	}
	
	public synchronized static List<String> getCurrentClassUselessFiles(String className) {
		List<String> uselessFileInfoList = new ArrayList<String>(100);

		try {
			Class<?> clazz = Class.forName(className);

			Method method = clazz.getMethod("getUselessFiles");

			Object obj = method.invoke(clazz.newInstance());

			@SuppressWarnings("unchecked")
			List<String> uselessFilesList = (List<String>) obj;

			String currentService = ConfigureSupport2.getServiceByClassName(className);
			
			currentService = currentService.replace("\\", "/").trim();
			
			for (String uselessFile : uselessFilesList) {
				if (!uselessFile.trim().equals("")) {
					uselessFileInfoList.add(currentService + "/" + uselessFile.trim());
				}
			}
		} catch (NoSuchMethodException ne) {
			// ignore
		} catch (Exception e) {
//			e.printStackTrace();
		}

		return uselessFileInfoList;
	}
	
	private synchronized static List<String> getUselessFilesByClassName(String className){
		List<String> list1 = getCurrentClassUselessFiles(className);
		
		List<String> list2 = getChildClassUselessFiles(className);
		
		list1.addAll(list2);
		
		return list1;
	}
	
	public synchronized static List<FileStatus> filterChangedList(String className, List<FileStatus> changedFileList) {
		List<FileStatus> newChangedList = new ArrayList<FileStatus>();
		
		List<String> uselessFileList = getUselessFilesByClassName(className);
		
		for(FileStatus fileStatus: changedFileList) {
			boolean isUseful = true;
			
			for(String uselessFile: uselessFileList) {
				if(fileStatus.getFilePath().equals(uselessFile)) {
					isUseful = false;
					break;
				}
			}
			
			if(isUseful) {
				newChangedList.add(fileStatus);
			}
		}
		
		return newChangedList;
	}
}
