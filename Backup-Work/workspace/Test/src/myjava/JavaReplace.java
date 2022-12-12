package myjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import customization.support.CodeSupport;
import customization.support.LinkSupport2;
import customization.support.WordsSupport;

/**
 * 
 * @author alexch2
 *
 */
public class JavaReplace {
	private static final String CONFIG_FILE_PATH = "F:\\java_workspace\\wacn\\wacn\\src\\myjava\\config.properties";
	
	private static final Properties properties = new Properties();
	
	public static synchronized Properties getProperties() {
		return properties;
	}
	
	private static synchronized void loadProperties() {
		try {
			Reader reader = new BufferedReader(new FileReader(CONFIG_FILE_PATH));
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static {
		loadProperties();
	}
	 
	public synchronized static void customizate(){
		runProcedure(false);
	}
	
	public synchronized static void test_customizate(){
		System.err.println("Run checking.......\n");
		
		runProcedure(true);
	}
	
	
	public synchronized static void runProcedure(boolean runForTest) {
		List<String> fileList = JavaReplace.readFileNameFromFileList(JavaParameterSupport.LIST_FILE);

		int count = 0;
		for (String file : fileList) {
			System.out.println(++count + ".========================================================================================");
			System.out.println(file);

			setRunInfo(file, runForTest);
			
			customizeOneFile(file);
		}
	}

	private synchronized static void setRunInfo(String fileName, boolean runForTest) {
		if (runForTest) {
			setTestPath();
		} else {
			setRunPath();
		}
		
		WordsSupport.setWords();
	}
	
	public static synchronized void customizeOneFile(String file) {
		String fileAbsolutePath = JavaParameterSupport.SOURCE_FOLDER + "/" + file;

		if (!new File(fileAbsolutePath).exists()) {

			system_out_println("\nFile Not Found: -> " + fileAbsolutePath);
			return;
		}

		// a. copy images.
//		ImageSupport2.copyImages(fileAbsolutePath);

		// b. do replacement and check key words.
		JavaReplace.checkAndCustomize(file);

		// c. check broken links.
		LinkSupport2.checkBrokenLinks(fileAbsolutePath);
	}
	
	public static synchronized void checkAndCustomize(String file) {
		// source file
		File sourceFile = new File(JavaParameterSupport.SOURCE_FOLDER + "/" + file);

		// dest file
		File destFile = new File(JavaParameterSupport.DESTINATION_FOLDER + "/" + file);

		BufferedReader reader = null;
		BufferedWriter writer = null;

		if (destFile.exists()) {
			destFile.delete();
		} else {
			destFile.getParentFile().mkdirs();
		}

		try {
			destFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// do replace
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), "utf-8"));

			String allContent = "";
			String line = null;

			while ((line = reader.readLine()) != null) {

				// a
				line = CodeSupport.revertToCode(line);

				// b
				for (String[] word : WordsSupport.getWords()) {
					line = line.replace(word[0], word[1]);
				}

				// c
				line = replaceMsAuthorAndMsDate(line);

				allContent = allContent + line + "\r\n";
			}

			allContent = allContent.replace("\r\n />", " />");

			writer = new BufferedWriter(new FileWriter(destFile));
			writer.write(new String(allContent.getBytes(), "utf-8") + "\n");

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

	public static synchronized List<String> readFileNameFromFileList(String listFile) {
		List<String> list = new ArrayList<String>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(listFile), "utf-8"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.trim().equals("")) {
					continue;
				}

				list.add(line.replace("\\", "/").trim());
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

		return list;
	}

	public synchronized static String findFoldersByFileName(String subFolder, String fileName) {
		String fileExistingFolder = null;

		File[] listFiles = new File(subFolder).listFiles();

		for (int i = 0; i < listFiles.length; i++) {
			if (listFiles[i].isFile() && listFiles[i].getName().equals(fileName)) {
				return subFolder;
			}
		}

		for (int i = 0; i < listFiles.length; i++) {
			if (listFiles[i].isDirectory()) {
				fileExistingFolder = findFoldersByFileName(listFiles[i].getAbsolutePath(), fileName);
				if (fileExistingFolder != null) {
					return fileExistingFolder;
				}
			}
		}

		return fileExistingFolder;
	}

