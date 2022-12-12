package customization.support;

import java.util.ArrayList;
import java.util.List;

public class IgnoreWordsSupport {
	
	private static final List<String> ignoredWords = new ArrayList<String>(100);
	
	public synchronized static List<String> getIgnoredWords() {
		return ignoredWords;
	}
	
	public synchronized static void setIgnoredWords() {
		ignoredWords.add("By default this is set to false, so that your application does not log personal data"); // personal
		ignoredWords.add("Microsoft personal accounts aren't supported in these clouds (by definition of these clouds)"); // personal
		
		ignoredWords.add("https://tsiclientsample.azurewebsites.net/windFarmGen.html");
		
		ignoredWords.add("-H \"Ocp-Apim-Subscription-Key: <client-secret>\" -H \"Ocp-Apim-Subscription-Region: your-region\"");
		
		ignoredWords.add("secure.aadcdn.microsoftonline-p.com/lib/1.0.0/js/msal.js");
		
		ignoredWords.add("https://docs.microsoft.com/azure/#pivot=products");
		
		ignoredWords.add("The Azure AD Connector account is supposed to be service free");
		
		ignoredWords.add("DefaultEndpointsProtocol=https;AccountName=[name];AccountKey=[key];EndpointSuffix=core.chinacloudapi.cn");
		
		ignoredWords.add("https://docs.microsoft.com/azure/developer");
		
		ignoredWords.add("com.google.code.gson");
		ignoredWords.add("com.google.gson");
		ignoredWords.add("github.com/google/gson");
		ignoredWords.add("ajax.googleapis.com");
		ignoredWords.add("Google Android");
		ignoredWords.add("Google Chrome");
		ignoredWords.add("googleapis");
		ignoredWords.add("google()");
		
		ignoredWords.add("English (US)");
		
		ignoredWords.add("demasiados"); // asia
		ignoredWords.add("demasiadas"); // asia
		
		ignoredWords.add("Italian, Japanese, Korean");
		ignoredWords.add("Japanese (ja-JP)");
		ignoredWords.add("Japanese              | ja            |");
		ignoredWords.add("in Japanese");
		ignoredWords.add("from Japanese");
		ignoredWords.add("\"Japanese\"");
		ignoredWords.add("\"Jpan\"");
		ignoredWords.add("<option value=\"ja\">Japanese</option>");
		ignoredWords.add("<option value=\"(ja-JP, HarukaRUS)\">Japanese | Female | HarukaRUS</option>");
		ignoredWords.add("<option value=\"(ja-JP, Ichiro, Apollo)\">Japanese | Male | Ichiro</option>");
		
//		ignoredWords.add("Login-AzureRmAccount -EnvironmentName AzureChinaCloud");
		ignoredWords.add("Connect-AzureAD -AzureEnvironmentName AzureChinaCloud");
		ignoredWords.add("Connect-AzureRmAccount -Environment AzureChinaCloud");
		ignoredWords.add("Connect-AzAccount -Environment AzureChinaCloud");
		ignoredWords.add("how-to-connect-azureadaccount");
		
		ignoredWords.add("connect-msolservice-failed");
		ignoredWords.add("`Connect-MsolService`");
		ignoredWords.add("[Connect-MsolService parameter reference]");
		ignoredWords.add("/msonline/connect-msolservice");
		
		ignoredWords.add("[Connect-AzureAD]");
		ignoredWords.add("connect-azuread?view");
		ignoredWords.add("Connect-MsolService -Credential $cred -AzureEnvironment AzureChinaCloud");
		ignoredWords.add("/az.accounts/connect-azaccount");
		ignoredWords.add("[Connect-AzAccount]");
		ignoredWords.add("/powershell/module/az.accounts/connect-azaccount");
		ignoredWords.add("/powershell/module/AzureAD/Connect-AzureAD");
		ignoredWords.add("``Connect-AzureAD``");
		
		ignoredWords.add("`Connect-AzureRmAccount`");
		ignoredWords.add("Add-AzureAccount -Environment AzureChinaCloud");
		
		// Connect-MsolService
		ignoredWords.add("Connect-MsolService -AzureEnvironment AzureChinaCloud");
		ignoredWords.add("[Connect-MsolService]");
		ignoredWords.add("powershell/module/msonline/connect-msolservice");
		
		ignoredWords.add("https://aka.ms/vsdownload?utm_source=mscom&utm_campaign=msdocs");
		ignoredWords.add("https://aka.ms/msidentity-aspnetcore-webapi-calls-msgraph");
		ignoredWords.add("https://aka.ms/authenticationDeploymentPlan");
		ignoredWords.add("https://aka.ms/aspnetcore-webapp-call-msgraph");
		ignoredWords.add("https://aka.ms/msidentity-aspnetcore-webapi");
		ignoredWords.add("https://aka.ms/aspnetcore-webapp-sign-in");
		ignoredWords.add("https://aka.ms/aadb2ciosappauthropc");
		ignoredWords.add("https://aka.ms/spolimitedaccessdocs");
		ignoredWords.add("https://aka.ms/adfstophsdpdownload");
		ignoredWords.add("https://aka.ms/aadb2cappauthropc");
		ignoredWords.add("https://aka.ms/owalimitedaccess");
		ignoredWords.add("https://aka.ms/deviceloginchina");
		ignoredWords.add("https://aka.ms/repairaadconnect");
		ignoredWords.add("https://aka.ms/aadrptclaimrules");
		ignoredWords.add("https://aka.ms/Office365SIM");
		ignoredWords.add("https://aka.ms/AA2kvvu");
		ignoredWords.add("https://aka.ms/devchat");
		ignoredWords.add("https://aka.ms/aadposh");
		ignoredWords.add("https://aka.ms/azafrv2");
				
		ignoredWords.add("https://aka.ms/msal-net-interactive");
		ignoredWords.add("https://aka.ms/msal-net-adfs-support");
		ignoredWords.add("https://aka.ms/msal-net-iwa");
		ignoredWords.add("https://aka.ms/msal-net");
		ignoredWords.add("https://aka.ms/adal-net");
		ignoredWords.add("https://aka.ms/adalnet");
		
		ignoredWords.add("docs.microsoft.com/azure-advanced-threat-protection");
		ignoredWords.add("docs.microsoft.com/azure/go/azure-sdk-go-install");
		ignoredWords.add("docs.microsoft.com/azure/javascript");
		ignoredWords.add("docs.microsoft.com/azure/java/api");
		ignoredWords.add("https://docs.microsoft.com/azure/architecture");
		
		ignoredWords.add("/media/active-directory-v2-flows");
		
		ignoredWords.add("schema.management.azure.com");
		ignoredWords.add("schemas.contoso.com");
		
		ignoredWords.add("docs.microsoft.com/azure/templates");
		
		ignoredWords.add("AssertStringClaimsAreEqual"); // msa
		
		// ignore all file: https://login.microsoftonline.com/static/tenant/default/*.cshtml
		// eg: https://login.microsoftonline.com/static/tenant/default/exception.cshtml
		ignoredWords.add("https://login.microsoftonline.com/static/tenant/default/");
		
		ignoredWords.add("\"AS\\\":\\\"American Samoa");
		ignoredWords.add("\"AU\\\":\\\"Australia");
		ignoredWords.add("TF\\\":\\\"French Southern Territories");
		ignoredWords.add("\"IO\\\":\\\"British Indian Ocean Territory");
		ignoredWords.add("\"IN\\\":\\\"India");
		ignoredWords.add("\"JP\\\":\\\"Japan");
		ignoredWords.add("|Japanese |");
		ignoredWords.add("\"ZA\\\":\\\"South Africa");
		ignoredWords.add("\"GS\\\":\\\"South Georgia and South Sandwich Islands");
		ignoredWords.add("\"SS\\\":\\\"South Sudan");
		
		ignoredWords.add("docs.microsoft.com/en-us/azure/china");
		ignoredWords.add("docs.microsoft.com/azure/china");
		
		ignoredWords.add("Office 365 Single Sign-On Test");
		
		ignoredWords.add("impersonation");
		ignoredWords.add("personalization");
		ignoredWords.add("AzureAdAndPersonalMicrosoftAccount");
		ignoredWords.add("privatepersonalidentifier");
		
		ignoredWords.add("AzureCloudInstance.AzureChina");
		ignoredWords.add("AzureCloudInstance");
		
		ignoredWords.add("Microsoft.Media");
		ignoredWords.add("Windows.Media");
		ignoredWords.add("Images.Media");
		
		ignoredWords.add("azure login -e AzureChinaCloud");
		
		ignoredWords.add("microsoftgraph.chinacloudapi.cn/user.read"); // user.read
		ignoredWords.add("microsoftgraph.chinacloudapi.cn/user.write");  // user.write
		ignoredWords.add("a scope value `user.read` maps to `");
		ignoredWords.add("microsoftgraph.chinacloudapi.cn%2Fuser.read");
		ignoredWords.add("*user.read* scope");
		ignoredWords.add("`user.read` scope");
		
		ignoredWords.add("User.ReadBasic");
		ignoredWords.add("permission **User.Read**");
		ignoredWords.add("User.Read.All");
		ignoredWords.add("**user.read**");
		
		ignoredWords.add("TextAnalytics.V2.0");
		
		ignoredWords.add("| 美国 | 美国 | 13 | 18 |");
		ignoredWords.add("| {Culture:RegionName} | 区域的两字母 ISO 代码。 | 美国 |");
		ignoredWords.add("\"JP\\\":\\\"日本\\\"");
		ignoredWords.add("\"美国\\\":\\\"美国\\\"");
		
		ignoredWords.add("<a name=\"review-apis\">");
		
		ignoredWords.add("schemas.microsoft.com");
		ignoredWords.add("schemas.android.com");
		ignoredWords.add("schemas.xmlsoap.org");
		
		ignoredWords.add("supplemental terms of use");
		
		ignoredWords.add("least user"); // east us
		ignoredWords.add("least");
		
		ignoredWords.add("Azure AD Free");
		ignoredWords.add("Feel free to");
		ignoredWords.add("free to fork");
		ignoredWords.add("Download Visual Studio 2019 for free");
		ignoredWords.add("free Azure AD");
		ignoredWords.add("freely for anyone to use");
		
		ignoredWords.add("DS1_V2");
		ignoredWords.add("Standard_v2");
		ignoredWords.add("Standard_DS2_v2");
		
		ignoredWords.add("M365-identity-device-management");
		
		ignoredWords.add("# Authentication");
		ignoredWords.add("#authentication");
		ignoredWords.add("authentication.");
		ignoredWords.add("Authentication isn't");
		ignoredWords.add("authentication]");
		ignoredWords.add("msrest.authentication");
		ignoredWords.add("\"Authentication\"");
		ignoredWords.add("specify authentication");
		ignoredWords.add("setting authentication");
		ignoredWords.add("authentication-key");
		ignoredWords.add("object authentication");
		ignoredWords.add("an authentication");
		ignoredWords.add("Allows authentication");
		ignoredWords.add("Basic Authentication");
		ignoredWords.add("Authentication header");
		ignoredWords.add("for authentication");
		ignoredWords.add("authentication token");
		ignoredWords.add("Authentication service");
		ignoredWords.add(">Authentication<");
		ignoredWords.add("\"authentication\"");
		ignoredWords.add("authentication required");
		
		ignoredWords.add("Premium Storage");
		
		ignoredWords.add("IncludeInSso");
		ignoredWords.add("associate");
		ignoredWords.add("Psso");
		ignoredWords.add("IDPSSODescriptor");
		ignoredWords.add("bypassonlocal");
		ignoredWords.add("ADSyncToolsSourceAnchorChanged");
		ignoredWords.add("应用程序 SSO");
		ignoredWords.add("桌面 SSO");
		ignoredWords.add("successor");
		ignoredWords.add("association");
		ignoredWords.add("processor");
		
		ignoredWords.add("MSAL");
		
		ignoredWords.add("fewest");
		ignoredWords.add("lowest");
		ignoredWords.add("login-east");
		ignoredWords.add("login-west");
		ignoredWords.add("apwestgarth");
		ignoredWords.add("newest");
		ignoredWords.add("MDM policy - West");
		
		ignoredWords.add("personalize");
		
		ignoredWords.add("acceptable"); // pta
		
		ignoredWords.add("v20");
		
		ignoredWords.add("acceptance");

		ignoredWords.add("Asia Pacific");
		
		ignoredWords.add("media/concept-authentication-methods");
		ignoredWords.add("media/concept-authentication-passwordless");
		
		ignoredWords.add("AzureCloudChina");
		
		ignoredWords.add("Azure AD Free");
		ignoredWords.add("Azure AD free");
		ignoredWords.add("Visual Studio for free");
		ignoredWords.add("puffinFree");
		
		ignoredWords.add("Policies\\Google\\Chrome");
		ignoredWords.add("clients2.google.com");
		
		ignoredWords.add("[Add-AzureAccount]");
		ignoredWords.add("azure.service/add-azureaccount");
		
		ignoredWords.add("Get-AzurePublishSettingsFile -Environment");
		
		ignoredWords.add("[free](https://github.com/join)");
		
		ignoredWords.add("Azure cloud service");
		
		ignoredWords.add("Connect-AzAccount -EnvironmentName AzureChinaCloud");
		
		ignoredWords.add("");
		ignoredWords.add("");
	}
	
}
