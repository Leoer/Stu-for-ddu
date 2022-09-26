package chinesehandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.time.DateUtils;

import chinesehandle.support.FileUtil;
import chinesehandle.support.ServiceBase;
import customization.WacnReplace81;
import customization.support.ConfigureSupport2;
import customization.support.ImageSupport2;
import customization.support.ParameterSupport;
//import support.CheckLinksIssue;

/***
 * 2019.06.24
 * 
 * @author alexch2
 *
 */
public class C_HandleFilesAndCreateLog {
    
	public static void main(String[] args) {
		System.out.println("Starting now ...");

		try {
			System.err.println("Don't forget to checkout and pull live branch.");

			// 1. move files from "master_copy_to_path" to zh-cn
			// 2. delete files that are marked as "redirected" and "Deleted"
			// 3. add redirection in ".openpublishing.redirection.json"
			handleFiles();

			// check and copy images
			checkFilesAndCreateLog(ServiceBase.getProperty("live_log_file_path"));

		} catch (Exception e) {
			FileUtil.writeToFile(e.getMessage(), ServiceBase.getProperty("error_log_file_path"));

			e.printStackTrace();
		}

		System.out.println("Done");
	}
	
	private static synchronized void checkFilesAndCreateLog(String logFilePath) {
		System.err.println("Start to check files and create log......."); 
		
		ParameterSupport.WRITE_LOG_TO_FILE = Boolean.valueOf(ServiceBase.getProperty("live_log_file_path"));
		
		WacnReplace81.system_out_println("Run for ZH-CN .......\n");

		ParameterSupport.RUN_TYPE = ParameterSupport.RUN_TO_ZH_CN;

		int count = 0;
		// file sample: cognitive-services/Computer-vision/QuickStarts/CSharp-hand-text.md
		for (String file : ServiceBase.getUpdatedFileSet()) {
			ParameterSupport.LOG_LIST.add(++count + ".========================================================================================");
			ParameterSupport.LOG_LIST.add(file);

			System.out.println(count + ". " + file);
			
			setRunInfo(file);
			
			customizeOneFile(file);
		}

		writeLogToFile(ParameterSupport.LOG_LIST, logFilePath);
		
		System.out.println("Check files and Create log Done..."); 
	}
	
	private synchronized static void setRunInfo(String fileName) {
		String service = getService(fileName);
		
		if(!service.equals(ParameterSupport.RUN_SERVICE)) {
			ParameterSupport.RUN_SERVICE = service;
			
			setTestPath();
			
			ConfigureSupport2.configure();
		}
	}
	
	private synchronized static String getService(String fileName) {
		fileName = fileName.replace("\\", "/");
		
		int lastSlash = fileName.lastIndexOf("/");
		
		return fileName.substring(0, lastSlash);
	}
	
	public static synchronized void setTestPath() {
		String service = ParameterSupport.RUN_SERVICE;

		if(service.startsWith("includes")) {
			ParameterSupport.SOURCE_FOLDER = ServiceBase.getProperty("zh_cn_repo_path");
		} else {
			ParameterSupport.SOURCE_FOLDER = ServiceBase.getProperty("zh_cn_repo_path") + "\\articles";
		}

		ParameterSupport.DESTINATION_FOLDER = ParameterSupport.TEST_FOLDER;

		ParameterSupport.SOURCE_FOLDER = ParameterSupport.SOURCE_FOLDER.replace("\\", "/");
		ParameterSupport.DESTINATION_FOLDER = ParameterSupport.DESTINATION_FOLDER.replace("\\", "/");
	}
	
	public static synchronized void customizeOneFile(String file) {
		String fileAbsolutePath = ParameterSupport.SOURCE_FOLDER + "/" + file;
		
		if(ConfigureSupport2.isUsefull(file)) {
			// a. check attention words. 
			WacnReplace81.printAttentionWords(file);
			
			// b. copy images. 
			ImageSupport2.copyImages(fileAbsolutePath); 
			
			// c. do replacement and check key words. 
			WacnReplace81.checkAndCustomize(file, false);
			
//			// d. check links issues
//			CheckLinksIssue.checkLinks(file);
			
			// e. check broken links. 
//			LinkSupport2.checkBrokenLinks(fileAbsolutePath);
		} else {
			WacnReplace81.system_err_println(" \n ------------------ File Not supported.");
		}

		WacnReplace81.system_out_println("");
	}

	private static synchronized void writeLogToFile(List<String> logList, String logFilePath) {
		String logContent = "";
		
		for(int i=0, size=logList.size(); i<size; i++) {
			logContent = logContent + logList.get(i) + "\r\n";
		}
		
		FileUtil.writeToFile(logContent, logFilePath);
	}
	
	public static synchronized boolean checkMsDateAndCreateLog() {
		boolean isAllMsDateValid = true;

		Map<String, String> map = FileUtil.getMsDateMap();

		// fileName, ms.date, issue
		List<String> msDateInfoList = new ArrayList<String>();

		// key: fileName
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();

		while (it.hasNext()) {
			String fileName = it.next();

			String msDateInfo = map.get(fileName);

			if (msDateInfo.equals(FileUtil.NOT_TRANSLATED)) {
				
				msDateInfoList.add(fileName + ", ," + FileUtil.NOT_TRANSLATED);
				
				isAllMsDateValid = false;
			} else if (msDateInfo.equals(FileUtil.NO_MS_DATE)) {

				msDateInfoList.add(fileName + ","+ FileUtil.NO_MS_DATE + ", ");
			} else {
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				try {
					Date msDate = sdf.parse(msDateInfo);

					int gap_day = Integer.parseInt(ServiceBase.getProperty("translation_day_gap"));
					
					if (msDate.before(DateUtils.addDays(new Date(), gap_day * -1))) {
						isAllMsDateValid = false;
						msDateInfoList.add(fileName + "," + msDateInfo + "," + FileUtil.NOT_TRANSLATED);
					} else {
						msDateInfoList.add(fileName + "," + msDateInfo + ", ");
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}

		Collections.sort(msDateInfoList);
		
		FileUtil.writeMsDateInfoToExcel(msDateInfoList);

		return isAllMsDateValid;
	}
	
	private static synchronized void handleFiles() throws Exception {
		// move translated files to zh-cn folder
		moveBackFiles();
		
		// delete redirected files
		FileUtil.deleteRedirectedFiles();
		
		if(!ServiceBase.getRedirectedFileSet().isEmpty()) {
			// update .openpublishing.redirection.json
			FileUtil.updateRedirectionJsonFile();
		}
	}
	
	private static synchronized void moveBackFiles() throws Exception {
		System.out.println("Starting moving backup files to \"live\" branch...\n"); 
		
		FileUtil.moveBackFiles(ServiceBase.getProperty("master_copy_to_path"), ServiceBase.getProperty("zh_cn_repo_path"));
		
		System.out.println("move translated docs to zh-cn folder...Done."); 
	}
}






