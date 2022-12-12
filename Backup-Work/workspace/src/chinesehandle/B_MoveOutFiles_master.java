package chinesehandle;

import chinesehandle.support.FileUtil;
import chinesehandle.support.ServiceBase;

/***
 * 2019.06.24
 * 
 * @author alexch2
 *
 */
public class B_MoveOutFiles_master {
	
	public static void main(String[] args) {
		System.out.println("Starting now ...");

		try {
			getChineseDocsFrom_Master();

		} catch (Exception e) {
			FileUtil.writeToFile(e.getMessage(), ServiceBase.getProperty("error_log_file_path"));

			e.printStackTrace();
		}

		System.out.println("Done");
	}
	
	
	private static synchronized void getChineseDocsFrom_Master() throws Exception {
		FileUtil.readAndMoveFiles(ServiceBase.getProperty("zh_cn_repo_path"), ServiceBase.getProperty("master_copy_to_path"));
		
		System.out.println("Copy files from master...Done."); 
	}
}






