package customization.support;

import java.util.ArrayList;
import java.util.List;

public class WordsSupport {

	private static final List<String[]> words = new ArrayList<String[]>(200);
	
	public static final List<String[]> getWords() {
		return words;
	}
	
	public synchronized static void setWords() {
		// 09/09/2021, replace special space to en half space.
		words.add(new String[] { " ",   " " });
		// 09/09/2021, replace full space to en half space.
		words.add(new String[] { "　",   " " });
		
		words.add(new String[] { "Windows azure",   "Azure" });
		words.add(new String[] { "Windows Azure",   "Azure" });
		words.add(new String[] { "windows azure",   "azure" });

		words.add(new String[] { "Microsoft azure",   "Azure" });
		words.add(new String[] { "Microsoft Azure",   "Azure" });
		words.add(new String[] { "microsoft azure",   "azure" });

		words.add(new String[] { "zh-CN",   "zh-cn" });
		
		words.add(new String[] { "https://ssprsbprodncu-sb.accesscontrol.windows.net",   "https://login.partner.microsoftonline.cn" });
		
		words.add(new String[] { "portal.Azure.com",               "portal.azure.cn" });
		words.add(new String[] { "portal.azure.com",               "portal.azure.cn" });
		words.add(new String[] { "windowsazure.com",               "azure.cn" });
		words.add(new String[] { "management.azure.com",           "management.chinacloudapi.cn" });
		words.add(new String[] { "login.windows.net",              "login.chinacloudapi.cn" });
		words.add(new String[] { "database.windows.net",           "database.chinacloudapi.cn" });
		words.add(new String[] { "database.azure.com",             "database.chinacloudapi.cn" });
		
		words.add(new String[] { "Microsoft Power BI",             "Power BI" });
		words.add(new String[] { "microsoft Power BI",             "Power BI" });
		words.add(new String[] { "Microsoft power BI",             "Power BI" });
		words.add(new String[] { "Microsoft power bi",             "Power BI" });

		words.add(new String[] { "azure.net",                      "chinacloudapi.cn" });
		words.add(new String[] { "cloudapp.net",                   "chinacloudapp.cn" });
		words.add(new String[] { "windows.net",                    "chinacloudapi.cn" });
		words.add(new String[] { "azurewebsites.net",              "chinacloudsites.cn" });
		words.add(new String[] { "azurewebsites.NET",              "chinacloudsites.cn" });
		words.add(new String[] { "azurehdinsight.net",             "azurehdinsight.cn" });
		words.add(new String[] { "trafficmanager.net",             "trafficmanager.cn" });
		words.add(new String[] { "onmicrosoft.com",                "partner.onmschina.cn" });
		words.add(new String[] { "OnMicrosoft.com",                "partner.onmschina.cn" });
		words.add(new String[] { "Onmicrosoft.com",                "partner.onmschina.cn" });
		words.add(new String[] { "onMicrosoft.com",                "partner.onmschina.cn" });

		// ------------------------- 
		words.add(new String[] { "http://azure.microsoft.com/en-us/downloads",       "/downloads" });
		words.add(new String[] { "http://azure.microsoft.com/downloads",             "/downloads" });
		words.add(new String[] { "https://azure.microsoft.com/en-us/downloads",      "/downloads" });
		words.add(new String[] { "https://azure.microsoft.com/downloads",            "/downloads" });
		// ------------------------- 

		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=214468",        "https://msdn.microsoft.com/en-us/library/dd264915.aspx" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/p/?LinkId=623012",      "/vs-azure-tools-publishing-a-cloud-service" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/p/?LinkId=623041",      "/vs-azure-tools-debugging-cloud-services-overview" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/p/?LinkId=623050",      "/vs-azure-tools-performance-profiling-cloud-services" });
		words.add(new String[] { "https://go.microsoft.com/fwlink/p/?LinkID=525040",     "https://portal.azure.cn" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/p/?LinkId=400450",      "/cloud-services/cloud-services-dotnet-diagnostics" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=623016",        "/vs-azure-tools-intellitrace-debug-published-cloud-services" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=260560",        "/service-bus-messaging/service-bus-dotnet-get-started-with-queues" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=239540",        "/downloads" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=251796",        "/cloud-services/cloud-services-continuous-delivery-use-vso" });
		words.add(new String[] { "http://go.microsoft.com/?linkid=9862595",              "/sql-database/sql-database-elastic-scale-shard-map-management" });

		words.add(new String[] { "/develop/nodejs/tutorials/website-using-socketio",               "/app-service-web/web-sites-nodejs-chat-app-socketio" });
		words.add(new String[] { "/develop/nodejs/tutorials/getting-started",                      "/cloud-services/cloud-services-nodejs-develop-deploy-app" });
		words.add(new String[] { "/manage/services/storage/how-to-manage-a-storage-account",       "/storage/storage-manage-storage-account" });
		words.add(new String[] { "install-configure-powershell",                                   "powershell-install-configure " }); // install-configure-powershell is redirected to powershell-install...
		words.add(new String[] { "sql-database-create-assembly-on-azure-with-csharp",              "sql-database-transact-sql-information" }); // same with above

		words.add(new String[] { "http://php.net/manual/en/function.sqlsrv-fetch-array.php",       "http://php.net/manual/zh/function.sqlsrv-fetch-array.php" });

		// ---------------------- 
		words.add(new String[] { "http://azure.microsoft.com/develop/net/how-to-guides/blob-storage",          "/storage/storage-dotnet-how-to-use-blobs" });
		words.add(new String[] { "http://azure.microsoft.com/develop/net",                                     "/develop/net" });
		words.add(new String[] { "http://azure.microsoft.com/develop/nodejs/tutorials/web-app-with-express",   "/cloud-services/cloud-services-nodejs-develop-deploy-express-app" });
		words.add(new String[] { "http://azure.microsoft.com/develop/nodejs",                                  "/develop/nodejs" });
		words.add(new String[] { "http://azure.microsoft.com/develop/iot",                                     "/develop/iot" });

		words.add(new String[] { "https://azure.microsoft.com/develop/net/how-to-guides/blob-storage",          "/storage/storage-dotnet-how-to-use-blobs" });
		words.add(new String[] { "https://azure.microsoft.com/develop/net",                                     "/develop/net" });
		words.add(new String[] { "https://azure.microsoft.com/develop/nodejs/tutorials/web-app-with-express",   "/cloud-services/cloud-services-nodejs-develop-deploy-express-app" });
		words.add(new String[] { "https://azure.microsoft.com/develop/nodejs",                                  "/develop/nodejs" });
		words.add(new String[] { "https://azure.microsoft.com/develop/iot",                                     "/develop/iot" });
		words.add(new String[] { "https://azure.microsoft.com/develop/python",                                  "/develop/python" });

		// ---------------------- 
		words.add(new String[] { "https://msdn.microsoft.com/library/windowsazure/gg551722.aspx",      "/cloud-services/cloud-services-certs-create" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn205161.aspx",                   "/service-bus-messaging/service-bus-sas" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/jj721951.aspx",             "/storage/storage-manage-access-to-resources" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn520246.aspx",             "/service-bus-messaging/service-bus-partitioning" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/hh528527.aspx",             "/service-bus-messaging/service-bus-performance-improvements" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn170477.aspx",                   "/service-bus-messaging/service-bus-sas" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/gg433048.aspx",             "/cloud-services/cloud-services-dotnet-diagnostics" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/ee336281.aspx",              "/sql-database/sql-database-transact-sql-information" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/ee336281.aspx",             "/sql-database/sql-database-transact-sql-information" });
		words.add(new String[] { "http://msdn.microsoft.com/library/windowsazure/ff394114.aspx",       "/sql-database/sql-database-monitoring-with-dmvs" });
		words.add(new String[] { "https://msdn.microsoft.com/library/windowsazure/ff394114.aspx",      "/sql-database/sql-database-monitoring-with-dmvs" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn741330.aspx",              "/sql-database/sql-database-web-business-sunset-faq" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn741330.aspx",             "/sql-database/sql-database-web-business-sunset-faq" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn758204.aspx",              "/sql-database/sql-database-business-continuity-design" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn758204.aspx",             "/sql-database/sql-database-business-continuity-design" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn741339.aspx",              "/sql-database/sql-database-geo-replication-overview" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn741339.aspx",             "/sql-database/sql-database-geo-replication-overview" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn741323.aspx",              "/sql-database/sql-database-disaster-recovery" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn741323.aspx",             "/sql-database/sql-database-disaster-recovery" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/jj650016.aspx",              "/sql-database/sql-database-business-continuity" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/jj650016.aspx",             "/sql-database/sql-database-business-continuity" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/ee336245.aspx",              "/sql-database/sql-database-general-limitations" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/ee336245.aspx",             "/sql-database/sql-database-general-limitations" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/hh852669.aspx",              "/sql-database/sql-database-business-continuity" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/hh852669.aspx",             "/sql-database/sql-database-business-continuity" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn495641.aspx",              "/sql-database/sql-database-elastic-scale-introduction" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn495641.aspx",             "/sql-database/sql-database-elastic-scale-introduction" });

		words.add(new String[] { "http://msdn.microsoft.com/library/azure/gg456327.aspx",   "/cloud-services/cloud-services-startup-tasks" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/gg456327.aspx",   "/cloud-services/cloud-services-startup-tasks" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/ee336235.aspx",   "/sql-database/sql-database-manage-logins" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/ee336235.aspx",   "/sql-database/sql-database-manage-logins" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn879147.aspx",   "/automation/automation-testing-runbook" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn879147.aspx",   "/automation/automation-testing-runbook" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn857355.aspx",   "/automation/automation-child-runbooks" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn857355.aspx",   "/automation/automation-child-runbooks" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/p/?linkid=615099",          "/vpn-gateway/vpn-gateway-about-vpn-devices" });
		words.add(new String[] { "https://go.microsoft.com/fwlink/p/?linkid=615099",         "/vpn-gateway/vpn-gateway-about-vpn-devices" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/ff951633.aspx",   "/sql-database/sql-database-develop-dotnet-simple" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/ff951633.aspx",   "/sql-database/sql-database-develop-dotnet-simple" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/jj156143.aspx",   "/virtual-machines/virtual-machines-windows-about" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/jj156143.aspx",   "/virtual-machines/virtual-machines-windows-about" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/ee621782.aspx",   "/sql-database/sql-database-firewall-configure" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/ee621782.aspx",   "/sql-database/sql-database-firewall-configure" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=390226",            "/app-service-web/websites-webjobs-resources" });
		words.add(new String[] { "https://go.microsoft.com/fwlink/?LinkId=390226",           "/app-service-web/websites-webjobs-resources" });
		words.add(new String[] { "http://msdn.microsoft.com/library/ee621782",               "/sql-database/sql-database-firewall-configure" });
		words.add(new String[] { "https://msdn.microsoft.com/library/ee621782",                      "/sql-database/sql-database-firewall-configure" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/ff394108#encryption",      "/sql-database/sql-database-security-guidelines" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/ff394108#encryption",     "/sql-database/sql-database-security-guidelines" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/ff394114.aspx",            "/sql-database/sql-database-monitoring-with-dmvs" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/ff394114.aspx",           "/sql-database/sql-database-monitoring-with-dmvs" });
		words.add(new String[] { "http://msdn.microsoft.com/library/ee336235.aspx#DatabasePerms",    "/sql-database/sql-database-manage-logins" });
		words.add(new String[] { "https://msdn.microsoft.com/library/ee336235.aspx#DatabasePerms",   "/sql-database/sql-database-manage-logins" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn781422.aspx",            "/automation/automation-runbook-gallery" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn781422.aspx",           "/automation/automation-runbook-gallery" });
		words.add(new String[] { "http://msdn.microsoft.com/library/dn643637.aspx",                  "/automation/automation-creating-importing-runbook" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn643637.aspx",                 "/automation/automation-creating-importing-runbook" });
		words.add(new String[] { "http://msdn.microsoft.com/library/dn940012.aspx",                  "/automation/automation-variables" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn940012.aspx",                 "/automation/automation-variables" });
		words.add(new String[] { "http://msdn.microsoft.com/library/dn940015.aspx",                  "/automation/automation-credentials" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn940015.aspx",                 "/automation/automation-credentials" });
		words.add(new String[] { "http://msdn.microsoft.com/library/dn781422.aspx",                  "/automation/automation-runbook-gallery" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn781422.aspx",                 "/automation/automation-runbook-gallery" });
		words.add(new String[] { "http://msdn.microsoft.com/library/dn879148.aspx",                  "/automation/automation-runbook-output-and-messages" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn879148.aspx",                 "/automation/automation-runbook-output-and-messages" });
		words.add(new String[] { "http://msdn.microsoft.com/library/dn643637.aspx",                  "/automation/automation-creating-importing-runbook" });
		words.add(new String[] { "https://msdn.microsoft.com/library/dn643637.aspx",                 "/automation/automation-creating-importing-runbook" });
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn940016.aspx",            "/automation/automation-schedules" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn940016.aspx",           "/automation/automation-schedules" });
		
		words.add(new String[] { "http://msdn.microsoft.com/library/hh124108",    "/cloud-services/cloud-services-model-and-package" });
		words.add(new String[] { "https://msdn.microsoft.com/library/hh124108",   "/cloud-services/cloud-services-model-and-package" });
		
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn195592.aspx",   "/active-directory/develop/active-directory-federation-metadata" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn645541.aspx",   "/active-directory/develop/active-directory-protocols-openid-connect-code" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn195591.aspx",   "/active-directory/develop/active-directory-saml-protocol-reference" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn903702.aspx",   "/active-directory/develop/active-directory-developers-guide" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn641920.aspx",   "/active-directory/develop/active-directory-signing-key-rollover" });


		words.add(new String[] { "http://azure.microsoft.com/pricing/license-mobility",                     "https://www.azure.cn/pricing/license-mobility" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/sql-database",                 "https://www.azure.cn/pricing/details/sql-database" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/virtual-machines/#windows",    "https://www.azure.cn/pricing/details/virtual-machines/#windows" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/virtual-machines/#sql",        "https://www.azure.cn/pricing/details/virtual-machines/#sql" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/virtual-machines",             "https://www.azure.cn/pricing/details/virtual-machines" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/service-bus",                  "https://www.azure.cn/pricing/details/messaging" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/calculator",                           "https://www.azure.cn/pricing/calculator" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/application-gateway",          "https://www.azure.cn/pricing/details/application-gateway" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/free-trial",                           "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/cloud-services",               "https://www.azure.cn/pricing/details/cloud-services" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/storage",                      "https://www.azure.cn/pricing/details/storage" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/key-vault",                    "https://www.azure.cn/pricing/details/key-vault" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/automation",                   "https://www.azure.cn/pricing/details/automation" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/batch",                       "https://www.azure.cn/pricing/details/batch" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/backup",                      "https://www.azure.cn/pricing/details/backup" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/app-service",                 "https://www.azure.cn/pricing/details/app-service" });
		words.add(new String[] { "https://azure.microsoft.com/en-us/pricing/details/app-service",           "https://www.azure.cn/pricing/details/app-service" });

		words.add(new String[] { "http://azure.microsoft.com/pricing/details/active-directory",               "https://www.azure.cn/pricing/details/active-directory" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/active-directory",              "https://www.azure.cn/pricing/details/active-directory" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/license-mobility",                      "https://www.azure.cn/pricing/license-mobility" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/sql-database",                  "https://www.azure.cn/pricing/details/sql-database" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/virtual-machines/#windows",     "https://www.azure.cn/pricing/details/virtual-machines/#windows" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/virtual-machines/#sql",         "https://www.azure.cn/pricing/details/virtual-machines/#SQL" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/virtual-machines",              "https://www.azure.cn/pricing/details/virtual-machines" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/service-bus",                   "https://www.azure.cn/pricing/details/messaging" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/calculator",                            "https://www.azure.cn/pricing/calculator" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/application-gateway",           "https://www.azure.cn/pricing/details/application-gateway" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/free-trial",                            "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/multi-factor-authentication",    "https://www.azure.cn/pricing/details/multi-factor-authentication" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/multi-factor-authentication",   "https://www.azure.cn/pricing/details/multi-factor-authentication" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/cloud-services",                "https://www.azure.cn/pricing/details/cloud-services" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/storage",                       "https://www.azure.cn/pricing/details/storage" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/key-vault",                     "https://www.azure.cn/pricing/details/key-vault" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/automation",                    "https://www.azure.cn/pricing/details/automation" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/documentdb",                    "https://www.azure.cn/pricing/details/documentdb" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/vpn-gateway",                   "https://www.azure.cn/pricing/details/vpn-gateway" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/vpn-gateway",                    "https://www.azure.cn/pricing/details/vpn-gateway" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/expressroute",                  "https://www.azure.cn/pricing/details/expressroute" });
		words.add(new String[] { "http://azure.microsoft.com/pricing/details/expressroute",                   "https://www.azure.cn/pricing/details/expressroute" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/functions",                     "https://www.azure.cn/pricing/details/azure-functions" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=760527",                             "https://www.azure.cn/pricing/details/power-bi-embedded" });
		
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=760527",                             "https://www.azure.cn/pricing/details/power-bi-embedded" });
		
		words.add(new String[] { "https://azure.microsoft.com/get-started",              "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		words.add(new String[] { "https://azure.microsoft.com/try/cognitive-services",   "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		
		// -----------------------------------------------------------------------------------------------------------------------
		words.add(new String[] { "zh-cn/download/details.aspx?id=45343",   "en-us/download/details.aspx?id=45343" });

		words.add(new String[] { "https://migrhoststorage.blob.core.chinacloudapi.cn/sqldwsample/DataWarehouseMigrationUtility.zip",   "https://migrhoststorage.blob.core.windows.net/sqldwsample/DataWarehouseMigrationUtility.zip" });

		words.add(new String[] { "https://azure.microsoft.com/documentation/scenarios/virtual-machines",   "/virtual-machines/" });

		words.add(new String[] { "pymssql.org/zh/latest/ref/pymssql.html",                           "pymssql.org/en/latest/ref/pymssql.html" });
		words.add(new String[] { "http://feedback.windowsazure.cn/forums/34192--general-feedback",   "https://www.azure.cn/product-feedback" });
		words.add(new String[] { "www.remoteapp.azure.cn/en/clients.aspx",                           "www.remoteapp.windowsazure.com/en/clients.aspx" });
		words.add(new String[] { "https://www.remoteapp.windowsazure.cn/en/clients.aspx",            "https://www.remoteapp.windowsazure.com/en/clients.aspx" });
		words.add(new String[] { "www.windowsazure.cn",                                              "www.azure.cn" });
		words.add(new String[] { "dtucalculator.chinacloudsites.cn",                                 "dtucalculator.azurewebsites.net" });

		words.add(new String[] { "FREE ACCOUNT",   "Trial" });
		words.add(new String[] { "free account",   "Trial" });
		words.add(new String[] { "Get-AzureRmSqlElasticPoolDatabaseActivity",   "Get-AzureRmSqlDatabaseActivity" });

		words.add(new String[] { "http://itunes.apple.com/us/app/xcode/id497799835?mt=12",   "http://itunes.apple.com/cn/app/xcode/id497799835?mt=12" });

		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn249410.aspx",   "/storage/storage-scalability-targets" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn645545.aspx",   "/active-directory/develop/active-directory-protocols-oauth-code" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn645545.aspx",   "/active-directory/develop/active-directory-protocols-oauth-code" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn151124.aspx",   "/active-directory/develop/active-directory-developers-guide" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/dn151124.aspx",   "/active-directory/develop/active-directory-developers-guide" });
		
		words.add(new String[] { "http://msdn.microsoft.com/library/azure/dn690470.aspx",           "/redis-cache" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=398249",                   "/redis-cache/cache-aspnet-session-state-provider" });
		words.add(new String[] { "http://msdn.microsoft.com/library/windowsazure/gg618003.aspx",    "https://docs.azure.cn" });
		words.add(new String[] { "http://msdn.microsoft.com/library/dn690521.aspx#Objects",         "/redis-cache/cache-dotnet-how-to-use-azure-redis-cache#working-with-caches" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=320830",                   "/redis-cache" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=398247",                   "/redis-cache" });

		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=402386",                "/documentdb/documentdb-dotnet-samples" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=325362",                "/app-service-web/" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=529715",                "/app-service-web/app-service-web-app-azure-portal" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=402319&clcid=0x409",    "/documentdb" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=735027",                "/documentdb/documentdb-request-units" });
		words.add(new String[] { "https://go.microsoft.com/fwLink/?LinkID=390493&clcid=0x409",   "/virtual-machines/windows/extensions-features" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699539",                "/develop/java/" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=523751",                "/app-service" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=529714",                "/app-service-web/app-service-changes-existing-services" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=760527",                "https://www.azure.cn/pricing/details/power-bi-embedded" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=746472",                "https://www.nuget.org/profiles/powerbi" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/p/?LinkId=623009",              "/vs-azure-tools-diagnostics-for-cloud-services-and-virtual-machines" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/p/?LinkId=262845",              "/cloud-services/cloud-services-performance-testing-visual-studio-profiler" });

		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699547",   "/develop/java" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699529",   "/azure-toolkit-for-eclipse" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699533",   "/azure-toolkit-for-eclipse-creating-a-hello-world-application" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=699546",   "/azure-toolkit-for-eclipse-installation/" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=690333",   "/azure-toolkit-for-eclipse-whats-new/" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699525",   "/azure-toolkit-for-eclipse-azure-role-properties/" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699528",   "/azure-toolkit-for-eclipse-azure-storage-account-list/" });

		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699524",   "/azure-toolkit-for-eclipse-azure-project-properties" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699535",   "/azure-toolkit-for-eclipse-debugging-azure-applications" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699536",   "/azure-toolkit-for-eclipse-deploying-large-deployments" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699542",   "/develop/java" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699545",   "/develop/java" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699548",   "/azure-toolkit-for-eclipse-enable-session-affinity" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699549",   "/develop/java" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699552",   "/azure-toolkit-for-eclipse-whats-new" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699538",   "/azure-toolkit-for-eclipse-enabling-remote-access-for-azure-deployments" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699551",   "/develop/java" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=466520",   "/cloud-services/cloud-services-sizes-specs" });
		
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=394767",   "/azure-resource-manager/powershell-azure-resource-manager" });

		words.add(new String[] { "https://github.com/Azure-Samples/active-directory-java-webapp-openidconnect\\/archive/complete.zip",   "https://github.com/Azure-Samples/active-directory-java-webapp-openidconnect/archive/complete.zip" });

		words.add(new String[] { "https://account.azure.cn/subscriptions",                           "https://account.windowsazure.cn/subscriptions" });
		words.add(new String[] { "/documentation/services/active-directory/",                        "/active-directory" });
		words.add(new String[] { "https://azure.microsoft.com/trial/get-started-active-directory",   "/active-directory" });

		words.add(new String[] { "https://azure.microsoft.com/free/?WT.mc_id=A261C142F",                "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		words.add(new String[] { "https://azure.microsoft.com/free",                                    "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=623901",                       "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });

		words.add(new String[] { "free Azure account",   "Azure account" });

		words.add(new String[] { "http://azure.com/docdb",   "/documentdb" });
		words.add(new String[] { "https://azure.microsoft.com/en-us/pricing/details/documentdb",   "https://www.azure.cn/pricing/details/documentdb" });

		words.add(new String[] { "/develop/mobile/tutorials/get-started/#create-new-service",   "/mobile-services/mobile-services-javascript-backend-windows-store-dotnet-get-started#create-new-service" });
		words.add(new String[] { "–",   "-" });
		words.add(new String[] { "https://account.azure.cn",   "https://account.windowsazure.cn" });
		words.add(new String[] { "mail.azure.cn",              "mail.windowsazure.cn" });

		words.add(new String[] { "http://azure.microsoft.com/pricing",        "https://www.azure.cn/pricing" });
		words.add(new String[] { "https://azure.microsoft.com/pricing",       "https://www.azure.cn/pricing" });
		words.add(new String[] { "/documentation/services/virtual-network",   "/virtual-network/" });

		words.add(new String[] { "https://msdn.microsoft.com/library/azure/mt126081.aspx#BKMK_SsprActivityEvent",   "https://msdn.microsoft.com/library/azure/ad/graph/howto/azure-ad-reports-and-events-preview" });

		words.add(new String[] { "https://msdn.microsoft.com/library/azure/hh967642.aspx",   "/active-directory/connect/active-directory-aadconnect" });
		words.add(new String[] { "http://www.cloudidentity.net",   "http://www.cloudidentity.com/blog/" });

		words.add(new String[] { "https://go.microsoft.com/fwlink/?LinkId=402413",   "https://msdn.microsoft.com/library/azure/dn781481.aspx" });

		words.add(new String[] { "http://msdn.microsoft.com/library/windowsazure/hh690946.aspx",   "/azure-toolkit-for-eclipse-installation/" });
		words.add(new String[] { "http://msdn.microsoft.com/library/windowsazure/hh690944.aspx",   "/azure-toolkit-for-eclipse-creating-a-hello-world-application/" });
		words.add(new String[] { "http://blogs.msdn.com/windowsazure",   "http://blogs.msdn.com/azure" });

		words.add(new String[] { "https://api.powerbi.com",         "https://api.powerbi.cn" });

		words.add(new String[] { "new ResourceManagementClient(credential)",   "new ResourceManagementClient(new Uri(\"https://management.chinacloudapi.cn/\"),  credential) " });
		words.add(new String[] { "/powershell/azureps-cmdlets-docs",   "/powershell-install-configure" });

		// update media for markdig
		words.add(new String[] { "](  media/",   "](media/" });
		words.add(new String[] { "]( media/",    "](media/" });
		words.add(new String[] { "]:  media/",   "]: media/" });
		words.add(new String[] { "]:media/",     "]: media/" });

		words.add(new String[] { "/powershell/azureps-cmdlets-docs",   "/powershell-install-configure" });

		words.add(new String[] { "multi-factor-authentication-app-faq",                   "microsoft-authenticator-app-faq" });
		words.add(new String[] { "multi-factor-authentication-microsoft-authenticator",   "microsoft-authenticator-app-how-to" });

		// from Derek
		words.add(new String[] { "service-bus-shared-access-signature-authentication",   "service-bus-sas" });
		words.add(new String[] { "/service-bus-messaging/service-bus-powershell-how-to-provision",   "https://docs.microsoft.com/en-us/powershell/resourcemanager/azurerm.servicebus/v0.0.2/azurerm.servicebus" });

		
		words.add(new String[] { "cosmosdb.azure.com",       "cosmosdb.azure.cn" });
		words.add(new String[] { "vault.chinacloudapi.cn",   "vault.azure.cn" });
		words.add(new String[] { "documents.azure.com",      "documents.azure.cn" });

		words.add(new String[] { "Select-AzureRmSubscription -SubscriptionName $subscr -Current",      "Select-AzureRmSubscription -SubscriptionName $subscr" });
		words.add(new String[] { "https://embedded.powerbi.com",                                       "https://embedded.powerbi.cn" });

		words.add(new String[] { "https://portalcontent.blob.core.chinacloudapi.cn/samples/DocDBWebsiteTodo.json",                      "https://portalcontent.blob.core.windows.net/samples/DocDBWebsiteTodo.json" });
		words.add(new String[] { "https://portalcontent.blob.core.chinacloudapi.cn/samples/DocDBWebSite.json",                          "https://portalcontent.blob.core.windows.net/samples/DocDBWebSite.json" });
		words.add(new String[] { "https://portalcontent.blob.core.chinacloudapi.cn/scriptaction/documentdb-hadoop-installer-v04.ps1",   "https://portalcontent.blob.core.windows.net/scriptaction/documentdb-hadoop-installer-v04.ps1" });
		words.add(new String[] { "http://portalcontent.blob.core.chinacloudapi.cn/samples/documentdb-hdinsight-samples.zip",            "http://portalcontent.blob.core.windows.net/samples/documentdb-hdinsight-samples.zip" });

		words.add(new String[] { "/download/details.aspx?id=41653",   "/download/details.aspx?id=42064" });

		words.add(new String[] { "documentdb-create-mongodb-account",              "documentdb-create-account" });
		words.add(new String[] { "documentdb-supercharge-your-account",            "documentdb-performance-levels" });
		words.add(new String[] { "web-sites-java-get-started",                     "app-service-web-get-started-java" });

		words.add(new String[] { "https://azure.microsoft.com/services/virtual-machines/sql-server",    "https://www.azure.cn/home/features/virtual-machines#SQL" });
		words.add(new String[] { "https://azure.microsoft.com/services/storage",                        "https://www.azure.cn/home/features/storage" });
		words.add(new String[] { "https://azure.microsoft.com/documentation/services/sql-database",     "https://www.azure.cn/home/features/sql-database" });
		words.add(new String[] { "https://azure.microsoft.com/documentation/services/load-balancer",    "https://www.azure.cn/home/features/load-balancer" });
		words.add(new String[] { "https://azure.microsoft.com/documentation/services/traffic-manager",  "https://www.azure.cn/home/features/traffic-manager" });
		words.add(new String[] { "http://azure.microsoft.com/services/expressroute",                    "https://www.azure.cn/home/features/expressroute" });
		words.add(new String[] { "https://azure.microsoft.com/documentation/services/expressroute",     "https://www.azure.cn/home/features/expressroute" });
		words.add(new String[] { "https://azure.microsoft.com/documentation/services/vpn-gateway",      "https://www.azure.cn/home/features/vpn-gateway" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/powershell-install-configure",                  "/powershell-install-configure" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/active-directory/develop/",                     "/active-directory/develop/" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/active-directory/connect/",                     "/active-directory/connect/" });

		words.add(new String[] { "https://docs.microsoft.com/azure/active-directory/develop/",                           "/active-directory/develop/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/active-directory/connect/",                           "/active-directory/connect/" });

		words.add(new String[] { "https://docs.microsoft.com/azure/site-recovery",                                       "/site-recovery" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/site-recovery",                                 "/site-recovery" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/active-directory/",                             "/active-directory/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/active-directory/",                                   "/active-directory/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/active-directory-domain-services",             "/active-directory-domain-services" });
		words.add(new String[] { "https://docs.microsoft.com/azure/active-directory-domain-services",                   "/active-directory-domain-services" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/bastion",                                      "/bastion" });
		words.add(new String[] { "https://docs.microsoft.com/azure/bastion",                                            "/bastion" });
			
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/documentdb/",                                   "/documentdb/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/documentdb/",                                         "/documentdb/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/backup/",                                       "/backup/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/backup/",                                             "/backup/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/automation",                                   "/automation" });
		words.add(new String[] { "https://docs.microsoft.com/azure/automation",                                         "/automation" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/batch/scripts/",                                "/batch/scripts/" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/batch/",                                        "/batch/" });

		words.add(new String[] { "https://docs.microsoft.com/azure/batch/scripts/",                                      "/batch/scripts/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/batch/",                                              "/batch/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/key-vault/",                                    "/key-vault/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/key-vault/",                                          "/key-vault/" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/private-link/",                                 "/private-link/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/private-link/",                                       "/private-link/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/multi-factor-authentication/end-user/",         "/multi-factor-authentication/end-user/" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/multi-factor-authentication/",                  "/multi-factor-authentication/" });

		words.add(new String[] { "https://docs.microsoft.com/azure/multi-factor-authentication/end-user/",               "/multi-factor-authentication/end-user/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/multi-factor-authentication/",                        "/multi-factor-authentication/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/notification-hubs/",   "/notification-hubs/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/notification-hubs/",         "/notification-hubs/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/power-bi-embedded/",   "/power-bi-embedded/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/power-bi-embedded/",         "/power-bi-embedded/" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/azure-functions/",      "/azure-functions/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/azure-functions/",            "/azure-functions/" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/app-service/",          "/app-service/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/app-service/",                "/app-service/" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/application-gateway",                 "/application-gateway" });
		words.add(new String[] { "https://docs.microsoft.com/azure/application-gateway",                       "/application-gateway" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/storage/",                            "/storage/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/storage/",                                  "/storage/" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/cosmos-db/",                          "/cosmos-db/" });
		words.add(new String[] { "https://docs.microsoft.com/azure/cosmos-db/",                                "/cosmos-db/" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/cognitive-services",                  "/cognitive-services" });
		words.add(new String[] { "https://docs.microsoft.com/azure/cognitive-services",                        "/cognitive-services" });
		
		words.add(new String[] { "https://azure.microsoft.com/services/functions",                             "https://www.azure.cn/zh-cn/home/features/azure-functions" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/monitoring-and-diagnostics",          "/monitoring-and-diagnostics" });
		words.add(new String[] { "https://docs.microsoft.com/azure/monitoring-and-diagnostics",                "/monitoring-and-diagnostics" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/virtual-network",                     "/virtual-network" });
		words.add(new String[] { "https://docs.microsoft.com/azure/virtual-network",                           "/virtual-network" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/app-service-web",                     "/app-service-web" });
		words.add(new String[] { "https://docs.microsoft.com/azure/app-service-web",                           "/app-service-web" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/active-directory-b2c",                "/active-directory-b2c" });
		words.add(new String[] { "https://docs.microsoft.com/azure/active-directory-b2c",                      "/active-directory-b2c" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/governance",                           "/governance" });
		words.add(new String[] { "https://docs.microsoft.com/azure/governance",                                 "/governance" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/event-hubs",                           "/event-hubs" });
		words.add(new String[] { "https://docs.microsoft.com/azure/event-hubs",                                 "/event-hubs" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/azure-monitor",                        "/azure-monitor" });
		words.add(new String[] { "https://docs.microsoft.com/azure/azure-monitor",                              "/azure-monitor" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/sql-database",                        "/sql-database" });
		words.add(new String[] { "https://docs.microsoft.com/azure/sql-database",                              "/sql-database" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/service-bus-messaging",               "/service-bus-messaging" });
		words.add(new String[] { "https://docs.microsoft.com/azure/service-bus-messaging",                     "/service-bus-messaging" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/dns",                                "/dns" });
		words.add(new String[] { "https://docs.microsoft.com/azure/dns",                                      "/dns" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-gb/azure/azure-stack",                        "/azure-stack" });
		words.add(new String[] { "https://docs.microsoft.com/azure/security/",                                "/security/" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/virtual-machine-scale-sets",         "/virtual-machine-scale-sets" });
		words.add(new String[] { "https://docs.microsoft.com/azure/azure-stack",                        "/azure-stack" });
		words.add(new String[] { "https://docs.microsoft.com/azure/vpn-gateway",                        "/vpn-gateway" });
		words.add(new String[] { "https://docs.microsoft.com/azure/virtual-machines",                   "/virtual-machines" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/virtual-machine-scale-sets",   "/virtual-machine-scale-sets" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/azure-stack",                  "/azure-stack" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/vpn-gateway",                  "/vpn-gateway" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/virtual-machines",             "/virtual-machines" });
		
		words.add(new String[] { "https://docs.microsoft.com/role-based-access-control",                "/role-based-access-control" });
		words.add(new String[] { "https://docs.microsoft.com/azure/role-based-access-control",          "/role-based-access-control" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/role-based-access-control",    "/role-based-access-control" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/azure-resource-manager",             "/azure-resource-manager" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/azure-resource-manager",       "/azure-resource-manager" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/service-fabric",                     "/service-fabric" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/service-fabric",               "/service-fabric" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/azure-cache-for-redis",              "/azure-cache-for-redis" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/azure-cache-for-redis",        "/azure-cache-for-redis" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/event-grid",                         "/event-grid" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/event-grid",                   "/event-grid" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/aks",                                "/aks" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/aks",                          "/aks" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/cloud-services",                    "/cloud-services" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/cloud-services",              "/cloud-services" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/service-health",                    "/service-health" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/service-health",              "/service-health" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/time-series-insights",              "/time-series-insights" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/time-series-insights",        "/time-series-insights" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/iot-hub",                           "/iot-hub" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/iot-hub",                     "/iot-hub" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/logic-apps",                           "/logic-apps" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/logic-apps",                     "/logic-apps" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/stream-analytics",                    "/stream-analytics" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/stream-analytics",              "/stream-analytics" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/api-management",                      "/api-management" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/api-management",                "/api-management" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/web-application-firewall",            "/web-application-firewall" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/web-application-firewall",      "/web-application-firewall" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/load-balancer",                       "/load-balancer" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/load-balancer",                 "/load-balancer" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/security-center",                       "/security-center" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/security-center",                 "/security-center" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/network-watcher",                       "/network-watcher" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/network-watcher",                 "/network-watcher" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/firewall",                              "/firewall" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/firewall",                        "/firewall" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/media-services",                        "/media-services" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/media-services",                  "/media-services" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/log-analytics",                        "/log-analytics" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/log-analytics",                  "/log-analytics" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/machine-learning",                        "/machine-learning" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/machine-learning",                  "/machine-learning" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/spring-cloud",                            "/spring-cloud"  });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/spring-cloud",                      "/spring-cloud" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/search",                                "/search"  });
		words.add(new String[] { "https://docs.microsoft.com/en-us/azure/search",                          "/search" });
		
		// about cognitive services replacement
		//===========================================================================================================
		words.add(new String[] { "https://westcentralus.dev.cognitive.microsoft.com/docs/services/56f91f2d778daf23d8ec6739/operations/56f91f2e778daf14a499e1fa",   "https://dev.cognitive.azure.cn/docs/services/56f91f2d778daf23d8ec6739/operations/56f91f2e778daf14a499e1fa" });
		words.add(new String[] { "https://westcentralus.dev.cognitive.microsoft.com/docs/services/56f91f2d778daf23d8ec6739/operations/56f91f2e778daf14a499e1fb",   "https://dev.cognitive.azure.cn/docs/services/56f91f2d778daf23d8ec6739/operations/56f91f2e778daf14a499e1fb" });
		words.add(new String[] { "https://westcentralus.dev.cognitive.microsoft.com/docs/services/56f91f2d778daf23d8ec6739/operations/56f91f2e778daf14a499e1fc",   "https://dev.cognitive.azure.cn/docs/services/56f91f2d778daf23d8ec6739/operations/56f91f2e778daf14a499e1fc" });

		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/56f91f2d778daf23d8ec6739",   "https://dev.cognitive.azure.cn/docs/services/56f91f2d778daf23d8ec6739/operations/56f91f2e778daf14a499e1fa" });

		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523c",   "https://dev.cognitive.azure.cn/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523c" });

		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395236",   "https://dev.cognitive.azure.cn/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395236" });
		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237",   "https://dev.cognitive.azure.cn/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237" });
		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395238",   "https://dev.cognitive.azure.cn/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395238" });
		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239",   "https://dev.cognitive.azure.cn/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239" });
		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523a",   "https://dev.cognitive.azure.cn/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039523a" });

		words.add(new String[] { "https://westus.dev.cognitive.microsoft.com/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244",   "https://dev.cognitive.azure.cn/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244" });

		words.add(new String[] { "westus.api.cognitive.microsoft.com",          "api.cognitive.azure.cn" });
		words.add(new String[] { "westcentralus.api.cognitive.microsoft.com",   "api.cognitive.azure.cn" });
		words.add(new String[] { "eastus2.api.cognitive.microsoft.com",         "api.cognitive.azure.cn" });
		words.add(new String[] { "westeurope.api.cognitive.microsoft.com",      "api.cognitive.azure.cn" });
		words.add(new String[] { "southeastasia.api.cognitive.microsoft.com",   "api.cognitive.azure.cn" });
		words.add(new String[] { "westus2.api.cognitive.microsoft.com",         "api.cognitive.azure.cn" });

		words.add(new String[] { "api.cognitive.microsoft.com",                 "api.cognitive.azure.cn" });
		
		words.add(new String[] { "westus.dev.cognitive.microsoft.com",          "dev.cognitive.azure.cn" });
		words.add(new String[] { "westus2.dev.cognitive.microsoft.com",         "dev.cognitive.azure.cn" });
		words.add(new String[] { "westcentralus.dev.cognitive.microsoft.com",   "dev.cognitive.azure.cn" });
		words.add(new String[] { "eastus2.dev.cognitive.microsoft.com",         "dev.cognitive.azure.cn" });
		words.add(new String[] { "westeurope.dev.cognitive.microsoft.com",      "dev.cognitive.azure.cn" });
		words.add(new String[] { "southeastasia.dev.cognitive.microsoft.com",   "dev.cognitive.azure.cn" });
		words.add(new String[] { "dev.projectoxford.ai",                        "dev.cognitive.azure.cn" });

		words.add(new String[] { "api.cognitive.microsofttranslator.com",       "api.translator.azure.cn" });
		
		// computer vision - Analyze Image method
		words.add(new String[] { "https://dev.cognitive.azure.cn/docs/services/5adf991815e1060e6355ad44", 
				                 "https://dev.cognitive.azure.cn/docs/services/56f91f2d778daf23d8ec6739"});
		
		//========================================================================================================
		
		words.add(new String[] { "graph.microsoft.com",   "microsoftgraph.chinacloudapi.cn" });

		words.add(new String[] { "https://azure.microsoft.com/develop",   "/develop" });
		
		words.add(new String[] { "storage/storage-table-design-guide",   "cosmos-db/table-storage-design-guide" });
		words.add(new String[] { "storage/storage-php-how-to-use-table-storage",   "cosmos-db/table-storage-how-to-use-php" });
		words.add(new String[] { "storage/storage-python-how-to-use-table-storage",   "cosmos-db/table-storage-how-to-use-python" });
		words.add(new String[] { "storage/storage-dotnet-how-to-use-tables",   "cosmos-db/table-storage-how-to-use-dotnet" });
		words.add(new String[] { "storage/storage-about-disks-and-vhds-linux",   "virtual-machines/linux/about-disks-and-vhds" });

		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkID=699526",   "/java/eclipse/azure-toolkit-for-eclipse-azure-service-endpoints" });
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=402457",   "https://www.azul.com/downloads/zulu/" });

		words.add(new String[] { "/pricing/details/cache",   "/pricing/details/redis-cache" });
		words.add(new String[] { "pricing/details/data-transfers",   "pricing/details/data-transfer" });
		
		words.add(new String[] { "/monitoring-and-diagnostics/insights-debugging-with-events",   "/azure-resource-manager/resource-group-audit" });

		words.add(new String[] { "account.azure.com",   "account.windowsazure.cn" });

		words.add(new String[] { "azurecli-interactive",     "azurecli" });
		words.add(new String[] { "powershell-interactive",   "powershell" });

		words.add(new String[] { "dev.powerbi.com",   "dev.powerbi.cn" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/rest/api/",            "/rest/api/" });
		words.add(new String[] { "https://docs.microsoft.com/rest/api/",                  "/rest/api/" });
		words.add(new String[] { "http://docs.microsoft.com/en-us/rest/api",              "/rest/api/" });
		words.add(new String[] { "http://docs.microsoft.com/rest/api",                    "/rest/api/" });
		words.add(new String[] { "/rest/api/",                                             "https://docs.microsoft.com/rest/api/" });
		
		words.add(new String[] { "https://docs.microsoft.com/powershell/azure/install-azurerm-ps",   "https://docs.microsoft.com/en-us/powershell/azure/install-az-ps?view=azps-1.2.0" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/powershell/module/",   "/powershell/module/" });
		words.add(new String[] { "https://docs.microsoft.com/powershell/module/",         "/powershell/module/" });
		words.add(new String[] { "http://docs.microsoft.com/en-us/powershell/module/",    "/powershell/module/" });
		words.add(new String[] { "http://docs.microsoft.com/powershell/module/",          "/powershell/module/" });
		words.add(new String[] { "/powershell/module/",                                   "https://docs.microsoft.com/powershell/module/" });
		
		words.add(new String[] { "https://docs.microsoft.com/en-us/powershell/azure/",    "/powershell/azure/" });
		words.add(new String[] { "https://docs.microsoft.com/powershell/azure/",          "/powershell/azure/" });
		words.add(new String[] { "http://docs.microsoft.com/en-us/powershell/azure/",     "/powershell/azure/" });
		words.add(new String[] { "http://docs.microsoft.com/powershell/azure/",           "/powershell/azure/" });
		words.add(new String[] { "/powershell/azure/",                                    "https://docs.microsoft.com/powershell/azure/" });

		words.add(new String[] { "https://docs.microsoft.com/en-us/java",                  "https://docs.microsoft.com/java" });
		words.add(new String[] { "https://docs.microsoft.com/java/azure/",                 "https://docs.azure.cn/java/" });
		
		words.add(new String[] { "https://azure.microsoft.com/en-us/support/trust-center",   "https://www.trustcenter.cn" });
		words.add(new String[] { "https://azure.microsoft.com/support/trust-center",         "https://www.trustcenter.cn" });
		words.add(new String[] { "https://www.microsoft.com/trustcenter/default.aspx",       "https://www.trustcenter.cn" });
		words.add(new String[] { "https://www.microsoft.com/trustcenter/security",           "https://www.trustcenter.cn/zh-cn/security/default.html" });
		words.add(new String[] { "https://www.microsoft.com/trustcenter/compliance",         "https://www.trustcenter.cn/zh-cn/compliance/default.html" });

		words.add(new String[] { "batch.azure.com",   "batch.chinacloudapi.cn" });

		words.add(new String[] { "Microsoft cloud",    "Azure cloud" });
		words.add(new String[] { "microsoft cloud",    "Azure cloud" });
		
		words.add(new String[] { "westus.cloudapp.azure.com",   "chinanorth.chinacloudapp.cn" });
		words.add(new String[] { "cloudapp.azure.com",          "chinacloudapp.cn" });
		
		words.add(new String[] { "https://azure.microsoft.com/documentation/scripts",    "/automation/automation-runbook-gallery" });
		
		words.add(new String[] { "/networking/networking-overview",   "/virtual-network/virtual-networks-overview" });
		
		words.add(new String[] { "active-directory-domains-add-azure-portal",   "add-custom-domain" });
		
		// dotnet link update
		words.add(new String[] { "docs.microsoft.com/dotnet",               "docs.azure.cn/zh-cn/dotnet" });
		words.add(new String[] { "docs.microsoft.com/en-us/dotnet",         "docs.azure.cn/zh-cn/dotnet" });
		words.add(new String[] { "docs.microsoft.com/dotnet/azure",         "docs.azure.cn/zh-cn/dotnet" });
		words.add(new String[] { "docs.microsoft.com/en-us/dotnet/azure",   "docs.azure.cn/zh-cn/dotnet" });
		// recover /dotnet/framework
		words.add(new String[] { "docs.azure.cn/zh-cn/dotnet/framework",    "docs.microsoft.com/dotnet/framework" });
		// fix dotnet/api broken link issue
		words.add(new String[] { "docs.azure.cn/zh-cn/dotnet/api)",         "docs.azure.cn/zh-cn/dotnet/api/overview)" });
		words.add(new String[] { "docs.azure.cn/zh-cn/dotnet/api/)",        "docs.azure.cn/zh-cn/dotnet/api/overview/)" });
		words.add(new String[] { "docs.azure.cn/zh-cn/dotnet/api )",        "docs.azure.cn/zh-cn/dotnet/api/overview)" });
		words.add(new String[] { "docs.azure.cn/zh-cn/dotnet/api/overview/azure",                             "docs.azure.cn/zh-cn/dotnet/api/overview" });
		words.add(new String[] { "docs.azure.cn/zh-cn/dotnet/api/?view=identitymodelclientsad-3.13.9",        "docs.azure.cn/zh-cn/dotnet/api/overview" });
		
		words.add(new String[] { "ms.portal.azure.cn",   "portal.azure.cn" });
		
		words.add(new String[] { "free-trial",                                "trial" });
		words.add(new String[] { "Free Trial",                                "trial" });
		words.add(new String[] { "free one-month trial",                      "trial" });
		words.add(new String[] { "free trial",                                "trial" });
		words.add(new String[] { "FREE TRIAL",                                "TRIAL" });
		words.add(new String[] { "Free one-month trial",                      "trial" });
		words.add(new String[] { "free Azure subscription",                   "Azure subscription" });
		words.add(new String[] { "Azure account for free",                    "Azure trial account" });
		words.add(new String[] { "www.azure.cn/pricing/free",                 "www.microsoft.com/china/azure/index.html?fromtype=cn" });
		
		words.add(new String[] { "[!INCLUDE [quickstarts-trial-note](../../includes/quickstarts-trial-note.md)]",   
				                 "If you don't have an Azure subscription, create a [trial account](https://www.microsoft.com/china/azure/index.html?fromtype=cn) before you begin." });
		
		words.add(new String[] { "[!INCLUDE [quickstarts-trial-note.md](../../includes/quickstarts-trial-note.md)]",   
        "If you don't have an Azure subscription, create a [trial account](https://www.microsoft.com/china/azure/index.html?fromtype=cn) before you begin." });
		
		words.add(new String[] { "[!INCLUDE [quickstarts-trial-note](../../../includes/quickstarts-trial-note.md)]",   
                                 "If you don't have an Azure subscription, create a [trial account](https://www.microsoft.com/china/azure/index.html?fromtype=cn) before you begin." });
		
		words.add(new String[] { "[!INCLUDE [quickstarts-trial-note](../../../../includes/quickstarts-trial-note.md)]",   
        "If you don't have an Azure subscription, create a [trial account](https://www.microsoft.com/china/azure/index.html?fromtype=cn) before you begin." });
		
		words.add(new String[] { "(.\\asdk\\",   "(asdk/" });
		words.add(new String[] { "(.\\user\\",   "(user/" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		
		
		words.add(new String[] { "免费帐户",     "试用帐户" });
		words.add(new String[] { "上载",         "上传" });
		words.add(new String[] { "免费试用",     "试用" });
		words.add(new String[] { "预览门户",     "经典门户" });
		words.add(new String[] { "美国东部",     "中国东部" });
		words.add(new String[] { "日本东部",     "中国东部" });
		words.add(new String[] { "美国西部",     "中国北部" });
		words.add(new String[] { "美国中部",     "中国东部" });

		words.add(new String[] { "Resource Manager 模板",       "资源管理器模板" });
		words.add(new String[] { " Resource Manager 模板",      "资源管理器模板" });
		words.add(new String[] { "资源管理器 概述",               "资源管理器概述" });
		words.add(new String[] { "资源管理器 创建",               "资源管理器创建" });
		words.add(new String[] { "资源管理器 的",                 "资源管理器的" });
		words.add(new String[] { "与 资源管理器",                 "与资源管理器" });
		words.add(new String[] { "资源管理器 配合",               "资源管理器配合" });
		words.add(new String[] { "使用 资源管理器",               "使用资源管理器" });
		words.add(new String[] { "负载平衡",                     "负载均衡" });
		words.add(new String[] { "即用即付",                     "标准预付费" });
		words.add(new String[] { "Microsoft 支持",               "Azure 支持" });
		words.add(new String[] { "Microsoft 云",                 "Azure 云" }); 
		words.add(new String[] { "microsoft 云",                 "Azure 云" }); 

		words.add(new String[]{ "North Europe",        "China North" });
		words.add(new String[]{ "West US",             "China North" });
		words.add(new String[]{ "WestUS",              "ChinaNorth"  });
		words.add(new String[]{ "westus",              "chinanorth"  });
		words.add(new String[]{ "Japan West",          "China North"  });
		words.add(new String[]{ "South Central US",    "China North"  });
		words.add(new String[]{ "East US",             "China North" });
		words.add(new String[]{ "EastUS",              "ChinaNorth"   });
		words.add(new String[]{ "Eastus",              "ChinaNorth"   });
		words.add(new String[]{ "EastUs",              "ChinaNorth"   });
		words.add(new String[]{ "JapanEast",           "ChinaNorth"  });
		words.add(new String[]{ "JapanWest",           "ChinaNorth"  });
		words.add(new String[]{ "Japan West",          "China North" });
		words.add(new String[]{ "Japan East",          "China North" });
		words.add(new String[]{ "East Asia",           "China North" });
		words.add(new String[]{ "North Central US",    "China North" });
		words.add(new String[]{ "USWest",              "ChinaNorth"  });
		words.add(new String[]{ "eastus",              "chinanorth"  });
		words.add(new String[]{ "West Central US",     "China North" });
		words.add(new String[]{ "Central US",          "China North" });
		words.add(new String[]{ "westeurope",          "chinanorth"   });
		words.add(new String[]{ "WestEurope",          "chinanorth"   });
		words.add(new String[]{ "West Europe",         "China North"   });
		
		words.add(new String[] { "http://go.microsoft.com/fwlink/?LinkId=252246",        "/cli/get-started-with-azure-cli" });
		words.add(new String[] { "https://docs.microsoft.com/en-us/cli/azure",           "/cli" });
		words.add(new String[] { "https://docs.microsoft.com/cli/azure",                 "/cli" });
		words.add(new String[] { "/cli/azure",                                           "/cli" });
		words.add(new String[] { "/cli//azure",                                          "/cli" });
		words.add(new String[] { "/cli/vmss/stop",                                       "/cli/vmss?view=azure-cli-latest#az_vmss_stop" });
		words.add(new String[] { "/cli/public-ip",                                       "/cli/network/public-ip" });
		words.add(new String[] { "/cli/application-gateway",                             "/cli/network/application-gateway" });
		words.add(new String[] { "/cli/vnet",                                            "/cli/network/vnet" });
		words.add(new String[] { "/cli/?view=azure-cli-2017-03-09-profile",              "/cli/" });
		words.add(new String[] { "/cli/az/vmss",                                         "/cli/vmss" });
		
		words.add(new String[] { "/dotnet/api/overview/azure",                           "/dotnet/api/overview/" });
		words.add(new String[] { "/java/api/overview/azure",                             "/java/api/overview" }); 
		words.add(new String[] { "/azure/active-directory/",                             "/active-directory/" });
		
		words.add(new String[] { "(/azure/azure-stack",               "(/azure-stack" });
		words.add(new String[] { "..\\articles\\azure-functions\\",   "../articles/azure-functions/" });
		words.add(new String[] { "..\\cosmos-db\\",                   "../cosmos-db/" });
		words.add(new String[] { ".\\.\\azure-stack",                 "../azure-stack" });
		
		words.add(new String[] { "]( /cli/install-azure-cli)",   "](/cli/install-azure-cli)" });
		
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/mt634517.aspx",   "https://docs.microsoft.com/en-us/powershell/module/AzureRM.RedisCache/New-AzureRmRedisCache?view=azurermps-6.6.0" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/mt634518.aspx",   "https://docs.microsoft.com/en-us/powershell/module/AzureRM.RedisCache/Set-AzureRmRedisCache?view=azurermps-6.6.0" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/mt634514.aspx",   "https://docs.microsoft.com/en-us/powershell/module/AzureRM.RedisCache/Get-AzureRmRedisCache?view=azurermps-6.6.0" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/mt634516.aspx",   "https://docs.microsoft.com/en-us/powershell/module/AzureRM.RedisCache/Get-AzureRmRedisCacheKey?view=azurermps-6.6.0" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/mt634512.aspx",   "https://docs.microsoft.com/en-us/powershell/module/AzureRM.RedisCache/New-AzureRmRedisCacheKey?view=azurermps-6.6.0" });
		words.add(new String[] { "https://msdn.microsoft.com/library/azure/mt634515.aspx",   "https://docs.microsoft.com/en-us/powershell/module/AzureRM.RedisCache/Remove-AzureRmRedisCache?view=azurermps-6.6.0" });
		
		words.add(new String[] { "https://functions.azure.com/signin",     "https://portal.azure.cn" });
		
		words.add(new String[] { "https://azure.microsoft.com/services/",  "https://www.azure.cn/home/features/" });
		
		// aks-----------
		words.add(new String[] { "aka.ms/devicelogin",                  "aka.ms/deviceloginchina" });
		words.add(new String[] { "aka.ms/mfasetup",                     "account.activedirectory.windowsazure.cn/proofup.aspx?culture=en-US" });
		words.add(new String[] { "https://aka.ms/ssprsetup",            "https://account.activedirectory.windowsazure.cn/PasswordReset/Register.aspx?regref=ssprsetup" });
		words.add(new String[] { "https://aka.ms/sspraddin",            "https://www.microsoft.com/en-us/download/details.aspx?id=57343" });
		words.add(new String[] { "https://aka.ms/ssprsetup",            "https://login.partner.microsoftonline.cn" });
		words.add(new String[] { "https://aka.ms/sspr",                 "https://passwordreset.activedirectory.windowsazure.cn" });
		
		words.add(new String[] { "https://aka.ms/Azure/ExpressRoute",   "/expressroute/expressroute-introduction/" });
		words.add(new String[] { "https://aka.ms/Azure/NSG",            "/virtual-network/virtual-networks-nsg/" });
		words.add(new String[] { "http://aka.ms/accessAAD",             "https://account.windowsazure.cn/Home/Index" });
		words.add(new String[] { "https://aka.ms/accessAAD",            "https://account.windowsazure.cn/Home/Index" });
		
		words.add(new String[] { "https://aka.ms/Azure/Availability",   "/virtual-machines/windows/manage-availability" });
		words.add(new String[] { "https://aka.ms/Azure/ILB/Internal",   "/load-balancer/load-balancer-get-started-ilb-arm-ps" });
		words.add(new String[] { "https://aka.ms/Azure/ILB/Internet",   "/load-balancer/load-balancer-get-started-internet-arm-ps" });
		words.add(new String[] { "https://aka.ms/Azure/ILB",            "/load-balancer/load-balancer-overview" });
		words.add(new String[] { "https://aka.ms/Azure/Storage",        "/storage/common/storage-introduction" });
		words.add(new String[] { "https://aka.ms/Azure/VNet",           "/virtual-network/virtual-networks-overview" });
		
		words.add(new String[] { "https://aka.ms/appservicecustomdns",                      "/app-service/app-service-web-tutorial-custom-domain#step-2-create-the-dns-records" });
		words.add(new String[] { "https://aka.ms/authappstart",                             "/active-directory/user-help/microsoft-authenticator-app-how-to" });
		words.add(new String[] { "https://go.microsoft.com/fwlink/?linkid=2083908",         "https://portal.azure.cn/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview" });
		words.add(new String[] { "https://aka.ms/MobileAppReg",                             "https://portal.azure.cn/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview" });
		words.add(new String[] { "https://aka.ms/aspnetcore2-1-aad-quickstart-v2",          "https://portal.azure.cn/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview" });
		
		words.add(new String[] { "https://portal.azure.com/#blade/Microsoft_AAD_RegisteredApps/applicationsListBlade/quickStartType/AspNetWebAppQuickstartPage/sourceType/docs",   
				                 "https://portal.azure.cn/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview" });
		
		words.add(new String[] { "https://aka.ms/IdentityProtectionRefresh",                 "https://portal.azure.cn/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/SecurityOverview"});
		words.add(new String[] { "https://aka.ms/msal-net-authorization-code",               "https://github.com/AzureAD/microsoft-authentication-library-for-dotnet/wiki/Acquiring-tokens-with-authorization-codes-on-web-apps" });
		words.add(new String[] { "https://aka.ms/msal-net-client-credentials",               "https://github.com/AzureAD/microsoft-authentication-library-for-dotnet/wiki/Client-credential-flows" });
		words.add(new String[] { "https://aka.ms/appregistrations",                          "https://portal.azure.cn/#blade/Microsoft_AAD_RegisteredApps/ApplicationsListBlade" });
		
		words.add(new String[] { "https://aka.ms/aadb2cappauthropc",                         "https://github.com/Azure-Samples/active-directory-b2c-android-appauth-ropc"});
		words.add(new String[] { "https://aka.ms/aadb2ciosappauthropc",                      "https://github.com/Azure-Samples/active-directory-b2c-ios-appauth-ropc"});
		words.add(new String[] { "https://aka.ms/aadb2c",                                    "/active-directory-b2c/active-directory-b2c-overview"});
		words.add(new String[] { "https://aka.ms/catou",                                     "https://portal.azure.cn/#blade/Microsoft_AAD_IAM/ConditionalAccessBlade/TermsOfUse"});
		words.add(new String[] { "https://aka.ms/breakglass",                                "/active-directory/users-groups-roles/directory-admin-roles-secure"});
		words.add(new String[] { "https://aka.ms/adprivacystatement",                        "/active-directory/fundamentals/active-directory-properties-area"});
		
		words.add(new String[] { "", ""});
		words.add(new String[] { "", ""});
		// ---------
		
		words.add(new String[] { "https://powerbi.microsoft.com/documentation/powerbi-developer-register-app",   "https://docs.azure.cn/zh-cn/articles/azure-operations-guide/power-bi-embedded/aog-power-bi-embedded-qa-creation-issue" });
		
		words.add(new String[] { "/active-directory/active-directory-apps-permissions-consent",     "/active-directory/develop/active-directory-integrating-applications" });

		words.add(new String[] { "Azure Active Directory Admin Center",   "Azure portal" });
		
		words.add(new String[] { "https://support.office.com/article/Office-365-URLs-and-IP-address-ranges-8548a211-3fe7-47cb-abb1-355ea5aa88a2",   
				                 "https://docs.microsoft.com/en-us/office365/enterprise/urls-and-ip-address-ranges-21vianet" });
		
		words.add(new String[] { "secure.aadcdn.microsoftonline p.com",                                   "secure.aadcdn.partner.microsoftonline-p.cn" });
		words.add(new String[] { "secure.aadcdn.microsoftonline-p.com",                                   "secure.aadcdn.partner.microsoftonline-p.cn" });
		
		// don't replce their position
		words.add(new String[] { "passwordreset.microsoftonline.com",             "passwordreset.activedirectory.windowsazure.cn" });
		words.add(new String[] { "microsoftonline.com",                           "partner.microsoftonline.cn" });
		
		// update /support links
		words.add(new String[] { "http://azure.microsoft.com/support",           "https://www.azure.cn/support" });
		words.add(new String[] { "https://azure.microsoft.com/support",          "https://www.azure.cn/support" });
		words.add(new String[] { "/support/legal/sla/sql-database/v1_0",         "https://www.azure.cn/support/legal/sla" });
		words.add(new String[] { "/support/legal/sla/sql-database",              "https://www.azure.cn/support/legal/sla" });
		words.add(new String[] { "/support/legal/sla/virtual-machines",          "https://www.azure.cn/support/legal/sla" });
		words.add(new String[] { "/support/trust-center/services",               "https://www.azure.cn/support/trust-center/compliance" });
		words.add(new String[] { "/support/legal/preview-supplemental-terms",    "https://www.azure.cn/support/legal" });
		words.add(new String[] { "/support/legal/sla/cache/v1_0/",               "https://www.azure.cn/support/sla/redis-cache/" });
		words.add(new String[] { "/support/legal/sla/cache/",                    "https://www.azure.cn/support/sla/redis-cache/" });
		words.add(new String[] { "/support/options",                             "https://www.azure.cn/support/contact" });
		
		words.add(new String[] { "https://support.microsoft.com/help/4026305/sql-contact-microsoft-azure-support",   "https://www.azure.cn/support" });
		words.add(new String[] { "https://azure.microsoft.com/overview/contact-us",                                  "https://www.azure.cn/support/contact" });
		words.add(new String[] { "https://portal.azure.cn/#create/Microsoft.Support",                                "https://www.azure.cn/support/support-ticket-form/?l=zh-cn" });
		words.add(new String[] { "https://www.azure.cn/support/legal/sla/vpn-gateway",                               "https://www.azure.cn/support/sla/vpn-gateway" });
        // --------update /support end
		
		words.add(new String[] { "https://www.azure.cn/pricing/details/cognitive-services/content-moderator",   "https://www.azure.cn/pricing/details/cognitive-services" });
		words.add(new String[] { "https://www.azure.cn/pricing/details/cognitive-services/computer-vision",     "https://www.azure.cn/pricing/details/cognitive-services" });
		words.add(new String[] { "https://azure.microsoft.com/pricing/details/cognitive-services",              "https://www.azure.cn/pricing/details/cognitive-services" });
		words.add(new String[] { "pricing/details/cognitive-services/translator-text-api",                      "pricing/details/cognitive-services" });
		
		words.add(new String[] { "AzureCloudEnvironment",   "AzureChinaCloudEnvironment" });
		
		words.add(new String[] { "```c#",   "```C#" });
		
		words.add(new String[] { "[az network public-ip show](/cli/network/public-ip)",                      "[az network public-ip show](https://docs.azure.cn/zh-cn/cli/network/public-ip?view=azure-cli-latest#az-network-public-ip-show)" });
		words.add(new String[] { "[az network public-ip create](/cli/network/public-ip)",                    "[az network public-ip create](https://docs.azure.cn/zh-cn/cli/network/public-ip?view=azure-cli-latest#az-network-public-ip-create)" });
		words.add(new String[] { "[az network public-ip show](/cli/network/public-ipwork_public_ip_show)",   "[az network public-ip show](https://docs.azure.cn/zh-cn/cli/network/public-ip?view=azure-cli-latest#az-network-public-ip-show)" });
		
		words.add(new String[] { "[az network application-gateway address-pool create](/cli/network/application-gatewaywork_application_gateway_address-pool_create)",
		                         "[az network application-gateway address-pool create](https://docs.azure.cn/zh-cn/cli/network/application-gateway/address-pool?view=azure-cli-latest#az-network-application-gateway-address-pool-create)" });

		words.add(new String[] { "[az network application-gateway frontend-port create](/cli/network/application-gatewaywork_application_gateway_frontend_port_create)",
		                         "[az network application-gateway frontend-port create](https://docs.azure.cn/zh-cn/cli/network/application-gateway/frontend-port?view=azure-cli-latest#az-network-application-gateway-frontend-port-create)" });

		words.add(new String[] { "[az network application-gateway rule create](/cli/network/application-gatewaywork_application_gateway_rule_create)",
		                         "[az network application-gateway rule create](https://docs.azure.cn/zh-cn/cli/network/application-gateway/rule?view=azure-cli-latest#az-network-application-gateway-rule-create)" });
		
		// update graph explorer links, see details: https://docs.microsoft.com/en-us/graph/deployments
		words.add(new String[] { "https://graphexplorer.chinacloudsites.cn",                "https://developer.microsoft.com/zh-cn/graph/graph-explorer-china" });
		words.add(new String[] { "https://developer.microsoft.com/graph/graph-explorer#",   "https://developer.microsoft.com/zh-cn/graph/graph-explorer-china" });
		words.add(new String[] { "https://developer.microsoft.com/graph/graph-explorer",    "https://developer.microsoft.com/zh-cn/graph/graph-explorer-china" });
		
		words.add(new String[] { "https://www.microsoft.com/TrustCenter/Compliance/PCI",                    "https://www.trustcenter.cn" });
		words.add(new String[] { "https://www.microsoft.com/trustcenter/cloudservices/cognitiveservices",   "https://www.trustcenter.cn" });
		
		words.add(new String[] { "https://www.azure.cnhttps://www.azure.cn/support",         "https://www.azure.cn/support" });
		
		words.add(new String[] { "login.microsoftonline.com",   "login.partner.microsoftonline.cn" });
		
		// active-directory/develop/...
		words.add(new String[] { "active-directory-v2-limitations",   "azure-ad-endpoint-comparison" });
		words.add(new String[] { "v2-id-and-access-tokens",           "access-tokens" });
		
		words.add(new String[] { "support.microsoft.com/en-us",     "support.microsoft.com" });
		words.add(new String[] { "https://support.microsoft.com/contactus",   "https://www.azure.cn/support/contact" });
		
		words.add(new String[] { "https://go.microsoft.com/fwlink/?LinkID=759711",         "https://www.azure.cn/zh-cn/home/features/cognitive-services/text-analytics/" });
		words.add(new String[] { "](//go.microsoft.com/fwlink/?LinkID=759711)",            "](https://www.azure.cn/zh-cn/home/features/cognitive-services/text-analytics/)" });
		words.add(new String[] { "https://go.microsoft.com/fwlink/?LinkID=759346",         "https://dev.cognitive.azure.cn/docs/services/TextAnalytics.V2.0/operations/56f30ceeeda5650db055a3c7" });		
		words.add(new String[] { "](//go.microsoft.com/fwlink/?LinkID=759346)",            "](https://dev.cognitive.azure.cn/docs/services/TextAnalytics.V2.0/operations/56f30ceeeda5650db055a3c7)" });
		words.add(new String[] { "https://go.microsoft.com/fwlink/?LinkID=759712",         "https://www.azure.cn/zh-cn/home/features/cognitive-services/text-analytics/" });
		words.add(new String[] { "](//go.microsoft.com/fwlink/?LinkID=759712)",            "](https://www.azure.cn/zh-cn/home/features/cognitive-services/text-analytics/)" });
		
		words.add(new String[] { "](/windows-server/identity/active-directory-federation-services)",   "](https://docs.microsoft.com/windows-server/identity/active-directory-federation-services)" });
		words.add(new String[] { "](/dotnet/api/microsoft.identity.client.msaluirequiredexception?view=azure-dotnet)",   "](https://docs.microsoft.com/dotnet/api/microsoft.identity.client.msaluirequiredexception?view=azure-dotnet)" });
		words.add(new String[] { "](/dotnet/api/microsoft.identity.client.msalerror?view=azure-dotnet#fields)",   "](https://docs.microsoft.com/dotnet/api/microsoft.identity.client.msalerror?view=azure-dotnet#fields)" });
		
		words.add(new String[] { "b2clogin.com",   "b2clogin.cn" });

		words.add(new String[] { "/active-directory/develop/active-directory-v2-libraries",   "/active-directory/develop/reference-v2-libraries" });
		
		words.add(new String[] { "/powershell/module/az.network/new-azapplicationgatewaybackendhttpsettings",   "/powershell/module/az.network/new-azapplicationgatewaybackendhttpsetting" });
		words.add(new String[] { "",   "" });
		
		words.add(new String[] { "](/cli/identity",      "](https://docs.microsoft.com/en-us/cli/azure/identity" });
		words.add(new String[] { "](/cli/vm/identity",   "](https://docs.microsoft.com/en-us/cli/azure/vm/identity" });
		
		words.add(new String[] { "/powershell/active-directory/install-adv2",   "/powershell/azure/active-directory/install-adv2" });
		
		words.add(new String[] { "schema.management.chinacloudapi.cn",   "schema.management.azure.com" });
		
		words.add(new String[] { "https://www.azure.cn/support/service-dashboard/",            "https://status.azure.com/status" });
		words.add(new String[] { "https://www.azure.cn/zh-cn/support/service-dashboard/",      "https://status.azure.com/status" });
		
		
		words.add(new String[] { "https://myapps.microsoft.com",               "https://account.activedirectory.windowsazure.cn/r#/applications" });
		
		words.add(new String[] { "https://www.azure.cn/develop/downloads",     "http://www.windowsazure.com/develop/downloads" });
		
		words.add(new String[] { "https://aka.ms/b2cappregtraining",           "/active-directory-b2c/app-registrations-training-guide" });
		
		words.add(new String[] { "[Create an account for free](",     "[Create an account](" });
		
		words.add(new String[] { "](/azure/event-grid)",                  "](/event-grid)" });
		words.add(new String[] { "](/azure/active-directory",             "](/active-directory" });
		words.add(new String[] { "](/azure/active-directory-b2c",         "](/active-directory-b2c" });
		words.add(new String[] { "](/azure/automation",                   "](/automation" });
		words.add(new String[] { "](/azure/azure-portal",                 "](/azure-portal" });
		words.add(new String[] { "](/azure/azure-monitor",                "](/azure-monitor" });
		words.add(new String[] { "](/azure/application-insights/)",       "](/azure-monitor/overview)" });
		words.add(new String[] { "](/azure/azure-functions/",             "](/azure-functions/" });	
		words.add(new String[] { "](/azure/application-gateway",          "](/application-gateway" });
		words.add(new String[] { "](/azure/azure-resource-manager",       "](/azure-resource-manager" });	
		words.add(new String[] { "](/azure/azure-portal/",                "](/azure-portal/" });		
		words.add(new String[] { "](/azure/backup",                       "](/backup" });
		words.add(new String[] { "](/azure/billing",                      "](/billing" });
		words.add(new String[] { "](/azure/cloud-services/",              "](/cloud-services/" });
		words.add(new String[] { "](/azure/data-explorer",                "](/data-explorer" });
		words.add(new String[] { "](/azure/data-factory",                 "](/data-factory" });
		words.add(new String[] { "](/azure/expressroute)",                "](/expressroute)" });
		
		words.add(new String[] { "](/azure/event-hubs",                   "](/event-hubs" });
		words.add(new String[] { "](/azure/role-based-access-control",    "](/role-based-access-control" });
		words.add(new String[] { "](/azure/iot-hub",                      "](/iot-hub" });
		words.add(new String[] { "](/azure/governance",                   "](/governance" });
		words.add(new String[] { "](/azure/network-watcher",              "](/network-watcher" });
		words.add(new String[] { "](/azure/virtual-network",              "](/virtual-network" });
		words.add(new String[] { "](/azure/vpn-gateway",                  "](/vpn-gateway" });
		words.add(new String[] { "](/azure/virtual-machines/",            "](/virtual-machines/" });
		words.add(new String[] { "](/azure/kusto",                        "](/kusto" });
		words.add(new String[] { "](/azure/key-vault",                    "](/key-vault" });
		words.add(new String[] { "](/azure/synapse-analytics",            "](/synapse-analytics" });
		words.add(new String[] { "](/azure/service-bus-messaging",        "](/service-bus-messaging" });
		words.add(new String[] { "](/azure/storage",                      "](/storage" });
		words.add(new String[] { "](/azure/security/",                    "](/security/" });
		words.add(new String[] { "](/azure/security-center",              "](/security-center" });
		words.add(new String[] { "](/azure/information-protection",       "](/information-protection" });
		words.add(new String[] { "](/information-protection/develop",     "](https://docs.microsoft.com/information-protection/develop" });
		words.add(new String[] { "](/azure/sql-database",                 "](/sql-database" });
		words.add(new String[] { "](/azure/app-service",                  "](/app-service" });
		words.add(new String[] { "](/azure/logic-apps",                   "](/logic-apps" });
		words.add(new String[] { "](/azure/event-grid",                   "](/event-grid" });
		words.add(new String[] { "](/azure/traffic-manager",              "](/traffic-manager" });
		
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		
		words.add(new String[] { "](/graph",                             "](https://docs.microsoft.com/graph" });
		words.add(new String[] { "](/intune",                            "](https://docs.microsoft.com/intune" });
		words.add(new String[] { "](/dotnet/api",                        "](https://docs.microsoft.com/dotnet/api" });
		words.add(new String[] { "](/windows-server",                    "](https://docs.microsoft.com/windows-server" });
		words.add(new String[] { "](/aspnet/",                           "](https://docs.microsoft.com/aspnet/" });
		words.add(new String[] { "](/xamarin",                           "](https://docs.microsoft.com/xamarin" });
		words.add(new String[] { "](/previous-versions/",                "](https://docs.microsoft.com/previous-versions/" });
		words.add(new String[] { "](/sharepoint/",                       "](https://docs.microsoft.com/sharepoint/" });
		words.add(new String[] { "](/office365/",                        "](https://docs.microsoft.com/office365/" });
		words.add(new String[] { "](/mem/",                              "](https://docs.microsoft.com/mem/" });
		words.add(new String[] { "](/microsoft-identity-manager/",       "](https://docs.microsoft.com/microsoft-identity-manager/" });
		words.add(new String[] { "](/Exchange",                          "](https://docs.microsoft.com/Exchange" });
		words.add(new String[] { "](/skypeforbusiness",                  "](https://docs.microsoft.com/skypeforbusiness" });
		words.add(new String[] { "](/archive/",                          "](https://docs.microsoft.com/archive/" });
		words.add(new String[] { "](/answers",                           "](https://docs.microsoft.com/answers" });
		words.add(new String[] { "](/windows/",                          "](https://docs.microsoft.com/windows/" });
		words.add(new String[] { "](/microsoft-365/",                    "](https://docs.microsoft.com/microsoft-365/" });
		words.add(new String[] { "](/sql/",                              "](https://docs.microsoft.com/sql/" });
		words.add(new String[] { "](/powershell/",                       "](https://docs.microsoft.com/powershell/" });
		words.add(new String[] { "](/dynamics365",                       "](https://docs.microsoft.com/dynamics365" });
		words.add(new String[] { "](/power-bi/",                         "](https://docs.microsoft.com/power-bi/" });
		words.add(new String[] { "](/exchange/",                         "](https://docs.microsoft.com/exchange/" });
		words.add(new String[] { "](/iis",                               "](https://docs.microsoft.com/iis" });
		words.add(new String[] { "](/configmgr",                         "](https://docs.microsoft.com/configmgr" });
		words.add(new String[] { "](/windows-hardware",                  "](https://docs.microsoft.com/windows-hardware" });
		words.add(new String[] { "](/universal-print",                   "](https://docs.microsoft.com/universal-print" });
		words.add(new String[] { "](/home",                              "](https://docs.microsoft.com/home" });
		words.add(new String[] { "](/python/api",                        "](https://docs.microsoft.com/python/api" });
		words.add(new String[] { "](/samples",                           "](https://docs.microsoft.com/samples" });
		words.add(new String[] { "](/azure/templates",                   "](https://docs.microsoft.com/azure/templates" });
		words.add(new String[] { "](/visualstudio/azure",                "](https://docs.microsoft.com/visualstudio/azure" });
		words.add(new String[] { "](/security-updates",                  "](https://docs.microsoft.com/security-updates" });
		
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
	} 
}
