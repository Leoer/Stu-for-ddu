package customization.services;

import java.util.ArrayList;
import java.util.List;

public class machine_learning {
	private static final List<String[]> words = new ArrayList<String[]>(200);
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String[]> getWords() {
//		words.add(new String[] { "",   "https://www.azure.cn/support/legal/subscription-agreement/" });
		words.add(new String[] { "https://ml.azure.com",   "https://studio.ml.azure.cn" });
//		words.add(new String[] { "active-directory/managed-identities-azure-resources/how-to-manage-ua-identity-portal.md",   "active-directory/managed-identities-azure-resources/how-manage-user-assigned-managed-identities.md" });
		words.add(new String[] { "algorithm-module-reference/",   "component-reference/" });
        words.add(new String[] { "/azure/databricks/",   "/databricks/" });
//        2022.0926 add 
        words.add(new String[] { "(how-to-migrate-from-estimators-to-scriptrunconfig.md)",   "(./v1/how-to-migrate-from-estimators-to-scriptrunconfig.md)" });
        words.add(new String[] { "(./how-to-migrate-from-estimators-to-scriptrunconfig.md)",   "(./v1/how-to-migrate-from-estimators-to-scriptrunconfig.md)" });
        words.add(new String[] { "(/how-to-migrate-from-estimators-to-scriptrunconfig)",   "(./v1/how-to-migrate-from-estimators-to-scriptrunconfig.md)" });
        
        words.add(new String[] { "(how-to-use-managed-identities.md)",   "(how-to-identity-based-service-authentication.md)" });
        words.add(new String[] { "(./how-to-use-managed-identities.md)",   "(how-to-identity-based-service-authentication.md)" });
        words.add(new String[] { "(/how-to-use-managed-identities)",   "(how-to-identity-based-service-authentication.md)" });
        
        words.add(new String[] { "(tutorial-train-deploy-notebook.md)",   "(./v1/tutorial-train-deploy-notebook.md)" });
        words.add(new String[] { "(./tutorial-train-deploy-notebook.md)",   "(./v1/tutorial-train-deploy-notebook.md)" });
        words.add(new String[] { "(/tutorial-train-deploy-notebook)",   "(./v1/tutorial-train-deploy-notebook.md)" });
        
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
	    // 04/20/2022, useless file
//	    warningWords.add("how-to-homomorphic-encryption-seal.md");
	    warningWords.add("concept-plan-manage-cost.md");
	    warningWords.add("how-to-attach-arc-kubernetes.md");
	    warningWords.add("how-to-data-prep-synapse-spark-pool.md ");
	    warningWords.add("how-to-deploy-fpga-web-service");
	    warningWords.add("how-to-kubernetes-instance-type.md");
//	    warningWords.add("how-to-link-synapse-ml-workspaces");
//	    warningWords.add("how-to-link-synapse-ml-workspaces.md");
	    warningWords.add("how-to-manage-workspace-terraform.md");
	    warningWords.add("migrate-execute-r-script.md");
	    warningWords.add("migrate-overview.md");
	    warningWords.add("migrate-rebuild-experiment.md");
	    warningWords.add("migrate-rebuild-integrate-with-client-app.md");
	    warningWords.add("migrate-rebuild-web-service.md");
	     warningWords.add("migrate-register-dataset.md");
	    warningWords.add("reference-yaml-datastore-data-lake-gen1.md");
//	    warningWords.add("how-to-homomorphic-encryption-seal");
//	    warningWords.add("how-to-auto-train-nlp-models.md");
//	    warningWords.add("how-to-auto-train-nlp-models");
//	    warningWords.add("security-controls-policy.md");
//	    warningWords.add("security-controls-policy");
	    warningWords.add("algorithm-module-reference/module-reference.md");
	    warningWords.add("algorithm-module-reference/module-reference");
//	    warningWords.add("module-reference.md");
//	    warningWords.add("module-reference");
//	    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//	    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code");
//	    warningWords.add("how-to-use-automl-small-object-detect.md");
	    warningWords.add("virtual-machines/nc-series.md");
	    warningWords.add("Supplemental Terms of Use for Azure Previews");
//	    
	    warningWords.add("Supplemental Terms of Use for Microsoft Azure Previews");
	    warningWords.add("(https://www.azure.cn/support/legal)");
	    warningWords.add("(https://www.azure.cn/support/legal/)");
//	    warningWords.add("how-to-configure-cli.md"); is available
	    
	    warningWords.add("how-to-deploy-fpga-web-service.md");
	    warningWords.add("::: code");
	    warningWords.add("Azure Arc"); 
	    warningWords.add("Arc-attached"); 
	    warningWords.add("Arc-enabled"); 
	    warningWords.add("reference-yaml-compute-kubernetes.md");
	    warningWords.add("Arc Kubernetes");
	    warningWords.add("[!Notebook-python[]");
	    
	    warningWords.add("ml.azure.com");
	    
//	    warningWords.add("algorithm-module-reference");
	    warningWords.add("algorithm-module-reference/");
	    warningWords.add("how-to-use-mlflow-azure-synapse.md");
	    
	    return warningWords;
	}
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("https://github.com/microsoft/MLOpsPython/generate");
//		ignoredWords.add("web-application-firewall-troubleshoot.md");
//		ignoredWords.add("application-gateway-web-application-firewall-portal.md");
		
