package customization;

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
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import customization.support.CodeSupport;
import customization.support.ConfigureSupport2;
import customization.support.IgnoreWordsSupport;
import customization.support.ImageSupport2;
import customization.support.LinkSupport2;
import customization.support.ParameterSupport;
import customization.support.WarningWordsSupport;
import customization.support.WordsSupport;

/**
 * 
 * @author alexch2
 *
 */
public class WacnReplace81 {
	private static final String CONFIG_FILE_PATH = "D:\\workspace\\Test\\src\\customization\\config.properties";
	
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

	private static final List<String[]> attentionWords = new ArrayList<String[]>(1000);

	private static List<String> uselessFilesList = new ArrayList<String>();

	public static void setUselessFilesList() {
	}

	public static List<String[]> getAttentionWords() {
		return attentionWords;
	}

	public static List<String> getUselessFilesList() {
		return uselessFilesList;
	}

	public synchronized static void customize(){
		runProcedure(false);
	}
	
	public synchronized static void test_customize(){
		System.err.println("Run checking.......\n");
		
		runProcedure(true);
	}
	
	
	public synchronized static void runProcedure(boolean runForTest) {
		List<String> fileList = WacnReplace81.readFileNameFromFileList(ParameterSupport.LIST_FILE);

		int count = 0;
		for (String file : fileList) {
			System.out.println(++count + ".========================================================================================");
			System.out.println(file);

			setRunInfo(file, runForTest);
			
			customizeOneFile(file, runForTest);
		}
	}

	private synchronized static void setRunInfo(String fileName, boolean runForTest) {
		String service = fileName.substring(0, fileName.lastIndexOf("/"));
		
		if(!service.equals(ParameterSupport.RUN_SERVICE)) {
			ParameterSupport.RUN_SERVICE = service;
			
			if (runForTest) {
				setTestPath();
			} else {
				setRunPath();
			}
			
			ConfigureSupport2.configure();
		}
	}
	
	public static synchronized void customizeOneFile(String file, boolean runForTest) {
		String fileAbsolutePath = ParameterSupport.SOURCE_FOLDER + "/" + file;
		
		// 01/13/2022, 
		if(runForTest) {
			if(fileAbsolutePath.contains("Azure-RMSDocs")) {
				fileAbsolutePath = fileAbsolutePath.replace("Azure-RMSDocs", "information-protection");
			}
		}
		
		if(!new File(fileAbsolutePath).exists()) {
			
			system_out_println("\nFile Not Found: -> " + fileAbsolutePath);
			return;
		}
		
		if(ConfigureSupport2.isUsefull(file)) {
			// a. check attention words. 
			WacnReplace81.printAttentionWords(file);
			
			// b. copy images. 
			ImageSupport2.copyImages(fileAbsolutePath); 
			
			// c. do replacement and check key words. 
			WacnReplace81.checkAndCustomize(file, runForTest);
			
//			// d. check links issues
//			CheckLinksIssue.checkLinks(file);
			
			// e. check broken links. 
			LinkSupport2.checkBrokenLinks(fileAbsolutePath);
		} else {
			system_out_println("\n ------------------ Not Supported.");
		}

		system_out_println("");
	}
	
