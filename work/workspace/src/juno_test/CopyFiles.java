package juno_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyFiles {
	private static List<String> my_services = new ArrayList<String>();

	private static String QUERY_DATA_CHECKEDIN_XLSX_PATH = "D:/mooncake/query_data_checkedin.xlsx";
	
	private static String PREFIX = "Github-85544329.main.Azure.mooncake-docs.articles/";
	
	private static String SOURCE_FOLDER = "D:/mooncake/Translated_articles/0916/articles/";
	private static String DEST_FOLDER = "D:/mooncake/Translated_articles/articles/";

	static {
		my_services.add("iot-hub");	
		my_services.add("machine-learning");  
		my_services.add("site-recovery");      
		my_services.add("app-service"); 
		my_services.add("azure-resource-manager");
		my_services.add("azure-functions");  
		my_services.add("logic-apps");  
		my_services.add("route-server");  
		
//		my_services.add("cloud-services-extended-support"); 
//		my_services.add("role-based-access-control");  
//		my_services.add("service-health");  
//		my_services.add("time-series-insights");  
//		my_services.add("virtual-machine-scale-sets"); 
//		my_services.add("active-directory-domain-services"); 
//		my_services.add("spring-cloud");
//		my_services.add("data-explorer");
//		my_services.add("hpc-cache");
	}

	public static void main(String[] args) {

		// 1. read excel, read all my files
		List<String> myfiles = readFileListFromExcel();

		System.out.println("Total files: " + myfiles.size());
		
		// 2. copy files from SOURCE_FOLDER to DEST_FOLDER(update ms.date or not)
		readAndMoveFiles(myfiles, SOURCE_FOLDER, DEST_FOLDER, true);

		System.out.println("Move files Done.");
		
		// 3. copy images
		for (String file : myfiles) {
			copyImages(SOURCE_FOLDER + "/" + file);
		}
		
		System.out.println("Copy images Done.");
	}

	private static synchronized List<String> readFileListFromExcel() {
		List<String> fileList = new ArrayList<String>(100);

		try {

			FileInputStream excelFile = new FileInputStream(new File(QUERY_DATA_CHECKEDIN_XLSX_PATH));
			XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			int rowCount = 0;
			while (rowIterator.hasNext()) {
				Row currentRow = rowIterator.next();

				rowCount++;

				if (rowCount == 1) {
					continue;
				}

				// databricks/sql/language-manual/sql-ref-functions-builtin-alpha.md
				String file = "";
				
				if (currentRow.getCell(0) != null) {
					file = currentRow.getCell(0).getStringCellValue().trim().replace("\\", "/").replace(PREFIX, "");

					String service;
					if(file.contains("/")) {
						service = file.substring(0, file.indexOf("/"));
					} else {
						service = file;
					}

					if (my_services.contains(service)) {
						fileList.add(file);
					}
				}
			}

			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileList;
	}

	private static synchronized void readAndMoveFiles(List<String> myfiles, String source_folder, String dest_folder, boolean updateMsDate) {
		for (String file : myfiles) {

			File fromFile = new File(source_folder + "/" + file);

			if (!fromFile.exists()) {
				System.err.println("Exception --> " + fromFile.getAbsolutePath() + ": File not found.");
				continue;
			}

			File toFile = new File(dest_folder + "/" + file);

			BufferedReader reader = null;
			BufferedWriter writer = null;
			try {
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(fromFile), "utf-8"));

				String allContent = "";
				String line = null;

				while ((line = reader.readLine()) != null) {
					if (updateMsDate && line.trim().startsWith("ms.date:")) {
						SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

						line = line.substring(0, line.indexOf("ms.date:")) + "ms.date: " + sdf.format(new Date());
					}

					allContent = allContent + line + "\r\n";
				}

				if (!toFile.exists()) {
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
	}

	private synchronized static void copyImages(String fileAbsolutePath) {

		Collection<String> mediaLineList = getMediaLines(fileAbsolutePath);

		for (String mediaLine : mediaLineList) {
			handleImage(fileAbsolutePath, mediaLine);
		}
	}

	private synchronized static Collection<String> getMediaLines(String fileAbsolutePath) {
		List<String> lineList = readToList(fileAbsolutePath);

		Set<String> mediaLineSet = new HashSet<String>();

		for (String line : lineList) {
			String mediaLine = getMediaLine(line);

			if (mediaLine != null && (mediaLine.contains("media/") || mediaLine.contains("images/"))) {
				mediaLineSet.add(mediaLine);
			}
		}

		return mediaLineSet;
	}

	// ![导出设置](./media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
	// ![导出设置](../../media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
	// ![导出设置](// media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
	// [1]:	// ./media/active-directory-certificate-based-authentication-ios/ic195031.png
	// :::image type="content" source="./media/site-recovery-active-directory/azure-test-network.png" alt-text="Azure test network":::
	// <a href="scenario-daemon-overview.md"><img alt="Daemon app that calls web APIs" src="media/scenarios/daemon-app.svg"></a>
	private synchronized static String getMediaLine(String line) {
		line = line.replace("\\", "/").trim();

		String mediaLine = null;

		try {
			// ![导出设置](./media/quickstart-azure-monitor-stream-logs-to-event-hub/ExportSettings.png)
			if (line.contains("](") && (line.contains("media/") || line.contains("images/"))) {
				mediaLine = line.substring(line.indexOf("](") + 2);
				mediaLine = mediaLine.substring(0, mediaLine.indexOf(")")).trim();
				// [1]:
				// ./media/active-directory-certificate-based-authentication-ios/ic195031.png
			} else if (line.startsWith("[") && line.contains("]:")) {
				mediaLine = line.substring(line.indexOf("]:") + 2).trim();
				// :::image type="content"
				// source="./media/site-recovery-active-directory/azure-test-network.png"
				// alt-text="Azure test network":::
			} else if (line.contains(":::image") && !line.startsWith(":::image-end:::")) {
				mediaLine = line.substring(line.indexOf("source=") + 8).replace("\'", "\"");
				mediaLine = mediaLine.substring(0, mediaLine.indexOf("\"")).trim();
				// <img alt="Daemon app that calls web APIs"
				// src="media/scenarios/daemon-app.svg">
			} else if (line.contains("<img")) {
				mediaLine = line.substring(line.indexOf("<img")).replace("\'", "\"");
				// <img src= "./media/active-directory-domain-services-alerts/running-icon.png"
				// width = "15" alt="Green check mark for running">
				mediaLine = mediaLine.replace("src= \"", "src=\"");
				mediaLine = mediaLine.substring(mediaLine.indexOf("src=") + 5);
				mediaLine = mediaLine.substring(0, mediaLine.indexOf("\"")).trim();
			}

			// ./media/howto-find-activity-reports/482.png "Audit logs"
			if (mediaLine != null && mediaLine.contains("\"")) {
				mediaLine = mediaLine.substring(0, mediaLine.indexOf("\"")).trim();
			}

		} catch (Exception e) {
			System.out.println("line: " + line);

			throw e;
		}

		return mediaLine;
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
		for (int i = 0; i < count; i++) {
			parentFile = parentFile.getParentFile();
		}

		String fromFile = parentFile.getAbsolutePath().replace("\\", "/") + "/"	+ mediaLine.replace("../", "").replace("./", "");
		String toFile = fromFile.replace(SOURCE_FOLDER, DEST_FOLDER);

		if (new File(fromFile).exists()) {
			copyFile(fromFile, toFile);
		}
	}

	private static synchronized List<String> readToList(String listFile) {
		List<String> list = new ArrayList<String>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(listFile), "utf-8"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.trim().equals("")) {
					continue;
				}

				list.add(line.trim());
			}

		} catch (FileNotFoundException e) {
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
