package myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import customization.WacnReplace81;
import customization.support.ParameterSupport;

public class Test {

	public static void main(String[] args) throws ParseException {

//		List<String> fileList = WacnReplace81.readFileNameFromFileList(ParameterSupport.LIST_FILE);
//		
//		for(String file: fileList) {
//			String comparefolder = "D:\\compare\\articles\\" + fileStr;
////			String mainFilePath = "D:\\myfiles\\mc-docs-pr.zh-cn\\articles\\" + fileStr;
//			
//			copyFile(comparefolder, zh-cn);
//		}
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
