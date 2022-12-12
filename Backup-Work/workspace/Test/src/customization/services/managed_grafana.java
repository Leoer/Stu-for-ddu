package customization.services;

import java.util.ArrayList;
import java.util.List;

public class managed_grafana {
	
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
//		ignoredWords.add("https://docs.microsoft.com/azure/developer/java/toolkit-for-intellij/quickstart-functions");
		
		ignoredWords.add("The Azure Login Dialog window");
		
//		ignoredWords.add("https://docs.microsoft.com/azure/developer/java/toolkit-for-intellij/sign-in-instructions");
//		ignoredWords.add("https://docs.microsoft.com/azure/developer/javascript/tutorial-vscode-serverless-node-01");
		
		ignoredWords.add("non-free subscription");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
	    
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
//		words.add(new String[] { "chinanorth",  "chinanorth2" });
//		words.add(new String[] { "ChinaNorth",  "ChinaNorth2" });
//		words.add(new String[] { "China North", "China North 2" });
		
//		words.add(new String[] { "](/application-insights)",     "](/azure-monitor/overview)" });
		
//		words.add(new String[] { "/java/api/overview/functions/runtime", "](https://docs.microsoft.com/zh-cn/java/api/overview/azure/functions/runtime?view=azure-java-stable)" });
		
		words.add(new String[] { "", "" });
		words.add(new String[] { "", "" });
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
//	    warningWords.add("python"); // not available
	    
//	    warningWords.add("linux");
	    
	    warningWords.add("chinanorth222");
	    
//	    warningWords.add("programming-languages-set-functions");
	    
	    warningWords.add("](](");
	    warningWords.add("billing");
	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");
	    
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
		
//		attentionWords.add(new String[]{"functions-manually-run-non-http.md",                 "开头新增了一段话，不要漏了"});
		
//		attentionWords.add(new String[]{"functions-create-first-azure-function-azure-cli.md", "06/02/2020, got error when run \"mvn ...deploy\""});
		
//		attentionWords.add(new String[]{"configure-monitoring.md",                            "Remove \"### New function app in the portal\", image not suitable."});
		
//		attentionWords.add(new String[]{"streaming-logs.md",                                  "### Built-in log streaming 部分图片不对，不要了"});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {

	
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
//	// TODO scripts
//	public static class Scripts {
//		private static final List<String> uselessFiles = new ArrayList<String>();
//		
//		public synchronized static List<String> getUselessFiles() {
//
////			uselessFiles.add("functions-cli-create-function-app-vsts-continuous.md");
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
//	public static class errors_diagnostics {
//		
//		public static class diagnostic_events {
//			
//			
//		}	
//	}
}












