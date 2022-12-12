package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Search {

	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "search.winodws.net",                                "search.azure.cn" });
		
		words.add(new String[] { "https://go.microsoft.com/fwlink/?linkid=2042400",   "https://www.azure.cn/pricing/details/search/" });
		
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });

		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
		warningWords.add("Bing");
		warningWords.add("SearchIndexClient");  // add endpoint
		warningWords.add("SearchServiceClient"); // add endpoint
		warningWords.add("");
		warningWords.add("");
		warningWords.add("");
		
		return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[] { "", "" });
		attentionWords.add(new String[] { "", "" });

		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// 01/25/2021, not available: bing entity api, need test..........................................
//		uselessFiles.add("cognitive-search-create-custom-skill-example.md");
		
		// need test..........................................
//		uselessFiles.add("cognitive-search-defining-skillset.md");
		
//		// 01/25/2021, need test............................................
//		uselessFiles.add("search-blob-ai-integration.md");
		
//		// no networking tag in mc portal, need test..........................................
//		uselessFiles.add("service-configure-firewall.md");
		
		// 01/25/2021, search-howto-move-across-regions.md
		uselessFiles.add("search-howto-move-across-regions.md");
		
		// 01/25/2021, power bi cannot connect to mc
		uselessFiles.add("search-monitor-logs-powerbi.md");
		
		// ??? need test..........................................
		uselessFiles.add("cognitive-search-custom-skill-form.md");
		
		// no aml skill 
		uselessFiles.add("cognitive-search-aml-skill.md");
		uselessFiles.add("cognitive-search-tutorial-aml-custom-skill.md");
		
		// no debug-sessions
		uselessFiles.add("cognitive-search-debug-session.md");
		uselessFiles.add("cognitive-search-tutorial-debug-sessions.md");
		
		// no managed-identities 
		uselessFiles.add("search-howto-managed-identities-cosmos-db.md");
		uselessFiles.add("search-howto-managed-identities-data-sources.md");
		uselessFiles.add("search-howto-managed-identities-sql.md");
		uselessFiles.add("search-howto-managed-identities-storage.md");
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		
		return uselessFiles;
	}
}
