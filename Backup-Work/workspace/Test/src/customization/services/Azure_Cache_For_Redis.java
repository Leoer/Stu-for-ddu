package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Azure_Cache_For_Redis {
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getWarningWords() {
		warningWords.add("zone redundancy");
	    warningWords.add("zone-redundancy");
//	    warningWords.add("geo replication");
//	    warningWords.add("geo-replication");
	    
//	    warningWords.add("private-link");
//	    warningWords.add("private link");
	    
	    warningWords.add("enterprise");
	    warningWords.add("");
	    warningWords.add("");
	    
	    return warningWords;
	}
	
	public synchronized static List<String> getIgnoredWords() {
//		ignoredWords.add("media/cache-private-link");
		ignoredWords.add("");
		
		return ignoredWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// billing not supported in china.
		uselessFiles.add("cache-reserved-pricing.md");
		
		// 03/30/2020 security/benchmarks/* not supported
		uselessFiles.add("security-baseline.md");
		
		//05/11/2021, Enterprise type not supported currently
		uselessFiles.add("quickstart-create-redis-enterprise.md");
		
		// 08/10/2020, governance/policy/concepts/regulatory-compliance not available 
		uselessFiles.add("security-controls-policy.md");
		
		// 10/22/2020, It says "zone pined caches are not yet available in current region" in portal when create a redis cache ("Advanced" tag)
		// If available, need update cache-high-availability.md
		uselessFiles.add("cache-how-to-zone-redundancy.md");
		
		// 03/09/2021, no "In the New Redis Cache creation UI, click Configure to set up Active geo-replication in the Advanced tab."
		uselessFiles.add("cache-how-to-active-geo-replication.md");
		
//		// 04/25/2021, private link not available currently
//		uselessFiles.add("cache-private-link.md");
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	public static class Scripts{
		
	}
}
