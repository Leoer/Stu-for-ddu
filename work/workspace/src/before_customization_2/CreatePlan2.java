package before_customization_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import before_customization_2.details.Plan_Active_Directory;
import before_customization_2.details.Plan_Web_Application_Firewall;
import before_customization_2.details.ServicePlanBase;

public class CreatePlan2 {
	
	public static void main(String[] args) throws IOException { 
		ServicePlanBase.EXCLE_FILE_PATH = "D:/mooncake/customization_files_0926.xlsx";
		
		ServicePlanBase.GLOBAL_REPO_PATH = "D:/mooncake/Docs/azure-docs-pr/articles/"; // latest global
		
		ServicePlanBase.GLOBAL_BACKUP_FOLDER = "D:/mooncake/_backup/global/azure-docs-pr_0913/articles/"; // old global
		
		// ignore files that only change metedata
		ServicePlanBase.IGNORE_METEDATA_CHANGE = false;
		
		List<ServicePlanBase> servicePlanList = new ArrayList<ServicePlanBase>();
		
		servicePlanList.add(new ServicePlanBase("iot-hub"));
		servicePlanList.add(new ServicePlanBase("machine-learning"));  
		servicePlanList.add(new ServicePlanBase("site-recovery"));
		servicePlanList.add(new ServicePlanBase("azure-functions")); 
		servicePlanList.add(new ServicePlanBase("logic-apps"));  
		servicePlanList.add(new ServicePlanBase("app-service")); 
		servicePlanList.add(new ServicePlanBase("azure-resource-manager"));
		servicePlanList.add(new ServicePlanBase("route-server"));
		 
		ServicePlanBase.writeToExcel(ServicePlanBase.EXCLE_FILE_PATH, servicePlanList);
	}
}







