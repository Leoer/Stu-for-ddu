package myjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import customization.WacnReplace81;
import customization.support.ParameterSupport;

public class CheckMsDateAndCopyFiles {

	public static void main(String[] args) {
		// 1. read all file list
		System.out.println("Start...");
		System.out.println("==================================");
		
		List<String> fileList = WacnReplace81.readFileNameFromFileList(ParameterSupport.LIST_FILE);
		Set<String> fileSet = new TreeSet<String>(fileList);
		
		System.out.println("Get file list Done.");
		System.out.println("==================================");
		
		// 2. compare zh-cn main ms.date with zh-cn live ms.date
		//    if main ms.date is later than live ms.date 
		//    copy file to live from main
		
		System.out.println("Print files which need copy: ");
		System.out.println("==================================");
		
		int count = 0;
		for(String fileStr: fileSet) {
			String liveFilePath = "D:\\compare\\articles\\" + fileStr;
			String mainFilePath = "D:\\myfiles\\mc-docs-pr\\articles\\" + fileStr;

			if(fileStr.startsWith("includes")) {
				liveFilePath.replace("articles\\", "");
				mainFilePath.replace("articles\\", "");
			}
			
 			Date liveMsDate = getMsDate(liveFilePath);
			Date mainMsDate = getMsDate(mainFilePath);
			
			if(mainMsDate != null && liveMsDate != null && mainMsDate.after(liveMsDate)) {
			    copyFile(new File(mainFilePath), new File(liveFilePath));
			    
//			    System.out.println(++count + ". " + fileStr);
			    System.out.println(fileStr);
			}
		}
	}
	
	
	private static Date getMsDate(String fileAbsPath) {
		File file = new File(fileAbsPath);
		
		if(!file.exists()) {
			return null;
		}
		
		BufferedReader reader = null;	
	    try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
					
			String line = null;
			while ((line = reader.readLine()) != null) {
			    if(line.contains("ms.date:")) {
			    	line = line.replace("ms.date:", "").trim();
			    	
			    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			    	
			    	return sdf.parse(line);
			    }
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Wrong ms.date format: " + fileAbsPath);
			
			return null;
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
		
		return null;
	}
	
	private static synchronized void copyFile(File fromFile, File toFile) {
		FileChannel inChannel = null;
		FileChannel outChannel = null;

		toFile.getParentFile().mkdirs();
		
		try {
			inChannel = new FileInputStream(fromFile).getChannel();
			outChannel = new FileOutputStream(toFile).getChannel();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			inChannel.transferTo(0, inChannel.size(), outChannel);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inChannel != null) {
				try {
					inChannel.close();
					inChannel = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (outChannel != null) {
				try {
					outChannel.close();
					outChannel = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
