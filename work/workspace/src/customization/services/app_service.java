package customization.services;

import java.util.ArrayList;
import java.util.List;

public class app_service {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
    private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
        //		ignoredWords.add("");                
                return ignoredWords;
            }
            
    public static synchronized List<String[]> getWords() {
                words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
        //		words.add(new String[] { "", "" });
        //		words.add(new String[] { "", "" });  
                return words;
            }
            
    public synchronized static List<String> getWarningWords() {	    
                warningWords.add("app service acontainer");
                warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                warningWords.add("]((");
                warningWords.add("]http");
                warningWords.add("]/");
                warningWords.add("Buy domain through portal");
                warningWords.add("Buy SSL certificate through portal//need confirm");
                warningWords.add("Authentication with Google");
                warningWords.add("Authentication with Facebook");
                warningWords.add("Authentication with Twitter");
                warningWords.add("Managed service identity//need to update"); 
                 warningWords.add("others(references of unavaiable features outside the service");
                warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                warningWords.add("**Add VNet (preview)**");
                warningWords.add("**Diagnose and solve problems**"); 
                 warningWords.add("App Service Certificate");
                warningWords.add("app service acontainer");
                warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                warningWords.add("Buy domain through portal"); 
                 warningWords.add("Buy SSL certificate through portal");
                warningWords.add("Authentication with Google");
                warningWords.add("Authentication with Facebook");
                warningWords.add("Authentication with Twitter"); 
                  warningWords.add("Managed service identity"); 
                 warningWords.add("others(references of unavaiable features outside the service");
//                 warningWords.add("how-to-migrate.md");
//                 warningWords.add("migrate.md");
//                 warningWords.add("migration-alternatives.md");
//                 warningWords.add("networking.md");
//                 warningWords.add("tutorial-networking-isolate-vnet.md");

                return warningWords;
            }
            
    public synchronized static List<String[]> getAttentionWords() {
        //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
	
                return attentionWords;
            }
            
    public synchronized static List<String> getUselessFiles() {
                //These files are grouped into one file
                uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                uselessFiles.add("app-service-app-service-environment-intro.md");
                uselessFiles.add("app-service-app-service-environment-layered-security.md");
                uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                uselessFiles.add("app-service-environment-auto-scale.md");
                uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                uselessFiles.add("app-service-web-get-started-windows-container.md");
                uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
        //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                uselessFiles.add("configure-authentication-file-based.md");
                uselessFiles.add("configure-authentication-oauth-tokens.md");
                uselessFiles.add("configure-authentication-provider-facebook.md");
                uselessFiles.add("configure-authentication-provider-google.md");
                uselessFiles.add("configure-authentication-provider-twitter.md");
//                uselessFiles.add("configure-connect-to-azure-storage.md");
        //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                uselessFiles.add("configure-custom-container.md");
                uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                uselessFiles.add("configure-ssl-bindings.md");
                uselessFiles.add("configure-ssl-certificate.md");
                uselessFiles.add("deploy-best-practices.md");
                uselessFiles.add("deploy-ci-cd-custom-container.md");
                uselessFiles.add("deploy-container-github-action.md");
                uselessFiles.add("deploy-content-sync.md");

//              this file is useless before, it seems to be available now, but it's not me to commit to ACN. 
//                uselessFiles.add("deploy-continuous-deployment.md");
                uselessFiles.add("deploy-github-actions.md");
                uselessFiles.add("manage-create-arc-environment.md");
                uselessFiles.add("manage-custom-dns-buy-domain.md");
        //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                uselessFiles.add("management-addresses.md");
                uselessFiles.add("overview-arc-integration.md");
                uselessFiles.add("overview-diagnostics.md");
        //		uselessFiles.add("overview-diagnostics.md");
                uselessFiles.add("overview-manage-costs.md");
//                uselessFiles.add("private-endpoint.md");
                uselessFiles.add("quickstart-arc.md");
//              this file is useless before, it seems to be available now, but it's not me to commit to ACN. 
//                uselessFiles.add("quickstart-custom-container.md");
        //		uselessFiles.add("quickstart-custom-container.md");
                uselessFiles.add("quickstart-multi-container.md");
                uselessFiles.add("quickstart-nodejs-uiex.md");
                uselessFiles.add("quickstart-wordpress.md");
                uselessFiles.add("samples-terraform.md");
                uselessFiles.add("tutorial-auth-aad.md");
        //		uselessFiles.add("tutorial-auth-aad.md");
//              this file is useless before, it seems to be available now, but it's not me to commit to ACN. 
//                uselessFiles.add("tutorial-custom-container.md");
                uselessFiles.add("tutorial-multi-container-app.md");
                uselessFiles.add("tutorial-send-email.md");
                uselessFiles.add("webjobs-create.md");
                uselessFiles.add("webjobs-create-ieux.md");
                uselessFiles.add("webjobs-create-ieux-conceptual.md");
                uselessFiles.add("webjobs-create-ieux-view-log.md");
                uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                uselessFiles.add("webjobs-sdk-get-started.md");
                uselessFiles.add("webjobs-sdk-how-to.md");
//                uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                uselessFiles.add("how-to-migrate.md");
                uselessFiles.add("migrate.md");
                uselessFiles.add("migration-alternatives.md");
                uselessFiles.add("networking.md");
                uselessFiles.add("tutorial-networking-isolate-vnet.md");
                
//              2022.6.23 The file does not appear in the unavailable list, but it is not customized either, it seems to be an unavailable file.
                uselessFiles.add("app-service-asp-net-migration.md");
//              2022.7.12 global delete them
                uselessFiles.add("how-to-zone-redundancy.md");
                uselessFiles.add("overview-zone-redundancy.md");
                
//              Web App + Database NOT found in Azure portal.
                uselessFiles.add("tutorial-nodejs-mongodb-app.md");
                return uselessFiles;
            }
	
	// TODO
	public static class networking {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
    public synchronized static List<String> getIgnoredWords() {
        //		ignoredWords.add("");                
                return ignoredWords;
            }
            
    public static synchronized List<String[]> getWords() {
                words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
        //		words.add(new String[] { "", "" });
        //		words.add(new String[] { "", "" });  
                return words;
            }
            
    public synchronized static List<String> getWarningWords() {	    
                warningWords.add("app service acontainer");
                warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                warningWords.add("]((");
                warningWords.add("]http");
                warningWords.add("]/");
                warningWords.add("Buy domain through portal");
                warningWords.add("Buy SSL certificate through portal//need confirm");
                warningWords.add("Authentication with Google");
                warningWords.add("Authentication with Facebook");
                warningWords.add("Authentication with Twitter");
                warningWords.add("Managed service identity//need to update"); 
                 warningWords.add("others(references of unavaiable features outside the service");
                warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                warningWords.add("**Add VNet (preview)**");
                warningWords.add("**Diagnose and solve problems**"); 
                 warningWords.add("App Service Certificate");
                warningWords.add("app service acontainer");
                warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                warningWords.add("Buy domain through portal"); 
                 warningWords.add("Buy SSL certificate through portal");
                warningWords.add("Authentication with Google");
                warningWords.add("Authentication with Facebook");
                warningWords.add("Authentication with Twitter"); 
                  warningWords.add("Managed service identity"); 
                 warningWords.add("others(references of unavaiable features outside the service");
//                 warningWords.add("how-to-migrate.md");
//                 warningWords.add("migrate.md");
//                 warningWords.add("migration-alternatives.md");
//                 warningWords.add("networking.md");
//                 warningWords.add("tutorial-networking-isolate-vnet.md");
 
                return warningWords;
            }
            
    public synchronized static List<String[]> getAttentionWords() {
        //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
	
                return attentionWords;
            }
            
    public synchronized static List<String> getUselessFiles() {
                //These files are grouped into one file
                uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                uselessFiles.add("app-service-app-service-environment-intro.md");
                uselessFiles.add("app-service-app-service-environment-layered-security.md");
                uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                uselessFiles.add("app-service-environment-auto-scale.md");
                uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                uselessFiles.add("app-service-web-get-started-windows-container.md");
                uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
        //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                uselessFiles.add("configure-authentication-file-based.md");
                uselessFiles.add("configure-authentication-oauth-tokens.md");
                uselessFiles.add("configure-authentication-provider-facebook.md");
                uselessFiles.add("configure-authentication-provider-google.md");
                uselessFiles.add("configure-authentication-provider-twitter.md");
//                uselessFiles.add("configure-connect-to-azure-storage.md");
        //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                uselessFiles.add("configure-custom-container.md");
                uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                uselessFiles.add("configure-ssl-bindings.md");
                uselessFiles.add("configure-ssl-certificate.md");
                uselessFiles.add("deploy-best-practices.md");
                uselessFiles.add("deploy-ci-cd-custom-container.md");
                uselessFiles.add("deploy-container-github-action.md");
                uselessFiles.add("deploy-content-sync.md");
        //		uselessFiles.add("deploy-content-sync.md");
//                uselessFiles.add("deploy-continuous-deployment.md");
                uselessFiles.add("deploy-github-actions.md");
                uselessFiles.add("manage-create-arc-environment.md");
                uselessFiles.add("manage-custom-dns-buy-domain.md");
        //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                uselessFiles.add("management-addresses.md");
                uselessFiles.add("overview-arc-integration.md");
                uselessFiles.add("overview-diagnostics.md");
        //		uselessFiles.add("overview-diagnostics.md");
                uselessFiles.add("overview-manage-costs.md");
//                uselessFiles.add("private-endpoint.md");
                uselessFiles.add("quickstart-arc.md");
//                uselessFiles.add("quickstart-custom-container.md");
        //		uselessFiles.add("quickstart-custom-container.md");
                uselessFiles.add("quickstart-multi-container.md");
                uselessFiles.add("quickstart-nodejs-uiex.md");
                uselessFiles.add("quickstart-wordpress.md");
                uselessFiles.add("samples-terraform.md");
                uselessFiles.add("tutorial-auth-aad.md");
        //		uselessFiles.add("tutorial-auth-aad.md");
//                uselessFiles.add("tutorial-custom-container.md");
                uselessFiles.add("tutorial-multi-container-app.md");
                uselessFiles.add("tutorial-send-email.md");
                uselessFiles.add("webjobs-create.md");
                uselessFiles.add("webjobs-create-ieux.md");
                uselessFiles.add("webjobs-create-ieux-conceptual.md");
                uselessFiles.add("webjobs-create-ieux-view-log.md");
                uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                uselessFiles.add("webjobs-sdk-get-started.md");
                uselessFiles.add("webjobs-sdk-how-to.md");
//                uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                uselessFiles.add("how-to-migrate.md");
                uselessFiles.add("migrate.md");
                uselessFiles.add("migration-alternatives.md");
                uselessFiles.add("networking.md");
                uselessFiles.add("tutorial-networking-isolate-vnet.md");
                return uselessFiles;
        }
	}
    // TODO
	public static class scripts {
        private static final List<String[]> words = new ArrayList<String[]>();
        private static final List<String> warningWords = new ArrayList<String>();
        private static final List<String[]> attentionWords = new ArrayList<String[]>();
        private static final List<String> uselessFiles = new ArrayList<String>();
        private static final List<String> ignoredWords = new ArrayList<String>();
        
        public synchronized static List<String> getIgnoredWords() {
            //		ignoredWords.add("");                
                    return ignoredWords;
                }
                
        public static synchronized List<String[]> getWords() {
                    words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                    words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
            //		words.add(new String[] { "", "" });
            //		words.add(new String[] { "", "" });  
                    return words;
                }
                
        public synchronized static List<String> getWarningWords() {	    
                    warningWords.add("app service acontainer");
                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                    warningWords.add("]((");
                    warningWords.add("]http");
                    warningWords.add("]/");
                    warningWords.add("Buy domain through portal");
                    warningWords.add("Buy SSL certificate through portal//need confirm");
                    warningWords.add("Authentication with Google");
                    warningWords.add("Authentication with Facebook");
                    warningWords.add("Authentication with Twitter");
                    warningWords.add("Managed service identity//need to update"); 
                     warningWords.add("others(references of unavaiable features outside the service");
                    warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                    warningWords.add("**Add VNet (preview)**");
                    warningWords.add("**Diagnose and solve problems**"); 
                     warningWords.add("App Service Certificate");
                    warningWords.add("app service acontainer");
                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                    warningWords.add("Buy domain through portal"); 
                     warningWords.add("Buy SSL certificate through portal");
                    warningWords.add("Authentication with Google");
                    warningWords.add("Authentication with Facebook");
                    warningWords.add("Authentication with Twitter"); 
                      warningWords.add("Managed service identity"); 
                     warningWords.add("others(references of unavaiable features outside the service");
//                     warningWords.add("how-to-migrate.md");
//                     warningWords.add("migrate.md");
//                     warningWords.add("migration-alternatives.md");
//                     warningWords.add("networking.md");
//                     warningWords.add("tutorial-networking-isolate-vnet.md");
 
                    return warningWords;
                }
                
        public synchronized static List<String[]> getAttentionWords() {
            //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
        
                    return attentionWords;
                }
                
        public synchronized static List<String> getUselessFiles() {
                    //These files are grouped into one file
                    uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                    uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                    uselessFiles.add("app-service-app-service-environment-intro.md");
                    uselessFiles.add("app-service-app-service-environment-layered-security.md");
                    uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                    uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                    uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                    uselessFiles.add("app-service-environment-auto-scale.md");
                    uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                    uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-get-started-windows-container.md");
                    uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                    uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                    uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
            //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                    uselessFiles.add("configure-authentication-file-based.md");
                    uselessFiles.add("configure-authentication-oauth-tokens.md");
                    uselessFiles.add("configure-authentication-provider-facebook.md");
                    uselessFiles.add("configure-authentication-provider-google.md");
                    uselessFiles.add("configure-authentication-provider-twitter.md");
//                    uselessFiles.add("configure-connect-to-azure-storage.md");
            //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                    uselessFiles.add("configure-custom-container.md");
                    uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                    uselessFiles.add("configure-ssl-bindings.md");
                    uselessFiles.add("configure-ssl-certificate.md");
                    uselessFiles.add("deploy-best-practices.md");
                    uselessFiles.add("deploy-ci-cd-custom-container.md");
                    uselessFiles.add("deploy-container-github-action.md");
                    uselessFiles.add("deploy-content-sync.md");
            //		uselessFiles.add("deploy-content-sync.md");
//                    uselessFiles.add("deploy-continuous-deployment.md");
                    uselessFiles.add("deploy-github-actions.md");
                    uselessFiles.add("manage-create-arc-environment.md");
                    uselessFiles.add("manage-custom-dns-buy-domain.md");
            //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                    uselessFiles.add("management-addresses.md");
                    uselessFiles.add("overview-arc-integration.md");
                    uselessFiles.add("overview-diagnostics.md");
            //		uselessFiles.add("overview-diagnostics.md");
                    uselessFiles.add("overview-manage-costs.md");
//                    uselessFiles.add("private-endpoint.md");
                    uselessFiles.add("quickstart-arc.md");
//                    uselessFiles.add("quickstart-custom-container.md");
            //		uselessFiles.add("quickstart-custom-container.md");
                    uselessFiles.add("quickstart-multi-container.md");
                    uselessFiles.add("quickstart-nodejs-uiex.md");
                    uselessFiles.add("quickstart-wordpress.md");
                    uselessFiles.add("samples-terraform.md");
                    uselessFiles.add("tutorial-auth-aad.md");
            //		uselessFiles.add("tutorial-auth-aad.md");
//                    uselessFiles.add("tutorial-custom-container.md");
                    uselessFiles.add("tutorial-multi-container-app.md");
                    uselessFiles.add("tutorial-send-email.md");
                    uselessFiles.add("webjobs-create.md");
                    uselessFiles.add("webjobs-create-ieux.md");
                    uselessFiles.add("webjobs-create-ieux-conceptual.md");
                    uselessFiles.add("webjobs-create-ieux-view-log.md");
                    uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                    uselessFiles.add("webjobs-sdk-get-started.md");
                    uselessFiles.add("webjobs-sdk-how-to.md");
//                    uselessFiles.add("web-sites-integrate-with-vnet.md");  20220718 This article has been translated. 
                    uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                    uselessFiles.add("how-to-migrate.md");
                    uselessFiles.add("migrate.md");
                    uselessFiles.add("migration-alternatives.md");
                    uselessFiles.add("networking.md");
                    uselessFiles.add("tutorial-networking-isolate-vnet.md");
                    return uselessFiles;
            }
        }
        // TODO
	public static class environment {
        private static final List<String[]> words = new ArrayList<String[]>();
        private static final List<String> warningWords = new ArrayList<String>();
        private static final List<String[]> attentionWords = new ArrayList<String[]>();
        private static final List<String> uselessFiles = new ArrayList<String>();
        private static final List<String> ignoredWords = new ArrayList<String>();
        
        public synchronized static List<String> getIgnoredWords() {
            //		ignoredWords.add("");                
                    return ignoredWords;
                }
                
        public static synchronized List<String[]> getWords() {
                    words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                    words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
            //		words.add(new String[] { "", "" });
            //		words.add(new String[] { "", "" });  
                    return words;
                }
                
        public synchronized static List<String> getWarningWords() {	    
                    warningWords.add("app service acontainer");
                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                    warningWords.add("]((");
                    warningWords.add("]http");
                    warningWords.add("]/");
                    warningWords.add("Buy domain through portal");
                    warningWords.add("Buy SSL certificate through portal//need confirm");
                    warningWords.add("Authentication with Google");
                    warningWords.add("Authentication with Facebook");
                    warningWords.add("Authentication with Twitter");
                    warningWords.add("Managed service identity//need to update"); 
                     warningWords.add("others(references of unavaiable features outside the service");
                    warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                    warningWords.add("**Add VNet (preview)**");
                    warningWords.add("**Diagnose and solve problems**"); 
                     warningWords.add("App Service Certificate");
                    warningWords.add("app service acontainer");
                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                    warningWords.add("Buy domain through portal"); 
                     warningWords.add("Buy SSL certificate through portal");
                    warningWords.add("Authentication with Google");
                    warningWords.add("Authentication with Facebook");
                    warningWords.add("Authentication with Twitter"); 
                      warningWords.add("Managed service identity"); 
                     warningWords.add("others(references of unavaiable features outside the service");
//                     warningWords.add("how-to-migrate.md");
//                     warningWords.add("migrate.md");
//                     warningWords.add("migration-alternatives.md");
//                     warningWords.add("networking.md");
//                     warningWords.add("tutorial-networking-isolate-vnet.md");
 
                    return warningWords;
                }
                
        public synchronized static List<String[]> getAttentionWords() {
            //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
        
                    return attentionWords;
                }
                
        public synchronized static List<String> getUselessFiles() {
                    //These files are grouped into one file
                    uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                    uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                    uselessFiles.add("app-service-app-service-environment-intro.md");
                    uselessFiles.add("app-service-app-service-environment-layered-security.md");
                    uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                    uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                    uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                    uselessFiles.add("app-service-environment-auto-scale.md");
                    uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                    uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-get-started-windows-container.md");
                    uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                    uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                    uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
            //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                    uselessFiles.add("configure-authentication-file-based.md");
                    uselessFiles.add("configure-authentication-oauth-tokens.md");
                    uselessFiles.add("configure-authentication-provider-facebook.md");
                    uselessFiles.add("configure-authentication-provider-google.md");
                    uselessFiles.add("configure-authentication-provider-twitter.md");
//                    uselessFiles.add("configure-connect-to-azure-storage.md");
            //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                    uselessFiles.add("configure-custom-container.md");
                    uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                    uselessFiles.add("configure-ssl-bindings.md");
                    uselessFiles.add("configure-ssl-certificate.md");
                    uselessFiles.add("deploy-best-practices.md");
                    uselessFiles.add("deploy-ci-cd-custom-container.md");
                    uselessFiles.add("deploy-container-github-action.md");
                    uselessFiles.add("deploy-content-sync.md");
            //		uselessFiles.add("deploy-content-sync.md");
//                    uselessFiles.add("deploy-continuous-deployment.md");
                    uselessFiles.add("deploy-github-actions.md");
                    uselessFiles.add("manage-create-arc-environment.md");
                    uselessFiles.add("manage-custom-dns-buy-domain.md");
            //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                    uselessFiles.add("management-addresses.md");
                    uselessFiles.add("overview-arc-integration.md");
                    uselessFiles.add("overview-diagnostics.md");
            //		uselessFiles.add("overview-diagnostics.md");
                    uselessFiles.add("overview-manage-costs.md");
//                    uselessFiles.add("private-endpoint.md");
                    uselessFiles.add("quickstart-arc.md");
//                    uselessFiles.add("quickstart-custom-container.md");
            //		uselessFiles.add("quickstart-custom-container.md");
                    uselessFiles.add("quickstart-multi-container.md");
                    uselessFiles.add("quickstart-nodejs-uiex.md");
                    uselessFiles.add("quickstart-wordpress.md");
                    uselessFiles.add("samples-terraform.md");
                    uselessFiles.add("tutorial-auth-aad.md");
            //		uselessFiles.add("tutorial-auth-aad.md");
//                    uselessFiles.add("tutorial-custom-container.md");
                    uselessFiles.add("tutorial-multi-container-app.md");
                    uselessFiles.add("tutorial-send-email.md");
                    uselessFiles.add("webjobs-create.md");
                    uselessFiles.add("webjobs-create-ieux.md");
                    uselessFiles.add("webjobs-create-ieux-conceptual.md");
                    uselessFiles.add("webjobs-create-ieux-view-log.md");
                    uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                    uselessFiles.add("webjobs-sdk-get-started.md");
                    uselessFiles.add("webjobs-sdk-how-to.md");
//                    uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                    uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                    uselessFiles.add("how-to-migrate.md");
                    uselessFiles.add("migrate.md");
                    uselessFiles.add("migration-alternatives.md");
                    uselessFiles.add("networking.md");
                    uselessFiles.add("tutorial-networking-isolate-vnet.md");
                    uselessFiles.add("overview.md");
//                    2022.0718 add because [Prerequisites](configure-ssl-certificate.md) is NOT available.
                    uselessFiles.add("how-to-custom-domain-suffix.md");
                    return uselessFiles;
            }
        }
        // TODO
	public static class includes {
        private static final List<String[]> words = new ArrayList<String[]>();
        private static final List<String> warningWords = new ArrayList<String>();
        private static final List<String[]> attentionWords = new ArrayList<String[]>();
        private static final List<String> uselessFiles = new ArrayList<String>();
        private static final List<String> ignoredWords = new ArrayList<String>();
        
        public synchronized static List<String> getIgnoredWords() {
            //		ignoredWords.add("");                
                    return ignoredWords;
                }
                
        public static synchronized List<String[]> getWords() {
                    words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                    words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
            //		words.add(new String[] { "", "" });
            //		words.add(new String[] { "", "" });  
                    return words;
                }
                
        public synchronized static List<String> getWarningWords() {	    
                    warningWords.add("app service acontainer");
                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                    warningWords.add("]((");
                    warningWords.add("]http");
                    warningWords.add("]/");
                    warningWords.add("Buy domain through portal");
                    warningWords.add("Buy SSL certificate through portal//need confirm");
                    warningWords.add("Authentication with Google");
                    warningWords.add("Authentication with Facebook");
                    warningWords.add("Authentication with Twitter");
                    warningWords.add("Managed service identity//need to update"); 
                     warningWords.add("others(references of unavaiable features outside the service");
                    warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                    warningWords.add("**Add VNet (preview)**");
                    warningWords.add("**Diagnose and solve problems**"); 
                     warningWords.add("App Service Certificate");
                    warningWords.add("app service acontainer");
                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                    warningWords.add("Buy domain through portal"); 
                     warningWords.add("Buy SSL certificate through portal");
                    warningWords.add("Authentication with Google");
                    warningWords.add("Authentication with Facebook");
                    warningWords.add("Authentication with Twitter"); 
                      warningWords.add("Managed service identity"); 
                     warningWords.add("others(references of unavaiable features outside the service");
//                     warningWords.add("how-to-migrate.md");
//                     warningWords.add("migrate.md");
//                     warningWords.add("migration-alternatives.md");
//                     warningWords.add("networking.md");
//                     warningWords.add("tutorial-networking-isolate-vnet.md");
 
                    return warningWords;
                }
                
        public synchronized static List<String[]> getAttentionWords() {
            //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
        
                    return attentionWords;
                }
                
        public synchronized static List<String> getUselessFiles() {
                    //These files are grouped into one file
                    uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                    uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                    uselessFiles.add("app-service-app-service-environment-intro.md");
                    uselessFiles.add("app-service-app-service-environment-layered-security.md");
                    uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                    uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                    uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                    uselessFiles.add("app-service-environment-auto-scale.md");
                    uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                    uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-get-started-windows-container.md");
                    uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                    uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                    uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                    uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
            //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                    uselessFiles.add("configure-authentication-file-based.md");
                    uselessFiles.add("configure-authentication-oauth-tokens.md");
                    uselessFiles.add("configure-authentication-provider-facebook.md");
                    uselessFiles.add("configure-authentication-provider-google.md");
                    uselessFiles.add("configure-authentication-provider-twitter.md");
//                    uselessFiles.add("configure-connect-to-azure-storage.md");
            //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                    uselessFiles.add("configure-custom-container.md");
                    uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                    uselessFiles.add("configure-ssl-bindings.md");
                    uselessFiles.add("configure-ssl-certificate.md");
                    uselessFiles.add("deploy-best-practices.md");
                    uselessFiles.add("deploy-ci-cd-custom-container.md");
                    uselessFiles.add("deploy-container-github-action.md");
                    uselessFiles.add("deploy-content-sync.md");
            //		uselessFiles.add("deploy-content-sync.md");
//                    uselessFiles.add("deploy-continuous-deployment.md");
                    uselessFiles.add("deploy-github-actions.md");
                    uselessFiles.add("manage-create-arc-environment.md");
                    uselessFiles.add("manage-custom-dns-buy-domain.md");
            //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                    uselessFiles.add("management-addresses.md");
                    uselessFiles.add("overview-arc-integration.md");
                    uselessFiles.add("overview-diagnostics.md");
            //		uselessFiles.add("overview-diagnostics.md");
                    uselessFiles.add("overview-manage-costs.md");
//                    uselessFiles.add("private-endpoint.md");
                    uselessFiles.add("quickstart-arc.md");
//                    uselessFiles.add("quickstart-custom-container.md");
            //		uselessFiles.add("quickstart-custom-container.md");
                    uselessFiles.add("quickstart-multi-container.md");
                    uselessFiles.add("quickstart-nodejs-uiex.md");
                    uselessFiles.add("quickstart-wordpress.md");
                    uselessFiles.add("samples-terraform.md");
                    uselessFiles.add("tutorial-auth-aad.md");
            //		uselessFiles.add("tutorial-auth-aad.md");
//                    uselessFiles.add("tutorial-custom-container.md");
                    uselessFiles.add("tutorial-multi-container-app.md");
                    uselessFiles.add("tutorial-send-email.md");
                    uselessFiles.add("webjobs-create.md");
                    uselessFiles.add("webjobs-create-ieux.md");
                    uselessFiles.add("webjobs-create-ieux-conceptual.md");
                    uselessFiles.add("webjobs-create-ieux-view-log.md");
                    uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                    uselessFiles.add("webjobs-sdk-get-started.md");
                    uselessFiles.add("webjobs-sdk-how-to.md");
//                    uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                    uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                    uselessFiles.add("how-to-migrate.md");
                    uselessFiles.add("migrate.md");
                    uselessFiles.add("migration-alternatives.md");
                    uselessFiles.add("networking.md");
                    uselessFiles.add("tutorial-networking-isolate-vnet.md");
                    return uselessFiles;
            }
            public static class quickstart_python {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                
                public synchronized static List<String> getIgnoredWords() {
                    //		ignoredWords.add("");                
                            return ignoredWords;
                        }
                        
                public static synchronized List<String[]> getWords() {
                            words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                            words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                    //		words.add(new String[] { "", "" });
                    //		words.add(new String[] { "", "" });  
                            return words;
                        }
                        
                public synchronized static List<String> getWarningWords() {	    
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("]((");
                            warningWords.add("]http");
                            warningWords.add("]/");
                            warningWords.add("Buy domain through portal");
                            warningWords.add("Buy SSL certificate through portal//need confirm");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter");
                            warningWords.add("Managed service identity//need to update"); 
                             warningWords.add("others(references of unavaiable features outside the service");
                            warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                            warningWords.add("**Add VNet (preview)**");
                            warningWords.add("**Diagnose and solve problems**"); 
                             warningWords.add("App Service Certificate");
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("Buy domain through portal"); 
                             warningWords.add("Buy SSL certificate through portal");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter"); 
                              warningWords.add("Managed service identity"); 
                             warningWords.add("others(references of unavaiable features outside the service");
//                             warningWords.add("how-to-migrate.md");
//                             warningWords.add("migrate.md");
//                             warningWords.add("migration-alternatives.md");
//                             warningWords.add("networking.md");
//                             warningWords.add("tutorial-networking-isolate-vnet.md");
 
                            return warningWords;
                        }
                        
                public synchronized static List<String[]> getAttentionWords() {
                    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                
                            return attentionWords;
                        }
                        
                public synchronized static List<String> getUselessFiles() {
                            //These files are grouped into one file
                            uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                            uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                            uselessFiles.add("app-service-app-service-environment-intro.md");
                            uselessFiles.add("app-service-app-service-environment-layered-security.md");
                            uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                            uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                            uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                            uselessFiles.add("app-service-environment-auto-scale.md");
                            uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                            uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-get-started-windows-container.md");
                            uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                            uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                            uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                            uselessFiles.add("configure-authentication-file-based.md");
                            uselessFiles.add("configure-authentication-oauth-tokens.md");
                            uselessFiles.add("configure-authentication-provider-facebook.md");
                            uselessFiles.add("configure-authentication-provider-google.md");
                            uselessFiles.add("configure-authentication-provider-twitter.md");
//                            uselessFiles.add("configure-connect-to-azure-storage.md");
                    //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                            uselessFiles.add("configure-custom-container.md");
                            uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                            uselessFiles.add("configure-ssl-bindings.md");
                            uselessFiles.add("configure-ssl-certificate.md");
                            uselessFiles.add("deploy-best-practices.md");
                            uselessFiles.add("deploy-ci-cd-custom-container.md");
                            uselessFiles.add("deploy-container-github-action.md");
                            uselessFiles.add("deploy-content-sync.md");
                    //		uselessFiles.add("deploy-content-sync.md");
//                            uselessFiles.add("deploy-continuous-deployment.md");
                            uselessFiles.add("deploy-github-actions.md");
                            uselessFiles.add("manage-create-arc-environment.md");
                            uselessFiles.add("manage-custom-dns-buy-domain.md");
                    //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                            uselessFiles.add("management-addresses.md");
                            uselessFiles.add("overview-arc-integration.md");
                            uselessFiles.add("overview-diagnostics.md");
                    //		uselessFiles.add("overview-diagnostics.md");
                            uselessFiles.add("overview-manage-costs.md");
//                            uselessFiles.add("private-endpoint.md");
                            uselessFiles.add("quickstart-arc.md");
//                            uselessFiles.add("quickstart-custom-container.md");
                    //		uselessFiles.add("quickstart-custom-container.md");
                            uselessFiles.add("quickstart-multi-container.md");
                            uselessFiles.add("quickstart-nodejs-uiex.md");
                            uselessFiles.add("quickstart-wordpress.md");
                            uselessFiles.add("samples-terraform.md");
                            uselessFiles.add("tutorial-auth-aad.md");
                    //		uselessFiles.add("tutorial-auth-aad.md");
//                            uselessFiles.add("tutorial-custom-container.md");
                            uselessFiles.add("tutorial-multi-container-app.md");
                            uselessFiles.add("tutorial-send-email.md");
                            uselessFiles.add("webjobs-create.md");
                            uselessFiles.add("webjobs-create-ieux.md");
                            uselessFiles.add("webjobs-create-ieux-conceptual.md");
                            uselessFiles.add("webjobs-create-ieux-view-log.md");
                            uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                            uselessFiles.add("webjobs-sdk-get-started.md");
                            uselessFiles.add("webjobs-sdk-how-to.md");
//                            uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                            uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                            uselessFiles.add("how-to-migrate.md");
                            uselessFiles.add("migrate.md");
                            uselessFiles.add("migration-alternatives.md");
                            uselessFiles.add("networking.md");
                            uselessFiles.add("tutorial-networking-isolate-vnet.md");
                            return uselessFiles;
                    }
                }
            public static class tutorial_php_mysql_app {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                
                public synchronized static List<String> getIgnoredWords() {
                    //		ignoredWords.add("");                
                            return ignoredWords;
                        }
                        
                public static synchronized List<String[]> getWords() {
                            words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                            words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                    //		words.add(new String[] { "", "" });
                    //		words.add(new String[] { "", "" });  
                            return words;
                        }
                        
                public synchronized static List<String> getWarningWords() {	    
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("]((");
                            warningWords.add("]http");
                            warningWords.add("]/");
                            warningWords.add("Buy domain through portal");
                            warningWords.add("Buy SSL certificate through portal//need confirm");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter");
                            warningWords.add("Managed service identity//need to update"); 
                             warningWords.add("others(references of unavaiable features outside the service");
                            warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                            warningWords.add("**Add VNet (preview)**");
                            warningWords.add("**Diagnose and solve problems**"); 
                             warningWords.add("App Service Certificate");
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("Buy domain through portal"); 
                             warningWords.add("Buy SSL certificate through portal");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter"); 
                              warningWords.add("Managed service identity"); 
                             warningWords.add("others(references of unavaiable features outside the service");
//                             warningWords.add("how-to-migrate.md");
//                             warningWords.add("migrate.md");
//                             warningWords.add("migration-alternatives.md");
//                             warningWords.add("networking.md");
//                             warningWords.add("tutorial-networking-isolate-vnet.md");
 
                            return warningWords;
                        }
                        
                public synchronized static List<String[]> getAttentionWords() {
                    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                
                            return attentionWords;
                        }
                        
                public synchronized static List<String> getUselessFiles() {
                            //These files are grouped into one file
                            uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                            uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                            uselessFiles.add("app-service-app-service-environment-intro.md");
                            uselessFiles.add("app-service-app-service-environment-layered-security.md");
                            uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                            uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                            uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                            uselessFiles.add("app-service-environment-auto-scale.md");
                            uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                            uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-get-started-windows-container.md");
                            uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                            uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                            uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                            uselessFiles.add("configure-authentication-file-based.md");
                            uselessFiles.add("configure-authentication-oauth-tokens.md");
                            uselessFiles.add("configure-authentication-provider-facebook.md");
                            uselessFiles.add("configure-authentication-provider-google.md");
                            uselessFiles.add("configure-authentication-provider-twitter.md");
//                            uselessFiles.add("configure-connect-to-azure-storage.md");
                    //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                            uselessFiles.add("configure-custom-container.md");
                            uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                            uselessFiles.add("configure-ssl-bindings.md");
                            uselessFiles.add("configure-ssl-certificate.md");
                            uselessFiles.add("deploy-best-practices.md");
                            uselessFiles.add("deploy-ci-cd-custom-container.md");
                            uselessFiles.add("deploy-container-github-action.md");
                            uselessFiles.add("deploy-content-sync.md");
                    //		uselessFiles.add("deploy-content-sync.md");
//                            uselessFiles.add("deploy-continuous-deployment.md");
                            uselessFiles.add("deploy-github-actions.md");
                            uselessFiles.add("manage-create-arc-environment.md");
                            uselessFiles.add("manage-custom-dns-buy-domain.md");
                    //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                            uselessFiles.add("management-addresses.md");
                            uselessFiles.add("overview-arc-integration.md");
                            uselessFiles.add("overview-diagnostics.md");
                    //		uselessFiles.add("overview-diagnostics.md");
                            uselessFiles.add("overview-manage-costs.md");
//                            uselessFiles.add("private-endpoint.md");
                            uselessFiles.add("quickstart-arc.md");
//                            uselessFiles.add("quickstart-custom-container.md");
                    //		uselessFiles.add("quickstart-custom-container.md");
                            uselessFiles.add("quickstart-multi-container.md");
                            uselessFiles.add("quickstart-nodejs-uiex.md");
                            uselessFiles.add("quickstart-wordpress.md");
                            uselessFiles.add("samples-terraform.md");
                            uselessFiles.add("tutorial-auth-aad.md");
                    //		uselessFiles.add("tutorial-auth-aad.md");
//                            uselessFiles.add("tutorial-custom-container.md");
                            uselessFiles.add("tutorial-multi-container-app.md");
                            uselessFiles.add("tutorial-send-email.md");
                            uselessFiles.add("webjobs-create.md");
                            uselessFiles.add("webjobs-create-ieux.md");
                            uselessFiles.add("webjobs-create-ieux-conceptual.md");
                            uselessFiles.add("webjobs-create-ieux-view-log.md");
                            uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                            uselessFiles.add("webjobs-sdk-get-started.md");
                            uselessFiles.add("webjobs-sdk-how-to.md");
//                            uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                            uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                            uselessFiles.add("how-to-migrate.md");
                            uselessFiles.add("migrate.md");
                            uselessFiles.add("migration-alternatives.md");
                            uselessFiles.add("networking.md");
                            uselessFiles.add("tutorial-networking-isolate-vnet.md");
                            return uselessFiles;
                    }
                }
            public static class quickstart_custom_container {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                
                public synchronized static List<String> getIgnoredWords() {
                    //		ignoredWords.add("");                
                            return ignoredWords;
                        }
                        
                public static synchronized List<String[]> getWords() {
                            words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                            words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                    //		words.add(new String[] { "", "" });
                    //		words.add(new String[] { "", "" });  
                            return words;
                        }
                        
                public synchronized static List<String> getWarningWords() {	    
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("]((");
                            warningWords.add("]http");
                            warningWords.add("]/");
                            warningWords.add("Buy domain through portal");
                            warningWords.add("Buy SSL certificate through portal//need confirm");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter");
                            warningWords.add("Managed service identity//need to update"); 
                             warningWords.add("others(references of unavaiable features outside the service");
                            warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                            warningWords.add("**Add VNet (preview)**");
                            warningWords.add("**Diagnose and solve problems**"); 
                             warningWords.add("App Service Certificate");
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("Buy domain through portal"); 
                             warningWords.add("Buy SSL certificate through portal");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter"); 
                              warningWords.add("Managed service identity"); 
                             warningWords.add("others(references of unavaiable features outside the service");
//                             warningWords.add("how-to-migrate.md");
//                             warningWords.add("migrate.md");
//                             warningWords.add("migration-alternatives.md");
//                             warningWords.add("networking.md");
//                             warningWords.add("tutorial-networking-isolate-vnet.md");
 
                            return warningWords;
                        }
                        
                public synchronized static List<String[]> getAttentionWords() {
                    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                
                            return attentionWords;
                        }
                        
                public synchronized static List<String> getUselessFiles() {
                            //These files are grouped into one file
                            uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                            uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                            uselessFiles.add("app-service-app-service-environment-intro.md");
                            uselessFiles.add("app-service-app-service-environment-layered-security.md");
                            uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                            uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                            uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                            uselessFiles.add("app-service-environment-auto-scale.md");
                            uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                            uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-get-started-windows-container.md");
                            uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                            uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                            uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                            uselessFiles.add("configure-authentication-file-based.md");
                            uselessFiles.add("configure-authentication-oauth-tokens.md");
                            uselessFiles.add("configure-authentication-provider-facebook.md");
                            uselessFiles.add("configure-authentication-provider-google.md");
                            uselessFiles.add("configure-authentication-provider-twitter.md");
//                            uselessFiles.add("configure-connect-to-azure-storage.md");
                    //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                            uselessFiles.add("configure-custom-container.md");
                            uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                            uselessFiles.add("configure-ssl-bindings.md");
                            uselessFiles.add("configure-ssl-certificate.md");
                            uselessFiles.add("deploy-best-practices.md");
                            uselessFiles.add("deploy-ci-cd-custom-container.md");
                            uselessFiles.add("deploy-container-github-action.md");
                            uselessFiles.add("deploy-content-sync.md");
                    //		uselessFiles.add("deploy-content-sync.md");
//                            uselessFiles.add("deploy-continuous-deployment.md");
                            uselessFiles.add("deploy-github-actions.md");
                            uselessFiles.add("manage-create-arc-environment.md");
                            uselessFiles.add("manage-custom-dns-buy-domain.md");
                    //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                            uselessFiles.add("management-addresses.md");
                            uselessFiles.add("overview-arc-integration.md");
                            uselessFiles.add("overview-diagnostics.md");
                    //		uselessFiles.add("overview-diagnostics.md");
                            uselessFiles.add("overview-manage-costs.md");
//                            uselessFiles.add("private-endpoint.md");
                            uselessFiles.add("quickstart-arc.md");
//                            uselessFiles.add("quickstart-custom-container.md");
                    //		uselessFiles.add("quickstart-custom-container.md");
                            uselessFiles.add("quickstart-multi-container.md");
                            uselessFiles.add("quickstart-nodejs-uiex.md");
                            uselessFiles.add("quickstart-wordpress.md");
                            uselessFiles.add("samples-terraform.md");
                            uselessFiles.add("tutorial-auth-aad.md");
                    //		uselessFiles.add("tutorial-auth-aad.md");
//                            uselessFiles.add("tutorial-custom-container.md");
                            uselessFiles.add("tutorial-multi-container-app.md");
                            uselessFiles.add("tutorial-send-email.md");
                            uselessFiles.add("webjobs-create.md");
                            uselessFiles.add("webjobs-create-ieux.md");
                            uselessFiles.add("webjobs-create-ieux-conceptual.md");
                            uselessFiles.add("webjobs-create-ieux-view-log.md");
                            uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                            uselessFiles.add("webjobs-sdk-get-started.md");
                            uselessFiles.add("webjobs-sdk-how-to.md");
//                            uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                            uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                            uselessFiles.add("how-to-migrate.md");
                            uselessFiles.add("migrate.md");
                            uselessFiles.add("migration-alternatives.md");
                            uselessFiles.add("networking.md");
                            uselessFiles.add("tutorial-networking-isolate-vnet.md");
                            return uselessFiles;
                    }
                }
            public static class quickstart_php {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                
                public synchronized static List<String> getIgnoredWords() {
                    //		ignoredWords.add("");                
                            return ignoredWords;
                        }
                        
                public static synchronized List<String[]> getWords() {
                            words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                            words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                    //		words.add(new String[] { "", "" });
                    //		words.add(new String[] { "", "" });  
                            return words;
                        }
                        
                public synchronized static List<String> getWarningWords() {	    
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("]((");
                            warningWords.add("]http");
                            warningWords.add("]/");
                            warningWords.add("Buy domain through portal");
                            warningWords.add("Buy SSL certificate through portal//need confirm");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter");
                            warningWords.add("Managed service identity//need to update"); 
                             warningWords.add("others(references of unavaiable features outside the service");
                            warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                            warningWords.add("**Add VNet (preview)**");
                            warningWords.add("**Diagnose and solve problems**"); 
                             warningWords.add("App Service Certificate");
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("Buy domain through portal"); 
                             warningWords.add("Buy SSL certificate through portal");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter"); 
                              warningWords.add("Managed service identity"); 
                             warningWords.add("others(references of unavaiable features outside the service");
//                             warningWords.add("how-to-migrate.md");
//                             warningWords.add("migrate.md");
//                             warningWords.add("migration-alternatives.md");
//                             warningWords.add("networking.md");
//                             warningWords.add("tutorial-networking-isolate-vnet.md");
 
                            return warningWords;
                        }
                        
                public synchronized static List<String[]> getAttentionWords() {
                    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                
                            return attentionWords;
                        }
                        
                public synchronized static List<String> getUselessFiles() {
                            //These files are grouped into one file
                            uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                            uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                            uselessFiles.add("app-service-app-service-environment-intro.md");
                            uselessFiles.add("app-service-app-service-environment-layered-security.md");
                            uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                            uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                            uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                            uselessFiles.add("app-service-environment-auto-scale.md");
                            uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                            uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-get-started-windows-container.md");
                            uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                            uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                            uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                            uselessFiles.add("configure-authentication-file-based.md");
                            uselessFiles.add("configure-authentication-oauth-tokens.md");
                            uselessFiles.add("configure-authentication-provider-facebook.md");
                            uselessFiles.add("configure-authentication-provider-google.md");
                            uselessFiles.add("configure-authentication-provider-twitter.md");
//                            uselessFiles.add("configure-connect-to-azure-storage.md");
                    //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                            uselessFiles.add("configure-custom-container.md");
                            uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                            uselessFiles.add("configure-ssl-bindings.md");
                            uselessFiles.add("configure-ssl-certificate.md");
                            uselessFiles.add("deploy-best-practices.md");
                            uselessFiles.add("deploy-ci-cd-custom-container.md");
                            uselessFiles.add("deploy-container-github-action.md");
                            uselessFiles.add("deploy-content-sync.md");
                    //		uselessFiles.add("deploy-content-sync.md");
//                            uselessFiles.add("deploy-continuous-deployment.md");
                            uselessFiles.add("deploy-github-actions.md");
                            uselessFiles.add("manage-create-arc-environment.md");
                            uselessFiles.add("manage-custom-dns-buy-domain.md");
                    //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                            uselessFiles.add("management-addresses.md");
                            uselessFiles.add("overview-arc-integration.md");
                            uselessFiles.add("overview-diagnostics.md");
                    //		uselessFiles.add("overview-diagnostics.md");
                            uselessFiles.add("overview-manage-costs.md");
//                            uselessFiles.add("private-endpoint.md");
                            uselessFiles.add("quickstart-arc.md");
//                            uselessFiles.add("quickstart-custom-container.md");
                    //		uselessFiles.add("quickstart-custom-container.md");
                            uselessFiles.add("quickstart-multi-container.md");
                            uselessFiles.add("quickstart-nodejs-uiex.md");
                            uselessFiles.add("quickstart-wordpress.md");
                            uselessFiles.add("samples-terraform.md");
                            uselessFiles.add("tutorial-auth-aad.md");
                    //		uselessFiles.add("tutorial-auth-aad.md");
//                            uselessFiles.add("tutorial-custom-container.md");
                            uselessFiles.add("tutorial-multi-container-app.md");
                            uselessFiles.add("tutorial-send-email.md");
                            uselessFiles.add("webjobs-create.md");
                            uselessFiles.add("webjobs-create-ieux.md");
                            uselessFiles.add("webjobs-create-ieux-conceptual.md");
                            uselessFiles.add("webjobs-create-ieux-view-log.md");
                            uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                            uselessFiles.add("webjobs-sdk-get-started.md");
                            uselessFiles.add("webjobs-sdk-how-to.md");
//                            uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                            uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                            uselessFiles.add("how-to-migrate.md");
                            uselessFiles.add("migrate.md");
                            uselessFiles.add("migration-alternatives.md");
                            uselessFiles.add("networking.md");
                            uselessFiles.add("tutorial-networking-isolate-vnet.md");
                            return uselessFiles;
                    }
                }
            public static class quickstart_java {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                
                public synchronized static List<String> getIgnoredWords() {
                    //		ignoredWords.add("");                
                            return ignoredWords;
                        }
                        
                public static synchronized List<String[]> getWords() {
                            words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                            words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                    //		words.add(new String[] { "", "" });
                    //		words.add(new String[] { "", "" });  
                            return words;
                        }
                        
                public synchronized static List<String> getWarningWords() {	    
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("]((");
                            warningWords.add("]http");
                            warningWords.add("]/");
                            warningWords.add("Buy domain through portal");
                            warningWords.add("Buy SSL certificate through portal//need confirm");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter");
                            warningWords.add("Managed service identity//need to update"); 
                             warningWords.add("others(references of unavaiable features outside the service");
                            warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                            warningWords.add("**Add VNet (preview)**");
                            warningWords.add("**Diagnose and solve problems**"); 
                             warningWords.add("App Service Certificate");
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("Buy domain through portal"); 
                             warningWords.add("Buy SSL certificate through portal");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter"); 
                              warningWords.add("Managed service identity"); 
                             warningWords.add("others(references of unavaiable features outside the service");
//                             warningWords.add("how-to-migrate.md");
//                             warningWords.add("migrate.md");
//                             warningWords.add("migration-alternatives.md");
//                             warningWords.add("networking.md");
//                             warningWords.add("tutorial-networking-isolate-vnet.md");
 
                            return warningWords;
                        }
                        
                public synchronized static List<String[]> getAttentionWords() {
                    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                
                            return attentionWords;
                        }
                        
                public synchronized static List<String> getUselessFiles() {
                            //These files are grouped into one file
                            uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                            uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                            uselessFiles.add("app-service-app-service-environment-intro.md");
                            uselessFiles.add("app-service-app-service-environment-layered-security.md");
                            uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                            uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                            uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                            uselessFiles.add("app-service-environment-auto-scale.md");
                            uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                            uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-get-started-windows-container.md");
                            uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                            uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                            uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                            uselessFiles.add("configure-authentication-file-based.md");
                            uselessFiles.add("configure-authentication-oauth-tokens.md");
                            uselessFiles.add("configure-authentication-provider-facebook.md");
                            uselessFiles.add("configure-authentication-provider-google.md");
                            uselessFiles.add("configure-authentication-provider-twitter.md");
//                            uselessFiles.add("configure-connect-to-azure-storage.md");
                    //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                            uselessFiles.add("configure-custom-container.md");
                            uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                            uselessFiles.add("configure-ssl-bindings.md");
                            uselessFiles.add("configure-ssl-certificate.md");
                            uselessFiles.add("deploy-best-practices.md");
                            uselessFiles.add("deploy-ci-cd-custom-container.md");
                            uselessFiles.add("deploy-container-github-action.md");
                            uselessFiles.add("deploy-content-sync.md");
                    //		uselessFiles.add("deploy-content-sync.md");
//                            uselessFiles.add("deploy-continuous-deployment.md");
                            uselessFiles.add("deploy-github-actions.md");
                            uselessFiles.add("manage-create-arc-environment.md");
                            uselessFiles.add("manage-custom-dns-buy-domain.md");
                    //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                            uselessFiles.add("management-addresses.md");
                            uselessFiles.add("overview-arc-integration.md");
                            uselessFiles.add("overview-diagnostics.md");
                    //		uselessFiles.add("overview-diagnostics.md");
                            uselessFiles.add("overview-manage-costs.md");
//                            uselessFiles.add("private-endpoint.md");
                            uselessFiles.add("quickstart-arc.md");
//                            uselessFiles.add("quickstart-custom-container.md");
                    //		uselessFiles.add("quickstart-custom-container.md");
                            uselessFiles.add("quickstart-multi-container.md");
                            uselessFiles.add("quickstart-nodejs-uiex.md");
                            uselessFiles.add("quickstart-wordpress.md");
                            uselessFiles.add("samples-terraform.md");
                            uselessFiles.add("tutorial-auth-aad.md");
                    //		uselessFiles.add("tutorial-auth-aad.md");
//                            uselessFiles.add("tutorial-custom-container.md");
                            uselessFiles.add("tutorial-multi-container-app.md");
                            uselessFiles.add("tutorial-send-email.md");
                            uselessFiles.add("webjobs-create.md");
                            uselessFiles.add("webjobs-create-ieux.md");
                            uselessFiles.add("webjobs-create-ieux-conceptual.md");
                            uselessFiles.add("webjobs-create-ieux-view-log.md");
                            uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                            uselessFiles.add("webjobs-sdk-get-started.md");
                            uselessFiles.add("webjobs-sdk-how-to.md");
//                            uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                            uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                            uselessFiles.add("how-to-migrate.md");
                            uselessFiles.add("migrate.md");
                            uselessFiles.add("migration-alternatives.md");
                            uselessFiles.add("networking.md");
                            uselessFiles.add("tutorial-networking-isolate-vnet.md");
                            return uselessFiles;
                    }
                }
            public static class tutorial_connect_app_access_microsoft_graph_as_user {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                
                public synchronized static List<String> getIgnoredWords() {
                    //		ignoredWords.add("");                
                            return ignoredWords;
                        }
                        
                public static synchronized List<String[]> getWords() {
                            words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                            words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                    //		words.add(new String[] { "", "" });
                    //		words.add(new String[] { "", "" });  
                            return words;
                        }
                        
                public synchronized static List<String> getWarningWords() {	    
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("]((");
                            warningWords.add("]http");
                            warningWords.add("]/");
                            warningWords.add("Buy domain through portal");
                            warningWords.add("Buy SSL certificate through portal//need confirm");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter");
                            warningWords.add("Managed service identity//need to update"); 
                             warningWords.add("others(references of unavaiable features outside the service");
                            warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                            warningWords.add("**Add VNet (preview)**");
                            warningWords.add("**Diagnose and solve problems**"); 
                             warningWords.add("App Service Certificate");
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("Buy domain through portal"); 
                             warningWords.add("Buy SSL certificate through portal");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter"); 
                              warningWords.add("Managed service identity"); 
                             warningWords.add("others(references of unavaiable features outside the service");
//                             warningWords.add("how-to-migrate.md");
//                             warningWords.add("migrate.md");
//                             warningWords.add("migration-alternatives.md");
//                             warningWords.add("networking.md");
//                             warningWords.add("tutorial-networking-isolate-vnet.md");

                            return warningWords;
                        }
                        
                public synchronized static List<String[]> getAttentionWords() {
                    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                
                            return attentionWords;
                        }
                        
                public synchronized static List<String> getUselessFiles() {
                            //These files are grouped into one file
                            uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                            uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                            uselessFiles.add("app-service-app-service-environment-intro.md");
                            uselessFiles.add("app-service-app-service-environment-layered-security.md");
                            uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                            uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                            uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                            uselessFiles.add("app-service-environment-auto-scale.md");
                            uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                            uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-get-started-windows-container.md");
                            uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                            uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                            uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                            uselessFiles.add("configure-authentication-file-based.md");
                            uselessFiles.add("configure-authentication-oauth-tokens.md");
                            uselessFiles.add("configure-authentication-provider-facebook.md");
                            uselessFiles.add("configure-authentication-provider-google.md");
                            uselessFiles.add("configure-authentication-provider-twitter.md");
//                            uselessFiles.add("configure-connect-to-azure-storage.md");
                    //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                            uselessFiles.add("configure-custom-container.md");
                            uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                            uselessFiles.add("configure-ssl-bindings.md");
                            uselessFiles.add("configure-ssl-certificate.md");
                            uselessFiles.add("deploy-best-practices.md");
                            uselessFiles.add("deploy-ci-cd-custom-container.md");
                            uselessFiles.add("deploy-container-github-action.md");
                            uselessFiles.add("deploy-content-sync.md");
                    //		uselessFiles.add("deploy-content-sync.md");
//                            uselessFiles.add("deploy-continuous-deployment.md");
                            uselessFiles.add("deploy-github-actions.md");
                            uselessFiles.add("manage-create-arc-environment.md");
                            uselessFiles.add("manage-custom-dns-buy-domain.md");
                    //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                            uselessFiles.add("management-addresses.md");
                            uselessFiles.add("overview-arc-integration.md");
                            uselessFiles.add("overview-diagnostics.md");
                    //		uselessFiles.add("overview-diagnostics.md");
                            uselessFiles.add("overview-manage-costs.md");
//                            uselessFiles.add("private-endpoint.md");
                            uselessFiles.add("quickstart-arc.md");
//                            uselessFiles.add("quickstart-custom-container.md");
                    //		uselessFiles.add("quickstart-custom-container.md");
                            uselessFiles.add("quickstart-multi-container.md");
                            uselessFiles.add("quickstart-nodejs-uiex.md");
                            uselessFiles.add("quickstart-wordpress.md");
                            uselessFiles.add("samples-terraform.md");
                            uselessFiles.add("tutorial-auth-aad.md");
                    //		uselessFiles.add("tutorial-auth-aad.md");
//                            uselessFiles.add("tutorial-custom-container.md");
                            uselessFiles.add("tutorial-multi-container-app.md");
                            uselessFiles.add("tutorial-send-email.md");
                            uselessFiles.add("webjobs-create.md");
                            uselessFiles.add("webjobs-create-ieux.md");
                            uselessFiles.add("webjobs-create-ieux-conceptual.md");
                            uselessFiles.add("webjobs-create-ieux-view-log.md");
                            uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                            uselessFiles.add("webjobs-sdk-get-started.md");
                            uselessFiles.add("webjobs-sdk-how-to.md");
//                            uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated. 
                            uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                            uselessFiles.add("how-to-migrate.md");
                            uselessFiles.add("migrate.md");
                            uselessFiles.add("migration-alternatives.md");
                            uselessFiles.add("networking.md");
                            uselessFiles.add("tutorial-networking-isolate-vnet.md");
                            return uselessFiles;
                    }
                }
            public static class tutorial_set_up_app_service_authentication {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                
                public synchronized static List<String> getIgnoredWords() {
                    //		ignoredWords.add("");                
                            return ignoredWords;
                        }
                        
                public static synchronized List<String[]> getWords() {
                            words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                            words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                    //		words.add(new String[] { "", "" });
                    //		words.add(new String[] { "", "" });  
                            return words;
                        }
                        
                public synchronized static List<String> getWarningWords() {	    
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("]((");
                            warningWords.add("]http");
                            warningWords.add("]/");
                            warningWords.add("Buy domain through portal");
                            warningWords.add("Buy SSL certificate through portal//need confirm");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter");
                            warningWords.add("Managed service identity//need to update"); 
                             warningWords.add("others(references of unavaiable features outside the service");
                            warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                            warningWords.add("**Add VNet (preview)**");
                            warningWords.add("**Diagnose and solve problems**"); 
                             warningWords.add("App Service Certificate");
                            warningWords.add("app service acontainer");
                            warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                            warningWords.add("Buy domain through portal"); 
                             warningWords.add("Buy SSL certificate through portal");
                            warningWords.add("Authentication with Google");
                            warningWords.add("Authentication with Facebook");
                            warningWords.add("Authentication with Twitter"); 
                              warningWords.add("Managed service identity"); 
                             warningWords.add("others(references of unavaiable features outside the service");
//                             warningWords.add("how-to-migrate.md");
//                             warningWords.add("migrate.md");
//                             warningWords.add("migration-alternatives.md");
//                             warningWords.add("networking.md");
//                             warningWords.add("tutorial-networking-isolate-vnet.md");
 
                            return warningWords;
                        }
                        
                public synchronized static List<String[]> getAttentionWords() {
                    //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                
                            return attentionWords;
                        }
                        
                public synchronized static List<String> getUselessFiles() {
                            //These files are grouped into one file
                            uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                            uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                            uselessFiles.add("app-service-app-service-environment-intro.md");
                            uselessFiles.add("app-service-app-service-environment-layered-security.md");
                            uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                            uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                            uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                            uselessFiles.add("app-service-environment-auto-scale.md");
                            uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                            uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-get-started-windows-container.md");
                            uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                            uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                            uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                            uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                    //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                            uselessFiles.add("configure-authentication-file-based.md");
                            uselessFiles.add("configure-authentication-oauth-tokens.md");
                            uselessFiles.add("configure-authentication-provider-facebook.md");
                            uselessFiles.add("configure-authentication-provider-google.md");
                            uselessFiles.add("configure-authentication-provider-twitter.md");
//                            uselessFiles.add("configure-connect-to-azure-storage.md");
                    //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                            uselessFiles.add("configure-custom-container.md");
                            uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                            uselessFiles.add("configure-ssl-bindings.md");
                            uselessFiles.add("configure-ssl-certificate.md");
                            uselessFiles.add("deploy-best-practices.md");
                            uselessFiles.add("deploy-ci-cd-custom-container.md");
                            uselessFiles.add("deploy-container-github-action.md");
                            uselessFiles.add("deploy-content-sync.md");
                    //		uselessFiles.add("deploy-content-sync.md");
//                            uselessFiles.add("deploy-continuous-deployment.md");
                            uselessFiles.add("deploy-github-actions.md");
                            uselessFiles.add("manage-create-arc-environment.md");
                            uselessFiles.add("manage-custom-dns-buy-domain.md");
                    //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                            uselessFiles.add("management-addresses.md");
                            uselessFiles.add("overview-arc-integration.md");
                            uselessFiles.add("overview-diagnostics.md");
                    //		uselessFiles.add("overview-diagnostics.md");
                            uselessFiles.add("overview-manage-costs.md");
//                            uselessFiles.add("private-endpoint.md");
                            uselessFiles.add("quickstart-arc.md");
//                            uselessFiles.add("quickstart-custom-container.md");
                    //		uselessFiles.add("quickstart-custom-container.md");
                            uselessFiles.add("quickstart-multi-container.md");
                            uselessFiles.add("quickstart-nodejs-uiex.md");
                            uselessFiles.add("quickstart-wordpress.md");
                            uselessFiles.add("samples-terraform.md");
                            uselessFiles.add("tutorial-auth-aad.md");
                    //		uselessFiles.add("tutorial-auth-aad.md");
//                            uselessFiles.add("tutorial-custom-container.md");
                            uselessFiles.add("tutorial-multi-container-app.md");
                            uselessFiles.add("tutorial-send-email.md");
                            uselessFiles.add("webjobs-create.md");
                            uselessFiles.add("webjobs-create-ieux.md");
                            uselessFiles.add("webjobs-create-ieux-conceptual.md");
                            uselessFiles.add("webjobs-create-ieux-view-log.md");
                            uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                            uselessFiles.add("webjobs-sdk-get-started.md");
                            uselessFiles.add("webjobs-sdk-how-to.md");
//                            uselessFiles.add("web-sites-integrate-with-vnet.md");20220718 This article has been translated.
                            uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                            uselessFiles.add("how-to-migrate.md");
                            uselessFiles.add("migrate.md");
                            uselessFiles.add("migration-alternatives.md");
                            uselessFiles.add("networking.md");
                            uselessFiles.add("tutorial-networking-isolate-vnet.md");
                            return uselessFiles;
                    }
                }
            public static class tutorial_dotnetcore_sqldb_app {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                    
                public synchronized static List<String> getIgnoredWords() {
                        //		ignoredWords.add("");                
                                return ignoredWords;
                            }
                            
                public static synchronized List<String[]> getWords() {
                                words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                                words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                        //		words.add(new String[] { "", "" });
                        //		words.add(new String[] { "", "" });  
                                return words;
                            }
                            
                public synchronized static List<String> getWarningWords() {	    
                                warningWords.add("app service acontainer");
                                warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                warningWords.add("]((");
                                warningWords.add("]http");
                                warningWords.add("]/");
                                warningWords.add("Buy domain through portal");
                                warningWords.add("Buy SSL certificate through portal//need confirm");
                                warningWords.add("Authentication with Google");
                                warningWords.add("Authentication with Facebook");
                                warningWords.add("Authentication with Twitter");
                                warningWords.add("Managed service identity//need to update"); 
                                 warningWords.add("others(references of unavaiable features outside the service");
                                warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                                warningWords.add("**Add VNet (preview)**");
                                warningWords.add("**Diagnose and solve problems**"); 
                                 warningWords.add("App Service Certificate");
                                warningWords.add("app service acontainer");
                                warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                warningWords.add("Buy domain through portal"); 
                                 warningWords.add("Buy SSL certificate through portal");
                                warningWords.add("Authentication with Google");
                                warningWords.add("Authentication with Facebook");
                                warningWords.add("Authentication with Twitter"); 
                                  warningWords.add("Managed service identity"); 
                                 warningWords.add("others(references of unavaiable features outside the service");
//                                 warningWords.add("how-to-migrate.md");
//                                 warningWords.add("migrate.md");
//                                 warningWords.add("migration-alternatives.md");
//                                 warningWords.add("networking.md");
//                                 warningWords.add("tutorial-networking-isolate-vnet.md");
 
                                return warningWords;
                            }
                            
                public synchronized static List<String[]> getAttentionWords() {
                        //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                    
                                return attentionWords;
                            }
                        
                public synchronized static List<String> getUselessFiles() {
                                //These files are grouped into one file
                                uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                                uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                                uselessFiles.add("app-service-app-service-environment-intro.md");
                                uselessFiles.add("app-service-app-service-environment-layered-security.md");
                                uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                                uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                                uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                                uselessFiles.add("app-service-environment-auto-scale.md");
                                uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                                uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                                uselessFiles.add("app-service-web-get-started-windows-container.md");
                                uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                                uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                                uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                                uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                                uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                        //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                                uselessFiles.add("configure-authentication-file-based.md");
                                uselessFiles.add("configure-authentication-oauth-tokens.md");
                                uselessFiles.add("configure-authentication-provider-facebook.md");
                                uselessFiles.add("configure-authentication-provider-google.md");
                                uselessFiles.add("configure-authentication-provider-twitter.md");
//                                uselessFiles.add("configure-connect-to-azure-storage.md");
                        //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                                uselessFiles.add("configure-custom-container.md");
                                uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                                uselessFiles.add("configure-ssl-bindings.md");
                                uselessFiles.add("configure-ssl-certificate.md");
                                uselessFiles.add("deploy-best-practices.md");
                                uselessFiles.add("deploy-ci-cd-custom-container.md");
                                uselessFiles.add("deploy-container-github-action.md");
                                uselessFiles.add("deploy-content-sync.md");
                        //		uselessFiles.add("deploy-content-sync.md");
//                                uselessFiles.add("deploy-continuous-deployment.md");
                                uselessFiles.add("deploy-github-actions.md");
                                uselessFiles.add("manage-create-arc-environment.md");
                                uselessFiles.add("manage-custom-dns-buy-domain.md");
                        //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                                uselessFiles.add("management-addresses.md");
                                uselessFiles.add("overview-arc-integration.md");
                                uselessFiles.add("overview-diagnostics.md");
                        //		uselessFiles.add("overview-diagnostics.md");
                                uselessFiles.add("overview-manage-costs.md");
//                                uselessFiles.add("private-endpoint.md");
                                uselessFiles.add("quickstart-arc.md");
//                                uselessFiles.add("quickstart-custom-container.md");
                        //		uselessFiles.add("quickstart-custom-container.md");
                                uselessFiles.add("quickstart-multi-container.md");
                                uselessFiles.add("quickstart-nodejs-uiex.md");
                                uselessFiles.add("quickstart-wordpress.md");
                                uselessFiles.add("samples-terraform.md");
                                uselessFiles.add("tutorial-auth-aad.md");
                        //		uselessFiles.add("tutorial-auth-aad.md");
//                                uselessFiles.add("tutorial-custom-container.md");
                                uselessFiles.add("tutorial-multi-container-app.md");
                                uselessFiles.add("tutorial-send-email.md");
                                uselessFiles.add("webjobs-create.md");
                                uselessFiles.add("webjobs-create-ieux.md");
                                uselessFiles.add("webjobs-create-ieux-conceptual.md");
                                uselessFiles.add("webjobs-create-ieux-view-log.md");
                                uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                                uselessFiles.add("webjobs-sdk-get-started.md");
                                uselessFiles.add("webjobs-sdk-how-to.md");
//                                uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                                uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                                uselessFiles.add("how-to-migrate.md");
                                uselessFiles.add("migrate.md");
                                uselessFiles.add("migration-alternatives.md");
                                uselessFiles.add("networking.md");
                                uselessFiles.add("tutorial-networking-isolate-vnet.md");
                                return uselessFiles;
                        }
                    }
            public static class tutorial_dotnet_storage_managed_identity {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                        
                public synchronized static List<String> getIgnoredWords() {
                            //		ignoredWords.add("");                
                                    return ignoredWords;
                                }
                                
                public static synchronized List<String[]> getWords() {
                                    words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                                    words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                            //		words.add(new String[] { "", "" });
                            //		words.add(new String[] { "", "" });  
                                    return words;
                                }
                                
                public synchronized static List<String> getWarningWords() {	    
                                    warningWords.add("app service acontainer");
                                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                    warningWords.add("]((");
                                    warningWords.add("]http");
                                    warningWords.add("]/");
                                    warningWords.add("Buy domain through portal");
                                    warningWords.add("Buy SSL certificate through portal//need confirm");
                                    warningWords.add("Authentication with Google");
                                    warningWords.add("Authentication with Facebook");
                                    warningWords.add("Authentication with Twitter");
                                    warningWords.add("Managed service identity//need to update"); 
                                     warningWords.add("others(references of unavaiable features outside the service");
                                    warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                                    warningWords.add("**Add VNet (preview)**");
                                    warningWords.add("**Diagnose and solve problems**"); 
                                     warningWords.add("App Service Certificate");
                                    warningWords.add("app service acontainer");
                                    warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                    warningWords.add("Buy domain through portal"); 
                                     warningWords.add("Buy SSL certificate through portal");
                                    warningWords.add("Authentication with Google");
                                    warningWords.add("Authentication with Facebook");
                                    warningWords.add("Authentication with Twitter"); 
                                      warningWords.add("Managed service identity"); 
                                     warningWords.add("others(references of unavaiable features outside the service");
//                                     warningWords.add("how-to-migrate.md");
//                                     warningWords.add("migrate.md");
//                                     warningWords.add("migration-alternatives.md");
//                                     warningWords.add("networking.md");
//                                     warningWords.add("tutorial-networking-isolate-vnet.md");

                                    return warningWords;
                                }
                                
                public synchronized static List<String[]> getAttentionWords() {
                            //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                        
                                    return attentionWords;
                                }
                                
                public synchronized static List<String> getUselessFiles() {
                                    //These files are grouped into one file
                                    uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                                    uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                                    uselessFiles.add("app-service-app-service-environment-intro.md");
                                    uselessFiles.add("app-service-app-service-environment-layered-security.md");
                                    uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                                    uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                                    uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                                    uselessFiles.add("app-service-environment-auto-scale.md");
                                    uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                                    uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                                    uselessFiles.add("app-service-web-get-started-windows-container.md");
                                    uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                                    uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                                    uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                                    uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                                    uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                            //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                    uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                                    uselessFiles.add("configure-authentication-file-based.md");
                                    uselessFiles.add("configure-authentication-oauth-tokens.md");
                                    uselessFiles.add("configure-authentication-provider-facebook.md");
                                    uselessFiles.add("configure-authentication-provider-google.md");
                                    uselessFiles.add("configure-authentication-provider-twitter.md");
//                                    uselessFiles.add("configure-connect-to-azure-storage.md");
                            //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                                    uselessFiles.add("configure-custom-container.md");
                                    uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                                    uselessFiles.add("configure-ssl-bindings.md");
                                    uselessFiles.add("configure-ssl-certificate.md");
                                    uselessFiles.add("deploy-best-practices.md");
                                    uselessFiles.add("deploy-ci-cd-custom-container.md");
                                    uselessFiles.add("deploy-container-github-action.md");
                                    uselessFiles.add("deploy-content-sync.md");
                            //		uselessFiles.add("deploy-content-sync.md");
//                                    uselessFiles.add("deploy-continuous-deployment.md");
                                    uselessFiles.add("deploy-github-actions.md");
                                    uselessFiles.add("manage-create-arc-environment.md");
                                    uselessFiles.add("manage-custom-dns-buy-domain.md");
                            //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                                    uselessFiles.add("management-addresses.md");
                                    uselessFiles.add("overview-arc-integration.md");
                                    uselessFiles.add("overview-diagnostics.md");
                            //		uselessFiles.add("overview-diagnostics.md");
                                    uselessFiles.add("overview-manage-costs.md");
//                                    uselessFiles.add("private-endpoint.md");
                                    uselessFiles.add("quickstart-arc.md");
//                                    uselessFiles.add("quickstart-custom-container.md");
                            //		uselessFiles.add("quickstart-custom-container.md");
                                    uselessFiles.add("quickstart-multi-container.md");
                                    uselessFiles.add("quickstart-nodejs-uiex.md");
                                    uselessFiles.add("quickstart-wordpress.md");
                                    uselessFiles.add("samples-terraform.md");
                                    uselessFiles.add("tutorial-auth-aad.md");
                            //		uselessFiles.add("tutorial-auth-aad.md");
//                                    uselessFiles.add("tutorial-custom-container.md");
                                    uselessFiles.add("tutorial-multi-container-app.md");
                                    uselessFiles.add("tutorial-send-email.md");
                                    uselessFiles.add("webjobs-create.md");
                                    uselessFiles.add("webjobs-create-ieux.md");
                                    uselessFiles.add("webjobs-create-ieux-conceptual.md");
                                    uselessFiles.add("webjobs-create-ieux-view-log.md");
                                    uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                                    uselessFiles.add("webjobs-sdk-get-started.md");
                                    uselessFiles.add("webjobs-sdk-how-to.md");
//                                    uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                                    uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                                    uselessFiles.add("how-to-migrate.md");
                                    uselessFiles.add("migrate.md");
                                    uselessFiles.add("migration-alternatives.md");
                                    uselessFiles.add("networking.md");
                                    uselessFiles.add("tutorial-networking-isolate-vnet.md");
                                    return uselessFiles;
                            }
                        }
            public static class tutorial_microsoft_graph_as_app {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                            
                public synchronized static List<String> getIgnoredWords() {
                                //		ignoredWords.add("");                
                                        return ignoredWords;
                                    }
                                    
                public static synchronized List<String[]> getWords() {
                                        words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                                        words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                                //		words.add(new String[] { "", "" });
                                //		words.add(new String[] { "", "" });  
                                        return words;
                                    }
                                    
                public synchronized static List<String> getWarningWords() {	    
                                        warningWords.add("app service acontainer");
                                        warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                        warningWords.add("]((");
                                        warningWords.add("]http");
                                        warningWords.add("]/");
                                        warningWords.add("Buy domain through portal");
                                        warningWords.add("Buy SSL certificate through portal//need confirm");
                                        warningWords.add("Authentication with Google");
                                        warningWords.add("Authentication with Facebook");
                                        warningWords.add("Authentication with Twitter");
                                        warningWords.add("Managed service identity//need to update"); 
                                         warningWords.add("others(references of unavaiable features outside the service");
                                        warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                                        warningWords.add("**Add VNet (preview)**");
                                        warningWords.add("**Diagnose and solve problems**"); 
                                         warningWords.add("App Service Certificate");
                                        warningWords.add("app service acontainer");
                                        warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                        warningWords.add("Buy domain through portal"); 
                                         warningWords.add("Buy SSL certificate through portal");
                                        warningWords.add("Authentication with Google");
                                        warningWords.add("Authentication with Facebook");
                                        warningWords.add("Authentication with Twitter"); 
                                          warningWords.add("Managed service identity"); 
                                         warningWords.add("others(references of unavaiable features outside the service");
//                                         warningWords.add("how-to-migrate.md");
//                                         warningWords.add("migrate.md");
//                                         warningWords.add("migration-alternatives.md");
//                                         warningWords.add("networking.md");
//                                         warningWords.add("tutorial-networking-isolate-vnet.md");

                                        return warningWords;
                                    }
                                    
                public synchronized static List<String[]> getAttentionWords() {
                                //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                            
                                        return attentionWords;
                                    }
                                    
                public synchronized static List<String> getUselessFiles() {
                                        //These files are grouped into one file
                                        uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                                        uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                                        uselessFiles.add("app-service-app-service-environment-intro.md");
                                        uselessFiles.add("app-service-app-service-environment-layered-security.md");
                                        uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                                        uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                                        uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                                        uselessFiles.add("app-service-environment-auto-scale.md");
                                        uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                                        uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-get-started-windows-container.md");
                                        uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                                        uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                                        uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                        uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                                        uselessFiles.add("configure-authentication-file-based.md");
                                        uselessFiles.add("configure-authentication-oauth-tokens.md");
                                        uselessFiles.add("configure-authentication-provider-facebook.md");
                                        uselessFiles.add("configure-authentication-provider-google.md");
                                        uselessFiles.add("configure-authentication-provider-twitter.md");
//                                        uselessFiles.add("configure-connect-to-azure-storage.md");
                                //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                                        uselessFiles.add("configure-custom-container.md");
                                        uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                                        uselessFiles.add("configure-ssl-bindings.md");
                                        uselessFiles.add("configure-ssl-certificate.md");
                                        uselessFiles.add("deploy-best-practices.md");
                                        uselessFiles.add("deploy-ci-cd-custom-container.md");
                                        uselessFiles.add("deploy-container-github-action.md");
                                        uselessFiles.add("deploy-content-sync.md");
                                //		uselessFiles.add("deploy-content-sync.md");
//                                        uselessFiles.add("deploy-continuous-deployment.md");
                                        uselessFiles.add("deploy-github-actions.md");
                                        uselessFiles.add("manage-create-arc-environment.md");
                                        uselessFiles.add("manage-custom-dns-buy-domain.md");
                                //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                                        uselessFiles.add("management-addresses.md");
                                        uselessFiles.add("overview-arc-integration.md");
                                        uselessFiles.add("overview-diagnostics.md");
                                //		uselessFiles.add("overview-diagnostics.md");
                                        uselessFiles.add("overview-manage-costs.md");
//                                        uselessFiles.add("private-endpoint.md");
                                        uselessFiles.add("quickstart-arc.md");
//                                        uselessFiles.add("quickstart-custom-container.md");
                                //		uselessFiles.add("quickstart-custom-container.md");
                                        uselessFiles.add("quickstart-multi-container.md");
                                        uselessFiles.add("quickstart-nodejs-uiex.md");
                                        uselessFiles.add("quickstart-wordpress.md");
                                        uselessFiles.add("samples-terraform.md");
                                        uselessFiles.add("tutorial-auth-aad.md");
                                //		uselessFiles.add("tutorial-auth-aad.md");
//                                        uselessFiles.add("tutorial-custom-container.md");
                                        uselessFiles.add("tutorial-multi-container-app.md");
                                        uselessFiles.add("tutorial-send-email.md");
                                        uselessFiles.add("webjobs-create.md");
                                        uselessFiles.add("webjobs-create-ieux.md");
                                        uselessFiles.add("webjobs-create-ieux-conceptual.md");
                                        uselessFiles.add("webjobs-create-ieux-view-log.md");
                                        uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                                        uselessFiles.add("webjobs-sdk-get-started.md");
                                        uselessFiles.add("webjobs-sdk-how-to.md");
//                                        uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                                        uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                                        uselessFiles.add("how-to-migrate.md");
                                        uselessFiles.add("migrate.md");
                                        uselessFiles.add("migration-alternatives.md");
                                        uselessFiles.add("networking.md");
                                        uselessFiles.add("tutorial-networking-isolate-vnet.md");
                                        return uselessFiles;
                                }
                            }
            public static class tutorial_nodejs_mongodb_app {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                            
                public synchronized static List<String> getIgnoredWords() {
                                //		ignoredWords.add("");                
                                        return ignoredWords;
                                    }
                                    
                public static synchronized List<String[]> getWords() {
                                        words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                                        words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                                //		words.add(new String[] { "", "" });
                                //		words.add(new String[] { "", "" });  
                                        return words;
                                    }
                                    
                public synchronized static List<String> getWarningWords() {	    
                                        warningWords.add("app service acontainer");
                                        warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                        warningWords.add("]((");
                                        warningWords.add("]http");
                                        warningWords.add("]/");
                                        warningWords.add("Buy domain through portal");
                                        warningWords.add("Buy SSL certificate through portal//need confirm");
                                        warningWords.add("Authentication with Google");
                                        warningWords.add("Authentication with Facebook");
                                        warningWords.add("Authentication with Twitter");
                                        warningWords.add("Managed service identity//need to update"); 
                                         warningWords.add("others(references of unavaiable features outside the service");
                                        warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                                        warningWords.add("**Add VNet (preview)**");
                                        warningWords.add("**Diagnose and solve problems**"); 
                                         warningWords.add("App Service Certificate");
                                        warningWords.add("app service acontainer");
                                        warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                        warningWords.add("Buy domain through portal"); 
                                         warningWords.add("Buy SSL certificate through portal");
                                        warningWords.add("Authentication with Google");
                                        warningWords.add("Authentication with Facebook");
                                        warningWords.add("Authentication with Twitter"); 
                                          warningWords.add("Managed service identity"); 
                                         warningWords.add("others(references of unavaiable features outside the service");
//                                         warningWords.add("how-to-migrate.md");
//                                         warningWords.add("migrate.md");
//                                         warningWords.add("migration-alternatives.md");
//                                         warningWords.add("networking.md");
//                                         warningWords.add("tutorial-networking-isolate-vnet.md");

                                        return warningWords;
                                    }
                                    
                public synchronized static List<String[]> getAttentionWords() {
                                //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                            
                                        return attentionWords;
                                    }
                                    
                public synchronized static List<String> getUselessFiles() {
                                        //These files are grouped into one file
                                        uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                                        uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                                        uselessFiles.add("app-service-app-service-environment-intro.md");
                                        uselessFiles.add("app-service-app-service-environment-layered-security.md");
                                        uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                                        uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                                        uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                                        uselessFiles.add("app-service-environment-auto-scale.md");
                                        uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                                        uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-get-started-windows-container.md");
                                        uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                                        uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                                        uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                        uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                                        uselessFiles.add("configure-authentication-file-based.md");
                                        uselessFiles.add("configure-authentication-oauth-tokens.md");
                                        uselessFiles.add("configure-authentication-provider-facebook.md");
                                        uselessFiles.add("configure-authentication-provider-google.md");
                                        uselessFiles.add("configure-authentication-provider-twitter.md");

                                //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                                        uselessFiles.add("configure-custom-container.md");
                                        uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                                        uselessFiles.add("configure-ssl-bindings.md");
                                        uselessFiles.add("configure-ssl-certificate.md");
                                        uselessFiles.add("deploy-best-practices.md");
                                        uselessFiles.add("deploy-ci-cd-custom-container.md");
                                        uselessFiles.add("deploy-container-github-action.md");
                                        uselessFiles.add("deploy-content-sync.md");
                                //		uselessFiles.add("deploy-content-sync.md");
//                                        uselessFiles.add("deploy-continuous-deployment.md");
                                        uselessFiles.add("deploy-github-actions.md");
                                        uselessFiles.add("manage-create-arc-environment.md");
                                        uselessFiles.add("manage-custom-dns-buy-domain.md");
                                //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                                        uselessFiles.add("management-addresses.md");
                                        uselessFiles.add("overview-arc-integration.md");
                                        uselessFiles.add("overview-diagnostics.md");
                                //		uselessFiles.add("overview-diagnostics.md");
                                        uselessFiles.add("overview-manage-costs.md");
//                                        uselessFiles.add("private-endpoint.md");
                                        uselessFiles.add("quickstart-arc.md");
//                                        uselessFiles.add("quickstart-custom-container.md");
                                //		uselessFiles.add("quickstart-custom-container.md");
                                        uselessFiles.add("quickstart-multi-container.md");
                                        uselessFiles.add("quickstart-nodejs-uiex.md");
                                        uselessFiles.add("quickstart-wordpress.md");
                                        uselessFiles.add("samples-terraform.md");
                                        uselessFiles.add("tutorial-auth-aad.md");
                                //		uselessFiles.add("tutorial-auth-aad.md");
//                                        uselessFiles.add("tutorial-custom-container.md");
                                        uselessFiles.add("tutorial-multi-container-app.md");
                                        uselessFiles.add("tutorial-send-email.md");
                                        uselessFiles.add("webjobs-create.md");
                                        uselessFiles.add("webjobs-create-ieux.md");
                                        uselessFiles.add("webjobs-create-ieux-conceptual.md");
                                        uselessFiles.add("webjobs-create-ieux-view-log.md");
                                        uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                                        uselessFiles.add("webjobs-sdk-get-started.md");
                                        uselessFiles.add("webjobs-sdk-how-to.md");
//                                        uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                                        uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                                        uselessFiles.add("how-to-migrate.md");
                                        uselessFiles.add("migrate.md");
                                        uselessFiles.add("migration-alternatives.md");
                                        uselessFiles.add("networking.md");
                                        uselessFiles.add("tutorial-networking-isolate-vnet.md");
                                        return uselessFiles;
                                }
                            }
            public static class tutorial_python_postgresql_app {
                private static final List<String[]> words = new ArrayList<String[]>();
                private static final List<String> warningWords = new ArrayList<String>();
                private static final List<String[]> attentionWords = new ArrayList<String[]>();
                private static final List<String> uselessFiles = new ArrayList<String>();
                private static final List<String> ignoredWords = new ArrayList<String>();
                            
                public synchronized static List<String> getIgnoredWords() {
                                //		ignoredWords.add("");                
                                        return ignoredWords;
                                    }
                                    
                public static synchronized List<String[]> getWords() {
                                        words.add(new String[] { ".azurewebsites.net",  ".chinacloudsites.cn" });
                                        words.add(new String[] { ".ftp.chinacloudsites.chinacloudapi.cn",  ".ftp.chinacloudsites.chinacloudapi.cn" });
                                //		words.add(new String[] { "", "" });
                                //		words.add(new String[] { "", "" });  
                                        return words;
                                    }
                                    
                public synchronized static List<String> getWarningWords() {	    
                                        warningWords.add("app service acontainer");
                                        warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                        warningWords.add("]((");
                                        warningWords.add("]http");
                                        warningWords.add("]/");
                                        warningWords.add("Buy domain through portal");
                                        warningWords.add("Buy SSL certificate through portal//need confirm");
                                        warningWords.add("Authentication with Google");
                                        warningWords.add("Authentication with Facebook");
                                        warningWords.add("Authentication with Twitter");
                                        warningWords.add("Managed service identity//need to update"); 
                                         warningWords.add("others(references of unavaiable features outside the service");
                                        warningWords.add("Azure Resource Explorer(https://resources.azure.com");
                                        warningWords.add("**Add VNet (preview)**");
                                        warningWords.add("**Diagnose and solve problems**"); 
                                         warningWords.add("App Service Certificate");
                                        warningWords.add("app service acontainer");
                                        warningWords.add("CD/CI(continuous deployment/Continuous Integration) with limitation");
                                        warningWords.add("Buy domain through portal"); 
                                         warningWords.add("Buy SSL certificate through portal");
                                        warningWords.add("Authentication with Google");
                                        warningWords.add("Authentication with Facebook");
                                        warningWords.add("Authentication with Twitter"); 
                                          warningWords.add("Managed service identity"); 
                                         warningWords.add("others(references of unavaiable features outside the service");
//                                         warningWords.add("how-to-migrate.md");
//                                         warningWords.add("migrate.md");
//                                         warningWords.add("migration-alternatives.md");
//                                         warningWords.add("networking.md");
//                                         warningWords.add("tutorial-networking-isolate-vnet.md");

                                        return warningWords;
                                    }
                                    
                public synchronized static List<String[]> getAttentionWords() {
                                //		attentionWords.add(new String[]{"functions-sign-in-vs-code.md",                       "定制过不要改！"}); // azure-functions
                            
                                        return attentionWords;
                                    }
                                    
                public synchronized static List<String> getUselessFiles() {
                                        //These files are grouped into one file
                                        uselessFiles.add("app-service-app-service-environment-control-inbound-traffic.md");
                                        uselessFiles.add("app-service-app-service-environment-create-ilb-ase-resourcemanager.md");
                                        uselessFiles.add("app-service-app-service-environment-intro.md");
                                        uselessFiles.add("app-service-app-service-environment-layered-security.md");
                                        uselessFiles.add("app-service-app-service-environment-network-architecture-overview.md");
                                        uselessFiles.add("app-service-app-service-environment-network-configuration-expressroute.md");
                                        uselessFiles.add("app-service-app-service-environment-securely-connecting-to-backend-resources.md");
                                        uselessFiles.add("app-service-environment-auto-scale.md");
                                        uselessFiles.add("app-service-environment-with-internal-load-balancer.md");
                                        uselessFiles.add("app-service-web-configure-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-get-started-windows-container.md");
                                        uselessFiles.add("app-service-web-how-to-create-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-how-to-create-a-web-app-in-an-ase.md");
                                        uselessFiles.add("app-service-web-scale-a-web-app-in-an-app-service-environment.md");
                                        uselessFiles.add("app-service-web-tutorial-auth-aad.md");
                                        uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                //		uselessFiles.add("app-service-web-tutorial-windows-containers-custom-fonts.md");
                                        uselessFiles.add("configure-authentication-customize-sign-in-out.md");
                                        uselessFiles.add("configure-authentication-file-based.md");
                                        uselessFiles.add("configure-authentication-oauth-tokens.md");
                                        uselessFiles.add("configure-authentication-provider-facebook.md");
                                        uselessFiles.add("configure-authentication-provider-google.md");
                                        uselessFiles.add("configure-authentication-provider-twitter.md");
                                      // 
//                                      this file is useless before, it seems to be available now, but it's not me to commit to ACN. 
                                //		uselessFiles.add("configure-connect-to-azure-storage.md");
//                                      this file is useless before, it seems to be available now, but it's not me to commit to ACN. 
//                                        uselessFiles.add("configure-custom-container.md");
                                        uselessFiles.add("configure-encrypt-at-rest-using-cmk.md");
//                                        uselessFiles.add("configure-ssl-bindings.md");
                                        uselessFiles.add("configure-ssl-certificate.md");
                                        uselessFiles.add("deploy-best-practices.md");
                                        uselessFiles.add("deploy-ci-cd-custom-container.md");
                                        uselessFiles.add("deploy-container-github-action.md");
                                        uselessFiles.add("deploy-content-sync.md");
//                                      this file is useless before, it seems to be available now, but it's not me to commit to ACN. 
//                                        uselessFiles.add("deploy-continuous-deployment.md");
                                        uselessFiles.add("deploy-github-actions.md");
                                        uselessFiles.add("manage-create-arc-environment.md");
                                        uselessFiles.add("manage-custom-dns-buy-domain.md");
                                //		uselessFiles.add("manage-custom-dns-buy-domain.md");
                                        uselessFiles.add("management-addresses.md");
                                        uselessFiles.add("overview-arc-integration.md");
                                        uselessFiles.add("overview-diagnostics.md");
                                //		uselessFiles.add("overview-diagnostics.md");
                                        uselessFiles.add("overview-manage-costs.md");
//                                        uselessFiles.add("private-endpoint.md");
                                        uselessFiles.add("quickstart-arc.md");
//                                        uselessFiles.add("quickstart-custom-container.md");
                                //		uselessFiles.add("quickstart-custom-container.md");
                                        uselessFiles.add("quickstart-multi-container.md");
                                        uselessFiles.add("quickstart-nodejs-uiex.md");
                                        uselessFiles.add("quickstart-wordpress.md");
                                        uselessFiles.add("samples-terraform.md");
                                        uselessFiles.add("tutorial-auth-aad.md");
                                //		uselessFiles.add("tutorial-auth-aad.md");
//                                        uselessFiles.add("tutorial-custom-container.md");
                                        uselessFiles.add("tutorial-multi-container-app.md");
                                        uselessFiles.add("tutorial-send-email.md");
                                        uselessFiles.add("webjobs-create.md");
                                        uselessFiles.add("webjobs-create-ieux.md");
                                        uselessFiles.add("webjobs-create-ieux-conceptual.md");
                                        uselessFiles.add("webjobs-create-ieux-view-log.md");
                                        uselessFiles.add("webjobs-dotnet-deploy-vs.md");
                                        uselessFiles.add("webjobs-sdk-get-started.md");
                                        uselessFiles.add("webjobs-sdk-how-to.md");
//                                        uselessFiles.add("web-sites-integrate-with-vnet.md"); 20220718 This article has been translated.
                                        uselessFiles.add("web-sites-purchase-ssl-web-site.md");
                                        uselessFiles.add("how-to-migrate.md");
                                        uselessFiles.add("migrate.md");
                                        uselessFiles.add("migration-alternatives.md");
                                        uselessFiles.add("networking.md");
                                        uselessFiles.add("tutorial-networking-isolate-vnet.md");
                                        return uselessFiles;
                                }
                            }
        }
	
}
	

