package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Cloud_Services {
	private static final List<String[]> words = new ArrayList<String[]>(200); 
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String[]> getWords() {
		words.add(new String[] { "https://go.microsoft.com/fwlink/?LinkID=251796",             "/cloud-services/cloud-services-choose-me" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/hh369930.aspx",      "https://docs.azure.cn" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/hh411542.aspx",      "/cloud-services/diagnostics-performance-counters" });
		
		words.add(new String[] { "http://aka.ms/ptvs",             "https://visualstudio.microsoft.com/zh-hans/vs/features/python/?wt.mc_id=aka_ms_python" });
		words.add(new String[] { "http://aka.ms/ptvsdocs",         "https://docs.microsoft.com/zh-cn/visualstudio/python/?view=vs-2019" });
		
		words.add(new String[] { "](/dotnet/framework",   "](https://docs.microsoft.com/dotnet/framework" });
		
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });

		return words;
	}
	
	public synchronized static List<String> getWarningWords() {

		warningWords.add("Get-AzurePublishSettingsFile"); // -Environment AzureChinaCloud
		warningWords.add("Import-AzurePublishSettingsFile");
		
//		// 01/25/2021, no plan for this service
//		warningWords.add("cloud-services-extended-support");
		
		warningWords.add("");
	
		return warningWords;
	}
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("Get-AzurePublishSettingsFile -Environment AzureChinaCloud");
		ignoredWords.add("Import-AzurePublishSettingsFile -Environment AzureChinaCloud");
		ignoredWords.add("[Get-AzurePublishSettingsFile]");
		ignoredWords.add("[Import-AzurePublishSettingsFile]");
		
		ignoredWords.add("AzureCloudService");
		ignoredWords.add("AzureCloudDeployment");
		ignoredWords.add("AzureCloudPowerShell");
		
		ignoredWords.add("[Add-AzureAccount]");
		
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		
	    return ignoredWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		
		uselessFiles.add("security-baseline.md");
		
		return uselessFiles;
	}	
	
	
	
}