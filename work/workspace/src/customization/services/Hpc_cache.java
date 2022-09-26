package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Hpc_cache {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("");
		ignoredWords.add("");
	    
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });

		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
		warningWords.add("");
		warningWords.add("");
		
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[] { "", "" });
		attentionWords.add(new String[] { "", "" });
		attentionWords.add(new String[] { "", "" });

		return attentionWords;
	}

	public synchronized static List<String> getUselessFiles() {
		
		// 03/14/2022, need service "azure-netapp-files" which isn't available currently
		uselessFiles.add("hpc-cache-netapp.md");
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
}








