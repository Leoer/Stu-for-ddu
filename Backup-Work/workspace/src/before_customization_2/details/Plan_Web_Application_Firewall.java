package before_customization_2.details;

import java.util.ArrayList;
import java.util.List;

public class Plan_Web_Application_Firewall extends ServicePlanBase { 
	
	public Plan_Web_Application_Firewall(String service) {
		super(service);
	}
	
	protected List<String> getAllBackupFiles(String service) {
		List<String> backupFileList = new ArrayList<String>(100);
		
		ServicePlanBase.getAllFiles(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + service);
		
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "web-application-firewall/ag");
		
		return backupFileList;
	}
	
	protected List<String> getAllGlobalFiles(String service) {
		List<String> globalFileList = new ArrayList<String>(100);
		
		ServicePlanBase.getAllFiles(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + service);
		
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "web-application-firewall/ag");
		
		return globalFileList;
	}
	
 
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
