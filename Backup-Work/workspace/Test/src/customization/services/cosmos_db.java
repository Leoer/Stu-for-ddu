package customization.services;

import java.util.ArrayList;
import java.util.List;

public class cosmos_db {
	
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
				
		ignoredWords.add("distribute-data-globally.md");
		ignoredWords.add("GlobalDocumentDB");
		ignoredWords.add("global-dist-under-the-hood.md");
	    ignoredWords.add("globaldb");
		ignoredWords.add("tutorial-global-distribution.md");
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		
		words.add(new String[] { "https://aka\\.ms/premiumtables", "https://docs.azure.cn/cosmos-db/table/introduction" });
		words.add(new String[] { "https://aka\\.ms/cassandratutorial", "https://docs.azure.cn/cosmos-db/cassandra/create-account-java" });
		words.add(new String[] { "https://aka\\.ms/tableapiimporttool", "https://docs.azure.cn/cosmos-db/table/table-import" });
		words.add(new String[] { "https://aka\\.ms/cassandraimport", "https://docs.azure.cn/cosmos-db/cassandra/migrate-data" });
		words.add(new String[] { "over the world", "over China" });
		words.add(new String[] { "http(s)?://azure\\.com/docdb", "https://www.azure.cn/home/features/cosmos-db/" });
		words.add(new String[] { "world-wide", "around China" });
		words.add(new String[] { "across the world", "around China" });
		words.add(new String[] { "across the globe", "around China" });
		words.add(new String[] { "around the world", "around China" });
		words.add(new String[] { "worldwide", "around China" });
		words.add(new String[] { "around the globe", "around China" });
		words.add(new String[] { "With its worldwide presence", "With its china-wide presence" });
		words.add(new String[] { "all Azure regions", "all Azure China regions" });
		words.add(new String[] { "all azure regions", "all Azure China regions" });
		words.add(new String[] { "planet-scale", "multiple-region scale" });
		words.add(new String[] { "global scale", "multiple-region scale" });
		words.add(new String[] { "planet scale", "multiple-region scale" });
		words.add(new String[] { "anywhere in the world", "anywhere in China" });
		words.add(new String[] { "globally replicates", "multiple data-center replicates" });
		words.add(new String[] { "Globally replicates", "multiple data-center replicates" });
		
		words.add(new String[] { "distribute data globally", "distribute data multiple-regionally" });
		words.add(new String[] { "Distribute data globally", "Distribute data multiple-regionally" });
		
		words.add(new String[] { "global throughput control", "multiple-regional throughput control" });
		words.add(new String[] { "globally distributed", "multiple-regionally distributed" });
		words.add(new String[] { "global distribution", "multiple-regional distribution" });
		words.add(new String[] { "replicated globally", "replicated multiple-regionally" });
		words.add(new String[] { "globally distributed", "multiple-regionally distributed" });
		words.add(new String[] { "Globally scale", "Multiple-regionally scale" });
		words.add(new String[] { "scaling-globally", "scaling-multiple-regionally" });
		words.add(new String[] { "distribute-data-globally", "distribute-data-multiple-regionally" });
		words.add(new String[] { "replicate data globally", "replicate data multiple-regionally" });
		words.add(new String[] { "in globally sorted order", "in multiple-regionally sorted order" });
		words.add(new String[] { "https://aka.ms/trycosmosdb", "https://cosmos.azure.cn/try/" });
		words.add(new String[] { "Red Hat", "CentOS" });
		words.add(new String[] { "sql-api-nodejs-get-started.md", "quickstart-nodejs.md" });
		words.add(new String[] { "distribute your data globally", "distribute your data multiple-regionally" });
		
		words.add(new String[] { "throughput globally", "throughput China" });
		words.add(new String[] { "Global access", "Multiple-regional access" });
		words.add(new String[] { "Global ambition", "Multiple-regional ambition" });
		words.add(new String[] { "Global distributed", "Multiple-regional distributed" });
		words.add(new String[] { "Global distribution", "Multiple-regional distribution" });
		words.add(new String[] { "Global data", "Multiple-regional data" });
		words.add(new String[] { "Global database", "Multiple-regional database" });
		words.add(new String[] { "Global databases", "Multiple-regional databases" });
		words.add(new String[] { "Global replication", "Multiple-regional replication" });
		words.add(new String[] { "Global replicated", "Multiple-regional replicated" });
		words.add(new String[] { "Global scale", "Multiple-regional scale" });

