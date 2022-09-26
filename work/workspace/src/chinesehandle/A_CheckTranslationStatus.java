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

import chinesehandle.support.FileUtil;
import chinesehandle.support.ServiceBase;

/***
 * 2019.06.24
 * 
 * @author alexch2
 *
 */
public class A_CheckTranslationStatus {
	
	public static void main(String[] args) {
		System.out.println("Starting now ...");
		
		try {
			boolean isAllFilesTranslated = checkMsDateAndCreateLog();

			System.out.println("");
			
			if (isAllFilesTranslated) {
				System.out.println("Check ms.data done. All files are translated. See file configured in \"ms_date_file_path\" for details."); 
			} else {
				System.err.println("Some files not translsted. See file configured in \"ms_date_file_path\" for details."); 
			}
		} catch (Exception e) {
			FileUtil.writeToFile(e.getMessage(), ServiceBase.getProperty("error_log_file_path"));

			e.printStackTrace();
		}

		System.out.println("Done");
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

					Date adaptedDate = sdf.parse(ServiceBase.getProperty("customization_date"));
					
					if (msDate.before(adaptedDate)) {
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
	
}






