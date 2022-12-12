package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Service_Health {
	private static final List<String[]> words = new ArrayList<String[]>(200);
	private static final List<String> uselessFiles = new ArrayList<String>();

	public synchronized static List<String[]> getWords() {
		words.add(new String[] { "https://aka.ms/azureservicehealth",   "https://portal.azure.cn/?source=akams%2F#blade/Microsoft_Azure_Health/AzureHealthBrowseBlade/serviceIssues" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });

		return words;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// 06/23/2020, from: Kejie Ma <kejiema@microsoft.com>, subject: "Need to validate https://docs.azure.cn/zh-cn/service-health/resource-health-alert-arm-template-guide"
		//Hello Alex,

		//I have tried the introduced content in https://docs.azure.cn/zh-cn/service-health/resource-health-alert-arm-template-guide but it failed. We have engaged PG that they need to add a feature in Mooncake to make it work. The ETA will be end of July.
		//Do you know anyone have validated the steps described in that doc? We need to double check with them if this is functioning in Mooncake. If not, pls help hide the doc on a.cn.

//		//Best regards,
//		//Kejie
//		uselessFiles.add("resource-health-alert-arm-template-guide.md");
		
		// 07/22/2020, portal operation different
//		uselessFiles.add("resource-health-alert-monitor-guide.md");
		
		uselessFiles.add("");
		uselessFiles.add("");

		return uselessFiles;
	}
}