package customization.services;

import java.util.ArrayList;
import java.util.List;

public class logic_apps {
	private static final List<String[]> words = new ArrayList<String[]>(200);
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String[]> getWords() {
		words.add(new String[] { "<br>",   "<br />" });
		words.add(new String[] { "<br/>",   "<br />" });
		words.add(new String[] { "</br>",   "<br />" });
		words.add(new String[] { "login.partner.microsoftonline.cn",   "login.chinacloudapi.cn" });
		words.add(new String[] { "https://portal.microsoft.com",   "https://portal.azure.cn" });
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
	    warningWords.add("logic-apps-sku-azure-arc-enabled.md");
	    warningWords.add("integration service environment");
	    warningWords.add("Send telemetry from a device to an IoT hub");
//	    
//	    warningWords.add("appgwingress.blob.core.chinacloudapi.cn"); // no need to replace, should be: appgwingress.blob.core.windows.net
//	    
	    warningWords.add("Integration service environment");
//	    
//	    // 05/25/2021, Feedback 430992
//	    warningWords.add("AGIC add-on");
//	    warningWords.add("AGIC addon");
//	    
//	    // 08/18/2021, Feedback 474888
//	    warningWords.add("Geo-Match");
//	    warningWords.add("Geomatch");
//	    warningWords.add("GeoMatch");
//	    warningWords.add("geomatch");
//	    
//	    warningWords.add("");
//	    warningWords.add("ISE");
	    
	    return warningWords;
	}
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("schemas.");
//		ignoredWords.add("china north 2");
//		ignoredWords.add("chinanorth2");
//		ignoredWords.add("azure-docs-powershell-samples");
//		ignoredWords.add("Hardware security module (HSM)-validated certificates are not supported");
//		
//		ignoredWords.add("app-service-app-service-environment-web-application-firewall");
//		ignoredWords.add("web-application-firewall-troubleshoot.md");
//		ignoredWords.add("application-gateway-web-application-firewall-portal.md");
//		
	    return ignoredWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"create-vmss-template.md",                                      "删掉 \"Deploy the Azure Resource Manager template by using click-to-deploy\", 因为它跳到 global 去了"});
