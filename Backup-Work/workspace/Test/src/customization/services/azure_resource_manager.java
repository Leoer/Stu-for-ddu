package customization.services;

import java.util.ArrayList;
import java.util.List;

public class azure_resource_manager {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
        //		ignoredWords.add("non-free subscription");
                return ignoredWords;
            }
    public static synchronized List<String[]> getWords() {
//        		words.add(new String[] { "azurepowershell",  "powershell" });
                return words;
            }
    public synchronized static List<String> getWarningWords() {	    
        
                warningWords.add("]((");
                warningWords.add("]http");
                warningWords.add("]/");   
                
                return warningWords;
            }
    public synchronized static List<String[]> getAttentionWords() {
        //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                return attentionWords;
            }
    public synchronized static List<String> getUselessFiles() {
        
        //		uselessFiles.add("azure-to-azure-autoupdate.md");
                uselessFiles.add("best-practices-resource-manager-security.md");
                uselessFiles.add("cloud-shell-powershell.md");
                uselessFiles.add("concepts-built-in-policy.md");
                uselessFiles.add("concepts-resource-onboarding.md");
                uselessFiles.add("create-custom-provider.md");
                uselessFiles.add("custom-providers-action-endpoint-how-to.md");
                uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
                uselessFiles.add("overview.md");
                uselessFiles.add("policy-samples.md");
                uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
                uselessFiles.add("proxy-resource-endpoint-reference.md");
                uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
                uselessFiles.add("tutorial-custom-providers-create.md");
                uselessFiles.add("tutorial-custom-providers-function-authoring.md");
                uselessFiles.add("tutorial-custom-providers-function-setup.md");
                uselessFiles.add("tutorial-get-started-with-custom-providers.md");
                uselessFiles.add("tutorial-resource-onboarding.md");
                uselessFiles.add("deployment-manager-tutorial.md");
                uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
                uselessFiles.add("managed-application-overview.md");
                uselessFiles.add("managed-application-publishing.md");
                uselessFiles.add("policy-samples.md");
                uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
                uselessFiles.add("grant-access-to-create-subscription.md");
                uselessFiles.add("programmatically-create-subscription.md");
                uselessFiles.add("resource-manager-cloud-shell-deploy.md");
                uselessFiles.add("resource-manager-governance-tags-billing.md");
                uselessFiles.add("tdeployment-manager-health-check.md");
                uselessFiles.add("tdeployment-manager-overview.md");
                uselessFiles.add("tdeployment-manager-tutorial.md");
                uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
                uselessFiles.add("tdeployment-script-template.md");
                uselessFiles.add("ttemplate-deploy-what-if.md");
                uselessFiles.add("ttemplate-tutorial-deployment-script.md");
                uselessFiles.add("policy-reference.md");
//              uselessFiles.add("microsoft-resources-move-regions.md");
                uselessFiles.add("create-custom-provider-quickstart-powershell.md");
                uselessFiles.add("ttemplate-spec-convert.md");
                uselessFiles.add("tdeploy-cloud-shell.md");
                uselessFiles.add("deploy-cloud-shell.md");
                uselessFiles.add("learn-bicep.md");
                uselessFiles.add("preview-features.md");
                uselessFiles.add("create-private-link-access-portal.md");
                uselessFiles.add("create-private-link-access-rest.md");
                uselessFiles.add("manage-private-link-access-rest.md");
                uselessFiles.add("learn-bicep.md");
                uselessFiles.add("control-plane-metrics.md");
                return uselessFiles;
            }

	// TODO
	public static class bicep {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
//		ignoredWords.add("non-free subscription");
	    return ignoredWords;
	}
	public static synchronized List<String[]> getWords() {
//		words.add(new String[] { "azurepowershell",  "powershell" });
		return words;
	}
	public synchronized static List<String> getWarningWords() {	    

	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");   
	    
	    return warningWords;
	}
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
		return attentionWords;
	}
	public synchronized static List<String> getUselessFiles() {

//		uselessFiles.add("azure-to-azure-autoupdate.md");
		uselessFiles.add("best-practices-resource-manager-security.md");
		uselessFiles.add("cloud-shell-powershell.md");
		uselessFiles.add("concepts-built-in-policy.md");
		uselessFiles.add("concepts-resource-onboarding.md");
		uselessFiles.add("create-custom-provider.md");
		uselessFiles.add("custom-providers-action-endpoint-how-to.md");
		uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
		uselessFiles.add("overview.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
		uselessFiles.add("proxy-resource-endpoint-reference.md");
		uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
		uselessFiles.add("tutorial-custom-providers-create.md");
		uselessFiles.add("tutorial-custom-providers-function-authoring.md");
		uselessFiles.add("tutorial-custom-providers-function-setup.md");
		uselessFiles.add("tutorial-get-started-with-custom-providers.md");
		uselessFiles.add("tutorial-resource-onboarding.md");
		uselessFiles.add("deployment-manager-tutorial.md");
		uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
		uselessFiles.add("managed-application-overview.md");
		uselessFiles.add("managed-application-publishing.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
		uselessFiles.add("grant-access-to-create-subscription.md");
		uselessFiles.add("programmatically-create-subscription.md");
		uselessFiles.add("resource-manager-cloud-shell-deploy.md");
		uselessFiles.add("resource-manager-governance-tags-billing.md");
		uselessFiles.add("tdeployment-manager-health-check.md");
		uselessFiles.add("tdeployment-manager-overview.md");
		uselessFiles.add("tdeployment-manager-tutorial.md");
		uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
		uselessFiles.add("tdeployment-script-template.md");
		uselessFiles.add("ttemplate-deploy-what-if.md");
		uselessFiles.add("ttemplate-tutorial-deployment-script.md");
		uselessFiles.add("policy-reference.md");
//		uselessFiles.add("microsoft-resources-move-regions.md");
		uselessFiles.add("create-custom-provider-quickstart-powershell.md");
		uselessFiles.add("ttemplate-spec-convert.md");
		uselessFiles.add("tdeploy-cloud-shell.md");
		uselessFiles.add("deploy-cloud-shell.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("preview-features.md");
		uselessFiles.add("create-private-link-access-portal.md");
		uselessFiles.add("create-private-link-access-rest.md");
		uselessFiles.add("manage-private-link-access-rest.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("control-plane-metrics.md");
		return uselessFiles;
	}
	}
	// TODO
	public static class managed_applications {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
//		ignoredWords.add("non-free subscription");
	    return ignoredWords;
	}
	public static synchronized List<String[]> getWords() {
//		words.add(new String[] { "azurepowershell",  "powershell" });
		return words;
	}
	public synchronized static List<String> getWarningWords() {	    

	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");   
	    
	    return warningWords;
	}
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
		return attentionWords;
	}
	public synchronized static List<String> getUselessFiles() {

//		uselessFiles.add("azure-to-azure-autoupdate.md");
		uselessFiles.add("best-practices-resource-manager-security.md");
		uselessFiles.add("cloud-shell-powershell.md");
		uselessFiles.add("concepts-built-in-policy.md");
		uselessFiles.add("concepts-resource-onboarding.md");
		uselessFiles.add("create-custom-provider.md");
		uselessFiles.add("custom-providers-action-endpoint-how-to.md");
		uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
		uselessFiles.add("overview.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
		uselessFiles.add("proxy-resource-endpoint-reference.md");
		uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
		uselessFiles.add("tutorial-custom-providers-create.md");
		uselessFiles.add("tutorial-custom-providers-function-authoring.md");
		uselessFiles.add("tutorial-custom-providers-function-setup.md");
		uselessFiles.add("tutorial-get-started-with-custom-providers.md");
		uselessFiles.add("tutorial-resource-onboarding.md");
		uselessFiles.add("deployment-manager-tutorial.md");
		uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
		uselessFiles.add("managed-application-overview.md");
		uselessFiles.add("managed-application-publishing.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
		uselessFiles.add("grant-access-to-create-subscription.md");
		uselessFiles.add("programmatically-create-subscription.md");
		uselessFiles.add("resource-manager-cloud-shell-deploy.md");
		uselessFiles.add("resource-manager-governance-tags-billing.md");
		uselessFiles.add("tdeployment-manager-health-check.md");
		uselessFiles.add("tdeployment-manager-overview.md");
		uselessFiles.add("tdeployment-manager-tutorial.md");
		uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
		uselessFiles.add("tdeployment-script-template.md");
		uselessFiles.add("ttemplate-deploy-what-if.md");
		uselessFiles.add("ttemplate-tutorial-deployment-script.md");
//		uselessFiles.add("policy-reference.md");
//		uselessFiles.add("microsoft-resources-move-regions.md");
		uselessFiles.add("create-custom-provider-quickstart-powershell.md");
		uselessFiles.add("ttemplate-spec-convert.md");
		uselessFiles.add("tdeploy-cloud-shell.md");
		uselessFiles.add("deploy-cloud-shell.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("preview-features.md");
		uselessFiles.add("create-private-link-access-portal.md");
		uselessFiles.add("create-private-link-access-rest.md");
		uselessFiles.add("manage-private-link-access-rest.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("control-plane-metrics.md");
		return uselessFiles;
	}
		// TODO
        public static class scripts {
        private static final List<String[]> words = new ArrayList<String[]>();
        private static final List<String> warningWords = new ArrayList<String>();
        private static final List<String[]> attentionWords = new ArrayList<String[]>();
        private static final List<String> uselessFiles = new ArrayList<String>();
        private static final List<String> ignoredWords = new ArrayList<String>();
        
        public synchronized static List<String> getIgnoredWords() {
    //		ignoredWords.add("non-free subscription");
            return ignoredWords;
        }
        public static synchronized List<String[]> getWords() {
//        	words.add(new String[] { "azurepowershell",  "powershell" });
            return words;
        }
        public synchronized static List<String> getWarningWords() {	    

            warningWords.add("]((");
            warningWords.add("]http");
            warningWords.add("]/");   
            
            return warningWords;
        }
        public synchronized static List<String[]> getAttentionWords() {
    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
            return attentionWords;
        }
        public synchronized static List<String> getUselessFiles() {

    //		uselessFiles.add("azure-to-azure-autoupdate.md");
            uselessFiles.add("best-practices-resource-manager-security.md");
            uselessFiles.add("cloud-shell-powershell.md");
            uselessFiles.add("concepts-built-in-policy.md");
            uselessFiles.add("concepts-resource-onboarding.md");
            uselessFiles.add("create-custom-provider.md");
            uselessFiles.add("custom-providers-action-endpoint-how-to.md");
            uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
            uselessFiles.add("overview.md");
            uselessFiles.add("policy-samples.md");
            uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
            uselessFiles.add("proxy-resource-endpoint-reference.md");
            uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
            uselessFiles.add("tutorial-custom-providers-create.md");
            uselessFiles.add("tutorial-custom-providers-function-authoring.md");
            uselessFiles.add("tutorial-custom-providers-function-setup.md");
            uselessFiles.add("tutorial-get-started-with-custom-providers.md");
            uselessFiles.add("tutorial-resource-onboarding.md");
            uselessFiles.add("deployment-manager-tutorial.md");
            uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
            uselessFiles.add("managed-application-overview.md");
            uselessFiles.add("managed-application-publishing.md");
            uselessFiles.add("policy-samples.md");
            uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
            uselessFiles.add("grant-access-to-create-subscription.md");
            uselessFiles.add("programmatically-create-subscription.md");
            uselessFiles.add("resource-manager-cloud-shell-deploy.md");
            uselessFiles.add("resource-manager-governance-tags-billing.md");
            uselessFiles.add("tdeployment-manager-health-check.md");
            uselessFiles.add("tdeployment-manager-overview.md");
            uselessFiles.add("tdeployment-manager-tutorial.md");
            uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
            uselessFiles.add("tdeployment-script-template.md");
            uselessFiles.add("ttemplate-deploy-what-if.md");
            uselessFiles.add("ttemplate-tutorial-deployment-script.md");
            uselessFiles.add("policy-reference.md");
//          uselessFiles.add("microsoft-resources-move-regions.md");
            uselessFiles.add("create-custom-provider-quickstart-powershell.md");
            uselessFiles.add("ttemplate-spec-convert.md");
            uselessFiles.add("tdeploy-cloud-shell.md");
            uselessFiles.add("deploy-cloud-shell.md");
            uselessFiles.add("learn-bicep.md");
            uselessFiles.add("preview-features.md");
            uselessFiles.add("create-private-link-access-portal.md");
            uselessFiles.add("create-private-link-access-rest.md");
            uselessFiles.add("manage-private-link-access-rest.md");
            uselessFiles.add("learn-bicep.md");
            uselessFiles.add("control-plane-metrics.md");
            return uselessFiles;
        }
        }
}
	// TODO
	public static class management {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
//		ignoredWords.add("non-free subscription");
	    return ignoredWords;
	}
	public static synchronized List<String[]> getWords() {
//		words.add(new String[] { "azurepowershell",  "powershell" });
		return words;
	}
	public synchronized static List<String> getWarningWords() {	    

	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");   
	    
	    return warningWords;
	}
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
		return attentionWords;
	}
	public synchronized static List<String> getUselessFiles() {

//		uselessFiles.add("azure-to-azure-autoupdate.md");
		uselessFiles.add("best-practices-resource-manager-security.md");
		uselessFiles.add("cloud-shell-powershell.md");
		uselessFiles.add("concepts-built-in-policy.md");
		uselessFiles.add("concepts-resource-onboarding.md");
		uselessFiles.add("create-custom-provider.md");
		uselessFiles.add("custom-providers-action-endpoint-how-to.md");
		uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
//		uselessFiles.add("overview.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
		uselessFiles.add("proxy-resource-endpoint-reference.md");
		uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
		uselessFiles.add("tutorial-custom-providers-create.md");
		uselessFiles.add("tutorial-custom-providers-function-authoring.md");
		uselessFiles.add("tutorial-custom-providers-function-setup.md");
		uselessFiles.add("tutorial-get-started-with-custom-providers.md");
		uselessFiles.add("tutorial-resource-onboarding.md");
		uselessFiles.add("deployment-manager-tutorial.md");
		uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
		uselessFiles.add("managed-application-overview.md");
		uselessFiles.add("managed-application-publishing.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
		uselessFiles.add("grant-access-to-create-subscription.md");
		uselessFiles.add("programmatically-create-subscription.md");
		uselessFiles.add("resource-manager-cloud-shell-deploy.md");
		uselessFiles.add("resource-manager-governance-tags-billing.md");
		uselessFiles.add("tdeployment-manager-health-check.md");
		uselessFiles.add("tdeployment-manager-overview.md");
		uselessFiles.add("tdeployment-manager-tutorial.md");
		uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
		uselessFiles.add("tdeployment-script-template.md");
		uselessFiles.add("ttemplate-deploy-what-if.md");
		uselessFiles.add("ttemplate-tutorial-deployment-script.md");
//		uselessFiles.add("policy-reference.md");
//		uselessFiles.add("microsoft-resources-move-regions.md");
		uselessFiles.add("create-custom-provider-quickstart-powershell.md");
		uselessFiles.add("ttemplate-spec-convert.md");
		uselessFiles.add("tdeploy-cloud-shell.md");
		uselessFiles.add("deploy-cloud-shell.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("preview-features.md");
		uselessFiles.add("create-private-link-access-portal.md");
		uselessFiles.add("create-private-link-access-rest.md");
		uselessFiles.add("manage-private-link-access-rest.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("control-plane-metrics.md");
		return uselessFiles;
	}
	// TODO
        public static class move_limitations {
        private static final List<String[]> words = new ArrayList<String[]>();
        private static final List<String> warningWords = new ArrayList<String>();
        private static final List<String[]> attentionWords = new ArrayList<String[]>();
        private static final List<String> uselessFiles = new ArrayList<String>();
        private static final List<String> ignoredWords = new ArrayList<String>();
        
        public synchronized static List<String> getIgnoredWords() {
    //		ignoredWords.add("non-free subscription");
            return ignoredWords;
        }
        public static synchronized List<String[]> getWords() {
//        	words.add(new String[] { "azurepowershell",  "powershell" });
            return words;
        }
        public synchronized static List<String> getWarningWords() {	    

            warningWords.add("]((");
            warningWords.add("]http");
            warningWords.add("]/");   
            
            return warningWords;
        }
        public synchronized static List<String[]> getAttentionWords() {
    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
            return attentionWords;
        }
        public synchronized static List<String> getUselessFiles() {

    //		uselessFiles.add("azure-to-azure-autoupdate.md");
            uselessFiles.add("best-practices-resource-manager-security.md");
            uselessFiles.add("cloud-shell-powershell.md");
            uselessFiles.add("concepts-built-in-policy.md");
            uselessFiles.add("concepts-resource-onboarding.md");
            uselessFiles.add("create-custom-provider.md");
            uselessFiles.add("custom-providers-action-endpoint-how-to.md");
            uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
            uselessFiles.add("overview.md");
            uselessFiles.add("policy-samples.md");
            uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
            uselessFiles.add("proxy-resource-endpoint-reference.md");
            uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
            uselessFiles.add("tutorial-custom-providers-create.md");
            uselessFiles.add("tutorial-custom-providers-function-authoring.md");
            uselessFiles.add("tutorial-custom-providers-function-setup.md");
            uselessFiles.add("tutorial-get-started-with-custom-providers.md");
            uselessFiles.add("tutorial-resource-onboarding.md");
            uselessFiles.add("deployment-manager-tutorial.md");
            uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
            uselessFiles.add("managed-application-overview.md");
            uselessFiles.add("managed-application-publishing.md");
            uselessFiles.add("policy-samples.md");
            uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
            uselessFiles.add("grant-access-to-create-subscription.md");
            uselessFiles.add("programmatically-create-subscription.md");
            uselessFiles.add("resource-manager-cloud-shell-deploy.md");
            uselessFiles.add("resource-manager-governance-tags-billing.md");
            uselessFiles.add("tdeployment-manager-health-check.md");
            uselessFiles.add("tdeployment-manager-overview.md");
            uselessFiles.add("tdeployment-manager-tutorial.md");
            uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
            uselessFiles.add("tdeployment-script-template.md");
            uselessFiles.add("ttemplate-deploy-what-if.md");
            uselessFiles.add("ttemplate-tutorial-deployment-script.md");
            uselessFiles.add("policy-reference.md");
//            uselessFiles.add("microsoft-resources-move-regions.md");
            uselessFiles.add("create-custom-provider-quickstart-powershell.md");
            uselessFiles.add("ttemplate-spec-convert.md");
            uselessFiles.add("tdeploy-cloud-shell.md");
            uselessFiles.add("deploy-cloud-shell.md");
            uselessFiles.add("learn-bicep.md");
            uselessFiles.add("preview-features.md");
            uselessFiles.add("create-private-link-access-portal.md");
            uselessFiles.add("create-private-link-access-rest.md");
            uselessFiles.add("manage-private-link-access-rest.md");
            uselessFiles.add("learn-bicep.md");
            uselessFiles.add("control-plane-metrics.md");
            return uselessFiles;
        }
        }
}
	// TODO
public static class templates {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
//		ignoredWords.add("non-free subscription");
	    return ignoredWords;
	}
	public static synchronized List<String[]> getWords() {
//		words.add(new String[] { "azurepowershell",  "powershell" });
		return words;
	}
	public synchronized static List<String> getWarningWords() {	    

	    warningWords.add("]((");
	    warningWords.add("]http");
	    warningWords.add("]/");   
	    
	    return warningWords;
	}
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
		return attentionWords;
	}
	public synchronized static List<String> getUselessFiles() {

//		uselessFiles.add("azure-to-azure-autoupdate.md");
		uselessFiles.add("best-practices-resource-manager-security.md");
		uselessFiles.add("cloud-shell-powershell.md");
		uselessFiles.add("concepts-built-in-policy.md");
		uselessFiles.add("concepts-resource-onboarding.md");
		uselessFiles.add("create-custom-provider.md");
		uselessFiles.add("custom-providers-action-endpoint-how-to.md");
		uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
		uselessFiles.add("overview.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
		uselessFiles.add("proxy-resource-endpoint-reference.md");
		uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
		uselessFiles.add("tutorial-custom-providers-create.md");
		uselessFiles.add("tutorial-custom-providers-function-authoring.md");
		uselessFiles.add("tutorial-custom-providers-function-setup.md");
		uselessFiles.add("tutorial-get-started-with-custom-providers.md");
		uselessFiles.add("tutorial-resource-onboarding.md");
		uselessFiles.add("deployment-manager-tutorial.md");
		uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
		uselessFiles.add("managed-application-overview.md");
		uselessFiles.add("managed-application-publishing.md");
		uselessFiles.add("policy-samples.md");
		uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
		uselessFiles.add("grant-access-to-create-subscription.md");
		uselessFiles.add("programmatically-create-subscription.md");
		uselessFiles.add("resource-manager-cloud-shell-deploy.md");
		uselessFiles.add("resource-manager-governance-tags-billing.md");
		uselessFiles.add("tdeployment-manager-health-check.md");
		uselessFiles.add("tdeployment-manager-overview.md");
		uselessFiles.add("tdeployment-manager-tutorial.md");
		uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
		uselessFiles.add("tdeployment-script-template.md");
		uselessFiles.add("ttemplate-deploy-what-if.md");
		uselessFiles.add("ttemplate-tutorial-deployment-script.md");
		uselessFiles.add("policy-reference.md");
//		uselessFiles.add("microsoft-resources-move-regions.md");
		uselessFiles.add("create-custom-provider-quickstart-powershell.md");
		uselessFiles.add("ttemplate-spec-convert.md");
		uselessFiles.add("tdeploy-cloud-shell.md");
		uselessFiles.add("deploy-cloud-shell.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("preview-features.md");
		uselessFiles.add("create-private-link-access-portal.md");
		uselessFiles.add("create-private-link-access-rest.md");
		uselessFiles.add("manage-private-link-access-rest.md");
		uselessFiles.add("learn-bicep.md");
		uselessFiles.add("control-plane-metrics.md");
//		2022.6.6 added. Reason: this marketplace item is not available.
		uselessFiles.add("template-spec-convert.md");
		return uselessFiles;
	}
}
//TODO
public static class troubleshooting {
    private static final List<String[]> words = new ArrayList<String[]>();
    private static final List<String> warningWords = new ArrayList<String>();
    private static final List<String[]> attentionWords = new ArrayList<String[]>();
    private static final List<String> uselessFiles = new ArrayList<String>();
    private static final List<String> ignoredWords = new ArrayList<String>();
        
    public synchronized static List<String> getIgnoredWords() {
    //		ignoredWords.add("non-free subscription");
            return ignoredWords;
        }
    public static synchronized List<String[]> getWords() {
//    	words.add(new String[] { "azurepowershell",  "powershell" });
            return words;
        }
    public synchronized static List<String> getWarningWords() {	    
    
            warningWords.add("]((");
            warningWords.add("]http");
            warningWords.add("]/");   
            
            return warningWords;
        }
    public synchronized static List<String[]> getAttentionWords() {
    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
            return attentionWords;
        }
    public synchronized static List<String> getUselessFiles() {
    
    //		uselessFiles.add("azure-to-azure-autoupdate.md");
            uselessFiles.add("best-practices-resource-manager-security.md");
            uselessFiles.add("cloud-shell-powershell.md");
            uselessFiles.add("concepts-built-in-policy.md");
            uselessFiles.add("concepts-resource-onboarding.md");
            uselessFiles.add("create-custom-provider.md");
            uselessFiles.add("custom-providers-action-endpoint-how-to.md");
            uselessFiles.add("custom-providers-resources-endpoint-how-to.md");
            uselessFiles.add("overview.md");
            uselessFiles.add("policy-samples.md");
            uselessFiles.add("proxy-cache-resource-endpoint-reference.md");
            uselessFiles.add("proxy-resource-endpoint-reference.md");
            uselessFiles.add("reference-custom-providers-csharp-endpoint.md");
            uselessFiles.add("tutorial-custom-providers-create.md");
            uselessFiles.add("tutorial-custom-providers-function-authoring.md");
            uselessFiles.add("tutorial-custom-providers-function-setup.md");
            uselessFiles.add("tutorial-get-started-with-custom-providers.md");
            uselessFiles.add("tutorial-resource-onboarding.md");
            uselessFiles.add("deployment-manager-tutorial.md");
            uselessFiles.add("managed-application-microsoft-network-publicipaddresscombo.md");
            uselessFiles.add("managed-application-overview.md");
            uselessFiles.add("managed-application-publishing.md");
            uselessFiles.add("policy-samples.md");
            uselessFiles.add("tutorial-create-managed-app-with-custom-provider.md");
            uselessFiles.add("grant-access-to-create-subscription.md");
            uselessFiles.add("programmatically-create-subscription.md");
            uselessFiles.add("resource-manager-cloud-shell-deploy.md");
            uselessFiles.add("resource-manager-governance-tags-billing.md");
            uselessFiles.add("tdeployment-manager-health-check.md");
            uselessFiles.add("tdeployment-manager-overview.md");
            uselessFiles.add("tdeployment-manager-tutorial.md");
            uselessFiles.add("tdeployment-manager-tutorial-health-check.md");
            uselessFiles.add("tdeployment-script-template.md");
            uselessFiles.add("ttemplate-deploy-what-if.md");
            uselessFiles.add("ttemplate-tutorial-deployment-script.md");
            uselessFiles.add("policy-reference.md");
//            uselessFiles.add("microsoft-resources-move-regions.md");
            uselessFiles.add("create-custom-provider-quickstart-powershell.md");
            uselessFiles.add("ttemplate-spec-convert.md");
            uselessFiles.add("tdeploy-cloud-shell.md");
            uselessFiles.add("deploy-cloud-shell.md");
            uselessFiles.add("learn-bicep.md");
            uselessFiles.add("preview-features.md");
            uselessFiles.add("create-private-link-access-portal.md");
            uselessFiles.add("create-private-link-access-rest.md");
            uselessFiles.add("manage-private-link-access-rest.md");
            uselessFiles.add("learn-bicep.md");
            uselessFiles.add("control-plane-metrics.md");
            return uselessFiles;
        }
    }
		
}
	

