package customization.services;

import java.util.ArrayList;
import java.util.List;

public class AD_B2C {
	private static final List<String[]> words = new ArrayList<String[]>(200);
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("media/phone-authentication");
		ignoredWords.add("basic-age-gating.md");
		
		ignoredWords.add("media/custom-email-mailjet");
		ignoredWords.add("github.com/azure-ad-b2c/samples/tree/master/policies/custom-email-verifcation-displaycontrol");
		
		ignoredWords.add("custom-policy-multi-factor-authentication");
		ignoredWords.add("customize-ui-with-html");
		
		ignoredWords.add("customize-ui.html");
		ignoredWords.add("Microsoft Authentication Library (MSAL)");
		
		ignoredWords.add("add-custom-domain");
		
		ignoredWords.add("");
		ignoredWords.add("");
		
		return ignoredWords;
	}
	
	public synchronized static List<String[]> getWords() {
//		words.add(new String[] { "aadb2cplayground.chinacloudsites.cn",   "aadb2cplayground.azurewebsites.net" });
		
		words.add(new String[] { "https://aka.ms/b2cappregintro",        "/active-directory/develop/app-registrations-training-guide-for-app-registrations-legacy-users" });
		
		words.add(new String[] { "https://aka.ms/b2cappregistrations",   "https://portal.azure.cn/#blade/Microsoft_AAD_B2CAdmin/TenantManagementMenuBlade/registeredApps" });
		
		words.add(new String[] { "https://aka.ms/b2cappregtraining",      "/active-directory-b2c/app-registrations-training-guide" });
		
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });
		words.add(new String[] { "",   "" });

		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
	    warningWords.add("Microsoft Account");
	    
	    warningWords.add("Facebook");
	    
	    warningWords.add("-fb"); // facebook
	    
	    warningWords.add("amzn"); // amazon
	    
	    warningWords.add("goog"); // google
	    
	    warningWords.add("msa"); // microsoft account
	    
//	    warningWords.add("Sign-up policies");
//	    warningWords.add("sign-in policies");
//	    warningWords.add("Profile editing policies");
//	    warningWords.add("Password reset policies");
//	    warningWords.add("Resource Owner policies");
	    
	    warningWords.add("b2clogin.com");
	    
//	    warningWords.add("basic");
//	    warningWords.add("basic authentication"); // 11/26/2019, 相关内容要删掉，johnny 确认
//	    warningWords.add("If the type of authentication is set to `Basic`");  // 'basic authentication' needs to be removed after 12/01/2019. 
	    
	    warningWords.add("multi-factor-authentication");
	    
	    warningWords.add("API connector");
	    
	    // 12/14/2021, display-control-time-based-one-time-password.md not available
	    warningWords.add("TOTP");
	    
	    warningWords.add("");
	    warningWords.add("");
	    warningWords.add("");
	    
	    return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
//		attentionWords.add(new String[]{"active-directory-b2c-reference-audit-logs.md",           "\"## Get audit logs with the Azure AD reporting API\" 部分的内容不适应acn ad, 删掉"});
		
		attentionWords.add(new String[]{"identity-provider-wechat.md",                           "\"备注\" 部分， 增加： \"中国区暂不支持 Google, Facebook, Twitter 作为标识提供者。\""});
		