//		
//		attentionWords.add(new String[]{"waf-overview.md",                                              "删掉 \"Azure Security Center\" 部分, 不适用"}); 
//		
//		attentionWords.add(new String[]{"application-gateway-create-gateway-arm-template.md",           "\"Deploy the Azure Resource Manager template by using click-to-deploy\" 部分定制过，不要修改"});
//		
//		attentionWords.add(new String[]{"configure-application-gateway-with-private-frontend-ip.md",    "删除 \"cloud shell\" 相关的图片"});
//		
////		attentionWords.add(new String[]{"application-gateway-autoscaling-zone-redundant.md",            "Pricing in US East, Example 1, Example 2 和 Example 3 删掉，美元记账不适合 China; \"## Supported regions\" 删掉"});
//		
////		attentionWords.add(new String[]{"application-gateway-faq.md",                                   "删掉 \"DDoS\" 相关的内容; \nCan Application Gateway communicate with instances outside of its virtual network or outside of its subscription? 部分添加 expressroute!!"});
//
//		attentionWords.add(new String[]{"configure-keyvault-ps.md",                                     " 非常重要： 代码中 location 使用 China North 2, 而不是 China North !!!!!!!!!!!!!"});
//		
//		attentionWords.add(new String[]{"application-gateway-metrics.md",                               "### Alert rules on metrics 要删掉，没有这个功能"});
//		
//		attentionWords.add(new String[]{"ingress-controller-expose-service-over-http-https.md",           "\"https://raw.githubusercontent.com...\" 的内容要替换"});
//		
//		// Feedback 341236
//		attentionWords.add(new String[]{"ingress-controller-install-new.md",            "### Install Ingress Controller Helm Chart 部分增加: environment: AzureChinaCloud"});
//		attentionWords.add(new String[]{"ingress-controller-install-existing.md",       "## Install Ingress Controller as a Helm Chart 部分增加: environment: AzureChinaCloud, 共3处。"});
//		
//		attentionWords.add(new String[]{"custom-waf-rules-overview.md",                 "GeoMatch 不支持"});
//		
//		attentionWords.add(new String[]{"overview-v2.md",           "\"## Supported regions\" 删掉"});
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {

		//**integration service environments** object not supported on Mooncake.
		//** Integration Service Environment**  can not be find on Mooncake portal.		
		uselessFiles.add("add-artifacts-integration-service-environment-ise.md");
		
		//`Azure ARC enabled logic apps`  not available on Mooncake.
		uselessFiles.add("azure-arc-enabled-logic-apps-create-deploy-workflows.md");
		
		//`Azure ARC enabled Kubernete` not available on Mooncake.
		uselessFiles.add("azure-arc-enabled-logic-apps-overview.md");
		
		//**integration service environments** object not supported on Mooncake.
		uselessFiles.add("connect-virtual-network-vnet-isolated-environment.md");
		
		//Intergration service environment is invalid on Mooncake currently.
		uselessFiles.add("connect-virtual-network-vnet-isolated-environment-overview.md");
		
		//ISE not valid on Moooncake. Currently Customer managed keys only apply for West US 2, East US, and South Central US.
		uselessFiles.add("connect-virtual-network-vnet-isolated-environment-overview.md");
		
		//**integration service environments** object not supported on Mooncake.
		uselessFiles.add("connect-virtual-network-vnet-set-up-single-ip-address.md");
		
		//`Tasks` in Automation tab is not available on Mooncake.
		uselessFiles.add("create-automation-tasks-azure-resources.md");
		
		//**Microsoft.Logic/integrationServiceEnvironments** Type did not exists in Mooncake.
		uselessFiles.add("create-integration-service-environment-rest-api.md");
		
		//**UserAssigned** not supported on Mooncake.
//		uselessFiles.add("create-managed-service-identity.md");
		
		//**AzureDiagnostics** not showed on Log Analytics object.
//		uselessFiles.add("create-monitoring-tracking-queries.md");
		
		//`Automation->Tasks(perview)` not exists on Service bus property panel.
		uselessFiles.add("create-replication-tasks-azure-resources.md");
		
		//NOT AVAILABLE ON Logic apps --> Add --> Preview submenu on Mooncake. Currently only Consumption available on Mooncake.
//		uselessFiles.add("create-single-tenant-workflows-azure-portal.md");still not available
		
		//Only show action in `Built In` tab, such as https,  NOT AVAILABLE ON `Azure` tab.
//		uselessFiles.add("create-single-tenant-workflows-visual-studio-code.md");still not available
		
		//logic app (preview)` not exists on search box of Mooncake portal.
		uselessFiles.add("create-stateful-stateless-workflows-azure-portal.md");
		
		//`Logic App(Preview)` did not available on Mooncake marketplace.
		uselessFiles.add("create-stateful-stateless-workflows-visual-studio-code.md");
		
		//ISE not valid on Moooncake. Currently Customer managed keys only apply for West US 2, East US, and South Central US.
		uselessFiles.add("customer-managed-keys-integration-service-environment.md");
		
		//NOT AVAILABLE ON SINGLE CONTENT logic app(standard) on Mooncake.
//		uselessFiles.add("devops-deployment-single-tenant-azure-logic-apps.md");
		
		//NOT AVAILABLE ON SINGLE CONTENT logic app(standard) on Mooncake. So we can not estimate the storage cost.
//		uselessFiles.add("estimate-storage-costs.md");
//		It seems available.
		
		//WorkFlow is smooth even the template will be altered one by one.
		uselessFiles.add("export-from-microsoft-flow-logic-app-template.md");

		//`Enable auditing and logging` not available in recommendation of Security Center on Mooncake.
		uselessFiles.add("healthy-unhealthy-resource.md");

		//**Microsoft.Logic/integrationServiceEnvironments** Type did not exists in Mooncake.
		uselessFiles.add("ise-manage-integration-service-environment.md");

		//**inline code** not valid on Mooncake. Currently preview.
		uselessFiles.add("logic-apps-add-run-inline-code.md");

		//**Bing Maps** not valid on Mooncake. Currently preview.
		uselessFiles.add("logic-apps-control-flow-run-steps-group-scopes.md");

		//`Logic App(Preview)` did not available on Mooncake marketplace.
		uselessFiles.add("logic-apps-overview-preview.md");

		//**tweet** involved content which is blocked in China.
		uselessFiles.add("logic-apps-scenario-social-serverless.md");

		//**dropbox** can not be found on ALL category in Mooncake currently.
		uselessFiles.add("logic-apps-using-file-connector.md");

		//**Logic Apps B2B**  can not be find on Mooncake portal.
		uselessFiles.add("monitor-b2b-messages-log-analytics.md");

		//NOT AVAILABLE ON SINGLE CONTENT logic app(standard) on Mooncake. 
//		uselessFiles.add("secure-single-tenant-workflow-virtual-network-private-endpoint.md");
//		This article available ?
		
		//NOT AVAILABLE ON SINGLE CONTENT logic app(standard) on Mooncake. 
//		uselessFiles.add("devops-deployment-single-tenant-azure-logic-apps.md");

		//NOT AVAILABLE ON SINGLE CONTENT logic app(standard) on Mooncake. 
//		It needs to confirm.
//		uselessFiles.add("single-tenant-overview-compare.md");

		//**Bing Maps** not valid on Mooncake. Currently preview.
		uselessFiles.add("tutorial-build-schedule-recurring-logic-app-workflow.md");

		// The area mentioned is not available.
		uselessFiles.add("set-up-zone-redundancy-availability-zones.md");
		
//		ISE NOT AVAILABLE.
		uselessFiles.add("export-from-ise-to-standard-logic-app.md");
		
		return uselessFiles;
	}
	
	
//	public static class Scripts {
//	
//	}
}