	    return ignoredWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
//		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		
		//Derek mark this feature is not available on Mooncake.
		uselessFiles.add("concept-plan-manage-cost.md");
		uselessFiles.add("how-to-attach-arc-kubernetes.md");
		uselessFiles.add("how-to-data-prep-synapse-spark-pool.md ");
		uselessFiles.add("how-to-deploy-fpga-web-service");
		uselessFiles.add("how-to-kubernetes-instance-type.md");
		uselessFiles.add("how-to-manage-workspace-terraform.md");
		uselessFiles.add("migrate-execute-r-script.md");
		uselessFiles.add("migrate-overview.md");
		uselessFiles.add("migrate-rebuild-experiment.md");
		uselessFiles.add("migrate-rebuild-integrate-with-client-app.md");
		uselessFiles.add("migrate-rebuild-web-service.md");
		uselessFiles.add("migrate-register-dataset.md");
		uselessFiles.add("reference-yaml-datastore-data-lake-gen1.md");
		uselessFiles.add("how-to-deploy-fpga-web-service.md");
        uselessFiles.add("how-to-devops-machine-learning.md");
		//`synapse-analytics/quickstart-create-workspace` is not avaialble on Mooncake.
		//`Azure Synapse Analytics` is not available on Mooncake.
		uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
		
		//cli-v2 is not available now
//		uselessFiles.add("how-to-configure-cli.md");  is available on 20220609
//		uselessFiles.add("machine-learning-cli-v2.md");
//		uselessFiles.add("how-to-autoscale-endpoints.md");
//		uselessFiles.add("how-to-access-resources-from-endpoints-managed-identities.md");
		uselessFiles.add("reference-yaml-compute-kubernetes.md");
		uselessFiles.add("dsvm-tutorial-bicep.md");
		
//		uselessFiles.add("how-to-use-batch-endpoint.md");
//		uselessFiles.add("how-to-manage-environments-v2.md");
//		uselessFiles.add("how-to-train-cli.md");
//		uselessFiles.add("how-to-deploy-managed-online-endpoints.md");
//		uselessFiles.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//		uselessFiles.add("how-to-configure-cli.md"); is available.
//		Seems to work, but not what I added.
//		uselessFiles.add("tutorial-train-deploy-image-classification-model-vscode.md");
		uselessFiles.add("reference-yaml-deployment-kubernetes-online.md");

