package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Web_Application_Firewall {
	
	public static class Ag {
		
		private static final List<String[]> words = new ArrayList<String[]>(200);
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public synchronized static List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public synchronized static List<String> getWarningWords() {
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public synchronized static List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public synchronized static List<String> getUselessFiles() {

			// 11/25/2019, not available
			uselessFiles.add("associate-waf-policy-existing-gateway.md");
			uselessFiles.add("bot-protection.md");
			uselessFiles.add("create-waf-policy-ag.md");
			uselessFiles.add("log-analytics.md");
			uselessFiles.add("powershell-samples.md");
			uselessFiles.add("resource-manager-template-samples.md");
			uselessFiles.add("web-application-firewall-logs.md");
			uselessFiles.add("whats-new.md");
			uselessFiles.add("migrate-policy.md");
			uselessFiles.add("application-gateway-waf-faq.md");
			uselessFiles.add("bot-protection-overview.md");
			uselessFiles.add("geomatch-custom-rules.md");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}

	}

}
