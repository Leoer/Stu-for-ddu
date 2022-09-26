package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Cloud_services_extended_support {
	private static final List<String[]> words = new ArrayList<String[]>(200); 
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	
	public synchronized static List<String[]> getWords() {
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {

		warningWords.add("Get-AzurePublishSettingsFile"); // -Environment AzureChinaCloud
		warningWords.add("Import-AzurePublishSettingsFile");
		
		// not supported currently
		warningWords.add("G series");
		warningWords.add("G-series");
		warningWords.add("h series");
		warningWords.add("h-series");
		
		warningWords.add("");
		warningWords.add("");
		warningWords.add("");
		warningWords.add("");
		
		return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[]{"available-sizes.md",           "[G] 系列不支持，要删除"});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getIgnoredWords() {
		
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		
	    return ignoredWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}	
	
	
	
	
	
	
}
