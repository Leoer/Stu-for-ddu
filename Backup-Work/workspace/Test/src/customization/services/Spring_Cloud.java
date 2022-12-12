package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Spring_Cloud {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();

	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("china east 2");
		ignoredWords.add("China East 2");
		ignoredWords.add("chinaeast2");
		
		// 10/29/2021, derek said on teams: Spring Cloud 从11/1起 在中国北部2 可用
		ignoredWords.add("china north 2");
		ignoredWords.add("China North 2");
		ignoredWords.add("chinanorth2");
		
		ignoredWords.add("https://docs.microsoft.com/azure/devops/");
		
		ignoredWords.add("Azure Public DNS");
		
		ignoredWords.add("east-west traffic");
		ignoredWords.add("north-south traffic");
		
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "zone_pivot_groups: programming-languages-spring-cloud",   "" });
		
		words.add(new String[] { "azuremicroservices.io",   "microservices.azure.cn" });
		
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		
		return words;
	}
		
	public synchronized static List<String> getWarningWords() {
	    warningWords.add("c#");
	    warningWords.add("c sharp");
	    warningWords.add("csharp");
	    
	    warningWords.add("::: zone");
	    
	    warningWords.add(".NET");
	    
	    warningWords.add("This article applies to");
	    warningWords.add("**This article applies to:");
	    
	    warningWords.add("steeltoe");
	    warningWords.add("steel toe");
	    
	    warningWords.add("vault.azure.net");
	    
	    // 12/04/2020, only accept china east 2 currently
	    warningWords.add("China East");
	    warningWords.add("China North");
	    warningWords.add("chinaeast");
	    warningWords.add("chinanorth");
	    
	    warningWords.add("zone_pivot_groups");
	    warningWords.add("azuremicroservices.io");
	    
	    // 02/21/2022, enterprise current not supported
	    warningWords.add("enterprise");
	    warningWords.add("");
	    warningWords.add("");
	    warningWords.add("");
	    warningWords.add("");
	    
	    
	    return warningWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// 11/02/2020, not available, pm confirmed(Derek said, no email) 
		uselessFiles.add("spring-cloud-tutorial-deploy-in-azure-virtual-network.md");
		uselessFiles.add("spring-cloud-howto-self-diagnose-solve.md");
		uselessFiles.add("policy-reference.md");
		
		// 11/12/2020, pm confirmed.
		uselessFiles.add("spring-cloud-tutorial-provision-azure-spring-cloud-instance-terraform.md");
		uselessFiles.add("spring-cloud-howto-integrate-azure-load-balancers.md");
		
		// 04/07/2021, should be not available
		uselessFiles.add("how-to-provision-azure-spring-cloud-instance-terraform.md");
		// 07/07/2021, should be not available
		uselessFiles.add("quickstart-deploy-infrastructure-vnet-terraform.md");
		
		// 02/20/2021, need "governance/policy/concepts/regulatory-compliance.md" which is not available.
		uselessFiles.add("security-controls-policy.md");
		
		// 02/20/2021, need spring-cloud-tutorial-deploy-in-azure-virtual-network.md which is not available.
		uselessFiles.add("spring-cloud-access-app-virtual-network.md");
		uselessFiles.add("spring-cloud-expose-apps-gateway-azure-firewall.md");
		uselessFiles.add("spring-cloud-troubleshooting-vnet.md");
		
		
		// spring-cloud-howto-integrate-azure-load-balancers.md
		uselessFiles.add("how-to-integrate-azure-load-balancers.md");
		// spring-cloud-howto-self-diagnose-solve.md
		uselessFiles.add("how-to-self-diagnose-solve.md");


//		// spring-cloud-tutorial-deploy-in-azure-virtual-network.md
//		uselessFiles.add("how-to-deploy-in-azure-virtual-network.md");
//		// spring-cloud-access-app-virtual-network.md
//		uselessFiles.add("access-app-virtual-network.md");
//		// spring-cloud-expose-apps-gateway-azure-firewall.md
//		uselessFiles.add("expose-apps-gateway-azure-firewall.md");
//		// spring-cloud-troubleshooting-vnet.md
//		uselessFiles.add("troubleshooting-vnet.md");
		
		// 09/14/2021, need account on https://www.dynatrace.com/
		uselessFiles.add("how-to-dynatrace-one-agent-monitor.md");
		
		// 01/25/2022, no "Elasticsearch (Elastic Cloud)" service in portal
		uselessFiles.add("how-to-elastic-apm-java-agent-monitor.md");
		uselessFiles.add("how-to-elastic-diagnostic-settings.md");
		
		// 02/21/2022, enterprise tier not supported currently 
		uselessFiles.add("how-to-enterprise-marketplace-offer.md"); // register doc
		uselessFiles.add("quickstart-setup-service-registry-enterprise.md");
		uselessFiles.add("quickstart-provision-service-instance-enterprise.md");
		uselessFiles.add("quickstart-deploy-apps-enterprise.md");
		uselessFiles.add("how-to-use-enterprise-spring-cloud-gateway.md");
		uselessFiles.add("how-to-use-enterprise-api-portal.md");
		uselessFiles.add("how-to-enterprise-service-registry.md");
		uselessFiles.add("how-to-enterprise-deploy-non-java-apps.md");
		uselessFiles.add("how-to-enterprise-build-service.md");
		uselessFiles.add("how-to-enterprise-application-configuration-service.md");
		uselessFiles.add("quickstart-setup-application-configuration-service-enterprise.md");
		
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	public static class Includes {
		private static final List<String> uselessFiles = new ArrayList<String>();
		
		public synchronized static List<String> getUselessFiles() {
			
			// 02/21/2022, enterprise tier not supported currently 
			uselessFiles.add("install-enterprise-extension.md");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	}
}