	private synchronized static String replaceMsAuthorAndMsDate(String line) {
		if (line != null && line.contains("ms.author:")) {
			line = line.substring(0, line.indexOf("ms.author:") + 11) + JavaParameterSupport.MS_AUTHER;
		}

		try {
			if (line != null && line.contains("ms.date:")) {

				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				line = line.substring(0, line.indexOf("ms.date:") + 9) + sdf.format(new Date());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("ms.date format is wrong...........");
		}

		return line;
	}

	public static synchronized void setTestPath() {
		JavaParameterSupport.SOURCE_FOLDER = JavaParameterSupport.MOONCAKE_ROOT_FOLDER;
		JavaParameterSupport.DESTINATION_FOLDER = JavaParameterSupport.TEST_FOLDER;

		JavaParameterSupport.SOURCE_FOLDER = JavaParameterSupport.SOURCE_FOLDER.replace("\\", "/");
		JavaParameterSupport.DESTINATION_FOLDER = JavaParameterSupport.DESTINATION_FOLDER.replace("\\", "/");
	}

	public synchronized static void setRunPath() {
		if (JavaParameterSupport.RUN_TYPE == JavaParameterSupport.RUN_TO_EN_US) {

			JavaParameterSupport.SOURCE_FOLDER = JavaParameterSupport.GLOBAL_ROOT_FOLDER;
			JavaParameterSupport.DESTINATION_FOLDER = JavaParameterSupport.MOONCAKE_ROOT_FOLDER;

		} else if (JavaParameterSupport.RUN_TYPE == JavaParameterSupport.RUN_TO_ZH_CN) {

			JavaParameterSupport.SOURCE_FOLDER = JavaParameterSupport.TECH_CONTENT_ROOT_FOLDER;
			JavaParameterSupport.DESTINATION_FOLDER = JavaParameterSupport.TEST_FOLDER;
		}

		JavaParameterSupport.SOURCE_FOLDER = JavaParameterSupport.SOURCE_FOLDER.replace("\\", "/");
		JavaParameterSupport.DESTINATION_FOLDER = JavaParameterSupport.DESTINATION_FOLDER.replace("\\", "/");
	}

	@Deprecated
	public synchronized static void printNotFoundIncludeFile(String absoFilePath) {
		for (String includeFile : getNotFoundIncludeFiles(absoFilePath)) {
			System.err.println("Include file not found in en-us repo: --> " + includeFile + "\n");
		}
	}
	
	// [!INCLUDE [active-directory-azuread-dev](../../../includes/active-directory-azuread-dev.md)]
	// check if included files are existing in en-us or not 
	@Deprecated
	public synchronized static List<String> getNotFoundIncludeFiles(String absoFilePath) {
		List<String> list = new ArrayList<String>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(absoFilePath), "utf-8"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				line = line.trim();
				
				if(line.startsWith("[!INCLUDE")) {
					String subStr = line.substring(line.indexOf("(") + 1); 
					subStr = subStr.substring(0, subStr.indexOf(")"));
					subStr= subStr.replace("../", "").replace("./", "").replace("includes/", "").trim();
					
					File includeFile = new File(JavaParameterSupport.MOONCAKE_ROOT_FOLDER + "/includes/" + subStr);
					
					if(!includeFile.exists()) {
						list.add(subStr);
					}
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

		return list;
	}
	
	public static void system_out_println(String log) {
		System.out.println(log);
	}

	public static void system_err_println(String log) {
		System.err.println(log);
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

		return list;
	}
	
//	public static synchronized void main(String[] args) {
//	List<String> fileList = WacnReplace8.readFileNameFromFileList(ParameterSupport.LIST_FILE);
//	String globalRedirectionJson = "E:\\my_files\\mooncake\\azure-docs-pr\\.openpublishing.redirection.json";
//	String enusRedirectionJson = "E:\\my_files\\mooncake\\mc-docs-pr.en-us\\.openpublishing.redirection.json";
//	FileUtil.updateRedirectionJsonFile(globalRedirectionJson, enusRedirectionJson, fileList);
//}
}
