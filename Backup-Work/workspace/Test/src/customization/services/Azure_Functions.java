package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Azure_Functions {
	
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("https://docs.microsoft.com/azure/developer/java/toolkit-for-intellij/quickstart-functions");
		
		ignoredWords.add("The Azure Login Dialog window");
		
		ignoredWords.add("https://docs.microsoft.com/azure/developer/java/toolkit-for-intellij/sign-in-instructions");
		ignoredWords.add("https://docs.microsoft.com/azure/developer/javascript/tutorial-vscode-serverless-node-01");
		
		ignoredWords.add("non-free subscription");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
	    
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "chinanorth",  "chinanorth2" });
		words.add(new String[] { "ChinaNorth",  "ChinaNorth2" });
		words.add(new String[] { "China North", "China North 2" });
		
		words.add(new String[] { "](/application-insights)",     "](/azure-monitor/overview)" });
		
		words.add(new String[] { "/java/api/overview/functions/runtime", "](https://docs.microsoft.com/zh-cn/java/api/overview/azure/functions/runtime?view=azure-java-stable)" });
		
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
		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
		
		attentionWords.add(new String[]{"functions-manually-run-non-http.md",                 "开头新增了一段话，不要漏了"});
		
		attentionWords.add(new String[]{"functions-create-first-azure-function-azure-cli.md", "06/02/2020, got error when run \"mvn ...deploy\""});
		
		attentionWords.add(new String[]{"configure-monitoring.md",                            "Remove \"### New function app in the portal\", image not suitable."});
		
		attentionWords.add(new String[]{"streaming-logs.md",                                  "### Built-in log streaming 部分图片不对，不要了"});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// azure-functions:
		// need to connect to twitter which is not supported in China.
		uselessFiles.add("functions-twitter-email.md");
		
		// not able to login https://web.powerapps.com/ https://flow.microsoft.com/ with ACN account.
		uselessFiles.add("app-service-export-api-to-powerapps-and-flow.md");
		
		// need twilio, can't go live from johnny
		uselessFiles.add("functions-bindings-twilio.md");
		
		// operation "Creating an API connection: step by step" not suitable for ACN
		uselessFiles.add("functions-bindings-external-table.md");
		
		// need "PowerApps" which can not login with acn account.
		uselessFiles.add("functions-powerapps-scenario.md");
		
		// need flow.microsoft.com, but acn account not able to sign in.
		uselessFiles.add("functions-flow-scenario.md");
		
		// global deleted
		uselessFiles.add("functions-cli-create-function-app-github.md");
		
		// 09/21/2018, DevOps-project service not available in acn portal.
		// 10/10/2018, checked again, just remove words about "DevOps"
		// 12/10/2018, no "Deployment options" under "Platform features"
		// 07/17/2019, no "github" in "platform featues" -> "deployment center" -> github
		// 02/22/2022, available, but page func differ from global 
		uselessFiles.add("functions-continuous-deployment.md");
		
		// 10/18/2018, much content are not available in acn.
		uselessFiles.add("functions-compare-logic-apps-ms-flow-webjobs.md");
		
		// 11/07/2018, redirected to "functions-bindings-sendgrid.md"
		uselessFiles.add("functions-how-to-use-sendgrid.md");
		
		// 03/20/2019, need to billed in dollar, not available.
		uselessFiles.add("functions-create-student-starter.md");
		
		// devops not supported in acn
		uselessFiles.add("functions-how-to-azure-devops.md");
		
		// 06/05/2020, many links and content are not available.
		uselessFiles.add("security-baseline.md");
		
		// 06/07/2021, azure arc not supported currently
		uselessFiles.add("create-first-function-arc-cli.md");
		uselessFiles.add("create-first-function-arc-custom-container.md");
		
		// 09/27/2021, not supported in azure China (No China in available regions in the doc)
//		2022.9.19 AVAILABLE NOW.
//		uselessFiles.add("azure-functions-az-redundancy.md");
		
//		2022.0718 add, because global delete it.
		uselessFiles.add("monitor-metrics.md");
//		2022.0802 add, because global delete it.
//		uselessFiles.add("create-first-function-cli-csharp-ieux.md");
//		uselessFiles.add("create-first-function-cli-java-uiex.md");
//		uselessFiles.add("create-first-function-cli-python-uiex.md");
//		uselessFiles.add("create-first-function-vs-code-csharp-ieux.md");
//		uselessFiles.add("create-first-function-vs-code-java-uiex.md");
//		uselessFiles.add("create-first-function-vs-code-python-uiex.md");
	
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	// TODO scripts
	public static class Scripts {
		private static final List<String> uselessFiles = new ArrayList<String>();
		
		public synchronized static List<String> getUselessFiles() {
			// github operation failed by command.
			uselessFiles.add("functions-cli-create-function-app-github-continuous.md");
			
			uselessFiles.add("functions-cli-create-function-app-vsts-continuous.md");
			
			return uselessFiles;
		}
	}
	
	// TODO durable
	public static class Durable {
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		
		public synchronized static List<String[]> getAttentionWords() {
			attentionWords.add(new String[]{"quickstart-js-vscode.md",                           "\"Sign in to Azure\" 部分跟global不一样，要修改。"}); // azure-functions
			
			return attentionWords;
		}
		
		public synchronized static List<String> getUselessFiles() {
			// 08/11/2020, need "Twilio", the sample in this file is not suitable for ACN.
			uselessFiles.add("durable-functions-monitor.md");
			
			// 01/12/2021, need "twilio" and python
			uselessFiles.add("durable-functions-monitor-python.md");
			
			uselessFiles.add("durable-functions-phone-verification.md");
			
			return uselessFiles;
		}
		
	}
	
	// TODO durable
	public static class Start_stop_vms {
		
	}
	public static class errors_diagnostics {
		
		public static class diagnostic_events {
			
			
		}	
	}
}












