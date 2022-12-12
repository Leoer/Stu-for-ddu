package customization.services;

import java.util.ArrayList;
import java.util.List;

public class ADDS {

	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("editions of Azure AD (Free and Premium)");
		ignoredWords.add("");
		ignoredWords.add("");
	    
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "[azure-support]: ../active-directory/fundamentals/active-directory-troubleshooting-support-howto.md",   "[azure-support]: https://support.azure.cn/en-us/support/support-azure/" });
		words.add(new String[] { "[azure-ad-support]: ../active-directory/fundamentals/active-directory-troubleshooting-support-howto.md",   "[azure-ad-support]: https://support.azure.cn/en-us/support/support-azure/" });
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
		// 07/13/2020, ad app proxy not supported
		uselessFiles.add("deploy-azure-app-proxy.md");
		
		// 10/13/2020, Derek said it's ok to move them to live.
//		// 08/27/2020, css team tested, not available
//		uselessFiles.add("create-resource-forest-powershell.md");
//		// 08/27/2020, resource forest not supported currently
//		uselessFiles.add("concepts-resource-forest.md"); 
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
}
	
