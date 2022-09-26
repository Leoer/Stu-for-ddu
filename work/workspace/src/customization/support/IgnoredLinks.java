package customization.support;

import java.util.ArrayList;
import java.util.List;

public class IgnoredLinks {
	private static final List<String> ignoredLinks = new ArrayList<String>(100);
	
	public synchronized static List<String> getIgnoredLinks() {
		return ignoredLinks;
	}
	
	public synchronized static void setIgnoredLinks() {
		ignoredLinks.add("http://stackoverflow.com/questions/tagged/msal"); 
		ignoredLinks.add("http://stackoverflow.com/questions/13386471/fixing-slow-initial-load-for-iis"); 
		ignoredLinks.add("http://stackoverflow.com/questions/13917205/iis-7-5-web-application-first-request-after-app-pool-recycle-very-slow"); 
		
		ignoredLinks.add("http://go.microsoft.com/fwlink/?LinkId=746481"); 
		ignoredLinks.add("http://go.microsoft.com/fwlink/?LinkId=746482"); 
		ignoredLinks.add("http://go.microsoft.com/fwlink/?LinkId=746483"); 
		
		ignoredLinks.add("http://www.windowsazure.com/develop/downloads/"); 
		
		ignoredLinks.add("https://jenkins.io/"); 
		ignoredLinks.add("https://aka.ms/azafrv2"); 
		
		ignoredLinks.add("http://website.com/"); 
		
		ignoredLinks.add("http://open.qq.com"); 
		ignoredLinks.add("https://aka.ms/AADB2CandGDPR"); 
		ignoredLinks.add("https://aka.ms/MigratetoAADB2C"); 
		ignoredLinks.add("https://aka.ms/b2coverview"); 
		ignoredLinks.add("https://aka.ms/aadposh");
		
		ignoredLinks.add("https://go.microsoft.com/fwlink/?LinkId=615771"); 
		ignoredLinks.add("https://go.microsoft.com/fwlink/?LinkID=396590"); 
		 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-java-webapp"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-java-webapp/blob/d55ee4ac0ce2c43378f2c99fd6e6856d41bdf144/src/main/resources/application.properties"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-java-webapp/blob/master/msal-java-webapp-sample/src/main/java/com/microsoft/azure/msalwebsample/AuthFilter.java"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-java-webapp/blob/d55ee4ac0ce2c43378f2c99fd6e6856d41bdf144/src/main/java/com/microsoft/azure/msalwebsample/AuthPageController.java#L30-L48"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-java-webapp/blob/d55ee4ac0ce2c43378f2c99fd6e6856d41bdf144/src/main/java/com/microsoft/azure/msalwebsample/AuthPageController.java#L50-L60"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-java-webapp/blob/master/msal-java-webapp-sample/src/main/resources/templates/index.html"); 
		
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-aspnetcore-webapp-tutorial"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-aspnet-webapp-openidconnect/blob/a2da310539aa613b77da1f9e1c17585311ab22b7/WebApp/Controllers/AccountController.cs#L16-L23"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-aspnet-webapp-openidconnect/blob/a2da310539aa613b77da1f9e1c17585311ab22b7/WebApp/Controllers/AccountController.cs#L25-L31"); 
		
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-daemon"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-daemon/blob/master/1-Call-MsGraph-WithSecret/parameters.json"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-daemon/blob/master/2-Call-MsGraph-WithCertificate/parameters.json"); 
		
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp/blob/0.1.0/app_config.py"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp/blob/e03be352914bfbd58be0d4170eba1fb7a4951d84/app.py#L1-L28"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp/blob/0.1.0/app.py#L14-L18"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp/blob/48637475ed7d7733795ebeac55c5d58663714c60/app.py#L47-L48"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp/blob/e03be352914bfbd58be0d4170eba1fb7a4951d84/app.py#L20-L28"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp/blob/e03be352914bfbd58be0d4170eba1fb7a4951d84/app.py#L81-L88"); 
		ignoredLinks.add("https://github.com/Azure-Samples/ms-identity-python-webapp/blob/e03be352914bfbd58be0d4170eba1fb7a4951d84/templates/index.html#L10"); 
		
		ignoredLinks.add("https://github.com/AzureAD/microsoft-identity-web/wiki/web-app-template"); 
		ignoredLinks.add("https://github.com/AzureAD/microsoft-identity-web/blob/master/src/Microsoft.Identity.Web.UI/Areas/MicrosoftIdentity/Controllers/AccountController.cs"); 
		ignoredLinks.add("https://github.com/AzureAD/microsoft-identity-web/blob/master/src/Microsoft.Identity.Web.UI/Areas/MicrosoftIdentity/Pages/Account/SignedOut.cshtml.cs"); 
		ignoredLinks.add("https://github.com/AzureAD/microsoft-identity-web/wiki");
		ignoredLinks.add("https://github.com/AzureAD/microsoft-identity-web/issues/133"); 
		
		ignoredLinks.add("https://github.com/AzureAD/microsoft-authentication-library-for-java/wiki");
		ignoredLinks.add("https://github.com/AzureAD/microsoft-authentication-library-for-java/tree/dev/src/samples"); 
		ignoredLinks.add("https://github.com/AzureAD/microsoft-authentication-library-for-java/blob/dev/src/samples/confidential-client/"); 
		ignoredLinks.add("https://github.com/AzureAD/microsoft-authentication-library-for-python/wiki"); 
		ignoredLinks.add("https://github.com/AzureAD/microsoft-authentication-library-for-dotnet/issues/747"); 

		ignoredLinks.add("https://github.com/AzureAD/azure-activedirectory-identitymodel-extensions-for-dotnet/wiki"); 

		ignoredLinks.add("https://github.com/Azure-Samples/microsoft-identity-platform-console-daemon"); 
		ignoredLinks.add("https://github.com/Azure-Samples/microsoft-identity-platform-aspnet-webapp-daemon"); 
		
		ignoredLinks.add("https://github.com/Azure-Samples/active-directory-aspnetcore-webapp-openidconnect-v2/tree/master/1-WebApp-OIDC/1-1-MyOrg#register-the-webapp-app-webapp"); 
		ignoredLinks.add("https://github.com/Azure-Samples/active-directory-dotnetcore-daemon-v2"); 
		ignoredLinks.add("https://github.com/Azure-Samples/active-directory-dotnetcore-daemon-v2/blob/master/1-Call-MSGraph/daemon-console/AuthenticationConfig.cs"); 
		ignoredLinks.add("https://github.com/Azure-Samples/active-directory-dotnetcore-daemon-v2/blob/master/1-Call-MSGraph/daemon-console/appsettings.json"); 
		ignoredLinks.add("https://github.com/Azure-Samples/active-directory-dotnet-web-single-sign-out#register-the-service-app-webapp-distributedsignout-dotnet"); 
		
		ignoredLinks.add("https://github.com/microsoftgraph/msgraph-training-rubyrailsapp"); 
		ignoredLinks.add("https://github.com/microsoftgraph/msgraph-training-aspnetmvcapp"); 
		ignoredLinks.add("https://github.com/microsoftgraph/msgraph-community-samples/tree/master/samples#aspnet"); 
		ignoredLinks.add("https://github.com/microsoftgraph/msgraph-community-samples"); 
		
		ignoredLinks.add("https://github.com/azure-samples/active-directory-xamarin-native-v2"); 
		ignoredLinks.add("https://github.com/azure-samples/active-directory-ios-swift-native-v2"); 
		
		ignoredLinks.add("https://www.mongodb.com/"); 
		ignoredLinks.add("http://flask.pocoo.org/"); 
		ignoredLinks.add("http://www.mongodb.org/"); 
		ignoredLinks.add("http://jade-lang.com"); 
		ignoredLinks.add(""); 
		ignoredLinks.add(""); 
		ignoredLinks.add(""); 
		ignoredLinks.add(""); 
	}
		
}