		uselessFiles.add("how-to-use-synapsesparkstep.md");
		
//		Prerequisites are not available.synapse-analytics on 20220722
//	    20220715 add for the referenced file is not available.
		uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
		uselessFiles.add("how-to-use-synapsesparkstep.md");
		
//		2022.0718 Deleted by global.
//		uselessFiles.add("how-to-use-azure-ad-identity.md");
//		uselessFiles.add("resource-limits-quotas-capacity.md");
		
//		2022.0802 Deleted by global.
//		uselessFiles.add("concept-data-ingestion.md");
//		uselessFiles.add("concept-open-source.md");
//		uselessFiles.add("concept-optimize-data-processing.md");
//		uselessFiles.add("how-to-create-attach-kubernetes.md");
//		uselessFiles.add("how-to-deploy-and-where.md");
//		uselessFiles.add("how-to-deploy-update-web-service.md");
//		uselessFiles.add("how-to-secure-inferencing-vnet.md");
//		uselessFiles.add("how-to-secure-web-service.md");
		
//		The feature of megaphone icon not find.
		uselessFiles.add("how-to-enable-preview-features.md");
		
//		Unavailable Because the Prerequisites[Azure Synapse Analytics workspace and cluster(/synapse-analytics/quickstart-create-workspace)] NOT AVAILABLE.
//		2022.0909 add
//		Service--Azure Synapse Analytics not available.
		uselessFiles.add("how-to-use-mlflow-azure-synapse.md");
		uselessFiles.add("how-to-manage-synapse-spark-pool.md");
		uselessFiles.add("how-to-submit-spark-jobs.md");
		uselessFiles.add("interactive-data-wrangling-with-apache-spark-azure-ml.md");
		uselessFiles.add("");
		return uselessFiles;
	}
	
	
	public static class data_science_virtual_machine{
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		private static final List<String[]> words = new ArrayList<String[]>(200);
		
		public synchronized static List<String[]> getWords() {
//			words.add(new String[] { "",   "https://www.azure.cn/support/legal/subscription-agreement/" });
			words.add(new String[] { "https://ml.azure.com",   "https://studio.ml.azure.cn" });
//			words.add(new String[] { "active-directory/managed-identities-azure-resources/how-to-manage-ua-identity-portal.md",   "active-directory/managed-identities-azure-resources/how-manage-user-assigned-managed-identities.md" });
			words.add(new String[] { "algorithm-module-reference/",   "component-reference/" });
	        words.add(new String[] { "/azure/databricks/",   "/databricks/" });
	        
	        
			return words;
		}
		public synchronized static List<String> getWarningWords() {
		    // 04/20/2022, useless file
//			warningWords.add("how-to-homomorphic-encryption-seal.md");
		    warningWords.add("concept-plan-manage-cost.md");
		    warningWords.add("how-to-attach-arc-kubernetes.md");
		    warningWords.add("how-to-data-prep-synapse-spark-pool.md ");
		    warningWords.add("how-to-deploy-fpga-web-service");
		    warningWords.add("how-to-kubernetes-instance-type.md");
//		    warningWords.add("how-to-link-synapse-ml-workspaces");
//		    warningWords.add("how-to-link-synapse-ml-workspaces.md");
		    warningWords.add("how-to-manage-workspace-terraform.md");
		    warningWords.add("migrate-execute-r-script.md");
		    warningWords.add("migrate-overview.md");
		    warningWords.add("migrate-rebuild-experiment.md");
		    warningWords.add("migrate-rebuild-integrate-with-client-app.md");
		    warningWords.add("migrate-rebuild-web-service.md");
		     warningWords.add("migrate-register-dataset.md");
		    warningWords.add("reference-yaml-datastore-data-lake-gen1.md");
//		    warningWords.add("how-to-homomorphic-encryption-seal");
//		    warningWords.add("how-to-auto-train-nlp-models.md");
//		    warningWords.add("how-to-auto-train-nlp-models");
//		    warningWords.add("security-controls-policy.md");
		    warningWords.add("how-to-deploy-fpga-web-service.md");
		    warningWords.add("algorithm-module-reference/module-reference.md");
		    warningWords.add("algorithm-module-reference/module-reference");
//		    warningWords.add("module-reference.md");
//		    warningWords.add("module-reference");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code");
//		    warningWords.add("how-to-use-automl-small-object-detect.md");
//		    warningWords.add("how-to-use-automl-small-object-detect");
		    warningWords.add("Supplemental Terms of Use for Azure Previews");
		    warningWords.add("Azure Arc"); 
		    warningWords.add("Arc-attached"); 
		    warningWords.add("Supplemental Terms of Use for Microsoft Azure Previews");
		    warningWords.add("(https://www.azure.cn/support/legal)");
		    warningWords.add("(https://www.azure.cn/support/legal/)");
//		    warningWords.add("how-to-configure-cli.md"); available
//		    warningWords.add("machine-learning-cli-v2.md");
		    // CLi v2 is preview but not available.
//		    warningWords.add("how-to-use-batch-endpoint.md");
//		    warningWords.add("how-to-manage-environments-v2.md");
//		    warningWords.add("how-to-train-cli.md");
//		    warningWords.add("how-to-deploy-managed-online-endpoints.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
		    warningWords.add("Arc-enabled"); 
		    warningWords.add("virtual-machines/nc-series.md");
		    warningWords.add("reference-yaml-deployment-kubernetes-online.md");
		    warningWords.add("::: code");
		    warningWords.add("Arc Kubernetes");
		    warningWords.add("[!Notebook-python[]");
		    warningWords.add("ml.azure.com");
		    warningWords.add("algorithm-module-reference");
		    warningWords.add("how-to-use-mlflow-azure-synapse.md");
		    return warningWords;
		}
		public synchronized static List<String> getUselessFiles() {
			
			//Derek mark this feature is not available on Mooncake.
			uselessFiles.add("concept-plan-manage-cost.md");
			uselessFiles.add("how-to-attach-arc-kubernetes.md");
			uselessFiles.add("how-to-data-prep-synapse-spark-pool.md ");
			uselessFiles.add("how-to-deploy-fpga-web-service");
			uselessFiles.add("how-to-kubernetes-instance-type.md");
			uselessFiles.add("how-to-manage-workspace-terraform.md");
			uselessFiles.add("migrate-execute-r-script.md");
			uselessFiles.add("migrate-overview.md");
			uselessFiles.add("migrate-rebuild-experiment.md");
			uselessFiles.add("migrate-rebuild-integrate-with-client-app.md");
			uselessFiles.add("migrate-rebuild-web-service.md");
			uselessFiles.add("migrate-register-dataset.md");
			uselessFiles.add("reference-yaml-datastore-data-lake-gen1.md");
			uselessFiles.add("how-to-deploy-fpga-web-service.md");

			//`synapse-analytics/quickstart-create-workspace` is not avaialble on Mooncake.
			//`Azure Synapse Analytics` is not available on Mooncake.
//			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			
			//cli-v2 is not available now
//			uselessFiles.add("how-to-configure-cli.md"); is available
//			uselessFiles.add("machine-learning-cli-v2.md");
//			uselessFiles.add("how-to-autoscale-endpoints.md");
//			uselessFiles.add("how-to-access-resources-from-endpoints-managed-identities.md");
			uselessFiles.add("reference-yaml-compute-kubernetes.md");
			uselessFiles.add("dsvm-tutorial-bicep.md");
			
//			uselessFiles.add("how-to-use-batch-endpoint.md");
//			uselessFiles.add("how-to-manage-environments-v2.md");
//			uselessFiles.add("how-to-train-cli.md");
//			uselessFiles.add("how-to-deploy-managed-online-endpoints.md");
//			uselessFiles.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");

//			Seems to work, but not what I added.
//			uselessFiles.add("tutorial-train-deploy-image-classification-model-vscode.md");
			uselessFiles.add("reference-yaml-deployment-kubernetes-online.md");
					
//		    20220715 add for the referenced file is not available.
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			
//			Prerequisites are not available.synapse-analytics
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			return uselessFiles;
		}
	}
	public static class component_reference{
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		private static final List<String[]> words = new ArrayList<String[]>(200);
		
		public synchronized static List<String[]> getWords() {
//			words.add(new String[] { "",   "https://www.azure.cn/support/legal/subscription-agreement/" });
			words.add(new String[] { "https://ml.azure.com",   "https://studio.ml.azure.cn" });
//			words.add(new String[] { "active-directory/managed-identities-azure-resources/how-to-manage-ua-identity-portal.md",   "active-directory/managed-identities-azure-resources/how-manage-user-assigned-managed-identities.md" });
			words.add(new String[] { "algorithm-module-reference/",   "component-reference/" });
	        words.add(new String[] { "/azure/databricks/",   "/databricks/" });
	        
	        
			return words;
		}
		public synchronized static List<String> getWarningWords() {
		    // 04/20/2022, useless file
//			warningWords.add("how-to-homomorphic-encryption-seal.md");
		    warningWords.add("concept-plan-manage-cost.md");
		    warningWords.add("how-to-attach-arc-kubernetes.md");
		    warningWords.add("how-to-data-prep-synapse-spark-pool.md ");
		    warningWords.add("how-to-deploy-fpga-web-service");
		    warningWords.add("how-to-kubernetes-instance-type.md");
//		    warningWords.add("how-to-link-synapse-ml-workspaces");
//		    warningWords.add("how-to-link-synapse-ml-workspaces.md");
		    warningWords.add("how-to-manage-workspace-terraform.md");
		    warningWords.add("migrate-execute-r-script.md");
		    warningWords.add("migrate-overview.md");
		    warningWords.add("migrate-rebuild-experiment.md");
		    warningWords.add("migrate-rebuild-integrate-with-client-app.md");
		    warningWords.add("migrate-rebuild-web-service.md");
		     warningWords.add("migrate-register-dataset.md");
		    warningWords.add("reference-yaml-datastore-data-lake-gen1.md");
//		    warningWords.add("how-to-homomorphic-encryption-seal");
//		    warningWords.add("how-to-auto-train-nlp-models.md");
//		    warningWords.add("how-to-auto-train-nlp-models");
//		    warningWords.add("security-controls-policy.md");
		    warningWords.add("how-to-deploy-fpga-web-service.md");
		    warningWords.add("algorithm-module-reference/module-reference.md");
		    warningWords.add("algorithm-module-reference/module-reference");
//		    warningWords.add("module-reference.md");
//		    warningWords.add("module-reference");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code");
//		    warningWords.add("how-to-use-automl-small-object-detect.md");
//		    warningWords.add("how-to-use-automl-small-object-detect");
		    warningWords.add("Supplemental Terms of Use for Azure Previews");
		    warningWords.add("Azure Arc"); 
		    warningWords.add("Arc-attached"); 
		    warningWords.add("Supplemental Terms of Use for Microsoft Azure Previews");
		    warningWords.add("(https://www.azure.cn/support/legal)");
		    warningWords.add("(https://www.azure.cn/support/legal/)");
//		    warningWords.add("how-to-configure-cli.md"); available
//		    warningWords.add("machine-learning-cli-v2.md");
		    // CLi v2 is preview but not available.
//		    warningWords.add("how-to-use-batch-endpoint.md");
//		    warningWords.add("how-to-manage-environments-v2.md");
//		    warningWords.add("how-to-train-cli.md");
//		    warningWords.add("how-to-deploy-managed-online-endpoints.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
		    warningWords.add("Arc-enabled"); 
		    warningWords.add("virtual-machines/nc-series.md");
		    warningWords.add("reference-yaml-deployment-kubernetes-online.md");
		    warningWords.add("::: code");
		    warningWords.add("Arc Kubernetes");
		    warningWords.add("[!Notebook-python[]");
		    warningWords.add("ml.azure.com");
		    warningWords.add("algorithm-module-reference");
		    warningWords.add("how-to-use-mlflow-azure-synapse.md");
		    return warningWords;
		}
		public synchronized static List<String> getUselessFiles() {
			
			//Derek mark this feature is not available on Mooncake.
			uselessFiles.add("concept-plan-manage-cost.md");
			uselessFiles.add("how-to-attach-arc-kubernetes.md");
			uselessFiles.add("how-to-data-prep-synapse-spark-pool.md ");
			uselessFiles.add("how-to-deploy-fpga-web-service");
			uselessFiles.add("how-to-kubernetes-instance-type.md");
			uselessFiles.add("how-to-manage-workspace-terraform.md");
			uselessFiles.add("migrate-execute-r-script.md");
			uselessFiles.add("migrate-overview.md");
			uselessFiles.add("migrate-rebuild-experiment.md");
			uselessFiles.add("migrate-rebuild-integrate-with-client-app.md");
			uselessFiles.add("migrate-rebuild-web-service.md");
			uselessFiles.add("migrate-register-dataset.md");
			uselessFiles.add("reference-yaml-datastore-data-lake-gen1.md");
			uselessFiles.add("how-to-deploy-fpga-web-service.md");

			//`synapse-analytics/quickstart-create-workspace` is not avaialble on Mooncake.
			//`Azure Synapse Analytics` is not available on Mooncake.
//			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			
			//cli-v2 is not available now
//			uselessFiles.add("how-to-configure-cli.md"); is available
//			uselessFiles.add("machine-learning-cli-v2.md");
//			uselessFiles.add("how-to-autoscale-endpoints.md");
//			uselessFiles.add("how-to-access-resources-from-endpoints-managed-identities.md");
			uselessFiles.add("reference-yaml-compute-kubernetes.md");
			uselessFiles.add("dsvm-tutorial-bicep.md");
			
//			uselessFiles.add("how-to-use-batch-endpoint.md");
//			uselessFiles.add("how-to-manage-environments-v2.md");
//			uselessFiles.add("how-to-train-cli.md");
//			uselessFiles.add("how-to-deploy-managed-online-endpoints.md");
//			uselessFiles.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");

//			Seems to work, but not what I added.
//			uselessFiles.add("tutorial-train-deploy-image-classification-model-vscode.md");
			uselessFiles.add("reference-yaml-deployment-kubernetes-online.md");
					
//		    20220715 add for the referenced file is not available.
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			
//			Prerequisites are not available.synapse-analytics
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			return uselessFiles;
		}
	}
	public static class v1{
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		public synchronized static List<String> getWarningWords() {
		    // 04/20/2022, useless file
//			warningWords.add("how-to-homomorphic-encryption-seal.md");
		    warningWords.add("concept-plan-manage-cost.md");
		    warningWords.add("how-to-attach-arc-kubernetes.md");
		    warningWords.add("how-to-data-prep-synapse-spark-pool.md ");
		    warningWords.add("how-to-deploy-fpga-web-service");
		    warningWords.add("how-to-kubernetes-instance-type.md");
//		    warningWords.add("how-to-link-synapse-ml-workspaces");
//		    warningWords.add("how-to-link-synapse-ml-workspaces.md");
		    warningWords.add("how-to-manage-workspace-terraform.md");
		    warningWords.add("migrate-execute-r-script.md");
		    warningWords.add("migrate-overview.md");
		    warningWords.add("migrate-rebuild-experiment.md");
		    warningWords.add("migrate-rebuild-integrate-with-client-app.md");
		    warningWords.add("migrate-rebuild-web-service.md");
		     warningWords.add("migrate-register-dataset.md");
		    warningWords.add("reference-yaml-datastore-data-lake-gen1.md");
//		    warningWords.add("how-to-homomorphic-encryption-seal");
		    warningWords.add("how-to-deploy-fpga-web-service.md");
//		    warningWords.add("how-to-auto-train-nlp-models");
//		    warningWords.add("security-controls-policy.md");
//		    warningWords.add("security-controls-policy");
		    warningWords.add("algorithm-module-reference/module-reference.md");
		    warningWords.add("algorithm-module-reference/module-reference");
//		    warningWords.add("module-reference.md");
//		    warningWords.add("module-reference");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code");
//		    warningWords.add("how-to-use-automl-small-object-detect.md");
//		    warningWords.add("how-to-use-automl-small-object-detect");
		    warningWords.add("Supplemental Terms of Use for Azure Previews");
		    warningWords.add("Azure Arc"); 
		    warningWords.add("Arc-attached"); 
		    warningWords.add("Supplemental Terms of Use for Microsoft Azure Previews");
		    warningWords.add("(https://www.azure.cn/support/legal)");
		    warningWords.add("(https://www.azure.cn/support/legal/)");
//		    warningWords.add("how-to-configure-cli.md");
//		    warningWords.add("machine-learning-cli-v2.md");
		    // CLi v2 is preview but not available.
//		    warningWords.add("how-to-use-batch-endpoint.md");
//		    warningWords.add("how-to-manage-environments-v2.md");
//		    warningWords.add("how-to-train-cli.md");
//		    warningWords.add("how-to-deploy-managed-online-endpoints.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
		    warningWords.add("Arc-enabled"); 
		    warningWords.add("virtual-machines/nc-series.md");
		    warningWords.add("reference-yaml-deployment-kubernetes-online.md");
		    warningWords.add("::: code");
		    warningWords.add("Arc Kubernetes");
		    warningWords.add("[!Notebook-python[]");
		    warningWords.add("ml.azure.com");
		    warningWords.add("algorithm-module-reference");
		    warningWords.add("how-to-use-mlflow-azure-synapse.md");
		    
		    return warningWords;
		}
		public synchronized static List<String> getUselessFiles() {
			
			//Derek mark this feature is not available on Mooncake.
			uselessFiles.add("concept-plan-manage-cost.md");
			uselessFiles.add("how-to-attach-arc-kubernetes.md");
			uselessFiles.add("how-to-data-prep-synapse-spark-pool.md ");
			uselessFiles.add("how-to-deploy-fpga-web-service");
			uselessFiles.add("how-to-kubernetes-instance-type.md");
			uselessFiles.add("how-to-manage-workspace-terraform.md");
			uselessFiles.add("migrate-execute-r-script.md");
			uselessFiles.add("migrate-overview.md");
			uselessFiles.add("migrate-rebuild-experiment.md");
			uselessFiles.add("migrate-rebuild-integrate-with-client-app.md");
			uselessFiles.add("migrate-rebuild-web-service.md");
			uselessFiles.add("migrate-register-dataset.md");
			uselessFiles.add("reference-yaml-datastore-data-lake-gen1.md");
			uselessFiles.add("how-to-deploy-fpga-web-service.md");

			//`synapse-analytics/quickstart-create-workspace` is not avaialble on Mooncake.
			//`Azure Synapse Analytics` is not available on Mooncake.
//			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			
			//cli-v2 is not available now
//			uselessFiles.add("how-to-configure-cli.md");  is available on 20220609 by Adam.
//			uselessFiles.add("machine-learning-cli-v2.md"); is available on 20220609 by Adam.
//			uselessFiles.add("how-to-autoscale-endpoints.md");
//			uselessFiles.add("how-to-access-resources-from-endpoints-managed-identities.md");
			uselessFiles.add("reference-yaml-compute-kubernetes.md");
			uselessFiles.add("dsvm-tutorial-bicep.md");
			
//			uselessFiles.add("how-to-use-batch-endpoint.md");
			uselessFiles.add("how-to-deploy-fpga-web-service.md");
//			uselessFiles.add("how-to-train-cli.md");
//			uselessFiles.add("how-to-deploy-managed-online-endpoints.md");
//			uselessFiles.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//			uselessFiles.add("how-to-configure-cli.md"); is available
			
//			Seems to work, but not what I added.
//			uselessFiles.add("tutorial-train-deploy-image-classification-model-vscode.md");
			uselessFiles.add("reference-yaml-deployment-kubernetes-online.md");
					
//		    20220715 add for the referenced file is not available.
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			
//			Prerequisites are not available.synapse-analytics
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			
//			The feature of  STANDARD_NC6 virtual machine not AVAILABLE in ACN.
			uselessFiles.add("how-to-use-reinforcement-learning.md");
			
			return uselessFiles;
		}
	}
	public static class batch_inference{
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		public synchronized static List<String> getWarningWords() {
		    // 04/20/2022, useless file
//			warningWords.add("how-to-homomorphic-encryption-seal.md");
		    warningWords.add("concept-plan-manage-cost.md");
		    warningWords.add("how-to-attach-arc-kubernetes.md");
		    warningWords.add("how-to-data-prep-synapse-spark-pool.md ");
		    warningWords.add("how-to-deploy-fpga-web-service");
		    warningWords.add("how-to-kubernetes-instance-type.md");
//		    warningWords.add("how-to-link-synapse-ml-workspaces");
//		    warningWords.add("how-to-link-synapse-ml-workspaces.md");
		    warningWords.add("how-to-manage-workspace-terraform.md");
		    warningWords.add("migrate-execute-r-script.md");
		    warningWords.add("migrate-overview.md");
		    warningWords.add("migrate-rebuild-experiment.md");
		    warningWords.add("migrate-rebuild-integrate-with-client-app.md");
		    warningWords.add("migrate-rebuild-web-service.md");
		     warningWords.add("migrate-register-dataset.md");
		    warningWords.add("reference-yaml-datastore-data-lake-gen1.md");
//		    warningWords.add("how-to-homomorphic-encryption-seal");
		    warningWords.add("how-to-deploy-fpga-web-service.md");
//		    warningWords.add("how-to-auto-train-nlp-models");
//		    warningWords.add("security-controls-policy.md");
//		    warningWords.add("security-controls-policy");
		    warningWords.add("algorithm-module-reference/module-reference.md");
		    warningWords.add("algorithm-module-reference/module-reference");
//		    warningWords.add("module-reference.md");
//		    warningWords.add("module-reference");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code");
//		    warningWords.add("how-to-use-automl-small-object-detect.md");
//		    warningWords.add("how-to-use-automl-small-object-detect");
		    warningWords.add("Supplemental Terms of Use for Azure Previews");
		    warningWords.add("Azure Arc"); 
		    warningWords.add("Arc-attached"); 
		    warningWords.add("Supplemental Terms of Use for Microsoft Azure Previews");
		    warningWords.add("(https://www.azure.cn/support/legal)");
		    warningWords.add("(https://www.azure.cn/support/legal/)");
//		    warningWords.add("how-to-configure-cli.md");
//		    warningWords.add("machine-learning-cli-v2.md");
		    // CLi v2 is preview but not available.
//		    warningWords.add("how-to-use-batch-endpoint.md");
//		    warningWords.add("how-to-manage-environments-v2.md");
//		    warningWords.add("how-to-train-cli.md");
//		    warningWords.add("how-to-deploy-managed-online-endpoints.md");
//		    warningWords.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
		    warningWords.add("Arc-enabled"); 
		    warningWords.add("virtual-machines/nc-series.md");
		    warningWords.add("reference-yaml-deployment-kubernetes-online.md");
		    warningWords.add("::: code");
		    warningWords.add("Arc Kubernetes");
		    warningWords.add("[!Notebook-python[]");
		    warningWords.add("ml.azure.com");
		    warningWords.add("algorithm-module-reference");
		    warningWords.add("how-to-use-mlflow-azure-synapse.md");
		    
		    return warningWords;
		}
		public synchronized static List<String> getUselessFiles() {
			
			//Derek mark this feature is not available on Mooncake.
			uselessFiles.add("concept-plan-manage-cost.md");
			uselessFiles.add("how-to-attach-arc-kubernetes.md");
			uselessFiles.add("how-to-data-prep-synapse-spark-pool.md ");
			uselessFiles.add("how-to-deploy-fpga-web-service");
			uselessFiles.add("how-to-kubernetes-instance-type.md");
			uselessFiles.add("how-to-manage-workspace-terraform.md");
			uselessFiles.add("migrate-execute-r-script.md");
			uselessFiles.add("migrate-overview.md");
			uselessFiles.add("migrate-rebuild-experiment.md");
			uselessFiles.add("migrate-rebuild-integrate-with-client-app.md");
			uselessFiles.add("migrate-rebuild-web-service.md");
			uselessFiles.add("migrate-register-dataset.md");
			uselessFiles.add("reference-yaml-datastore-data-lake-gen1.md");
			uselessFiles.add("how-to-deploy-fpga-web-service.md");

			//`synapse-analytics/quickstart-create-workspace` is not avaialble on Mooncake.
			//`Azure Synapse Analytics` is not available on Mooncake.
//			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			
			//cli-v2 is not available now
//			uselessFiles.add("how-to-configure-cli.md");  is available on 20220609 by Adam.
//			uselessFiles.add("machine-learning-cli-v2.md"); is available on 20220609 by Adam.
//			uselessFiles.add("how-to-autoscale-endpoints.md");
//			uselessFiles.add("how-to-access-resources-from-endpoints-managed-identities.md");
			uselessFiles.add("reference-yaml-compute-kubernetes.md");
			uselessFiles.add("dsvm-tutorial-bicep.md");
			
//			uselessFiles.add("how-to-use-batch-endpoint.md");
			uselessFiles.add("how-to-deploy-fpga-web-service.md");
//			uselessFiles.add("how-to-train-cli.md");
//			uselessFiles.add("how-to-deploy-managed-online-endpoints.md");
//			uselessFiles.add("how-to-debug-managed-online-endpoints-visual-studio-code.md");
//			uselessFiles.add("how-to-configure-cli.md"); is available
			
//			Seems to work, but not what I added.
//			uselessFiles.add("tutorial-train-deploy-image-classification-model-vscode.md");
			uselessFiles.add("reference-yaml-deployment-kubernetes-online.md");
					
//		    20220715 add for the referenced file is not available.
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			
//			Prerequisites are not available.synapse-analytics
			uselessFiles.add("how-to-link-synapse-ml-workspaces.md");
			uselessFiles.add("how-to-use-synapsesparkstep.md");
			
//			The feature of  STANDARD_NC6 virtual machine not AVAILABLE in ACN.
			uselessFiles.add("how-to-use-reinforcement-learning.md");
			
			return uselessFiles;
		}
	}
}
