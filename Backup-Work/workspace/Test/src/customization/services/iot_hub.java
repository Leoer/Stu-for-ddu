package customization.services;

import java.util.ArrayList;
import java.util.List;

public class iot_hub {
	
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
		words.add(new String[] { "node.js",  "Node.js" });
		words.add(new String[] { "https://ml.azure.com",  "https://studio.ml.azure.cn" });
		words.add(new String[] { "https://www.azure.cn/home/features/open-datasets/",     "https://azure.microsoft.com/services/open-datasets/" });
//		2022.0909 add
		words.add(new String[] { "quickstart-control-device-node.md", "quickstart-control-device.md" });
//		
//		words.add(new String[] { "", "" });
//		words.add(new String[] { "", "" });
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {	    
	    warningWords.add("such as an exponential backoff");
	    warningWords.add("api-version=2018-06-30");
	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");
	    warningWords.add("\\azure-iot-samples-java\\iot-hub\\Samples\\device\\AndroidSample");
	    
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
		// iot-hub:
		
		//These files are grouped into one file
		uselessFiles.add("iot-hub-visual-studio-cloud-device-messaging.md");
		uselessFiles.add("iot-hub-troubleshoot-error-503003-partitionnotfound.md");
		uselessFiles.add("iot-hub-troubleshoot-error-429001-throttlingexception.md");
		uselessFiles.add("iot-hub-troubleshoot-error-412002-devicemessagelocklost.md");
		uselessFiles.add("iot-hub-troubleshoot-error-409002-linkcreationconflict.md");
		uselessFiles.add("iot-hub-troubleshoot-error-409001-devicealreadyexists.md");
		uselessFiles.add("iot-hub-troubleshoot-error-404104-deviceconnectionclosedremotely.md");
		uselessFiles.add("iot-hub-troubleshoot-error-404103-devicenotonline.md");
		uselessFiles.add("iot-hub-troubleshoot-error-404103-devicenotonline.md");
		uselessFiles.add("iot-hub-troubleshoot-error-403006-devicemaximumactivefileuploadlimitexceeded.md");
		uselessFiles.add("iot-hub-troubleshoot-error-403004-devicemaximumqueuedepthexceeded.md");
		uselessFiles.add("iot-hub-troubleshoot-error-403002-iothubquotaexceeded.md");
		uselessFiles.add("iot-hub-troubleshoot-error-401003-iothubunauthorized.md");
		uselessFiles.add("iot-hub-troubleshoot-error-400027-connectionforcefullyclosedonnewconnection.md");
		uselessFiles.add("iot-hub-troubleshoot-error-500xxx-internal-errors.md");
		
		uselessFiles.add("iot-hub-device-streams-overview.md");// Region NOT available.
		uselessFiles.add("iot-hub-distributed-tracing.md");// Region NOT available. 20221010 
//		uselessFiles.add("");
		
		//file was deleted by global 
		uselessFiles.add("iot-hub-protocol-gateway.md");
		uselessFiles.add("iot-hub-troubleshoot-error-504101-gatewaytimeout.md");
		uselessFiles.add("iot-hub-device-management-visual-studio.md");
		
//		Preview mode NOT AVAILABLE.NO such feature.20220914
		uselessFiles.add("iot-hub-preview-mode.md");
		
//		NOT AVAILABLE. 20220914
		uselessFiles.add("iot-hub-tls-support.md");
		
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