	public static synchronized void checkAndCustomize(String file, boolean runForTest) {
		// source file
		String sourceFileName = ParameterSupport.SOURCE_FOLDER + "/" + file;
		
		// 01/13/2022, 
		if(runForTest) {
			if(sourceFileName.contains("Azure-RMSDocs")) {
				sourceFileName = sourceFileName.replace("Azure-RMSDocs", "information-protection");
			}
		}
		
		File sourceFile = new File(sourceFileName);

		// dest file
		String destFileName = ParameterSupport.DESTINATION_FOLDER + "/" + file;
		
		// 01/13/2022, 
		if(destFileName.contains("Azure-RMSDocs")) {
			destFileName = destFileName.replace("Azure-RMSDocs", "information-protection");
		}
		
		File destFile = new File(destFileName);
		
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
			Set<String> warningWords = new HashSet<String>();

			boolean isCommented = false;
			final String COMMENT_START_STR = "<!--";
			final String COMMENT_END_STR = "-->";
			
			while ((line = reader.readLine()) != null) {

				if(!runForTest) { // not for test
					// a
					line = CodeSupport.revertToCode(line);
	
					// b
					for (String[] word : WordsSupport.getWords()) {
						line = line.replace(word[0], word[1]);
					}
	
					// c
					line = replaceMsAuthorAndMsDate(line);
				}
				
				// ========================================================= 01/26/2021, ignore commented content
				// normal, not commented
				if(!isCommented && !line.contains(COMMENT_START_STR)) {
					warningWords.addAll(checkKeyWords(line));
					warningWords.addAll(checkUselessMD(line));
					
				// <!-- AAA   -->
				} else if(!isCommented && line.contains(COMMENT_START_STR) && line.contains(COMMENT_END_STR)) {
					String commentContent = line.substring(line.indexOf(COMMENT_START_STR), line.indexOf(COMMENT_END_STR)); 
					String contentNeedCheck = line.replace(commentContent, "");
					
					warningWords.addAll(checkKeyWords(contentNeedCheck));
					warningWords.addAll(checkUselessMD(contentNeedCheck));
				// aa <!-- AAA
				} else if(!isCommented && line.contains(COMMENT_START_STR) && !line.contains(COMMENT_END_STR)) {
					isCommented = true;
					String commentContent = line.substring(line.indexOf(COMMENT_START_STR)); 
					String contentNeedCheck = line.replace(commentContent, "");

					warningWords.addAll(checkKeyWords(contentNeedCheck)); 
					warningWords.addAll(checkUselessMD(contentNeedCheck));
				// BBB  -->bb
				} else if(isCommented && line.contains(COMMENT_END_STR)) {
					isCommented = false;
					
					String commentContent = line.substring(0, line.indexOf(COMMENT_END_STR)); 
					String contentNeedCheck = line.replace(commentContent, "");

					warningWords.addAll(checkKeyWords(contentNeedCheck)); 
					warningWords.addAll(checkUselessMD(contentNeedCheck));
				}
				// =========================================================
				
				allContent = allContent + line + "\r\n";
			}

			allContent = allContent.replace("\r\n />", " />");

			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFile), "utf-8"));
			writer.write(allContent);

			printWarningWords(warningWords);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File Not Found");
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

	private synchronized static Set<String> checkUselessMD(String line) {
		Set<String> set = new HashSet<String>();

		line = line.toLowerCase();

		for (String ignoredWords : IgnoreWordsSupport.getIgnoredWords()) {
			line = line.replace(ignoredWords.toLowerCase(), "");
		}

		for (String uselessMD : uselessFilesList) {
			String uselessFileName = uselessMD.replace(".md", "");

			if (line.contains(uselessFileName.toLowerCase())) {
				set.add(uselessFileName);
			}
		}

		return set;
	}

	private synchronized static Set<String> checkKeyWords(String line) {
		Set<String> set = new HashSet<String>();

		line = line.toLowerCase();

		List<String> ignoredWordsList = IgnoreWordsSupport.getIgnoredWords();
		
		for (String ignoredWord : ignoredWordsList) {
			line = line.replace(ignoredWord.toLowerCase(), "");
		}

		for (String keyWord : WarningWordsSupport.getWarningWords()) {
			if (!"".equals(keyWord.trim()) && line.contains(keyWord.toLowerCase().toLowerCase())) {
				set.add(keyWord);
			}
		}

		return set;
	}

	private static synchronized void printWarningWords(Set<String> keyWordsSet) {
		for (String keyWord : keyWordsSet) {
			if (!keyWord.trim().equals("")) {
				system_err_println("Please check: --> " + keyWord);
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

	public synchronized static void printAttentionWords(String file) {
		String fileName = file.substring(file.lastIndexOf("/") + 1); 
		
		for (String[] attentionFile : attentionWords) {
			if (attentionFile[0].equals(fileName)) {
				system_err_println("\nAttention: --> " + attentionFile[1] + "\n");
			}
		}
	}

	private synchronized static String replaceMsAuthorAndMsDate(String line) {
		if (line != null && line.contains("ms.author:")) {
			line = line.substring(0, line.indexOf("ms.author:") + 11) + ParameterSupport.MS_AUTHER;
		}
		if (line != null && line.contains("author:")&& !line.contains("ms.author:")) {
			line = line.substring(0, line.indexOf("author:") + 8) + ParameterSupport.AUTHER;
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
		String service = ParameterSupport.RUN_SERVICE;

		if(service.startsWith("includes")) {
			ParameterSupport.SOURCE_FOLDER = ParameterSupport.MOONCAKE_ROOT_FOLDER;
		} else {
			ParameterSupport.SOURCE_FOLDER = ParameterSupport.MOONCAKE_ROOT_FOLDER + "\\articles";
		}

		ParameterSupport.DESTINATION_FOLDER = ParameterSupport.TEST_FOLDER;

		ParameterSupport.SOURCE_FOLDER = ParameterSupport.SOURCE_FOLDER.replace("\\", "/");
		ParameterSupport.DESTINATION_FOLDER = ParameterSupport.DESTINATION_FOLDER.replace("\\", "/");
	}

	public synchronized static void setRunPath() {
		String runFolder = ParameterSupport.RUN_SERVICE;

		if (runFolder == null)
			throw new NullPointerException("runFolder is Null.");

		if (ParameterSupport.RUN_TYPE == ParameterSupport.RUN_TO_EN_US) {
			if(runFolder.startsWith("includes")) {
				ParameterSupport.SOURCE_FOLDER = ParameterSupport.GLOBAL_ROOT_FOLDER;
				ParameterSupport.DESTINATION_FOLDER = ParameterSupport.MOONCAKE_ROOT_FOLDER;
			} else {
				ParameterSupport.SOURCE_FOLDER = ParameterSupport.GLOBAL_ROOT_FOLDER + "\\articles";
				ParameterSupport.DESTINATION_FOLDER = ParameterSupport.MOONCAKE_ROOT_FOLDER + "\\articles";
			}

		} else if (ParameterSupport.RUN_TYPE == ParameterSupport.RUN_TO_ZH_CN) {
			if(runFolder.startsWith("includes")) {
				ParameterSupport.SOURCE_FOLDER = ParameterSupport.TECH_CONTENT_ROOT_FOLDER;
				ParameterSupport.DESTINATION_FOLDER = ParameterSupport.TEST_FOLDER;
			} else {
				ParameterSupport.SOURCE_FOLDER = ParameterSupport.TECH_CONTENT_ROOT_FOLDER + "\\articles";
				ParameterSupport.DESTINATION_FOLDER = ParameterSupport.TEST_FOLDER;
			}
		}

		ParameterSupport.SOURCE_FOLDER = ParameterSupport.SOURCE_FOLDER.replace("\\", "/");
		ParameterSupport.DESTINATION_FOLDER = ParameterSupport.DESTINATION_FOLDER.replace("\\", "/");
	}

	public static void system_out_println(String log) {
		if (ParameterSupport.WRITE_LOG_TO_FILE) {
			ParameterSupport.LOG_LIST.add(log);
		} else {
			System.out.println(log);
		}
	}
	
	public static void system_err_println(String log) {
		if (ParameterSupport.WRITE_LOG_TO_FILE) {
			ParameterSupport.LOG_LIST.add(log);
		} else {
			System.err.println(log);
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
	
//	public synchronized static String findFoldersByFileName(String subFolder, String fileName) {
//	String fileExistingFolder = null;
//
//	File[] listFiles = new File(subFolder).listFiles();
//
//	for (int i = 0; i < listFiles.length; i++) {
//		if (listFiles[i].isFile() && listFiles[i].getName().equals(fileName)) {
//			return subFolder;
//		}
//	}
//
//	for (int i = 0; i < listFiles.length; i++) {
//		if (listFiles[i].isDirectory()) {
//			fileExistingFolder = findFoldersByFileName(listFiles[i].getAbsolutePath(), fileName);
//			if (fileExistingFolder != null) {
//				return fileExistingFolder;
//			}
//		}
//	}
//
//	return fileExistingFolder;
//}
//	
//	@Deprecated
//	public synchronized static void printNotFoundIncludeFile(String absoFilePath) {
//		for (String includeFile : getNotFoundIncludeFiles(absoFilePath)) {
//			System.err.println("Include file not found in en-us repo: --> " + includeFile + "\n");
//		}
//	}
	
	// [!INCLUDE [active-directory-azuread-dev](../../../includes/active-directory-azuread-dev.md)]
	// check if included files are existing in en-us or not 
//	@Deprecated
//	public synchronized static List<String> getNotFoundIncludeFiles(String absoFilePath) {
//		List<String> list = new ArrayList<String>();
//
//		BufferedReader reader = null;
//
//		try {
//			reader = new BufferedReader(new InputStreamReader(new FileInputStream(absoFilePath), "utf-8"));
//
//			String line = null;
//			while ((line = reader.readLine()) != null) {
//				line = line.trim();
//				
//				if(line.startsWith("[!INCLUDE")) {
//					String subStr = line.substring(line.indexOf("(") + 1); 
//					subStr = subStr.substring(0, subStr.indexOf(")"));
//					subStr= subStr.replace("../", "").replace("./", "").replace("includes/", "").trim();
//					
//					File includeFile = new File(ParameterSupport.MOONCAKE_ROOT_FOLDER + "/includes/" + subStr);
//					
//					if(!includeFile.exists()) {
//						list.add(subStr);
//					}
//				}
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (reader != null) {
//					reader.close();
//					reader = null;
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return list;
//	}
}
