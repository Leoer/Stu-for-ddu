package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Application_Gateway {
	private static final List<String[]> words = new ArrayList<String[]>(200);
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String[]> getWords() {
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });

		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
	    warningWords.add("China North");
	    warningWords.add("china north");
	    warningWords.add("chinanorth");
	    
	    warningWords.add("appgwingress.blob.core.chinacloudapi.cn"); // no need to replace, should be: appgwingress.blob.core.windows.net
	    
	    warningWords.add("web-application-firewall");
	    
	    // 05/25/2021, Feedback 430992
	    warningWords.add("AGIC add-on");
	    warningWords.add("AGIC addon");
	    
	    // 08/18/2021, Feedback 474888
	    warningWords.add("Geo-Match");
	    warningWords.add("Geomatch");
	    warningWords.add("GeoMatch");
	    warningWords.add("geomatch");
	    
	    warningWords.add("");
	    warningWords.add("");
	    
	    return warningWords;
	}
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("China North 2");
		ignoredWords.add("china north 2");
		ignoredWords.add("chinanorth2");
		ignoredWords.add("azure-docs-powershell-samples");
		ignoredWords.add("Hardware security module (HSM)-validated certificates are not supported");
		
		ignoredWords.add("app-service-app-service-environment-web-application-firewall");
		ignoredWords.add("web-application-firewall-troubleshoot.md");
		ignoredWords.add("application-gateway-web-application-firewall-portal.md");
		
	    return ignoredWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[]{"create-vmss-template.md",                                      "删掉 \"Deploy the Azure Resource Manager template by using click-to-deploy\", 因为它跳到 global 去了"});
		
		attentionWords.add(new String[]{"waf-overview.md",                                              "删掉 \"Azure Security Center\" 部分, 不适用"}); 
		
		attentionWords.add(new String[]{"application-gateway-create-gateway-arm-template.md",           "\"Deploy the Azure Resource Manager template by using click-to-deploy\" 部分定制过，不要修改"});
		
		attentionWords.add(new String[]{"configure-application-gateway-with-private-frontend-ip.md",    "删除 \"cloud shell\" 相关的图片"});
		
//		attentionWords.add(new String[]{"application-gateway-autoscaling-zone-redundant.md",            "Pricing in US East, Example 1, Example 2 和 Example 3 删掉，美元记账不适合 China; \"## Supported regions\" 删掉"});
		
//		attentionWords.add(new String[]{"application-gateway-faq.md",                                   "删掉 \"DDoS\" 相关的内容; \nCan Application Gateway communicate with instances outside of its virtual network or outside of its subscription? 部分添加 expressroute!!"});

		attentionWords.add(new String[]{"configure-keyvault-ps.md",                                     " 非常重要： 代码中 location 使用 China North 2, 而不是 China North !!!!!!!!!!!!!"});
		
		attentionWords.add(new String[]{"application-gateway-metrics.md",                               "### Alert rules on metrics 要删掉，没有这个功能"});
		
		attentionWords.add(new String[]{"ingress-controller-expose-service-over-http-https.md",           "\"https://raw.githubusercontent.com...\" 的内容要替换"});
		
		// Feedback 341236
		attentionWords.add(new String[]{"ingress-controller-install-new.md",            "### Install Ingress Controller Helm Chart 部分增加: environment: AzureChinaCloud"});
		attentionWords.add(new String[]{"ingress-controller-install-existing.md",       "## Install Ingress Controller as a Helm Chart 部分增加: environment: AzureChinaCloud, 共3处。"});
		
		attentionWords.add(new String[]{"custom-waf-rules-overview.md",                 "GeoMatch 不支持"});
		
		attentionWords.add(new String[]{"overview-v2.md",           "\"## Supported regions\" 删掉"});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// 06/02/2020, portal operation different
		uselessFiles.add("application-gateway-integration-security-center.md");
		
		// 08/06/2019, "AzureDiagnostics" is not supported, "AuditLogs" works.
//		uselessFiles.add("log-analytics.md");
		
		// 09/17/2020, pricing not supported
		uselessFiles.add("understanding-pricing.md");
		
		// 05/25/2020, Feedback 430992
		uselessFiles.add("tutorial-ingress-controller-add-on-existing.md");
		uselessFiles.add("tutorial-ingress-controller-add-on-new.md");
		
		// 07/26/2021, FEEDBACK 462869
		uselessFiles.add("ingress-controller-autoscale-pods.md");
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	
	public static class Scripts {
	
	}
}
