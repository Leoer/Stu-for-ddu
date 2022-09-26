package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Data_explorer {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "dataexplorer.azure.com",     "dataexplorer.azure.cn" });
		words.add(new String[] { "kusto.windows.net",          "kusto.chinacloudapi.cn" });
		
		// 05/28/2021, feedback from Derek email
		words.add(new String[] { "https://dataexplorer.azure.cn/clusters/help/databases/Samples",   
				                 "https://dataexplorer.azure.cn/clusters/help.chinaeast2/databases/Samples" });
		
		words.add(new String[] { "help.kusto.chinacloudapi.cn",   "help.chinaeast2.kusto.chinacloudapi.cn" });
		
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });

		return words;
	}
	
	private static final List<String> ignoredWords = new ArrayList<String>();

	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("china east 2");
		ignoredWords.add("chinaeast2");
		ignoredWords.add("");
		ignoredWords.add("https://docs.microsoft.com/azure/kusto");
		
		ignoredWords.add("flows");
		ignoredWords.add("data flow");
		ignoredWords.add("DevOps engineer");
		ignoredWords.add("end-to-end flow");
		ignoredWords.add("Overflow");
		
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		
	    return ignoredWords;
	}
	
	public synchronized static List<String> getWarningWords() {
	    warningWords.add("kafuka");
	    
//	    warningWords.add("Optimized autoscale");
	    
	    warningWords.add("china north");
	    warningWords.add("chinanorth");
	    warningWords.add("china east");
	    warningWords.add("chinaeast");
	    
	    // 05/28/2021, 
	    warningWords.add("https://dataexplorer.azure.cn/clusters/help/"); // help.chinaeast2
	    
	    // 05/28/2021, 
	    warningWords.add("help.kusto"); // should be "help.chinaeast2.kusto"
	    
	    warningWords.add("");
	    warningWords.add("");
	    warningWords.add("");
	    warningWords.add("");
	    
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[] { "managed-identities.md", "System assigned, \"message\": \"Resource type 'Microsoft.Kusto/clusters' does not support creation of 'SystemAssigned' resource identity. The supported types are 'None'.\"" });
		
		// 03/18/2021
		attentionWords.add(new String[] { "ingest-data-one-click.md", "Remove \"Select Data in the left pane. Within the Data Management page, select a type of ingestion and click Ingest.\" segment." });
		
		// 09/09/2021
		attentionWords.add(new String[] { "one-click-event-hub.md",  "## Ingest new data 部分, 使用 \"right click your table and select the **Ingest new data** tab. \"" });

		attentionWords.add(new String[] { "ingest-sample-data.md",   "跟global 不一样，改的时候要注意" });
		attentionWords.add(new String[] { "",  "" });
		attentionWords.add(new String[] { "",  "" });
		attentionWords.add(new String[] { "",  "" });
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
//		//01/25/2021, cannot use event grid - no Event Subscription
//		uselessFiles.add("ingest-data-event-grid.md");
//		uselessFiles.add("ingest-data-event-grid-manual.md");
//		uselessFiles.add("ingest-data-event-grid-overview.md");
//		uselessFiles.add("data-connection-event-grid-csharp.md");
//		uselessFiles.add("data-connection-event-grid-python.md");
//		uselessFiles.add("data-connection-event-grid-resource-manager.md");
		
		uselessFiles.add("devops.md");
		
		uselessFiles.add("connect-from-databricks.md");
		
		// 01/25/2021, no Reservations in mc
		uselessFiles.add("pricing-reserved-capacity.md");
		
		// 01/25/2021, vnet integration not support
		uselessFiles.add("vnet-deployment.md");
		uselessFiles.add("vnet-create-cluster-portal.md");
		uselessFiles.add("vnet-deploy-troubleshoot.md");
		uselessFiles.add("vnet-create-private-endpoint.md");
		uselessFiles.add("vnet-endpoint-storage-event-hub.md");
		
		// 01/25/2021, not supported
		uselessFiles.add("grafana.md");
		
		// 01/25/2021, not support - no ingest new data(preview) in dataexplorer.azure.cn
//		uselessFiles.add("ingest-data-one-click.md");
//		uselessFiles.add("one-click-ingestion-existing-table.md");
//		uselessFiles.add("one-click-ingestion-new-table.md");
		
		// 01/25/2021, not work in mooncake portal - cannot save
		uselessFiles.add("customer-managed-keys-csharp.md");
		uselessFiles.add("customer-managed-keys-portal.md");
		uselessFiles.add("customer-managed-keys-resource-manager.md");
		// 01/25/2021, customer managed keys
		uselessFiles.add("customer-managed-keys-cli.md");
		uselessFiles.add("customer-managed-keys-powershell.md");
		
		// 01/25/2021, not supported
		uselessFiles.add("flow.md");
		uselessFiles.add("flow-usage.md");
		
