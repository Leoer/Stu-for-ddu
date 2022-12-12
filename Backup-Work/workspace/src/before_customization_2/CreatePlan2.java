package before_customization_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import before_customization_2.details.Plan_Active_Directory;
import before_customization_2.details.Plan_Web_Application_Firewall;
import before_customization_2.details.ServicePlanBase;

public class CreatePlan2 {
	
	public static void main(String[] args) throws IOException { 
		ServicePlanBase.EXCLE_FILE_PATH = "d:/customization_files.xlsx";
		
		ServicePlanBase.GLOBAL_REPO_PATH = "d:/myfiles/azure-docs-pr/articles/";
		
		ServicePlanBase.GLOBAL_BACKUP_FOLDER = "d:/backup/global/2022-03-07 after sync/articles/";
		
		// ignore files that only change metedata
		ServicePlanBase.IGNORE_METEDATA_CHANGE = true;
		
		List<ServicePlanBase> servicePlanList = new ArrayList<ServicePlanBase>();
		
		servicePlanList.add(new Plan_Active_Directory("active-directory"));
		servicePlanList.add(new ServicePlanBase("active-directory-b2c"));  
		servicePlanList.add(new ServicePlanBase("Azure-RMSDocs"));      // New, from derek
		servicePlanList.add(new ServicePlanBase("application-gateway")); 
		servicePlanList.add(new ServicePlanBase("azure-cache-for-redis"));  
		servicePlanList.add(new ServicePlanBase("azure-functions"));  
		servicePlanList.add(new ServicePlanBase("cloud-services"));  
		servicePlanList.add(new ServicePlanBase("cloud-services-extended-support")); 
		servicePlanList.add(new ServicePlanBase("role-based-access-control"));  
		servicePlanList.add(new ServicePlanBase("service-health"));  
		servicePlanList.add(new ServicePlanBase("time-series-insights"));  
		servicePlanList.add(new ServicePlanBase("virtual-machine-scale-sets")); 
		servicePlanList.add(new ServicePlanBase("active-directory-domain-services")); 
		servicePlanList.add(new ServicePlanBase("spring-cloud"));
		servicePlanList.add(new ServicePlanBase("data-explorer"));
		servicePlanList.add(new ServicePlanBase("hpc-cache"));
		servicePlanList.add(new Plan_Web_Application_Firewall("web-application-firewall"));
		
		ServicePlanBase.writeToExcel(ServicePlanBase.EXCLE_FILE_PATH, servicePlanList);
	}
}







