package customization.support;

import java.util.ArrayList;
import java.util.List;

public class WarningWordsSupport {

	private static final List<String> warningWords = new ArrayList<String>(100);
	
	public synchronized static List<String> getWarningWords() {		
		return warningWords;
	}
	
	public synchronized static void setWarningWords() {		
		
	    // 09/15/2021, used in zh-cn, should be "
		warningWords.add("&quot;");
		
		// TODO
		// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		warningWords.add("Portal Tour");
		warningWords.add("zh-cn/documentation");
		warningWords.add("West");
		warningWords.add("west");
		warningWords.add("westus");
		warningWords.add("Asia");
		warningWords.add("South");
		warningWords.add("free-trial");
		warningWords.add("free trial");
		warningWords.add("http://azure.microsoft.com/pricing");
		warningWords.add("美国");
		warningWords.add("欧洲");
		warningWords.add("日本");
		warningWords.add("预览门户");
		warningWords.add("预览 门户");
		warningWords.add("Central India");
		warningWords.add("日本东部");
		warningWords.add("japan");
		warningWords.add("Europe");
		warningWords.add("japaneast");
		warningWords.add("japan east");
		warningWords.add("Japan East");
		warningWords.add("West India");
		warningWords.add("南亚");
		warningWords.add("Australia");
		warningWords.add("America");
		warningWords.add("Australia Southeast");
		warningWords.add("美国中北部");
		warningWords.add("Australia East");
		warningWords.add("西欧");
		warningWords.add("日本西部");
		warningWords.add("东亚");
		warningWords.add("美国中南部");
		warningWords.add("India");
		warningWords.add("South India");
		warningWords.add("巴西南部");
		warningWords.add("北欧");
		warningWords.add("美国中部");
		warningWords.add("美国东部");
		warningWords.add("美国西部");
		warningWords.add("亚洲");
		warningWords.add("East US");
		warningWords.add("westeurope");
		warningWords.add("] (");
		warningWords.add("azure.microsoft.com/blog/azure-limits-quotas-increase-requests");
//		warningWords.add("Import-AzurePublishSettingsFile");
//		warningWords.add("Get-AzurePublishSettingsFile");
		warningWords.add("( media/");
		warningWords.add("免费账户");
		warningWords.add("Runbook types");
		warningWords.add("free account");
		warningWords.add("Free Account");
		warningWords.add("free Azure subscription");
		warningWords.add("Active Geo-Replication is available for");
		warningWords.add("活动异地复制适用于");
		warningWords.add("Member Offers");
		warningWords.add("twitter");
		warningWords.add("youtube");
		warningWords.add("http://azure.microsoft.com/pricing");
		warningWords.add("https://azure.microsoft.com/pricing");
		warningWords.add("manage/services/notification-hubs/notify-users");
		warningWords.add(".\\media");
		warningWords.add(".media");
		warningWords.add("[comment]:");
		warningWords.add("pricing/member-offers/msdn-benefits-details");
		// power-bi-embedded - no use link - need remove
		warningWords.add("[Web 应用示例仪表板](http://go.microsoft.com/fwlink/?LinkId=761493)");
		warningWords.add("[示例入门](/power-bi-embedded/power-bi-embedded-get-started-sample/)");
		// DefaultEndpointsProtocol=https;AccountName=MyAccountName;AccountKey=MyAccountKey;EndpointSuffix=core.chinacloudapi.cn
//		warningWords.add("DefaultEndpointsProtocol"); // end with "EndpointSuffix=core.chinacloudapi.cn"
		warningWords.add("key-vault-hsm-protected-keys");
//		warningWords.add("key-vault-logging");
		warningWords.add("Select-AzureRmSubscription -SubscriptionName $subscr -Current");
		warningWords.add("mobile-services/index.md"); // mobile-services is useless
		warningWords.add("http://azure.microsoft.com/en-us/documentation");
		warningWords.add("http://azure.microsoft.com/documentation");
		warningWords.add("cognitive.microsoft.com");

		warningWords.add("https://docs.microsoft.com//azure");
		warningWords.add("https://docs.microsoft.com/azure");
		warningWords.add("https://docs.microsoft.com/en-us/azure");
		warningWords.add("https://docs.microsoft.com/en-gb/azure");
		
		// from derek
		warningWords.add("app-service-value-prop-what-is");
		warningWords.add("Connect-AzureAD"); // -> Connect-AzureAD -AzureEnvironmentName AzureChinaCloud

		warningWords.add("cloud shell");
		warningWords.add("cloud-shell");
		warningWords.add("shell.azure.com");
		
		warningWords.add("Connect-MsolService"); // Connect-MsolService -AzureEnvironment AzureChinaCloud

		warningWords.add("Add-AzureAccount"); // Add-AzureAccount -Environment AzureChinaCloud
		
		// azure graph api
		warningWords.add("graphexplorer.azurewebsites.net");     
		warningWords.add("graphexplorer.chinacloudsites.cn"); 
		warningWords.add("graph.microsoft.com/v1.0/");  
		warningWords.add("graph.windows.net");  
		warningWords.add("graph.microsoft.com"); 
		
		warningWords.add("connect health"); // in active directory

		warningWords.add("google");
		warningWords.add("facebook");
		
		
		warningWords.add("apps.dev.microsoft.com"); // no such portal for China.
		warningWords.add("portal.office.com"); // https://portal.partner.microsoftonline.cn 
		
		warningWords.add("manage.windowsazure.cn");
	    
	    warningWords.add("即用即付"); // -> 标准预付费
	    
	    
	    warningWords.add("https://azure.microsoft.com/en-us/free/?b=17.06"); // should use china address: https://account.windowsazure.cn
	    
	    warningWords.add("AzureCloud"); // should be: AzureChinaCloud
	    
	    warningWords.add("interactive shell"); // = cloud shell
	    
//	    warningWords.add("hsm");
	    warningWords.add("Set-AzsRegistration"); // need to add postfix:  -ResourceGroupLocation "ChinaEast"
	    
	    warningWords.add("Twilio");
	    
//	    warningWords.add("data-lake");
//	    warningWords.add("data lake");
	    
	    // used for notification-hubs
//	    warningWords.add("gcm");
//	    warningWords.add("fcm");
	    
	    warningWords.add("(/azure/");
	    warningWords.add("( /azure/");
	    
	    warningWords.add("<a href=\"/azure/");
	    
	    warningWords.add("Connect-AzureRmAccount"); // Connect-AzureRmAccount -Environment AzureChinaCloud
	    
	    
	    warningWords.add("https://azure.microsoft.com/documentation/services");
	    warningWords.add("https://azure.microsoft.com/services");
	    warningWords.add("http://azure.microsoft.com/documentation/services");
	    warningWords.add("http://azure.microsoft.com/services");
	    
//	    warningWords.add("Set-AzureRmVmssStorageProfile"); // add -> -OsDiskCreateOption "FromImage" `
	    
	    warningWords.add("Application Registration Portal"); // it's not supported
	    
	    warningWords.add("free account");
	    
	    warningWords.add("[free]");
	    
	    warningWords.add("resources.azure.com");
	    
	    warningWords.add("aad.portal");
	    
	    warningWords.add("Gallery Applications");
	    
	    warningWords.add("https://aka.ms/repairaadcau"); // yutubi video, not supported
	    
	    warningWords.add("westcentralus");
	    warningWords.add("west central us");
	    warningWords.add("west central");
	    warningWords.add("central us");
	    warningWords.add("centralus");

//	    warningWords.add("$");
//	    warningWords.add("charged");
	    warningWords.add("dollar");
	    
	    warningWords.add("http://aka.ms/mfasetup"); // should be changed
	    
	    warningWords.add("QR 码"); // 二维码
	    
	    warningWords.add("government");
	    
	    warningWords.add("Free trial subscription keys");
	    
	    warningWords.add("Connect-AzAccount"); // Connect-AzAccount -Environment AzureChinaCloud
	    
	    warningWords.add("#<a name=");
	    
	    warningWords.add("https://azure.microsoft.com/en-us/try/cognitive-services"); // remove
	    
	    warningWords.add("azure.microsoft.com/documentation/articles");
	    
	    warningWords.add("azure login");
	    
	    warningWords.add("Login-AzAccount"); // change to "Connect-AzAccount -Environment AzureChinaCloud"
	    warningWords.add("Login-azureRmAccount"); // check if need to change to "Connect-AzAccount -Environment AzureChinaCloud"
	    
	    warningWords.add("PowerApps");
	    warningWords.add("https://www.azure.cnhttps://www.azure.cn");
	    
	    warningWords.add("user.read"); // in ad it should be:    https://microsoftgraph.chinacloudapi.cn/user.read
	    warningWords.add("user.write"); // in ad it should be:   https://microsoftgraph.chinacloudapi.cn/user.write
	    
	    warningWords.add("Azure public cloud"); // -> Azure China Cloud
	    warningWords.add("Azure public");
	    
	    warningWords.add("https://msdn.microsoft.com/library/azure/dn768219.aspx"); // topic moved to "application proxy" in ad
	    warningWords.add("free key");
	    
	    warningWords.add("free subscription");
	    
	    warningWords.add("~/includes");
	    
	    warningWords.add("[!code");
	    warningWords.add("~/articles");
	    
	    warningWords.add("schemas.");
	    warningWords.add("azurewebsites");
	    
	    warningWords.add("(US)");
	    
	    warningWords.add("schema.management.chinacloudapi.cn"); // -> schema.management.azure.com
	    
	    warningWords.add("https://aka.ms/b2cappregintro"); // redirected to global ad
	    
	    warningWords.add(":::code language=");
	    warningWords.add("[!code-");
	    
	    warningWords.add("Create an account for free"); // remove "free"
	    warningWords.add("create one for free"); // remove "free"
	    
	    warningWords.add("align=\"right\"");
	    
	    warningWords.add("https://docs.microsoft.com https://docs.microsoft.com");
	    warningWords.add("https://docs.microsoft.comhttps://docs.microsoft.com");
	    
	    warningWords.add("https://docs.azure.cn https://docs.azure.cn");
	    warningWords.add("https://docs.azure.cnhttps://docs.azure.cn");
	    
	    warningWords.add("youtu.be");
	    
	    // -> https://support.azure.cn/zh-cn/support/support-azure/
//	    warningWords.add("azure-portal/supportability/how-to-create-azure-support-request");
	    
	    warningWords.add("1rmb");
	    
	    warningWords.add("myprofile.microsoft.com");
	    
	    warningWords.add("video");
	    
	    warningWords.add("Create an Azure subscription for free");
	    
	    warningWords.add("google.com");
	    
	    warningWords.add("Initialize-ADSyncDomainJoinedComputerSync"); // "-AzureEnvironment AzureChinaCloud" should be addedat the end
	    
	    // az cloud set -n AzureChinaCloud
	    // az login
//	    warningWords.add("az login");
	    
	    
	    warningWords.add("");
	    warningWords.add("");
	    warningWords.add("");
	}
	
}
