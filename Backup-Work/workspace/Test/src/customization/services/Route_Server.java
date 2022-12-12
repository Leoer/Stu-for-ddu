package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Route_Server {
	
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
//		words.add(new String[] { "", "" });
//		words.add(new String[] { "", "" });
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {	    
	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");

	  
//	    warningWords.add("");
//	    warningWords.add("");
//	    warningWords.add(""); 
	    
	    
	    
	    
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "���ƹ���Ҫ�ģ�"}); // azure-functions
//		
//		attentionWords.add(new String[]{"functions-manually-run-non-http.md",                 "��ͷ������һ�λ�����Ҫ©��"});
//		
//		attentionWords.add(new String[]{"functions-create-first-azure-function-azure-cli.md", "06/02/2020, got error when run \"mvn ...deploy\""});
//		
//		attentionWords.add(new String[]{"configure-monitoring.md",                            "Remove \"### New function app in the portal\", image not suitable."});
//		
//		attentionWords.add(new String[]{"streaming-logs.md",                                  "### Built-in log streaming ����ͼƬ���ԣ���Ҫ��"});
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
//		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {

//		Azure VMware Solution NOT AVAILABLE
		uselessFiles.add("vmware-solution-default-route.md");

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
//			attentionWords.add(new String[]{"quickstart-js-vscode.md",                           "\"Sign in to Azure\" ���ָ�global��һ����Ҫ�޸ġ�"}); // azure-functions
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












