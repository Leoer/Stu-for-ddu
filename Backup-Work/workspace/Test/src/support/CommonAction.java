package support;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import customization.WacnReplace81;
import customization.services.Active_Directory;
import customization.support.ParameterSupport;

public class CommonAction {

    public static String LIST_FILE = "E:\\my_files\\my_workspace\\wacnReplace\\wacn\\src\\customization\\file_list.txt";

    public static String FROM_FILE = "E:/my_files/mooncake/mc-docs-pr.zh-cn/articles/";
    
    public static String TO_FILE = "e:/copy_from_master/";
    
    public static void main(String[] args) {
    	
//    	printAllFilesIncludingSubFolder("D:\\myfiles\\azure-docs-pr\\articles\\cloud-services-extended-support", ".yml");
    	
    	printUniqueFiles();
    	
//    	deleteFiles("E:\\my_files\\mooncake\\mc-docs-pr\\articles");
    }
    
    private static void checkCodeExist(String folderName) {
    	List<String> fileList = new ArrayList<String>(100);
    	
    	getAllFilesIncludingSubFolder(folderName, fileList);
    	
    	BufferedReader reader = null;
    	
    	for(String filePath: fileList) {
    		boolean started = false;
    		
    		try {
    			reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));

    			int count = 0;
    			String line = null;
    			while ((line = reader.readLine()) != null) {
    				 if(line.trim().startsWith("```") && ++count%2 == 1) {
    					 started = true;
    					 continue;
    				 }
    				
    				 if(started) {
    					 if(line.trim().startsWith("```")) {
    						 System.err.println(filePath);
    						 System.err.println(line);
    					 	 break;
    					 } else {
    						 started = false;
    						 continue;
    					 }
    				 }
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		} finally {
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
    }
    
    
    public static void printUniqueFiles() {
    	List<String> fileList = WacnReplace81.readFileNameFromFileList(ParameterSupport.LIST_FILE);
    	
    	Set<String> treeSet = new TreeSet<String>(fileList);
    	
    	for(String file: treeSet) {
    		System.out.println(file);
    	}
    }
    
    public static void deleteFiles(String parentFolder) {
    	List<String> fileList = WacnReplace81.readFileNameFromFileList(ParameterSupport.LIST_FILE);
    	
    	for(String strFile: fileList) {
    		File file = new File(parentFolder + "/" + strFile);
    		
//    		System.out.println(parentFolder + "/" + strFile);
    		
    		file.deleteOnExit();
    	}
    }
    
	public static void checkRedirectedFile() {
		List<String> uselessFileList = Active_Directory.Fundamentals.getUselessFiles();

		for (String uselessFile : uselessFileList) {
			if (!uselessFile.trim().equals("")) {
				String url = "https://docs.microsoft.com/en-us/azure/active-directory/fundamentals/" + uselessFile.replace(".md", "");

				printRedirectedURL(url);
			}
		}
	}
    
	private static void printRedirectedURL(String link) {
		HttpURLConnection connection = null;

		try {
			URL url = new URL(link);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			connection.connect();
			
			String origin_url = connection.getURL().toString();
			
			InputStream is = connection.getInputStream();
			
			String redirected_url = connection.getURL().toString();
			
			is.close();
			
			if(!origin_url.equals(redirected_url)) { 
				System.out.println(origin_url);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();
				connection = null;
			}
		}
	}
    
    
    
    public static void getUselessFiles() {
    	String globalRepo = ParameterSupport.GLOBAL_ROOT_FOLDER;
    	String enusRepo = ParameterSupport.MOONCAKE_ROOT_FOLDER;
    	
    	List<String> globalFiles = new ArrayList<String>(500);
    	getAllFilesIncludingSubFolder(globalRepo + "\\articles\\backup",                      ".md", globalFiles, globalRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(globalRepo + "\\articles\\azure-monitor",               ".md", globalFiles, globalRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(globalRepo + "\\articles\\virtual-machines\\linux",     ".md", globalFiles, globalRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(globalRepo + "\\articles\\api-management",              ".md", globalFiles, globalRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(globalRepo + "\\articles\\stream-analytics",            ".md", globalFiles, globalRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(globalRepo + "\\articles\\event-grid",                  ".md", globalFiles, globalRepo + "\\articles\\");
    	
    	List<String> enusFiles = new ArrayList<String>(500);
    	getAllFilesIncludingSubFolder(enusRepo + "\\articles\\backup",                        ".md", enusFiles, enusRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(enusRepo + "\\articles\\azure-monitor",                 ".md", enusFiles, enusRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(enusRepo + "\\articles\\virtual-machines\\linux",       ".md", enusFiles, enusRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(enusRepo + "\\articles\\api-management",                ".md", enusFiles, enusRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(enusRepo + "\\articles\\stream-analytics",              ".md", enusFiles, enusRepo + "\\articles\\");
    	getAllFilesIncludingSubFolder(enusRepo + "\\articles\\event-grid",                    ".md", enusFiles, enusRepo + "\\articles\\");
    	
    	globalFiles.removeAll(enusFiles);
    	Collections.sort(globalFiles); 
    	
    	for(String file: globalFiles) {
    		System.out.println(file);
    	}
    }
    
    public static synchronized List<String> readToList(String listFile) {
		List<String> list = new ArrayList<String>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(listFile), "utf-8"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				if(line.trim().equals("")) {
					continue;
				}
				
				list.add(line.trim());
			}

		} catch (FileNotFoundException e) {
			System.err.println("File Not Found!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
					reader = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return list;
	}
    
    public static void removeFilesFromList() {
    	List<String> fileList = WacnReplace81.readFileNameFromFileList(LIST_FILE);
    	
    	for (String fileName : fileList) {
    		
    		File file = new File(fileName);
    		
    		if(file.exists()) {
    			file.delete();
    		} else {
    			System.err.println(fileName + " not exists.");
    		}
    	}
    	
    	System.out.println("\nRemoving done.");
    }
    
	public static void readAndMoveFiles() {
		List<String> fileList = WacnReplace81.readFileNameFromFileList(LIST_FILE);

		String fromPath;
		String toPath;
		for (String fileName : fileList) {
			if (fileName.startsWith("includes")) {
				fromPath = FROM_FILE.replace("articles/", "");
				
				File toPathFolder = new File(TO_FILE + "includes"); 
				toPathFolder.mkdirs();

				readAndMoveFile(new File(fromPath + fileName), new File(TO_FILE + fileName.replace("\\", "/")));
				
			} else {
				toPath = TO_FILE + fileName.replace("\\", "/");
				toPath = toPath.substring(0, toPath.lastIndexOf("/"));

				File toPathFolder = new File(toPath);
				toPathFolder.mkdirs();

				readAndMoveFile(new File(FROM_FILE + fileName), new File(TO_FILE + fileName));
			}
		}

		System.out.println("Done");
	}
     

	public static void readAndMoveFiles(String path) {
		List<String> fileList = WacnReplace81.readFileNameFromFileList(LIST_FILE);

		String fromPath;
		String toPath;
		if(path.equals("includes")) {
			fromPath = FROM_FILE.replace("articles", path);
			toPath = TO_FILE + path;
		} else {
			fromPath = FROM_FILE + path;
			toPath = TO_FILE + path;
		}
		
		for (String fileName : fileList) {

			File fromFile = new File(fromPath + "/" + fileName);

			File toFolder = new File(toPath);
			if (!toFolder.exists())
				toFolder.mkdirs();

			File toFile = new File(toPath + "/" + fileName);

			readAndMoveFile(fromFile, toFile);
		}

		System.out.println("Done"); 
	}

	public static void readAndMoveFile(File fromFile, File toFile) {
    	if (!fromFile.exists()) {

            System.err.println(fromFile.getName() + " does not exist.");
            return;
        }
    	
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fromFile), "utf-8"));

            String allContent = "";
            String line = null;

            while ((line = reader.readLine()) != null) {
                allContent = allContent + line + "\r\n";
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

    public static void getAllFiles(String folderName, String postfix) {
        File files = new File(folderName);

//        System.out.println(folderName); 
        
        for (File file : files.listFiles()) {
            if (postfix != null) {
                if (file.getName().endsWith(postfix)) {
                    System.out.println(file.getAbsolutePath());
                }
            } else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    public static void printAllFilesIncludingSubFolder(String folderName, String postfix) {
        File files = new File(folderName);

//        System.out.println(folderName); 
        
        for (File file : files.listFiles()) {
            if (file.isFile()) {
                if (postfix != null) {
                    if (file.getName().endsWith(postfix)) {
                        System.out.println(file.getAbsolutePath());
                    }
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            } else {
            	printAllFilesIncludingSubFolder(file.getAbsolutePath(), postfix);
            }
        }
    }
    
    public static void getAllFilesIncludingSubFolder(String folderName, String postfix, List<String> fileList, String replaceWords) {
        File files = new File(folderName);

        for (File file : files.listFiles()) {
            if (file.isFile()) {
                if (postfix != null) {
                    if (file.getName().endsWith(postfix)) {
                    	fileList.add(file.getAbsolutePath().replace(replaceWords, "")); 
                    }
                } else {
                	fileList.add(file.getAbsolutePath().replace(replaceWords, "")); 
                }
            } else {
            	getAllFilesIncludingSubFolder(file.getAbsolutePath(), postfix, fileList, replaceWords);
            }
        }
    }
    
	public static void getAllFilesIncludingSubFolder(String folderName, List<String> fileList) {
		File files = new File(folderName);

		for (File file : files.listFiles()) {
			if (file.isFile()) {
				fileList.add(file.getAbsolutePath());
			} else {
				getAllFilesIncludingSubFolder(file.getAbsolutePath(), fileList);
			}
		}
	}
	
	public static void getAllFilesIncludingSubFolder_2(String folderName, List<String> fileList) {
		File files = new File(folderName);

		for (File file : files.listFiles()) {
			if (file.isFile()) {
				
				if(file.getAbsolutePath().endsWith(".md") || file.getAbsolutePath().endsWith(".yml")) {
					fileList.add(file.getAbsolutePath());
				}
				
			} else {
				getAllFilesIncludingSubFolder_2(file.getAbsolutePath(), fileList);
			}
		}
	}
    
	public static void getAllFileNames(String folderName) {
		File files = new File(folderName);

		for (File file : files.listFiles()) {
			if (file.isFile()) {
				System.out.println(file.getAbsolutePath());
			}
		}
	}
	
	public static void getAllFileNames(String folderName, String writeToFile) {
		File files = new File(folderName);

		List<String> fileNameList = new ArrayList<String>(200);
		
		for (File file : files.listFiles()) {
			if (file.isFile()) {
				fileNameList.add(file.getName());
			}
		}
		
		writeToFile(fileNameList, writeToFile);
		
		System.out.println("Done -> getAllFileNames(folderName, writeToFile)"); 
	}
    
	/**
	 * find file path in folder.
	 * 
	 * findName are in file_list.txt.
	 * 
	 * if there are files with the same names, only find the first found.
	 * 
	 * @param folder, where files are
	 *            
	 */
	public static void findFilePathFromFolder(String folder) {
		List<String> fileList = WacnReplace81.readFileNameFromFileList(LIST_FILE);

		for (String fileName : fileList) {
			if (!findFilesPath(fileName, folder)) {
				System.err.println(fileName + " Not found!");
			}
		}
	}

	private static boolean findFilesPath(String fileName, String folderName) {
		File files = new File(folderName);

		for (File file : files.listFiles()) {
			if (file.isFile()) {
				if (file.getName().equals(fileName)) {
					System.out.println(file.getAbsolutePath());
					return true;
				}
			}
		}

		for (File file : files.listFiles()) {
			if (file.isDirectory()) { 
				boolean found = findFilesPath(fileName, file.getAbsolutePath());
				if(found) {
					return true;
				}
			}
		}

		return false;
	}
    
    //===========================================================================
	
	/**
	 * find file path in folder.
	 * 
	 * findName are in file_list.txt.
	 * 
	 * if there are files with the same names, find all path.
	 * 
	 * @param folder, where files are
	 *            
	 */
	public static void findAllFilePathFromFolder(String folder) {
		List<String> fileList = WacnReplace81.readFileNameFromFileList(LIST_FILE);

		for (String fileName : fileList) {
			if (!findAllFilesPath(fileName, folder)) {
				System.err.println(fileName + " Not found!");
			}
		}
	}

	private static boolean findAllFilesPath(String fileName, String folderName) {
		File files = new File(folderName);

		boolean found = false;
		
		for (File file : files.listFiles()) {
			if (file.isFile()) {
				if (file.getName().equals(fileName)) {
					System.out.println(file.getAbsolutePath());
					found = true;
				}
			}
		}

		for (File file : files.listFiles()) {
			if (file.isDirectory()) { 
				boolean existInSubFolder = findAllFilesPath(fileName, file.getAbsolutePath());
				if(existInSubFolder) {
					found = true;
				}
			}
		}

		return found;
	}
	
	
	private static void writeToFile(String content, String fileAbsolutePath) {
		BufferedWriter writer = null;
		
		try {
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAbsolutePath), "utf-8"));
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		} finally {
			if (writer != null) {
				try {
					writer.close();
					writer = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void writeToFile(List<String> contentList, String fileAbsolutePath) {
		
		String content = "";
		
		for(int i=0; i<contentList.size(); i++) {
			if(i != contentList.size()-1) {
				content += contentList.get(i) + "\r\n";
			} else {
				content += contentList.get(i);
			}
		}
		
		writeToFile(content, fileAbsolutePath);
		
	}
	
	public static boolean findInFile(File fromFile, String str) {
    	if (!fromFile.exists()) {

            System.err.println(fromFile.getName() + " does not exist.");
            return false;
        }
    	
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fromFile), "utf-8"));

            String line = null;
            while ((line = reader.readLine()) != null) {
            	if(line.toLowerCase().contains(str.toLowerCase())) {
            		return true;
            	}
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    reader = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return false;
    }
	
	// 10/09/2019, For ad new files go live
	public static void getUnqueFile(String fromFile, String toFile) {
		List<String> fileList = CommonAction.readToList(fromFile);
		
		Set<String> set = new TreeSet<String>(fileList);
		
		CommonAction.writeToFile(new ArrayList<String>(set), toFile); 
		
		System.out.println("Done");
	}
	
	public static void getUniqeFiles() {
		List<String> fileList = WacnReplace81.readFileNameFromFileList(LIST_FILE);
		
		Set<String> set = new TreeSet<String>(fileList);
		
		for(String file: set) {
			System.out.println(file);
		}
	}
	
	public static void checkExisting() {
		List<String> fileList = WacnReplace81.readFileNameFromFileList(LIST_FILE);
		
		for(String file: fileList) {
			if(new File(file.replace("azure-docs-pr", "mc-docs-pr.en-us")).exists()) {
				System.out.println(file + "," + "exists");
			} else {
				System.out.println(file + "," + "not exists");
			}
		}
	}
	
	private static void checkSomeFile(String folder) {
		File currFoler = new File(folder);
		
		BufferedReader reader = null;
		
		for(File file: currFoler.listFiles()) {
			if(file.isDirectory()) {
				continue;
			}
			
			boolean needCheck = false;
			
	        try {
	            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));

	            String line = null;
	            while ((line = reader.readLine()) != null) {
	            	if(line.contains("bastion") || line.contains("tutorial-create-management-vm") || line.contains("join-windows-vm")) {
	            		needCheck = true;
	            		break;
	            	}
	            }

	            if(needCheck) {
	            	System.out.println(file.getAbsolutePath());
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
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
		
	}

}
