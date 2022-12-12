package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Time_Series_Insights {
	private static final List<String[]> words = new ArrayList<String[]>(200);
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	// tsiclientsample.azurewebsites.net
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("China North 2");
		ignoredWords.add("chinanorth2");
		
		ignoredWords.add("China East 2");
		ignoredWords.add("chinaeast2");
		
		ignoredWords.add("insights.timeseries.azure.com/samples");
		ignoredWords.add("insights.timeseries.azure.com/preview/demo");
		ignoredWords.add("insights.timeseries.azure.com/demo");
		ignoredWords.add("insights.timeseries.azure.com/clientsample");
		
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		
	    
	    return ignoredWords;
	}
	
	public synchronized static List<String[]> getWords() {
		words.add(new String[] { "api.timeseries.azure.com",          "api.timeseries.azure.cn" });
		
		words.add(new String[] { "insights.timeseries.azure.com",     "insights.timeseries.azure.cn" });
		
		words.add(new String[] { "](/azure/time-series-insights",     "](/time-series-insights" });
		
		words.add(new String[] { "time-series-insights-how-to-add-an-event-source-eventhub.md",    "how-to-ingest-data-event-hub.md" });
		words.add(new String[] { "time-series-insights-how-to-add-an-event-source-iothub.md",      "how-to-ingest-data-iot-hub.md" });
		words.add(new String[] { "time-series-insights-update-create-environment.md",              "tutorials-set-up-tsi-environment.md" });
		
		words.add(new String[] { "", "" });
		words.add(new String[] { "", "" });
		words.add(new String[] { "", "" });

		return words;
	}

	public synchronized static List<String> getWarningWords() {
		// only support "china north 2" and "china east 2"
		warningWords.add("China North");
		warningWords.add("China East");
		warningWords.add("chinanorth");
		warningWords.add("chinaeast");
		
		warningWords.add("https://www.azureiotsolutions.com");
		warningWords.add("IoT accelerator");
		
		// 09/01/2020, demo environment not available
		warningWords.add("Gen2 demo environment"); // -> https://insights.timeseries.azure.com/preview/demo
		
		// 09/01/2020, It is Contoso Wind Farm demo link. Changed the .com to .cn but not work
		warningWords.add("insights.timeseries.azure.cn/preview/samples");
		warningWords.add("insights.timeseries.azure.cn/preview/demo");
//		warningWords.add("Contoso Wind Farm demo");
		
		warningWords.add("");
		warningWords.add("");
		
		return warningWords;
	}

	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[] { "tutorials-set-up-tsi-environment.md",   "只有 \"Create an Azure Time Series Insights Gen2 environment\" 部分可用" });
		attentionWords.add(new String[] { "", "" });
		attentionWords.add(new String[] { "", "" });

		return attentionWords;
	}

	public synchronized static List<String> getUselessFiles() {
        // 09/01/2020, redirected to unsupported files.
		uselessFiles.add("time-series-insights-update-explorer.md");   // redirected to concepts-ux-panels.md
		uselessFiles.add("time-series-insights-update-quickstart.md"); // redirected to quickstart-explore-tsi.md
		
		// 09/01/2020, about Gen2 demo envirment "https://insights.timeseries.azure.com/preview/demo" which gives a demo about global tsi.
		// and "https://insights.timeseries.azure.cn/preview/demo" not work.
		uselessFiles.add("concepts-ux-panels.md");
		uselessFiles.add("quickstart-explore-tsi.md");
		// 09/01/2020, about IoT solution accelerator "https://www.azureiotsolutions.com" which accept global acn account only.
		uselessFiles.add("tutorial-create-populate-tsi-environment.md");
		
		// 03/06/2020, not sure 
//		uselessFiles.add("concepts-power-bi.md");
//		uselessFiles.add("how-to-connect-power-bi.md");
		
		// 09/28/2020, digital twins not supported currently
		uselessFiles.add("tutorials-model-sync.md");
		uselessFiles.add("");

		return uselessFiles;
	}
}