		words.add(new String[] { "global access", "multiple-region access" });
		words.add(new String[] { "global ambition", "multiple-region ambition" });
		words.add(new String[] { "global distributed", "multiple-region distributed" });
		words.add(new String[] { "global distribution", "multiple-region distribution" });
		words.add(new String[] { "global data", "multiple-region data" });
		words.add(new String[] { "global database", "multiple-region database" });
		words.add(new String[] { "global databases", "multiple-region databases" });
		words.add(new String[] { "global replication", "multiple-region replication" });
		words.add(new String[] { "global replicated", "multiple-region replicated" });
		words.add(new String[] { "global scale", "multiple-region scale" });

		words.add(new String[] { "Globally access", "Multiple-regionally access" });
		words.add(new String[] { "Globally ambition", "Multiple-regionally ambition" });
		words.add(new String[] { "Globally distributed", "Multiple-regionally distributed" });
		words.add(new String[] { "Globally distribution", "Multiple-regionally distribution" });
		words.add(new String[] { "Globally data", "Multiple-regionally data" });
		words.add(new String[] { "Globally database", "Multiple-regionally database" });
		words.add(new String[] { "Globally databases", "Multiple-regionally databases" });
		words.add(new String[] { "Globally replication", "Multiple-regionally replication" });
		words.add(new String[] { "Globally replicated", "Multiple-regionally replicated" });
		words.add(new String[] { "Globally scale", "Multiple-regionally scale" });

		words.add(new String[] { "globally access", "multiple-regionally access" });
		words.add(new String[] { "globally ambition", "multiple-regionally ambition" });
		words.add(new String[] { "globally distributed", "multiple-regionally distributed" });
		words.add(new String[] { "globally distribution", "multiple-regionally distribution" });
		words.add(new String[] { "globally data", "multiple-regionally data" });
		words.add(new String[] { "globally database", "multiple-regionally database" });
		words.add(new String[] { "globally databases", "multiple-regionally databases" });
		words.add(new String[] { "globally replication", "multiple-regionally replication" });
		words.add(new String[] { "globally replicated", "multiple-regionally replicated" });
		words.add(new String[] { "globally scale", "multiple-regionally scale" });

		words.add(new String[] { "global order", "multiple-regional order" });
		words.add(new String[] { "global consistency models", "multiple-regional consistency models" });
		words.add(new String[] { "global variables", "multiple-regional variables" });
		words.add(new String[] { "global unique", "multiple-regional unique" });

		words.add(new String[] { "globally order", "multiple-regionally order" });
		words.add(new String[] { "globally consistency models", "multiple-regionally consistency models" });
		words.add(new String[] { "globally variables", "multiple-regionally variables" });
		words.add(new String[] { "globally unique", "multiple-regionally unique" });
		
		words.add(new String[] { "contoso.gremlin.cosmos.azure.com", "contoso.gremlin.cosmos.azure.cn" });
		
