package before_customization_2.details;

import java.util.ArrayList;
import java.util.List;

public class Plan_Active_Directory extends ServicePlanBase {

	public Plan_Active_Directory(String service) {
		super(service);
	}

	protected List<String> getAllBackupFiles(String service) {
		List<String> backupFileList = new ArrayList<String>(1000);
		
		ServicePlanBase.getAllFiles(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + service);
		
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/azuread-dev");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/authentication");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/conditional-access");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/develop");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/devices");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/enterprise-users");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/external-identities");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/fundamentals");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/governance");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/hybrid");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/manage-apps");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/managed-identities-azure-resources");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/privileged-identity-management");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/reports-monitoring");
		ServicePlanBase.getAllFilesIncludingSubFolder(backupFileList, ServicePlanBase.GLOBAL_BACKUP_FOLDER + "active-directory/roles");
		

		return backupFileList;
	}
	
	protected List<String> getAllGlobalFiles(String service) {
		List<String> globalFileList = new ArrayList<String>(1000);
		
		ServicePlanBase.getAllFiles(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + service);
		
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/azuread-dev");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/authentication");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/external-identities");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/conditional-access");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/develop");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/fundamentals");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/governance");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/hybrid");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/manage-apps");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/managed-identities-azure-resources");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/privileged-identity-management");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/reports-monitoring");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/roles");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/enterprise-users");
		ServicePlanBase.getAllFilesIncludingSubFolder(globalFileList, ServicePlanBase.GLOBAL_REPO_PATH + "active-directory/devices");
		
		return globalFileList;
	}
	
	
	
}
