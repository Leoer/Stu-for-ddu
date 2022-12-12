package customization.services;

import java.util.ArrayList;
import java.util.List;

public class site_recovery {
	
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
//		ignoredWords.add("non-free subscription");
//		ignoredWords.add("");
//		ignoredWords.add("");
//		ignoredWords.add("");
	    
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
//		words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
//		words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
//		words.add(new String[] { "https://www.azure.cn/home/features/open-datasets/",     "https://azure.microsoft.com/services/open-datasets/" });
//		
//		words.add(new String[] { "/java/api/overview/functions/runtime", "](https://docs.microsoft.com/zh-cn/java/api/overview/azure/functions/runtime?view=azure-java-stable)" });
//		
		words.add(new String[] { "/azure/site-recovery/", "/site-recovery/" });
//		words.add(new String[] { "", "" });
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {	    
	    warningWords.add("RAID disk");
	    warningWords.add("CMK");
	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");
	    warningWords.add("ASR");
	  
//	    warningWords.add("");
//	    warningWords.add("");
//	    warningWords.add(""); 
	    
	    
	    
	    
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
//		
//		attentionWords.add(new String[]{"functions-manually-run-non-http.md",                 "开头新增了一段话，不要漏了"});
//		
//		attentionWords.add(new String[]{"functions-create-first-azure-function-azure-cli.md", "06/02/2020, got error when run \"mvn ...deploy\""});
//		
//		attentionWords.add(new String[]{"configure-monitoring.md",                            "Remove \"### New function app in the portal\", image not suitable."});
//		
//		attentionWords.add(new String[]{"streaming-logs.md",                                  "### Built-in log streaming 部分图片不对，不要了"});
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
//		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {

		uselessFiles.add("azure-to-azure-autoupdate.md");

//		Wendy Verified Successfully
//		uselessFiles.add("azure-to-azure-how-to-enable-policy.md");
		
		uselessFiles.add("azure-to-azure-how-to-enable-replication-cmk-disks.md");
//		uselessFiles.add("azure-to-azure-how-to-enable-replication-cmk-disks.md");
//		uselessFiles.add("azure-to-azure-how-to-enable-zone-to-zone-disaster-recovery.md");
//		uselessFiles.add("azure-to-azure-move-overview.md");
		uselessFiles.add("azure-to-azure-walkthrough-architecture.md");
//		uselessFiles.add("azure-to-azure-walkthrough-architecture.md");
		uselessFiles.add("azure-to-azure-walkthrough-enable-replication.md");
//		uselessFiles.add("azure-to-azure-walkthrough-enable-replication.md");
		uselessFiles.add("azure-to-azure-walkthrough-network.md");
//		uselessFiles.add("azure-to-azure-walkthrough-network.md");
		uselessFiles.add("azure-to-azure-walkthrough-overview.md");
//		uselessFiles.add("azure-to-azure-walkthrough-overview.md");
		uselessFiles.add("azure-to-azure-walkthrough-prerequisites.md");
//		uselessFiles.add("azure-to-azure-walkthrough-prerequisites.md");
		uselessFiles.add("azure-to-azure-walkthrough-test-failover.md");
//		uselessFiles.add("azure-to-azure-walkthrough-test-failover.md");
//		uselessFiles.add("azure-to-azure-walkthrough-vault.md");
		uselessFiles.add("azure-to-azure-walkthrough-vault.md");
		uselessFiles.add("move-azure-VMs-AVset-Azone.md");

//		Pending for Verified.
//		uselessFiles.add("move-azure-VMs-cross-region.md");
		
		uselessFiles.add("move-vaults-across-regions.md");
		uselessFiles.add("region-move-cross-geos.md");
		uselessFiles.add("site-recovery-architecture-vmware-to-azure.md");
//		uselessFiles.add("site-recovery-azure-to-azure-after-migration.md");
		uselessFiles.add("site-recovery-azure-to-azure-after-migration.md");
		uselessFiles.add("site-recovery-failback-azure-to-vmware-classic.md");
//		uselessFiles.add("site-recovery-failback-azure-to-vmware-classic-legacy.md");
		uselessFiles.add("site-recovery-failback-azure-to-vmware-classic-legacy.md");
//		uselessFiles.add("site-recovery-replicate-azure-to-azure.md");
//		uselessFiles.add("site-recovery-runbook-automation.md");
//		uselessFiles.add("site-recovery-runbook-automation.md");
//		The following article appeared in ACN, not submitted by Adam.
//		uselessFiles.add("site-recovery-test-failover-to-azure.md");
		uselessFiles.add("site-recovery-vmware-setup-azure-ps-classic.md");
		uselessFiles.add("site-recovery-vmware-to-azure-classic.md");
		uselessFiles.add("site-recovery-vmware-to-azure-classic-legacy.md");
		uselessFiles.add("vmware-azure-multi-tenant-csp-disaster-recovery.md");

//		They seems not available but I can't test for them. They didn't appear before without any information.
//		So I add these two articles here on 2022.06.22  
//		uselessFiles.add("vmware-azure-set-up-replication-tutorial-preview.md");
//		uselessFiles.add("deploy-vmware-azure-replication-appliance-preview");  //FIPS

		
//		feedback states that this article is unavailable. It should be deleted.
		uselessFiles.add("vmware-azure-architecture-preview.md");

		return uselessFiles;
	}
	
	// TODO scripts
//	public static class Scripts {
//		private static final List<String> uselessFiles = new ArrayList<String>();
//		
//		public synchronized static List<String> getUselessFiles() {
//			// github operation failed by command.
//			uselessFiles.add("functions-cli-create-function-app-github-continuous.md");
//			
//			uselessFiles.add("functions-cli-create-function-app-vsts-continuous.md");
//			
//			return uselessFiles;
//		}
//	}
//	
//	// TODO durable
//	public static class Durable {
//		private static final List<String[]> attentionWords = new ArrayList<String[]>();
//		private static final List<String> uselessFiles = new ArrayList<String>();
//		
//		public synchronized static List<String[]> getAttentionWords() {
//			attentionWords.add(new String[]{"quickstart-js-vscode.md",                           "\"Sign in to Azure\" 部分跟global不一样，要修改。"}); // azure-functions
//			
//			return attentionWords;
//		}
//		
//		public synchronized static List<String> getUselessFiles() {
//			// 08/11/2020, need "Twilio", the sample in this file is not suitable for ACN.
//			uselessFiles.add("durable-functions-monitor.md");
//			
//			// 01/12/2021, need "twilio" and python
//			uselessFiles.add("durable-functions-monitor-python.md");
//			
//			uselessFiles.add("durable-functions-phone-verification.md");
//			
//			return uselessFiles;
//		}
//		
//	}
//	
//	// TODO durable
//	public static class Start_stop_vms {
//		
//	}
}