		words.add(new String[] { "Global replication", "Multiple-regional replication" });
		words.add(new String[] { "global replication", "multiple-regional replication" });
		words.add(new String[] { "global supply", "multiple-regional supply" });
		words.add(new String[] { "global traceability", "multiple-regional traceability" });
		words.add(new String[] { "globally replicated", "multiple-regionally replicated" });
		words.add(new String[] { "global replicated", "multiple-regional replicated" });
		words.add(new String[] { "global configuration", "multiple-regional configuration" });
		words.add(new String[] { "global high availability", "multiple-regional high availability" });
		words.add(new String[] { "Distribute your data globally", "Distribute your data multiple-regionally" });
		words.add(new String[] { "specified globally", "specified multiple-regionally" });
		words.add(new String[] { "create-support-request-quota-increase.md", "https://support.azure.cn/support/support-azure/" });
		words.add(new String[] { "global active-active apps", "multiple-regional active-active apps" });
		words.add(new String[] { "cosmos.azure.com", "cosmos.azure.cn" });
		words.add(new String[] { "https://login.partner.microsoftonline.cn", "https://login.chinacloudapi.cn" });
		
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {

	    warningWords.add("chinanorth222");
	    
	    warningWords.add("](](");
	    warningWords.add("billing");
	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");
	    
	    warningWords.add("global");
	    warningWords.add("Global");
	    warningWords.add("globally");
	    warningWords.add("Globally");
	    warningWords.add("globally-distributed");
	    
	    warningWords.add("global throughput control");
	    warningWords.add("globally distributed");
	    warningWords.add("globally distributed");
	    warningWords.add("replicated globally");
	    warningWords.add("globally distributed");
	    warningWords.add("Globally scale");
	    warningWords.add("scaling-globally");
	    warningWords.add("distribute-data-globally");
	    warningWords.add("replicate data globally");
	    warningWords.add("in globally sorted order");
	    warningWords.add("https://aka.ms/trycosmosdb");
	    warningWords.add("Red Hat");
	    warningWords.add("distribute data globally");
	    warningWords.add("Distribute data globally");
	    warningWords.add("azure.com");
	    warningWords.add("Without a credit card or an Azure subscription");
	    warningWords.add("Sign in to your terminal via Azure CLI or PowerShell");
	    warningWords.add("You can [activate Visual Studio subscriber benefits]");
	    warningWords.add("https://www.azure.cn/try/cosmosdb/");
	    warningWords.add("sql-api-nodejs-get-started.md");
	    
	    warningWords.add("https://docs.microsoft.com/azure/templates/microsoft.documentdb/allversions");
	    warningWords.add("cosmos.azure.com");
	    warningWords.add("PostgreSQL");
	    warningWords.add("cosmos-api-choices.png");
	    warningWords.add("Select API option");
	    
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		
		attentionWords.add(new String[]{"autopilot-faq.md",           "autopilot feature not showed on Mooncake portal"});
		attentionWords.add(new String[]{"20-days-of-tips.md",           "it is all video content without words"});
		attentionWords.add(new String[]{"bootstrap-kubernetes-cluster.md",           "private preview only at CentralUS on global, submit the request to microsoft.com mail"});
		attentionWords.add(new String[]{"cassandra-spark-databricks.md",           "databricks is not available on MC"});
		attentionWords.add(new String[]{"cosmos-db-advanced-threat-protection.md",           "No **Advanced security** in setting submenu of Cosmos DB account in portal"});
		attentionWords.add(new String[]{"cosmosdb-jupyter-notebooks.md",           "jupyter notebooks not available on Azure China Cloud"});
		attentionWords.add(new String[]{"cosmosdb-monitor-resource-logs.md",           "Add Diagnostic Setting is not exists on Mooncake project."});
		attentionWords.add(new String[]{"cosmos-db-reserved-capacity.md",           "Reserved is not avaliable on MC, current only on Azure Commercial (VM, Cosmos DB, Suse Linux, SQL Database)"});
		attentionWords.add(new String[]{"cosmosdb-sql-api-migrate-data-striim.md",           "Not striim images in the marketplace of Azure China"});
		attentionWords.add(new String[]{"data-explorer.md",           "Open Full Screen with ConnectionString is invalid on MC"});
		attentionWords.add(new String[]{"estimate-ru-with-capacity-planner.md",           "Not Available https://cosmos.azure.com/  for Azure China. Only valid for global  public Azure."});
		attentionWords.add(new String[]{"etcd-api-introduction.md",           "private preview not suitable on Azure China Portal."});
		attentionWords.add(new String[]{"firewall-support.md",           "firewall and virtual network setting is not valid on MC"});
		attentionWords.add(new String[]{"how-to-configure-cosmos-db-trigger-logs.md",           "Azure Function did not link with Appliation Insight in Mooncake."});
		attentionWords.add(new String[]{"how-to-configure-private-endpoints.md",           "Prviate link is on preview on global azure (US West, Central zone) for Cosmos DB."});
		attentionWords.add(new String[]{"large-partition-keys.md",           "No option about My partition key is large than 100 bytes."});
		attentionWords.add(new String[]{"migrate-cosmosdb-data.md",           "Registry only submit to global Azure."});
		attentionWords.add(new String[]{"mongodb-post-migration.md",           "(Azure Database Migration Service) is not valid on MC"});
		attentionWords.add(new String[]{"mongodb-pre-migration.md",           "(Azure Database Migration Service) is not valid on MC"});
		attentionWords.add(new String[]{"monitor-normalized-request-units.md",           "*Normalized RU Consumption* metrix is not exist in Metrix options in Mooncake."});
		attentionWords.add(new String[]{"monitor-server-side-latency.md",           "No server side latency in metrics options in Azure China portal."});
		attentionWords.add(new String[]{"partners-migration-cosmosdb.md",           "partner not suit to China"});
		attentionWords.add(new String[]{"plan-manage-costs.md",           "**Cost Management** and **Cost Analytics** can not be found on Mooncake currently."});
		attentionWords.add(new String[]{"spark-api-introduction.md",           "private preview not valid on MC"});
		attentionWords.add(new String[]{"spark-connector.md",           "private preview not valid on MC"});
		attentionWords.add(new String[]{"use-notebook-features-and-commands.md",           "jupyter notebooks not available on Azure China Cloud"});
		attentionWords.add(new String[]{"mongodb-version-upgrade.md",           "The `feature` submenu did not show 'Upgrade to Mongo server version 3.6` in Mooncake portal."});
		attentionWords.add(new String[]{"synapse-link-power-bi.md",           "The ` Azure Synapse Analytics (workspaces preview)` feature is not available on Mooncake portal.  Only available for feature `Azure Synapse Analytics (formerly SQL DW) on Mooncake."});
		attentionWords.add(new String[]{"create-support-request-quota-increase.md",           "`+ New Support Request ` submenu is not avaiable on Mooncake."});
		attentionWords.add(new String[]{"cassandra-kafka-connect.md",           "`notebook` feature not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-command-line.md",           "No registered resource provider found for location 'chinaeast2' and API version '2021-03-01-preview' for type 'databaseAccounts'."});
		attentionWords.add(new String[]{"continuous-backup-restore-frequently-asked-questions.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-introduction.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-permissions.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-portal.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-powershell.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-resource-model.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-template.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-database-accounts-list.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-database-accounts-list-by-location.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-mongodb-collections-list.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-mongodb-databases-list.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-mongodb-resources-list.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-sql-containers-list.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-sql-databases-list.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"restorable-sql-resources-list.md",           "`continuous backup` is not available on Mooncake."});
		attentionWords.add(new String[]{"analytical-store-private-endpoints.md",           "`Azure Synapse Analytics`(Create Synapse workspace) not available on Mooncake."});
		attentionWords.add(new String[]{"continuous-backup-restore-frequently-asked-questions.yml",           "Continuous Backup is not available on Mooncake."});
		attentionWords.add(new String[]{"dedicated-gateway.md",           "`Dedicated Gateway` submenu on exists on Cosmos Db managed setting panel."});
		attentionWords.add(new String[]{"how-to-configure-integrated-cache.md",           "`Dedicated Gateway` submenu on exists on Cosmos Db managed setting panel."});
		attentionWords.add(new String[]{"integrated-cache.md",           "`Dedicated Gateway` submenu on exists on Cosmos Db managed setting panel."});
		attentionWords.add(new String[]{"integrated-cache-faq.md",           "`Dedicated Gateway` submenu on exists on Cosmos Db managed setting panel."});
		attentionWords.add(new String[]{"integrated-cache-faq.md",           "`Dedicated Gateway` submenu on exists on Cosmos Db managed setting panel."});
		attentionWords.add(new String[]{"monitor-account-key-updates.md",           "`Azure Cosmos DB Account` is not exist in option of `Resource Type`  on Monitor metrics submenu."});
		attentionWords.add(new String[]{"access-previews.md",           "There is nothing about Microsoft.DocumentDB category "});
		attentionWords.add(new String[]{"burst-capacity.md",           "Diagnose and solve problems -> Throughput and Scaling ` not available on mooncake"});
		attentionWords.add(new String[]{"burst-capacity-faq.yml",           "Diagnose and solve problems -> Throughput and Scaling ` not available on mooncake"});
		attentionWords.add(new String[]{"merge.md",           "Diagnose and solve problems -> Throughput and Scaling ` not available on mooncake"});
		attentionWords.add(new String[]{"how-to-setup-cross-tenant-customer-managed-keys.md",           "`The feature 'FederatedClientIdentity' could not be found both in Powershell and CLI,  Portal are not supported now."});
		attentionWords.add(new String[]{"notebooks-faq.yml",           "`notebook` feature not available on Mooncake."});
		attentionWords.add(new String[]{"notebooks-overview.md",           "`notebook` feature not available on Mooncake."});
		attentionWords.add(new String[]{"try-free.md",           "`https://cosmos.azure.cn/try/` not available on Mooncake."});

		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
	
		uselessFiles.add("changefeed-ecommerce-solution.md");
//		Reservations not available. 20221101
		uselessFiles.add("reserved-capacity.md");
		uselessFiles.add("partners-migration.md");
		uselessFiles.add("monitor-account-key-updates.md");
		uselessFiles.add("how-to-configure-integrated-cache.md");
		uselessFiles.add("access-previews.md");
		uselessFiles.add("analytical-store-private-endpoints.md");
		uselessFiles.add("burst-capacity-faq.yml");
		uselessFiles.add("burst-capacity.md");
		uselessFiles.add("monitor-account-key-updates.md");
		uselessFiles.add("data-explorer.md");
		uselessFiles.add("dedicated-gateway.md");
		uselessFiles.add("how-to-container-copy.md");
		uselessFiles.add("how-to-configure-integrated-cache.md");
		uselessFiles.add("how-to-setup-cross-tenant-customer-managed-keys.md");
		uselessFiles.add("integrated-cache-faq.md");
		uselessFiles.add("monitor-account-key-updates.md");
		uselessFiles.add("intra-account-container-copy.md");
		uselessFiles.add("integrated-cache.md");
		uselessFiles.add("monitor-server-side-latency.md");
		uselessFiles.add("merge.md");
		uselessFiles.add("monitoring-solutions.md");
		uselessFiles.add("notebooks-faq.yml");
		uselessFiles.add("notebooks-overview.md");
		uselessFiles.add("plan-manage-costs.md");
		uselessFiles.add("synapse-link-power-bi.md");
		uselessFiles.add("try-free.md");
		
//		2022.11.16 add .Because synapse link is not available.
		uselessFiles.add("analytical-store-introduction.md");
		uselessFiles.add("configure-custom-partitioning.md");
		uselessFiles.add("configure-synapse-link.md");
		uselessFiles.add("custom-partitioning-analytical-store.md");
		uselessFiles.add("integrated-power-bi-synapse-link.md");
		uselessFiles.add("synapse-link.md");
		uselessFiles.add("synapse-link-frequently-asked-questions.yml");
		uselessFiles.add("synapse-link-use-cases.md");
		uselessFiles.add("hierarchical-partition-keys.md");
		uselessFiles.add("hierarchical-partition-keys-faq.yml");
		
		uselessFiles.add("");
		
		
		return uselessFiles;
	}
	
	// TODO scripts
	public static class cassandra {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		private static final List<String> ignoredWords = new ArrayList<String>();
		
		public synchronized static List<String> getIgnoredWords() {

			ignoredWords.add("");
		    
		    return ignoredWords;
		}
		
		public static synchronized List<String[]> getWords() {
			
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			
			return words;
		}
		
		public synchronized static List<String> getWarningWords() {

		    warningWords.add("chinanorth222");
		    
		    warningWords.add("](](");
		    warningWords.add("billing");
		    warningWords.add("]((");
		    warningWords.add("]http");
		    warningWords.add("]/");
		    
		    return warningWords;
		}
		
		public synchronized static List<String[]> getAttentionWords() {

			attentionWords.add(new String[]{"migrate-data-striim.md",           " `Striim` is not available on Mooncake."});
			attentionWords.add(new String[]{"materialized-views-cassandra.md",  "  BadRequest-code :BadRequest,message :Invalid capability CassandraEnableMaterializedViews.\r\nActivityId: 08e913db-3bfe-4006-a7e1-7991e3089dd6, Microsoft.Azure.Documents.Common/2.14.0})"});
			
			return attentionWords;
		}
		
		public synchronized static List<String> getUselessFiles() {
		
			uselessFiles.add("tutorial-kubernetes-workload-identity.md");
			uselessFiles.add("materialized-views.md");
			uselessFiles.add("migrate-data-striim.md");
			
			return uselessFiles;
		}
	}
	// TODO scripts
	public static class gremlin {
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
			
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			
			return words;
		}
		
		public synchronized static List<String> getWarningWords() {

		    warningWords.add("chinanorth222");
		    
		    warningWords.add("](](");
		    warningWords.add("billing");
		    warningWords.add("]((");
		    warningWords.add("]http");
		    warningWords.add("]/");
		    
		    return warningWords;
		}
		
		public synchronized static List<String[]> getAttentionWords() {
			
			attentionWords.add(new String[]{"supply-chain-traceability-solution.md",     "`Infosys Traceability Knowledge Graph` is not available on Azure China market."});
			attentionWords.add(new String[]{"",           ""});
			
			return attentionWords;
		}
		
		public synchronized static List<String> getUselessFiles() {
		
			uselessFiles.add("supply-chain-traceability-solution.md");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	}
	// TODO scripts
	public static class includes {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		private static final List<String> ignoredWords = new ArrayList<String>();
			
		public synchronized static List<String> getIgnoredWords() {
			
			ignoredWords.add("");
			
			return ignoredWords;
		}
			
		public static synchronized List<String[]> getWords() {
				
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			
			return words;
		}
			
		public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
		}
			
		public synchronized static List<String[]> getAttentionWords() {

				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
		}
			
		public synchronized static List<String> getUselessFiles() {
			
				uselessFiles.add("");
				
				return uselessFiles;
		}
	}
	// TODO scripts
	public static class mongodb {
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
				
				words.add(new String[] { "", "" });
				words.add(new String[] { "", "" });
				
				return words;
			}
			
			public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
			}
			