//		// 01/25/2021, resource health not contain ADX
//		uselessFiles.add("monitor-with-resource-health.md");
		
//		// 01/25/2021, no ADX in API permission
//		uselessFiles.add("provision-azure-ad-app.md");
		
		// 01/25/2021, no data explorer dashboard
		uselessFiles.add("azure-data-explorer-dashboards.md");
		uselessFiles.add("dashboard-parameters.md");
		uselessFiles.add("dashboard-customize-visuals.md");
		
		// 01/25/2021, double encryption
		uselessFiles.add("double-encryption.md");
		
		// 01/25/2021, youtube video
		uselessFiles.add("data-share.md");
		
		// 01/25/2021, advisor dignose not supported
		uselessFiles.add("azure-advisor.md");
		
		// 03/17/2021, not suitable
		uselessFiles.add("whats-new.md");
		
		// 05/11/2021, SKU Standard_E64i_v3 not supported in China region
		uselessFiles.add("isolated-compute.md");
		
		// 05/11/2021, acn accont not available in https://make.preview.powerapps.com/
		uselessFiles.add("power-apps-connector.md");
		
		// 07/19/2021, no external table
		uselessFiles.add("external-table.md");
		
		// 08/30/2021, no "Data"
		uselessFiles.add("generate-lightingest-command.md");
		
		// 01/10/2022, no "Data"
		uselessFiles.add("one-click-manage-database.md");
		uselessFiles.add("one-click-table-batching-policy.md");
		uselessFiles.add("one-click-table-retention-policy.md");
		// 02/07/2022, no "Data"
		uselessFiles.add("sample-app-generator-one-click.md");
		
		// 03/07/2022, not able to create a free cluster, page differ from global
		uselessFiles.add("start-for-free-web-ui.md");
		uselessFiles.add("start-for-free.md");
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	// TODO
	public static class Includes {
		private static final List<String> uselessFiles = new ArrayList<String>();
		
		public synchronized static List<String> getUselessFiles() {
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	}
	
	// TODO
	public static class Kusto {
		private static final List<String> uselessFiles = new ArrayList<String>();
		
		public synchronized static List<String> getUselessFiles() {
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
		
		// TODO
		public static class Api {
			private static final List<String> uselessFiles = new ArrayList<String>();
			
			public synchronized static List<String> getUselessFiles() {
				uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
			
			// TODO
			public static class Connection_strings {
				
			}
			
			// TODO
			public static class Golang {
				
			}
			
			// TODO
			public static class Java {
				
			}
			
			// TODO
			public static class Monaco {
				
			}
			
			// TODO
			public static class Netfx {
				
			}
			
			// TODO
			public static class Node {
				
			}
			
			// TODO
			public static class Powershell {
				
			}
			
			// TODO
			public static class Python {
				
			}
			
			// TODO
			public static class R {
				
			}
			
			// TODO
			public static class Rest {
				
			}
			
			// TODO
			public static class Tds {
				
			}
			
		}
		
		// TODO
		public static class Concepts {
			
		}
		
		// TODO
		public static class Functions_library {
			
		}
		
		// TODO
		public static class Management {
			
			
			// TODO
			public static class Access_control {
				
			}
			
			// TODO
			public static class Data_export {
				
			}
			
			// TODO
			public static class Data_ingestion {
				private static final List<String> uselessFiles = new ArrayList<String>();
				
				public synchronized static List<String> getUselessFiles() {
					// 01/25/2021, event grid not support
					uselessFiles.add("eventgrid.md");
					uselessFiles.add("");
					uselessFiles.add("");
					
					return uselessFiles;
				}
			}
			
			// TODO
			public static class Materialized_views {
				
			}
		}
		
		// TODO
		public static class Query {
			
			private static final List<String> uselessFiles = new ArrayList<String>();
			
			public synchronized static List<String> getUselessFiles() {
				// 2021/07/19, digital twins not supported 
				uselessFiles.add("azure-digital-twins-query-request-plugin.md");
				uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
			
			// TODO
			public static class Functions {
				
			}
			
			// TODO
			public static class Scalar_data_types {
				
			}
			
			// TODO
			public static class Schema_entities {
				
			}
			
			
			
		}
		
		// TODO
		public static class Tools {
			private static final List<String> uselessFiles = new ArrayList<String>();
			
			public synchronized static List<String> getUselessFiles() {
				uselessFiles.add("logicapps.md");
				uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
		}
		
	}

	
}