//		attentionWords.add(new String[]{"TOC.yml",                                               "增加 \"identity-provider-wechat.md, identity-provider-weibo.md, identity-provider-qq.md\""});
		
		// 07/23/2019
		attentionWords.add(new String[]{"active-directory-b2c-reference-threat-management.md",    "\"## Manage password protection settings\" 和 \"## View locked-out accounts\" 部分的内容都不支持"});
		
		attentionWords.add(new String[]{"restful-technical-profile.md",                            "搜索 \"basic\". \"basic authentication\" 相关的内容要删掉，johnny确认, go live after 12/01, need johnny confirm. "});
		
		attentionWords.add(new String[]{"multi-factor-authentication.md",                         "## Set multi-factor authentication 部分China与global不一样，下次再看看是否一样"});
		
		attentionWords.add(new String[]{"azure-monitor.md",                                      "Need \"lighthouse\" in lastest version. Check if it can be customized before updating."});
		
		attentionWords.add(new String[]{"add-sign-up-and-sign-in-policy.md",                     "删除图片 add-sign-up-and-sign-in-flow.png "});
		
		attentionWords.add(new String[]{"multi-factor-authentication.md",                       "不适用 ACN, 继续使用 custom-policy-multi-factor-authentication.md"});
		
		attentionWords.add(new String[]{"tutorial-create-user-flows.md",                         "前面必须加上关于facebook的说明！！！！！"});
		
		attentionWords.add(new String[]{"create-user-flow.md",                                  "Remove \"phone\" in \"Configure local IDP\", no phone in portal"});
		
		attentionWords.add(new String[]{"add-password-change-policy.md",                        "Self-service password reset 部分不符合，但是如果删了的话，整篇文章可能就不能用了"});
		
		attentionWords.add(new String[]{"sign-in-options.md",                                   "identity provider local 没有 Phone sign in, 相关内容要删掉"});
		
		attentionWords.add(new String[]{"identity-provider-local.md",                           "没有 Phone sign in, 相关内容要删掉"});
		
		attentionWords.add(new String[]{"tutorial-configure-password-hash-sync.md",             "\"启用密码哈希同步\" 部分的代码中使用 Microsoft Azure AD Sync 和 Microsoft Azure Active Directory Connect"});
		
		attentionWords.add(new String[]{"",           ""});
		attentionWords.add(new String[]{"",           ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// 01/18/2021, no All services -> App registrations -> Identity Experience Framework
		// 05/19/2021, sent feedback on global page
		uselessFiles.add("configure-user-input.md");
		uselessFiles.add("");
		uselessFiles.add("");
		
		
		// 04/02/2019, "Help + support" content differ from acn portal.
		uselessFiles.add("active-directory-b2c-support.md");

		// 04/02/2019, too many "facebook" in it.
		uselessFiles.add("claims-transformation-technical-profile.md");
		uselessFiles.add("social-transformations.md");
		
		// 04/03/2019, sample in it need twitter.
		uselessFiles.add("oauth1-technical-profile.md");
		
		// 04/03/2019, sample in it need facebook.
		uselessFiles.add("oauth2-technical-profile.md");
		
		// 02/03/2020, no region about China.
		uselessFiles.add("data-residency.md");
		// 02/03/2020, use facebook as an example
		uselessFiles.add("migrate-social-identities.md");
		// 02/03/2020, need google/facebook/microsoft account which is not supported
		uselessFiles.add("quickstart-native-app-desktop.md");
		uselessFiles.add("quickstart-single-page-app.md");
		uselessFiles.add("quickstart-web-app-dotnet.md");
		
		// 02/04/2020, use facebook as example. 
		uselessFiles.add("view-audit-logs.md");
		
		// 02/04/2020, need /active-directory/reports-monitoring/concept-reporting-api
		uselessFiles.add("view-usage-reports.md");
		
		// 03/04/2020, devops not supported currently
		uselessFiles.add("deploy-custom-policies-devops.md");
		
		// 04/16/2020, no "Create Azure AD B2C user" 
		uselessFiles.add("manage-users-portal.md");
		
		// 06/24/2020, test failed
		uselessFiles.add("tutorial-web-app-python.md");
		
		// 07/27/2020, no mailjet in portal
		uselessFiles.add("custom-email-mailjet.md");
		
		// 05/17/2021, no "New API connector" in portal blade, try next time.
		uselessFiles.add("add-api-connector.md");
		uselessFiles.add("api-connectors-overview.md");
		uselessFiles.add("api-connector-samples.md");
		uselessFiles.add("secure-rest-api.md");
		uselessFiles.add("custom-policy-rest-api-claims-exchange.md");
		uselessFiles.add("add-api-connector-token-enrichment.md");
		
		// 11/16/2020, not fit for China. 
		uselessFiles.add("whats-new-docs.md");
		
		//01/04/2021, no "phone" in ACN. 
		uselessFiles.add("phone-authentication-user-flows.md");
		uselessFiles.add("");
		
	    //======================================================================================
		// 01/14/2021, send grid not supported
		uselessFiles.add("custom-email-sendgrid.md");
		
		// 02/03/2020, 
		uselessFiles.add("identity-provider-facebook.md");
		uselessFiles.add("identity-provider-amazon.md");
		uselessFiles.add("identity-provider-google.md");
		uselessFiles.add("identity-provider-twitter.md");
		uselessFiles.add("identity-provider-microsoft-account.md");
		uselessFiles.add("tutorial-add-identity-providers.md");
		// 09/27/20nt20, not able to open linked in in china.
		uselessFiles.add("ideity-provider-linkedin.md");
		// 03/10/2021, not able to visit "https://idmsa.apple.com"
		uselessFiles.add("identity-provider-apple-id.md");
		
		// 12/13/2021, 
		uselessFiles.add("identity-provider-ping-one.md");
		uselessFiles.add("identity-provider-swissid.md");
		
		// uncomment 11/19/2021
//		// 02/01/2021, no "phone" in "local account" identity providers, hard to update this doc
//		uselessFiles.add("identity-provider-local.md");
		
		// 04/03/2019, sample uses facebook
		uselessFiles.add("tutorial-add-identity-providers.md");
		
		
		//10/16/2020, identity protection not supported in ad
		uselessFiles.add("conditional-access-identity-protection-overview.md");
		uselessFiles.add("conditional-access-identity-protection-setup.md");
		uselessFiles.add("conditional-access-technical-profile.md");
		uselessFiles.add("conditional-access-user-flow.md");
		uselessFiles.add("policy-keys-overview.md");
		
		// 11/16/2020, global azure partner 
		uselessFiles.add("partner-twilio.md");
		uselessFiles.add("partner-arkose-labs.md");
		uselessFiles.add("partner-gallery.md");
		uselessFiles.add("partner-idology.md");
		uselessFiles.add("partner-itsme.md");
		uselessFiles.add("partner-trusona.md");
		uselessFiles.add("partner-typingdna.md");
		uselessFiles.add("partner-experian.md");
		uselessFiles.add("partner-lexisnexis.md");
		uselessFiles.add("partner-onfido.md");
		uselessFiles.add("partner-hypr.md");
		uselessFiles.add("partner-jumio.md");
		uselessFiles.add("partner-whoiam.md");
		uselessFiles.add("partner-saviynt.md");
		uselessFiles.add("partner-n8identity.md");
		uselessFiles.add("partner-strata.md");
		uselessFiles.add("partner-nevis.md");
		uselessFiles.add("partner-zscaler.md");
		uselessFiles.add("partner-keyless.md");
		uselessFiles.add("partner-dynamics-365-fraud-protection.md");
		uselessFiles.add("partner-ping-identity.md");
		uselessFiles.add("partner-biocatch.md");
		uselessFiles.add("partner-cloudflare.md");
		uselessFiles.add("partner-akamai.md");
		uselessFiles.add("partner-bloksec.md");
		uselessFiles.add("partner-datawiza.md");
		uselessFiles.add("partner-nok-nok.md");
		uselessFiles.add("partner-f5.md");
		uselessFiles.add("partner-idemia.md");
		uselessFiles.add("partner-haventec.md");
		uselessFiles.add("partner-bindid.md");
		
		// 09/01/2021, service waf not supported in acn portal 
		uselessFiles.add("partner-azure-web-application-firewall.md");
		
		
		// 05/17/2021, about partners
		uselessFiles.add("identity-verification-proofing.md");
		
		// 02/01/2021, sign-in flow differs from Acn portal.
		uselessFiles.add("add-sign-in-policy.md");
		
		// 03/10/2021, identity protection not supported
		uselessFiles.add("identity-protection-investigate-risk.md");
		
		// 03/10/2021, All are youtube videos
		uselessFiles.add("azure-ad-external-identities-videos.md");
		
		// 03/10/2021, no "Azure AD B2C -> User flows -> you flow -> Page layouts -> Template"
		uselessFiles.add("customize-ui.md");
		
		// 03/10/2021, no "Azure AD B2C -> User flows -> you flow -> Settings -> Properties -> Password complexity -> Forced password reset"
		uselessFiles.add("force-password-reset.md");
		
		// 03/10/2021, "multifactor authentication page" differ from global
		uselessFiles.add("phone-based-mfa.md");
		
		// 05/14/2021, no "user flow" -> properties -> age gating
		uselessFiles.add("age-gating.md");
		
		// 05/14/2021, need frontdoor service, not available
		uselessFiles.add("custom-domain.md");
		
		// 05/15/2021, need custom-domain.md as one of the Prerequisites.
		uselessFiles.add("embedded-login.md");
		
		// 05/15/2021, need api-connectors-overview.md and oauth2-technical-profile.md
		uselessFiles.add("https-cipher-tls-requirements.md");
		
		//06/01/2021, portal "Azure AD B2C -> Security -> Authentication methods (Preview)" page shows error 403
		uselessFiles.add("threat-management.md");
		
		//07/13/2021, my app portal not supported 
		uselessFiles.add("publish-app-to-azure-ad-app-gallery.md");
		
		//07/13/2021, need custom-domain.md
		uselessFiles.add("enable-authentication-spa-app-options.md");
		uselessFiles.add("enable-authentication-web-application-options.md");
		uselessFiles.add("enable-authentication-web-app-with-api-options.md");
		uselessFiles.add("enable-authentication-android-app-options.md");
		uselessFiles.add("enable-authentication-angular-spa-app-options.md");
		uselessFiles.add("enable-authentication-ios-app-options.md");
		uselessFiles.add("enable-authentication-python-web-app-options.md");
		uselessFiles.add("enable-authentication-in-node-web-app-options.md");
		uselessFiles.add("enable-authentication-in-node-web-app-with-api-options.md");
		
		// 08/09/2021, need lighthouse, not available
		uselessFiles.add("azure-monitor.md");
		
		// 08/20/2021, need sentinel, not available
		uselessFiles.add("azure-sentinel.md");
		
		// 12/14/2021, In multi-factor-authentication.md -> Verification methods, this doc needs identity-protection which is not available currently
		uselessFiles.add("display-control-time-based-one-time-password.md");
		
		
		uselessFiles.add("");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	
	
	
}