			public synchronized static List<String[]> getAttentionWords() {
				
				attentionWords.add(new String[]{"tutorial-develop-mongodb-react.md",           "Only contains www.youtube.com vedio "});
				attentionWords.add(new String[]{"",           ""});
				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
			}
			
			public synchronized static List<String> getUselessFiles() {
			
				uselessFiles.add("tutorial-develop-react.md");
				uselessFiles.add("feature-support-42.md");
				uselessFiles.add("");
				
				return uselessFiles;
			}
			public static class includes {
			
			}
	}
	// TODO scripts
	public static class nosql {
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
				
				words.add(new String[] { "", "" });
				words.add(new String[] { "", "" });
				
				return words;
			}
			
			public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
			}
			
			public synchronized static List<String[]> getAttentionWords() {
				
				attentionWords.add(new String[]{"changefeed-ecommerce-solution.md",           "output as Power Bi in invalid on MC"});
				attentionWords.add(new String[]{"advanced-threat-protection.md",           "Not support the government Cloud."});
				attentionWords.add(new String[]{"cosmosdb-cassandra-api-migrate-data-striim.md",           "Not striim images in the marketplace of Azure China."});
				attentionWords.add(new String[]{"create-notebook-visualize-data.md",           "jupyter notebooks not available on Azure China Cloud"});
				attentionWords.add(new String[]{"enable-notebooks.md",           "jupyter notebooks not available on Azure China Cloud"});
				attentionWords.add(new String[]{"import-github-notebooks.md",           "*Enable Notebook* not available on Mooncake."});
				attentionWords.add(new String[]{"use-csharp-notebook-features-and-commands.md",           "*Notebook* feature not available om Mooncake."});
				attentionWords.add(new String[]{"use-python-notebook-features-and-commands.md",           "*Notebook* feature not available om Mooncake."});
				attentionWords.add(new String[]{"publish-notebook-gallery.md",           "`notebook` feature not available on Mooncake."});
				attentionWords.add(new String[]{"migrate-data-striim.md",           "`Striim` is not available on Mooncake."});
				attentionWords.add(new String[]{"defender-for-cosmos-db.md",           "`Microsoft Defender for Cosmos DB` is not available on sovereign cloud such as Azure China."});
				attentionWords.add(new String[]{"distribute-throughput-across-partitions.md",           "Diagnose and solve problems -> Throughput and Scaling ` not available on mooncake"});
				attentionWords.add(new String[]{"distribute-throughput-across-partitions-faq.yml",           "Diagnose and solve problems -> Throughput and Scaling ` not available on mooncake"});
				attentionWords.add(new String[]{"how-to-delete-by-partition-key.md",           "`DeleteAllItemsByPartitionKey` not be found on Mooncake."});
				attentionWords.add(new String[]{"tutorial-create-notebook.md",           "`notebook` feature not available on Mooncake."});

				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
			}
			
			public synchronized static List<String> getUselessFiles() {
			
				uselessFiles.add("changefeed-ecommerce-solution.md");
				uselessFiles.add("defender-for-cosmos-db.md");
				uselessFiles.add("distribute-throughput-across-partitions-faq.yml");
			    uselessFiles.add("distribute-throughput-across-partitions.md");
				uselessFiles.add("how-to-delete-by-partition-key.md");
				uselessFiles.add("migrate-data-striim.md");
				uselessFiles.add("tutorial-create-notebook.md");
			    uselessFiles.add("");
				uselessFiles.add("");
				
				return uselessFiles;
			}
			public static class includes {
			}
			public static class query {
			}
	}
	// TODO scripts
	public static class postgresql {
			private static final List<String[]> words = new ArrayList<String[]>();
			private static final List<String> warningWords = new ArrayList<String>();
			private static final List<String[]> attentionWords = new ArrayList<String[]>();
			private static final List<String> uselessFiles = new ArrayList<String>();
			private static final List<String> ignoredWords = new ArrayList<String>();
			
			public synchronized static List<String> getIgnoredWords() {

				ignoredWords.add("");
				
				return ignoredWords;
			}
			
			public static synchronized List<String[]> getWords() {
				
				words.add(new String[] { "", "" });
				words.add(new String[] { "", "" });
				
				return words;
			}
			
			public synchronized static List<String> getWarningWords() {

				warningWords.add("chinanorth222");
				
				warningWords.add("](](");
				warningWords.add("billing");
				warningWords.add("]((");
				warningWords.add("]http");
				warningWords.add("]/");
				
				return warningWords;
			}
			
			public synchronized static List<String[]> getAttentionWords() {

				attentionWords.add(new String[]{"",           ""});
				
				return attentionWords;
			}
			
			public synchronized static List<String> getUselessFiles() {

				uselessFiles.add("");
				
				return uselessFiles;
			}
			// TODO scripts
			public static class includes {

			}
	}
	// TODO scripts
	public static class table {
			private static final List<String> uselessFiles = new ArrayList<String>();
			public synchronized static List<String> getUselessFiles() {
				uselessFiles.add("how-to-use-go.md");
				uselessFiles.add("");
				
				
				return uselessFiles;
			}
			// TODO scripts
			public static class includes {

				public static class quickstart_dotnet {

							}
				public static class quickstart_java {

							}
				public static class quickstart_nodejs {

							}
				public static class quickstart_python {
					private static final List<String[]> attentionWords = new ArrayList<String[]>();
					public synchronized static List<String[]> getAttentionWords() {

						attentionWords.add(new String[]{"create-cosmos-db-acct-3.md",           "Cosmos DB `API Select Page` is not available on Mooncake."});

						return attentionWords;
					}
				}
			}
	}
	// TODO scripts
	public static class scripts {
			// TODO scripts
			public static class cli {
				public static class cassandra {
				}
				public static class common {
				}
				public static class gremlin {
				}
				public static class mongodb {
				}
				public static class nosql {
				}
				public static class table {
				}
			}
			public static class powershell {
				public static class cassandra {
				}
				public static class common {
				}
				public static class gremlin {
				}
				public static class mongodb {
				}
				public static class nosql {
				}
				public static class table {
				}
			}
	}
}