package customization.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import support.CommonAction;

public class ImageSupport2 {

	// ![导出设置](./media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
	// ![导出设置](../../media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
	// ![导出设置]( media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
	// [1]: ./media/active-directory-certificate-based-authentication-ios/ic195031.png
	// :::image type="content" source="./media/site-recovery-active-directory/azure-test-network.png" alt-text="Azure test network":::
	// <a href="scenario-daemon-overview.md"><img alt="Daemon app that calls web APIs" src="media/scenarios/daemon-app.svg"></a>
	private synchronized static String getMediaLine(String line) {
		line = line.replace("\\", "/").trim();
		
		String mediaLine = null;
		
		try {
			// ![导出设置](./media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
			if(line.contains("](") && (line.contains("media/") || line.contains("images/"))) {
				mediaLine = line.substring(line.indexOf("](") + 2);
				mediaLine = mediaLine.substring(0, mediaLine.indexOf(")")).trim(); 
			// [1]: ./media/active-directory-certificate-based-authentication-ios/ic195031.png
			} else if(line.startsWith("[") && line.contains("]:")) { 
				mediaLine = line.substring(line.indexOf("]:") + 2).trim();
			// :::image type="content" source="./media/site-recovery-active-directory/azure-test-network.png" alt-text="Azure test network":::	
			} else if(line.contains(":::image") && !line.startsWith(":::image-end:::")) {
				mediaLine = line.substring(line.indexOf("source=") + 8).replace("\'", "\"");
				mediaLine = mediaLine.substring(0, mediaLine.indexOf("\"")).trim();
		    // <img alt="Daemon app that calls web APIs" src="media/scenarios/daemon-app.svg">
			} else if(line.contains("<img")) {
				mediaLine = line.substring(line.indexOf("<img")).replace("\'", "\""); 
				// <img src= "./media/active-directory-domain-services-alerts/running-icon.png" width = "15" alt="Green check mark for running">
				mediaLine = mediaLine.replace("src= \"", "src=\"");
				mediaLine = mediaLine.substring(mediaLine.indexOf("src=") + 5);
				mediaLine = mediaLine.substring(0, mediaLine.indexOf("\"")).trim();
			}
			
			// ./media/howto-find-activity-reports/482.png "Audit logs"
			if(mediaLine != null && mediaLine.contains("\"")) {
				mediaLine = mediaLine.substring(0, mediaLine.indexOf("\"")).trim(); 
			}
		
		} catch(Exception e) {
			System.out.println("line: " + line);
			
			throw e;
		}
		
		return mediaLine;  
	}
	
	private synchronized static Collection<String> getMediaLines(String fileAbsolutePath) {
		List<String> lineList = CommonAction.readToList(fileAbsolutePath);
		
		Set<String> mediaLineSet = new HashSet<String>();
		
		for(String line: lineList) {
			String mediaLine = getMediaLine(line);
		
			if(mediaLine != null && (mediaLine.contains("media/") || mediaLine.contains("images/"))) {
				mediaLineSet.add(mediaLine);
			}
		}
		
		return mediaLineSet;
	}

	public synchronized static void copyImages(String fileAbsolutePath) {
		
		Collection<String> mediaLineList = getMediaLines(fileAbsolutePath);
		
		for(String mediaLine: mediaLineList) {
			handleImage(fileAbsolutePath, mediaLine);
		}
	}
	
	// mediaLine:
	// ./media/site-recovery-active-directory/azure-test-network.png
	// ../media/site-recovery-active-directory/azure-test-network.png
	// ../../media/site-recovery-active-directory/azure-test-network.png
	// media/site-recovery-active-directory/azure-test-network.png
	private synchronized static void handleImage(String fileAbsolutePath, String mediaLine) {
		File file = new File(fileAbsolutePath);
		
		int count = StringUtils.countMatches(mediaLine, "../");
		
		File parentFile = file.getParentFile();
		for(int i=0; i<count; i++) {
			parentFile = parentFile.getParentFile();
		}
		
		String fromFile = parentFile.getAbsolutePath().replace("\\", "/") + "/" + mediaLine.replace("../", "").replace("./", "");
		String toFile;
		
		if(ParameterSupport.RUN_TYPE == ParameterSupport.RUN_TO_EN_US) {
			fromFile = fromFile.replace(ParameterSupport.MOONCAKE_ROOT_FOLDER, ParameterSupport.GLOBAL_ROOT_FOLDER);
			fromFile = fromFile.replace(ParameterSupport.TECH_CONTENT_ROOT_FOLDER, ParameterSupport.GLOBAL_ROOT_FOLDER);
			
			toFile = fromFile.replace(ParameterSupport.GLOBAL_ROOT_FOLDER, ParameterSupport.MOONCAKE_ROOT_FOLDER); 
		} else {
			fromFile = fromFile.replace(ParameterSupport.TECH_CONTENT_ROOT_FOLDER, ParameterSupport.MOONCAKE_ROOT_FOLDER);	
			fromFile = fromFile.replace(ParameterSupport.GLOBAL_ROOT_FOLDER, ParameterSupport.MOONCAKE_ROOT_FOLDER);
			
			toFile = fromFile.replace(ParameterSupport.MOONCAKE_ROOT_FOLDER, ParameterSupport.TECH_CONTENT_ROOT_FOLDER); 
		}
		
		// 01/13/2022, 
		if(toFile.contains("Azure-RMSDocs")) {
			toFile = toFile.replace("Azure-RMSDocs", "information-protection");
		}
		
		if(new File(fromFile).exists()) {
			copyFile(fromFile, toFile);
		}
		
		// copy localized files
		if(ParameterSupport.RUN_TYPE == ParameterSupport.RUN_TO_EN_US) {
			fromFile = fromFile.replace(ParameterSupport.GLOBAL_ROOT_FOLDER, ParameterSupport.LOCAL_IMAGE_ROOT);
		} else {
			fromFile = fromFile.replace(ParameterSupport.MOONCAKE_ROOT_FOLDER, ParameterSupport.LOCAL_IMAGE_ROOT);
		}
		
		if(new File(fromFile).exists()) {
			copyFile(fromFile, toFile);
		}
	}
	
	@SuppressWarnings("resource")
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

	private synchronized static void copyFile(String sourceFileName, String destFileName) {
		copyFile(new File(sourceFileName), new File(destFileName));
	}
}
