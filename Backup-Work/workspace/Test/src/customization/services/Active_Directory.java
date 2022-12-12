package customization.services;

import java.util.ArrayList;
import java.util.List;


//o365 china portal: https://portal.partner.microsoftonline.cn/Home


// AzureADMyOrg
// AzureADMultipleOrgs

public class Active_Directory {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();

	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("free tier");
		
		ignoredWords.add("https://aka.ms/ms-id-web/webapp");
		
		ignoredWords.add("media/groups-lifecycle");
		ignoredWords.add("media/concepts-azure-multi-factor-authentication-prompts-session-lifetime");
		ignoredWords.add("media/quickstart-v2-javascript-auth-code");
		ignoredWords.add("media/quickstart-analyze-sign-in");
		
		ignoredWords.add("https://docs.microsoft.com/windows/security/identity-protection");
		
		ignoredWords.add("web Application proxy");
		
		ignoredWords.add("Azure cloud instance");
		
		ignoredWords.add("`Enter_the_Cloud_Instance_Id_Here` is the instance of the Azure cloud.");
		
		ignoredWords.add("The default `authority` value represents the main Azure cloud:");
		
		ignoredWords.add("Azure cloud service");
		
		ignoredWords.add("quickstart-v2-javascript-auth-code-react.md");
		
		ignoredWords.add("_User.Read_");
		
		ignoredWords.add("*User.ReadWrite.All*");
		
		ignoredWords.add("%20user.read");
		
		ignoredWords.add("work Microsoft account");
		ignoredWords.add("school Microsoft account");
		
		ignoredWords.add("You can't use ROPC for Microsoft accounts (MSA)");
		
		ignoredWords.add("personal device");
		ignoredWords.add("personal-device");
		
		ignoredWords.add("personal identification");
		
		ignoredWords.add("User.Read.All");
		ignoredWords.add("User.ReadWrite.All");
		
		ignoredWords.add("");
		
		ignoredWords.add("");
		
		ignoredWords.add("");
		
		ignoredWords.add("");
		
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "](../fundamentals/active-directory-troubleshooting-support-howto.md)",   "](https://support.azure.cn/en-us/support/support-azure/)" });
		words.add(new String[] { "](/active-directory/active-directory-troubleshooting-support-howto)",    "](https://support.azure.cn/en-us/support/support-azure/)" });

		words.add(new String[] { "https://aka.ms/duplicateattributeresiliency",                            "/active-directory/hybrid/how-to-connect-syncservice-duplicate-attribute-resiliency" });

		words.add(new String[] { "https://aka.ms/aadreports",   "/active-directory/reports-monitoring/overview-reports" });
		
		words.add(new String[] { "https://docs.microsoft.com/azure/log-analytics/log-analytics-overview",   "/azure-monitor/log-query/log-query-overview" });
		
		words.add(new String[] { "https://aka.ms/certCreds",  "/active-directory/develop/active-directory-certificate-credentials" });
		
		words.add(new String[] { "https://aka.ms/AADRestrictedGuestAccess", "https://portal.azure.cn" });
		
		words.add(new String[] { "account.activedirectory.azure.cn",    "account.activedirectory.windowsazure.cn" });
		
		words.add(new String[] { "](/azure/kusto/query/)", "](/data-explorer/kusto/query/)" });
		
		words.add(new String[] { "https://aka.ms/AAatrux",    "https://portal.azure.cn/#blade/Microsoft_AAD_RegisteredApps/ApplicationsListBlade/quickStartType/JavascriptSpaQuickstartPage/sourceType/docs" });
		words.add(new String[] { "https://aka.ms/AAatehv",    "https://portal.azure.cn/#blade/Microsoft_AAD_RegisteredApps/ApplicationsListBlade/quickStartType/JavascriptSpaQuickstartPage/sourceType/docs" });
		
		// from feedback
		words.add(new String[] { "urn:federation:MicrosoftOnline", "urn:federation:partner.microsoftonline.cn" });

		// from feedback
		words.add(new String[] { "invites@microsoft.com",     "invites@oe.21vianet.com" });
		
		// 05/12/2021, from feedback 422354
		words.add(new String[] { "enterpriseregistration.chinacloudapi.cn",   "enterpriseregistration.partner.microsoftonline.cn" });
		
		// 05/12/2021, from feedback425048, in active-directory\authentication\howto-mfa-nps-extension.md
		words.add(new String[] { "[licenses for Azure AD Multi-Factor Authentication](./concept-mfa-howitworks.md)",  "[licenses for Azure AD Multi-Factor Authentication](./concept-mfa-licensing.md)" });
		
		// 05/26/20201, feedback 432228
		words.add(new String[] { "adnotifications.azure.cn", "adnotifications.windowsazure.cn" });
		
		words.add(new String[] { "[Azure AD admin center](https://aad.portal.azure.cn)", "[Azure portal](https://portal.azure.cn)" });
		
		words.add(new String[] { "https://www.microsoft.com/security/business/identity-access-management/azure-ad-pricing", "https://www.azure.cn/pricing/details/active-directory" });
		
		words.add(new String[] { "https://www.microsoft.com/en-us/security/business/identity-access-management/azure-ad-pricing", "https://www.azure.cn/pricing/details/active-directory" });
		words.add(new String[] { "https://www.azure.cn/pricing/details/active-directory/external-identities", "https://www.azure.cn/pricing/details/active-directory" });
		
		words.add(new String[] { "Sign in to the [Azure portal](https://portal.azure.cn) or [Azure portal](https://portal.azure.cn)", "Sign in to the [Azure portal](https://portal.azure.cn)" });
		words.add(new String[] { "", "" });
		words.add(new String[] { "", "" });
		words.add(new String[] { "", "" });
		
		return words;
	}

	public synchronized static List<String> getWarningWords() {

		// warningWords.add("password writeback");
//		warningWords.add("device writeback");
//		warningWords.add("group writeback");

		warningWords.add("pta");
		warningWords.add("pass-through authentication");
		warningWords.add("pass through authentication");
		warningWords.add("Pass-through authentication");

		warningWords.add("AzurePublic");
		warningWords.add("AzureUsGovernment");
		warningWords.add("AzureCloudInstance.AzurePublic"); // AzureCloudInstance.AzureChina
		warningWords.add("AzureCloudInstance.AzureUsGovernment");

		// warningWords.add("single sign-on");
		// warningWords.add("Single Sign On");
		// warningWords.add("sso");

		warningWords.add("https://aka.ms");
		warningWords.add("myapps.microsoft.com"); // -> https://account.activedirectory.windowsazure.cn/r#/applications

//		warningWords.add("Microsoft Flow");

		warningWords.add("saas-apps");

		warningWords.add("admin.microsoft.com"); // acn account not supported

//		warningWords.add("free");

		warningWords.add("Terms of use");

		warningWords.add("identity-protection");
		warningWords.add("identityprotection");
		warningWords.add("identity protection");

//		warningWords.add("Device-based");

		warningWords.add("SAML 2");
		
		warningWords.add("SaaS");
		
		warningWords.add("Application proxy");
		
//		warningWords.add("gallery");
		warningWords.add("account.activedirectory.azure.cn"); //  -> account.activedirectory.windowsazure.cn
		
		warningWords.add("government");
		
		warningWords.add("enterprise state roaming");
		
		warningWords.add("Azure Cloud");
		
		warningWords.add("Cloud App Security");
		
		warningWords.add("cloudappsecurity");
		
		warningWords.add("invites@microsoft.com");
		
		warningWords.add("MFA provider");
		warningWords.add("MFA server");
		warningWords.add("Multi-Factor Authentication Server");
		warningWords.add("Multi-Factor Authentication provider");
		
		// not supported
//		warningWords.add("Graph Explorer");
		
		// 09/27/2021, "what if" not supported in conditional access
		warningWords.add("what-if");
		warningWords.add("what if");
		
		// 12/08/2021, not available currently
		warningWords.add("security attributes");
		
		// global graph page, not fit for China
		warningWords.add("https://aka.ms/ge");
		warningWords.add("");
		warningWords.add("");
		
		return warningWords;
	}

	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[] { "", "" });
		attentionWords.add(new String[] { "", "" });

		return attentionWords;
	}

	public synchronized static List<String> getUselessFiles() {
		uselessFiles.add("");

		return uselessFiles;
	}

	// TODO
	public static class Authentication {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "concept-mfa-howitworks.md", "跟global不一样，尽量不要改" });

			attentionWords.add(new String[] { "howto-sspr-windows.md",	"\"### Enable for Windows 10 using Intune\" 删掉, 步骤和acn的不一样" });

			attentionWords.add(new String[] { "howto-mfa-nps-extension.md", "使用 adnotifications.windowsazure.cn" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// authentication
			// 08/15/2019, no "security" -> "Authentication method"
			uselessFiles.add("concept-password-ban-bad.md");

			// 11/20/2018, no ad -> Security -> Authentication methods
			uselessFiles.add("howto-password-ban-bad-on-premises-operations.md");
			uselessFiles.add("howto-password-ban-bad-on-premises-troubleshoot.md");
			uselessFiles.add("howto-password-ban-bad-configure.md");
			uselessFiles.add("howto-password-ban-bad-on-premises-agent-versions.md");
			uselessFiles.add("howto-password-ban-bad-on-premises-deploy.md");
			uselessFiles.add("howto-password-ban-bad-on-premises-faq.md");
			uselessFiles.add("howto-password-ban-bad-on-premises-monitor.md");
			uselessFiles.add("concept-password-ban-bad-on-premises.md");
			uselessFiles.add("howto-password-ban-bad-on-premises-faq.yml");
			uselessFiles.add("concept-password-ban-bad-combined-policy.md");
			
			// 03/24/2020, no ad -> Security -> "Authentication method"
			uselessFiles.add("tutorial-configure-custom-password-protection.md");

			// 09/01/2020, no "security" -> "Authentication method"
			uselessFiles.add("howto-password-smart-lockout.md");
			
			// 08/03/2018, redirected from
			// "multi-factor-authentication-get-started-adfs-cloud.md" which is not available
			uselessFiles.add("howto-mfa-adfs.md");
			
			// 06/02/2020, need Identity Protection which is not supported currently
			uselessFiles.add("tutorial-risk-based-sspr-mfa.md");
			
			// 09/04/2018, need ad -> conditional access
			uselessFiles.add("tutorial-mfa-applications.md");
			
			// 09/05/2018, about mfa auth provider, not supported
			uselessFiles.add("concept-mfa-authprovider.md");
			// 09/05/2018, need mfa server, not supported
			uselessFiles.add("howto-mfa-reporting-datacollection.md");
			uselessFiles.add("howto-mfa-reporting.md");
			// 09/05/2018, not supported
			uselessFiles.add("howto-mfaserver-adfs-2012.md");
			// 09/27/2018, mfa server not supported.
			uselessFiles.add("howto-mfaserver-deploy-ha.md");

			// 03/10/2020, many features are not supported in it
			uselessFiles.add("concept-resilient-controls.md");
			// 02/25/2019, not able to login https://myprofile.microsoft.com with acn account, 
			uselessFiles.add("concept-registration-mfa-sspr-combined.md");
			// 02/25/2019, need concept-registration-mfa-sspr-combined.md
			uselessFiles.add("howto-registration-mfa-sspr-combined.md");
			uselessFiles.add("howto-registration-mfa-sspr-combined-troubleshoot.md");

			// 04/08/2019, not supported
			uselessFiles.add("multi-factor-authentication-get-started-adfs.md");

			// 04/08/2019, need mfa server/provider, not supported
			uselessFiles.add("multi-factor-authentication-security-best-practices.md");

//--------------------------------------------------------------------
//			uselessFiles.add("howto-mfa-nps-extension.md");
//			uselessFiles.add("howto-mfa-nps-extension-advanced.md");
			
			// 11/20/2018, mfa server not supported in acn.
//			uselessFiles.add("howto-mfa-nps-extension-errors.md");
			
			// 02/22/2021, need "mfa server" which isn't supported 
			uselessFiles.add("howto-mfa-nps-extension-vpn.md");
			uselessFiles.add("howto-mfa-nps-extension-rdg.md");
			
			uselessFiles.add("howto-mfaserver-deploy-upgrade.md");
			uselessFiles.add("howto-mfaserver-nps-vpn.md");
			uselessFiles.add("howto-mfaserver-nps-rdg.md");
			uselessFiles.add("howto-mfaserver-adfs-2.md");
			uselessFiles.add("howto-mfaserver-deploy.md");
			uselessFiles.add("howto-mfaserver-deploy-mobileapp.md");
			uselessFiles.add("howto-mfaserver-deploy-upgrade-pf.md");
			uselessFiles.add("howto-mfaserver-deploy-userportal.md");
			uselessFiles.add("howto-mfaserver-dir-ad.md");
			uselessFiles.add("howto-mfaserver-dir-ldap.md");
			uselessFiles.add("howto-mfaserver-dir-radius.md");
			uselessFiles.add("howto-mfaserver-iis.md");
			uselessFiles.add("howto-mfaserver-windows.md");
			uselessFiles.add("howto-mfa-server-settings.md");
			
			// 09/16/2021
			uselessFiles.add("howto-mfaserver-adfs-windows-server.md");
			
			uselessFiles.add("how-to-migrate-mfa-server-to-azure-mfa-user-authentication.md");
			uselessFiles.add("how-to-migrate-mfa-server-to-azure-mfa-with-federation.md");
			uselessFiles.add("how-to-migrate-mfa-server-to-azure-mfa.md");
			
			// 10/26/2020, need mfa nps server
			uselessFiles.add("auth-radius.md");
//--------------------------------------------------------------------

			// 11/04/2019, many content are not available and hard to update it.
			uselessFiles.add("concept-authentication-methods.md");

			// 11/04/2019, too many files are referenced which are not supported.
			uselessFiles.add("howto-authentication-passwordless-deployment.md");
			// 11/04/2019, most of the content not available. many useless links.
			uselessFiles.add("howto-authentication-passwordless-phone.md");
			// 09/21/2020, most of the content not available. need "https://myprofile.microsoft.com"
			uselessFiles.add("howto-authentication-passwordless-security-key.md");
			uselessFiles.add("howto-authentication-passwordless-faqs.md");
			uselessFiles.add("howto-authentication-passwordless-troubleshoot.md");
			// 11/04/2019, need howto-authentication-passwordless-security-key.md
			uselessFiles.add("howto-authentication-passwordless-security-key-on-premises.md");
			// 11/04/2019, most of the content not available.
			uselessFiles.add("howto-authentication-passwordless-security-key-windows.md");

			// 11/04/2019, most of passwordless files are not available.
			uselessFiles.add("concept-authentication-passwordless.md");

			// 01/03/2020, many mfa functionalities not available
			uselessFiles.add("concept-mfa-data-residency.md");

			// 06/29/2020, no "app password" on "https://account.activedirectory.windowsazure.cn/proofup.aspx"
			uselessFiles.add("howto-mfa-app-passwords.md");

			// 06/29/2020, some content such as "pta" not supported
			uselessFiles.add("howto-authentication-use-email-signin.md");

			// 07/06/2020, much description in it not supported 
			uselessFiles.add("concepts-azure-multi-factor-authentication-prompts-session-lifetime");
			
			// 08/28/2020, much description in it not supported 
			uselessFiles.add("concepts-azure-multi-factor-authentication-prompts-session-lifetime.md");
			
			// 09/29/2020, no "ad" -> security -> "M F A"
			uselessFiles.add("concept-authentication-oath-tokens.md");
			
			// 09/29/2020, not able to edit "Authentication contact info"
			uselessFiles.add("concept-authentication-phone-options.md");
			
			// 09/29/2020, no "security questions" on "Authentication methods" page 
			uselessFiles.add("concept-authentication-security-questions.md");
			
			// 09/29/2020, not sure available or not. no function in ad "Authentication methods"
			uselessFiles.add("concept-authentication-authenticator-app.md");
			
			// 10/27/2020, on "Security > Authentication methods" page, no "Authentication method policy (preview)"
			uselessFiles.add("howto-authentication-sms-signin.md");
			
			// 02/22/2021, need passwordless authentication
			uselessFiles.add("fido2-compatibility.md");
			uselessFiles.add("concept-fido2-hardware-vendor.md");
			uselessFiles.add("howto-authentication-temporary-access-pass.md");
			
			// 03/11/2021, no "Azure Active Directory > Security > Authentication Methods > Activity"
			uselessFiles.add("howto-authentication-methods-activity.md");
			
			// 03/11/2021, need "MFA server"
			uselessFiles.add("how-to-authentication-two-way-sms-unsupported.md");
			
			// 07/23/2021, sso not supported
			uselessFiles.add("how-to-authentication-sms-supported-apps.md");
			
			// 11/04/2021, no "security -> MFA"
			uselessFiles.add("concept-authentication-operator-assistance.md");
			
			// 11/18/2021, no "security -> Identity Secure Score"
			uselessFiles.add("how-to-authentication-find-coverage-gaps.md");
			
			// 11/18/2021, cloud-sync not supported
			uselessFiles.add("tutorial-enable-cloud-sync-sspr-writeback.md");
			
			// 11/30/2021, no "security -> Authentication methods"
			uselessFiles.add("how-to-mfa-additional-context.md");
			uselessFiles.add("how-to-mfa-registration-campaign.md");
			
			// 11/30/2021, not sure available or not
			uselessFiles.add("how-to-mfa-microsoft-managed.md");
			
			// 11/30/2021, many features not available in it
			uselessFiles.add("how-to-mfa-number-match.md");
			
			// 02/25/2022, no ad -> Security -> Authentication methods in portal 
			uselessFiles.add("certificate-based-authentication-faq.yml");
			uselessFiles.add("concept-certificate-based-authentication-limitations.md");
			uselessFiles.add("concept-certificate-based-authentication-technical-deep-dive.md");
			uselessFiles.add("concept-certificate-based-authentication.md");
			uselessFiles.add("how-to-certificate-based-authentication.md");  // u can see details in it
			uselessFiles.add("troubleshoot-certificate-based-authentication.md");
			uselessFiles.add("active-directory-certificate-based-authentication-get-started.md");
			uselessFiles.add("active-directory-certificate-based-authentication-android.md");
			uselessFiles.add("active-directory-certificate-based-authentication-ios.md");
			
			// 03/17/2022， not suitable for Azure China.
			uselessFiles.add("feature-availability.md");
			
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	}

	// TODO
	public static class Azuread_Dev {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {

			// 02/24/2020, not available in develop and not been redirected from develop
			uselessFiles.add("active-directory-acs-migration.md");
			uselessFiles.add("howto-app-gallery-listing.md");
			uselessFiles.add("howto-get-appsource-certified.md");
			uselessFiles.add("howto-reactivate-disabled-acs-namespaces.md");
			uselessFiles.add("howto-v1-debug-saml-sso-issues.md");
			uselessFiles.add("howto-v1-enable-sso-android.md");
			uselessFiles.add("howto-v1-enable-sso-ios.md");
			uselessFiles.add("videos.md");

			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
		 
	}

	// TODO
    public static class Enterprise_users {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
			
		public static synchronized List<String[]> getWords() {
			words.add(new String[] {"](/active-directory/active-directory-licensing-group-problem-resolution-azure-portal",   "](/active-directory/enterprise-users/licensing-groups-resolve-problems" });

			words.add(new String[] { "](/active-directory/active-directory-licensing-product-and-service-plan-reference", 	  "](/active-directory/enterprise-users/licensing-service-plan-reference" });

			words.add(new String[] { "](/active-directory/active-directory-licensing-group-advanced",	                      "](/active-directory/enterprise-users/licensing-group-advanced" });

			words.add(new String[] { "](/active-directory/active-directory-licensing-ps-examples",		                      "](/active-directory/enterprise-users/licensing-ps-examples" });

			words.add(new String[] { "](/active-directory/active-directory-licensing-group-migration-azure-portal", 	      "](/active-directory/enterprise-users/licensing-groups-migrate-users" });

			words.add(new String[] { "](../active-directory-identityprotection.md)",			                              "](/active-directory/identity-protection/overview)" });

			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}
			
		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "directory-delete-howto.md",			"删除 ## Delete a subscription\" 部分的内容，不适用" });

			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// 07/31/2018, need azure ad premium or basic version, not supported
			uselessFiles.add("groups-saasapps.md");
			// 11/14/2019, need aad.portal.azure.com, not supported
			uselessFiles.add("groups-lifecycle.md");

			// 10/11/2018, need aad.portal.azure.com, acn not supported.
			uselessFiles.add("linkedin-integration.md");
			// 10/11/2018, need "linkedin-integration.md"
			uselessFiles.add("linkedin-user-consent.md");
			// 08/26/2020, many features are not available in it.
			uselessFiles.add("users-sharing-accounts.md");
				
			// 07/04/2019, no "my data requests" in acn portal.
			uselessFiles.add("users-close-account.md");

			// 08/26/2020, "Bulk" operations not supported in acn ad groups
			uselessFiles.add("groups-bulk-download-members.md");
			uselessFiles.add("groups-bulk-download.md");
			uselessFiles.add("groups-bulk-import-members.md");
			uselessFiles.add("groups-bulk-remove-members.md");
			uselessFiles.add("groups-members-owners-search.md");

			//09/21/2020, no ad -> Users – All users -> Preview features -> Enhanced user management
			uselessFiles.add("users-search-enhanced.md");
				
			// 11/05/2020, need to login "https://portal.office.com/admintakeover"
			uselessFiles.add("domains-admin-takeover.md");
				
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
	}
	
	// TODO
	public static class External_identities {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		/*
		From: Elisabeth Olson <elisol@microsoft.com>
		Sent: Thursday, April 16, 2020 5:43:19 PM
		
		Hi Isha,

        It would probably be easier to indicate which features aren’t going to China than try to enumerate the ones that are.  
        We won’t be supporting non-AAD accounts, so any content about MSAs, Google fed, Direct fed, and email OTP would need to be removed.  
        We also won’t be supporting inviting existing internal users, so we’d need to remove that content as well.  Other than that, I think everything else should be fine as is.

		Thanks,
		Elisabeth

		*/
		public static synchronized List<String> getWarningWords() {
			warningWords.add("Google fed");
			warningWords.add("Direct fed");
			
			warningWords.add("email OTP");
			warningWords.add("OTP");
			warningWords.add("one time passcode");
			
//			warningWords.add("internal user");
			
			warningWords.add("SaaS");
			
			// 04/29/2020, remove the NOTE, pm confirmed.
			warningWords.add("Starting March 31, 2021");
			
			// 06/22/2020, FEEDBACK 240607, it’s not supported to invite social users using Microsoft accounts with B2B in Azure China tenants
			warningWords.add("Microsoft account");
			warningWords.add("MSAs");
			warningWords.add("MSA");
			
//			warningWords.add("social"); // non-AAd account not supported including social accounts.
			warningWords.add("");
			
			warningWords.add("Self-service sign-up");
			
			// 03/22/2022, no "ad" -> "Organizational relationships" -> "Cross-tenant access settings (Preview)" -> Default settings -> Edit inbound defaults -> B2b direct connect
			warningWords.add("direct connect");
			
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			// 04/29/2020, From pm
			attentionWords.add(new String[] { "hybrid-on-premises-to-cloud.md",  "PM: Remove section \"Grant B2B users in Azure AD access to your on-premises apps\"" });
			
			// 04/29/2020, From pm
			// commented in 02/17/2022 as the doc changed completly
//			attentionWords.add(new String[] { "user-properties.md",  "In State 1, remove last three sentences \"If the partner organization doesn't use Azur eAD….(JIT) tenancy or a \"viral\" tenancy\"" });
//			attentionWords.add(new String[] { "user-properties.md",  "Remove State 2 and later references to it in the doc, this state is irrelevant altogether for China cloud" });
//			attentionWords.add(new String[] { "user-properties.md",  "Remove \"For guest users in State 2...\"" });
//			attentionWords.add(new String[] { "user-properties.md",  "Under \"Key properties of the AAD B2B collab user\" > \"Source\" remove bullet for Microsoft account" });
//			attentionWords.add(new String[] { "user-properties.md",  "Remove \"Important Starting March 31\" note - this is irrelevant for China cloud" });
			
			// 04/29/2020, From pm
			attentionWords.add(new String[] { "customize-invitation-api.md",   "In step 1, change sentence to \"Invite an external user with their email address.\" and in the example, use \"sam@fabrikam.com\"" });
			
			// 04/29/2020, From pm
			attentionWords.add(new String[] { "what-is-b2b.md",                "Under \"Collaborate with any partner…\" section, remove \"Azure AD is not required\" on first bullet" });
			// 05/28/2020, Feedback 227048 
			attentionWords.add(new String[] { "what-is-b2b.md",                "Remove \"Let application and group owners manage their own guest users\", not supported" });
			
			// 04/29/2020, From pm
			attentionWords.add(new String[] { "redemption-experience.md",      "Remove Step 3 in the \"Redemption through the invitation email\" section" });
			attentionWords.add(new String[] { "redemption-experience.md",      "In \"Redemption thorugh a direct link\" section, remove the bullet in second set of bullets \"The user doesn't have an Azure AD account, an MSA, ....\" - this is irrelevant for China" });
			attentionWords.add(new String[] { "redemption-experience.md",      "Remove the whole \"Invitation redemption flow\" section" });
			attentionWords.add(new String[] { "redemption-experience.md",      "Remove the sentence in the last paragraph of the article \"If an MSA was created, the guest's Source shows Microsoft Account.\"" });
			// 05/28/2020, Feedback 227048 
			attentionWords.add(new String[] { "redemption-experience.md",      "Remove links about \"https://account.activedirectory.windowsazure.cn/r#/applications\"" }); 
			
			
//			attentionWords.add(new String[] { "conditional-access.md",         "remove content about \"Device-based Conditional Access\"" });
			attentionWords.add(new String[] { "current-limitations.md",        "remove content about \"Azure US Government clouds\"" });
			
			// 05/28/2021
			attentionWords.add(new String[] { "add-users-administrator.md",    "\"## Resend invitations to guest users\" 部分 acn portal 没有" });
			
			
			attentionWords.add(new String[] { "external-collaboration-settings-configure.md", "To configure external collaboration settings 部分，把External Identities > External collaboration settings 改成 Organizational relationships > Settings" });
			attentionWords.add(new String[] { "external-collaboration-settings-configure.md", "刪掉 Enable guest self-service sign-up via user flows:... 和 Under Enable guest self-service sign up via user flows..." });
			
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			
			// 04/17/2020, google fed not supported
			uselessFiles.add("google-federation.md");
			
			// 04/17/2020, direct fed not supported
			uselessFiles.add("direct-federation.md");
			uselessFiles.add("direct-federation-adfs.md");
			
			// 04/17/2020, email OTP not supported
			uselessFiles.add("one-time-passcode.md");
			
			// 04/17/2020, Inviting existing internal users not supported
			uselessFiles.add("invite-internal-users.md");
			
			// 04/20/2020, operation steps in this files are not available in Acn portal
			uselessFiles.add("get-support.md");
			
			// 04/29/2020, pm confirmed in excel
			uselessFiles.add("hybrid-cloud-to-on-premises.md");
			
			// 04/29/2020, pm confirmed in excel
			uselessFiles.add("add-users-information-worker.md");
			
			// 04/29/2020, pm confirmed in excel
			uselessFiles.add("configure-saas-apps.md");
			
			// 04/29/2020, pm confirmed in excel, not available currently, 
			uselessFiles.add("b2b-quickstart-add-guest-users-portal.md");
			uselessFiles.add("claims-mapping.md");
			
//			// 04/29/2020, pm: Dynamic groups won't be available until mid-May.  We should hold this doc until they're in the China cloud
//			uselessFiles.add("use-dynamic-groups.md");
			
			uselessFiles.add("facebook-federation.md");
			
			// 06/29/2020, need facebook/google/Direct federation
			uselessFiles.add("identity-providers.md");

			// 02/10/2022, self-service-sign-up not found in portal ad blade
			uselessFiles.add("self-service-sign-up-add-api-connector.md");
			uselessFiles.add("self-service-sign-up-add-approvals.md");
			uselessFiles.add("self-service-sign-up-overview.md");
			uselessFiles.add("self-service-sign-up-secure-api-connector.md");
			uselessFiles.add("self-service-sign-up-user-flow.md");
			uselessFiles.add("user-flow-add-custom-attributes.md");
			uselessFiles.add("user-flow-customize-language.md");
			uselessFiles.add("api-connectors-overview.md");
			uselessFiles.add("code-samples-self-service-sign-up.md");
			
			// 11/20/2020, not fit for china.
			uselessFiles.add("whats-new-docs.md");
			
			// 03/11/2021, no "ad -> External Identities"
			uselessFiles.add("microsoft-account.md");
			uselessFiles.add("azure-ad-account.md");
			
//			// 02/10/2022, no "ad -> External Identities"
//			uselessFiles.add("cross-tenant-access-overview.md");
//			uselessFiles.add("cross-tenant-access-settings-b2b-collaboration.md");
//			// 02/18/2022, no "ad -> External Identities"
//			uselessFiles.add("external-collaboration-settings-configure.md");
			
			// 03/21/2022, no "ad -> External Identities", check again next time
			uselessFiles.add("b2b-direct-connect-overview.md");
			uselessFiles.add("cross-tenant-access-settings-b2b-direct-connect.md");
			
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	}
	
	// TODO Conditional access
	public static class Conditional_Access {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "](../active-directory-conditional-access-azure-portal.md)",                   "](overview.md)" });
			words.add(new String[] { "](/active-directory/active-directory-conditional-access-azure-portal)",		"](overview.md)" });

			words.add(new String[] { "](../active-directory-identityprotection.md)",		"](/active-directory/identity-protection/overview)"});
			
			words.add(new String[] {"](/active-directory/active-directory-identityprotection-enable)", "](/active-directory/identity-protection/enable)"});

			words.add(new String[] { "](/active-directory/active-directory-conditional-access-locations)",	"](/active-directory/conditional-access/location-condition)" });

			words.add(new String[] { "](/active-directory/active-directory-conditional-access-no-modern-authentication)",	"](/active-directory/conditional-access/conditional-access-for-exo-and-spo)" });

			words.add(new String[] { "](/active-directory/active-directory-identityprotection-playbook)",      "](/active-directory/identity-protection/playbook)"});

			words.add(new String[] { "", "" });

			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			// warningWords.add("device");
//			warningWords.add("device-based");
			
			// Device compliance policies
//			warningWords.add("/intune/device-compliance-get-started");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			// 08/24/2021, 
			attentionWords.add(new String[] { "troubleshoot-policy-changes-audit-log.md", "Got error on \"Azure portal > Azure AD > Log Analytics\", need to check on portal again." });
			
			attentionWords.add(new String[] { "howto-continuous-access-evaluation-troubleshoot.md", "No \"ad -> Sign-ins -> filter -> Is CAE Token\"" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// 01/09/2020, device not supported
//			uselessFiles.add("require-managed-devices.md");
			// 01/09/2020, identity protection not supported currently
			uselessFiles.add("app-sign-in-risk.md");
			// 01/09/2020, identity protection not supported currently
			uselessFiles.add("howto-conditional-access-policy-risk.md");
			
			// 01/09/2020, myapps.microsoft.com donot accept acn account
			uselessFiles.add("terms-of-use.md");

			uselessFiles.add("");
			uselessFiles.add("");

			// 02/20/2020, pm confirmed, not supported in Mooncake
			uselessFiles.add("app-protection-based-conditional-access.md");
			uselessFiles.add("baseline-protection.md");
			uselessFiles.add("concept-baseline-protection.md");
			uselessFiles.add("concept-conditional-access-report-only.md");
			uselessFiles.add("howto-conditional-access-policy-registration.md");
			uselessFiles.add("howto-conditional-access-session-lifetime.md");
			uselessFiles.add("howto-baseline-protect-administrators.md");
			
			// 04/20/2020, pm confirmed
			uselessFiles.add("howto-conditional-access-report-only.md");
			// 09/07/2020, redirected from howto-conditional-access-report-only.md
			uselessFiles.add("howto-conditional-access-insights-reporting.md");
			
			// 08/14/2020, need "identity protection"
			uselessFiles.add("howto-conditional-access-policy-risk-user.md");
			
			// 09/27/2021, feedback 476154
			uselessFiles.add("what-if-tool.md");
			uselessFiles.add("troubleshoot-conditional-access-what-if.md");
			
//			// 10/08/2021, no Azure Active Directory > Sign-ins > Is CAE Token
//			uselessFiles.add("howto-continuous-access-evaluation-troubleshoot.md");
			
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
	}

	// TODO
	public static class Develop {
		private static final List<String[]> words = new ArrayList<String[]>(200);
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "](/active-directory/develop/guidedsetups/active-directory-javascriptspa)",       "](tutorial-v2-javascript-spa.md)" });
			words.add(new String[] { "](/active-directory/develop/guidedsetups/active-directory-windesktop)",          "](tutorial-v2-windows-desktop.md)" });
			words.add(new String[] { "](guidedsetups/active-directory-mobileanddesktopapp-windowsdesktop-intro.md)",   "](tutorial-v2-windows-desktop.md)" });
			words.add(new String[] { "](/active-directory/develop/guidedsetups/active-directory-android)",             "](tutorial-v2-android.md)" });

			// in "quickstart-v2-javascript.md"
			words.add(new String[] { "[\"user.read\"]",         "[\"https://microsoftgraph.chinacloudapi.cn/user.read\"]" }); // scopes: ["https://microsoftgraph.chinacloudapi.cn/user.read"]
			words.add(new String[] { "[ \"user.read\" ]",       "[\"https://microsoftgraph.chinacloudapi.cn/user.read\"]" });

			// in some other files
			words.add(new String[] { "new string[] { \"user.read\" }",              "new string[] { \"https://microsoftgraph.chinacloudapi.cn/user.read\" }" });

			words.add(new String[] { "secure.aadcdn.partner.microsoftonline-p.cn/lib/1.0.0-preview.4/js/msal.min.js",      "secure.aadcdn.microsoftonline-p.com/lib/1.0.0/js/msal.js" });
			words.add(new String[] { "secure.aadcdn.partner.microsoftonline-p.cn/lib/1.0.0/js/msal.js",                    "secure.aadcdn.microsoftonline-p.com/lib/1.0.0/js/msal.js" });

			words.add(new String[] { "](/graph/permissions-reference)",      "](https://docs.microsoft.com/graph/permissions-reference)" });

			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			// no this option when register an app in "app registrations(preview)"
			warningWords.add("Accounts in any organizational directory and personal Microsoft accounts");

			// not supported when doing "app registrations(preview)"
			warningWords.add("personal Microsoft account");
			warningWords.add("PersonalMicrosoftAccount");
			warningWords.add("personal account");
			warningWords.add("(MSA)");
			// personal microsoft accounts!
			warningWords.add("hotmail.com");
			warningWords.add("outlook.com");
			warningWords.add("personal");

			warningWords.add("https://aka.ms");

			warningWords.add("https://go.microsoft.com/fwlink/?linkid=2083908");
			warningWords.add("Microsoft account");

			warningWords.add("secure.aadcdn.partner.microsoftonline-p.cn/lib");

			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "msal-net-aad-b2c-considerations.md",		"## Google Auth and Embedded Webview 部分删掉" });

			attentionWords.add(new String[] { "active-directory-how-applications-are-added.md", "\"## How are application objects and service principals related to each other?\" 部分的内容不可用" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// 10/08/2018, redirected from
			// "application-dev-registration-config-change-token-lifetime-how-to.md" which is not available.
			uselessFiles.add("registration-config-change-token-lifetime-how-to.md");
			// 10/08/2018, redirected from
			// "application-dev-registration-config-multi-tenant-application-add-to-gallery-how-to.md"
			// which is not available.
			uselessFiles.add("registration-config-multi-tenant-application-add-to-gallery-how-to.md");

			// 12/21/2018, review request sent, but no reply from pm.
			uselessFiles.add("howto-v1-enable-sso-android.md");
			uselessFiles.add("howto-v1-enable-sso-ios.md");
			// 01/02/2019, sso not supported in acn.
			uselessFiles.add("registration-config-sso-how-to.md");

			// 05/07/2019, about global registration portal, useless
			uselessFiles.add("active-directory-v2-registration-portal.md");

			// 04/08/2019, single sign on not supported
			uselessFiles.add("active-directory-saml-protocol-reference.md");
			uselessFiles.add("single-sign-on-saml-protocol.md");
			uselessFiles.add("single-sign-out-saml-protocol.md");
			// 04/22, SAML 2.0 not supported currently
			uselessFiles.add("reference-saml-tokens.md");

			// 06/14/2019, demonstrates in azure Government cloud.
			uselessFiles.add("msal-national-cloud.md");

			// 01/31/2018, it's useless after reading it.
			uselessFiles.add("active-directory-mobileanddesktopapp-windowsdesktop-configure-arp.md");

			// 08/15/2019, retired
			uselessFiles.add("active-directory-acs-migration.md");

//			// 06/18/2019, will be deprecated and switch to the new conditional access
//			// feature, not available
//			uselessFiles.add("active-directory-configurable-token-lifetimes.md");

			// 2018, can not find "user attribute" blade in portal.
			uselessFiles.add("active-directory-saml-claims-customization.md");

			// 10/08/2019, no such functions in 'Microsoft Graph Explorer' china.
			uselessFiles.add("active-directory-enterprise-app-role-management.md");

			// 11/26/2019, Transitioning from Application Registration Portal to Azure portal, not available
			uselessFiles.add("app-registration-portal-training-guide.md");

			// 02/05/2020, youtube not supported
			uselessFiles.add("identity-videos.md");

//			// 03/23/2020, not sure if available or not as no code to test. Most of the
//			// links in it are about global graph, not china graph.
//			uselessFiles.add("microsoft-graph-intro.md");
			
			// 05/25/2020, need "https://github.com/Azure-Samples/ms-identity-javascript-v2/archive/quickstart.zip" which is 404
			uselessFiles.add("quickstart-v2-javascript-auth-code.md");
			
			// 01/12/2022, no "Add MPN ID to verify publisher" on ad -> app registration -> app -> Branding
			uselessFiles.add("publisher-verification-overview.md");
			uselessFiles.add("mark-app-as-publisher-verified.md");
			uselessFiles.add("troubleshoot-publisher-verification.md");
			
			// 08/14/2020, app gallery not supported
			uselessFiles.add("v2-howto-app-gallery-listing.md");
			                  
			// 08/14/2020, acn account not accepted in "https://appsource.microsoft.com"
			uselessFiles.add("v2-howto-get-appsource-certified.md");
			
			// 11/09/2020, reference manage-apps sso files
			uselessFiles.add("mobile-sso-support-overview.md");
			// 11/09/2020, seems not supported
			uselessFiles.add("msal-android-single-sign-on.md");
			
			// 12/31/2020, used for sso.
			uselessFiles.add("scenario-token-exchange-saml-oauth.md");
			
			// 02/22/2021, need passwordless authentication
			uselessFiles.add("support-fido2-authentication.md");
			
			// 02/10/2022, google.com not supported in China
			uselessFiles.add("workload-identity-federation-create-trust-gcp.md");
			
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
		
		public static class Includes {
			
		}
	}

	// TODO
	public static class Devices {
		private static final List<String[]> words = new ArrayList<String[]>(200);
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
			
		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}
		
		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "azureadjoin-plan.md", " 没有 ### Additional local administrators on Azure AD joined devices" });
			
			attentionWords.add(new String[] { "hybrid-azuread-join-manual.md", "把 \"urn:federation:MicrosoftOnline\" 替换成 \"urn:federation:partner.microsoftonline.cn\"" });

			attentionWords.add(new String[] { "hybrid-azuread-join-manual.md", "This object usually is named **Microsoft Office 365 Identity Platform China**. 星号中间的部分不翻译" });
			
			attentionWords.add(new String[] { "hybrid-azuread-join-managed-domains.md",    "增加 \"https://enterpriseregistration.windows.net\"" });
			attentionWords.add(new String[] { "hybrid-azuread-join-federated-domains.md",  "增加 \"https://enterpriseregistration.windows.net\"" });
			attentionWords.add(new String[] { "hybrid-azuread-join-manual.md",             "增加 \"https://enterpriseregistration.windows.net\"" });
			
			// FEEDBACK 524968
			attentionWords.add(new String[] { "howto-vm-sign-in-azure-ad-linux.md",  "ChinaEast2 要改为 ChinaNorth2；Azure 门户创建 linux VM 并启用 Azure AD 登录（“管理”选项卡）, 这个暂不支持，portal相关的操作要删掉；来自feedback 524968" });
			attentionWords.add(new String[] { "howto-vm-sign-in-azure-ad-linux.md",  "\"Enabling Azure AD login in for Linux VM in Azure\" 部分跟global不一样，要注意"});
			
			return attentionWords;
		}
		
		public static synchronized List<String> getUselessFiles() {
			uselessFiles.add("enterprise-state-roaming-enable.md");
			uselessFiles.add("enterprise-state-roaming-faqs.md");
			uselessFiles.add("enterprise-state-roaming-group-policy-settings.md");
			uselessFiles.add("enterprise-state-roaming-overview.md");
			uselessFiles.add("enterprise-state-roaming-troubleshooting.md");
			uselessFiles.add("enterprise-state-roaming-windows-settings-reference.md");
			uselessFiles.add("enterprise-state-roaming-faqs.yml");
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
		
	}		
			
	// TODO
	public static class Fundamentals {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "active-directory-how-subscriptions-associated-directory.md",
					"\"## To associate an existing subscription to your Azure AD directory\" 部分跟global 不一样，定制过不要改" });
			
			attentionWords.add(new String[] { "certificate-authorities.md", "Remove segment \"CAs used in Azure Public and Azure US Government clouds\"" });
			
		    // 12/04/2020, ACN 没有 Sign up and sign in (Recommended), 只有 Sign up and sign in (Standard)
			attentionWords.add(new String[] { "resilient-end-user-experience.md", "## Availability of Multi-factor authentication 部分与 China 的不一样，要删掉" });
			
			// 01/05/2021
			attentionWords.add(new String[] { "9-secure-access-teams-sharepoint.md", "删掉 9-external-collaboration-settings.png, 不适用" });
			
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// fundamentals
			// 08/12/2019, not suitable for acn.
			uselessFiles.add("whats-new.md");
			// 02/25/2020, need b2b as Prerequisites
//			uselessFiles.add("active-directory-deployment-checklist-p2.md");
			// 06/22/2018, for europe customers
			uselessFiles.add("active-directory-data-storage-eu.md");
			// 08/12/2019, it is about version history, not suitable for acn.
			uselessFiles.add("whats-new-archive.md");
			// 04/09/2019, most of the content is not available
			uselessFiles.add("active-directory-deployment-plans.md");
			// 07/04/2019, no "identity secure score" blade in ad.
			uselessFiles.add("identity-secure-score.md");
			// 07/04/2019, about government, not supported
			uselessFiles.add("whats-new-microsoft-365-government.md");

			// no "new support request" in ibiza portal
			uselessFiles.add("active-directory-troubleshooting-support-howto.md"); // replace it with: https://support.azure.cn/en-us/support/support-azure/

//			// 05/18/2020, need premium, not able to test "Company branding" and no release plan
//			uselessFiles.add("customize-branding.md");	

			// 12/09/2019, operation guide, many are not available currently.
			uselessFiles.add("active-directory-ops-guide-auth.md");
			uselessFiles.add("active-directory-ops-guide-govern.md");
			uselessFiles.add("active-directory-ops-guide-iam.md");
			uselessFiles.add("active-directory-ops-guide-intro.md");
			uselessFiles.add("active-directory-ops-guide-ops.md");

			// 01/15/2019, for australia, not China
			uselessFiles.add("active-directory-data-storage-australia.md");
			// 02/24/2019, for australia, not China
			uselessFiles.add("active-directory-data-storage-australia-newzealand.md");
			
			// 08/17/2020, too much content which is not available
			uselessFiles.add("five-steps-to-full-application-integration-with-azure-ad.md");
			
			// 10/23/2020, need Application proxy, not supported 
			uselessFiles.add("auth-header-based.md");
			uselessFiles.add("auth-kcd.md");
			// 10/26/2020, sso not supported 
			uselessFiles.add("auth-password-based-sso.md");
			uselessFiles.add("auth-saml.md");

			// 10/26/2020, need application proxy
			uselessFiles.add("auth-remote-desktop-gateway.md");
			// 10/26/2020, need Azure AD Provisioning Service
			uselessFiles.add("sync-scim.md");
			
			// 12/03/2020, need application proxy
			uselessFiles.add("resilience-on-premises-access.md");
			// 12/03/2020, need ad/device
//			uselessFiles.add("resilience-with-device-states.md");
			// 12/03/2020, Authentication Methods in this article are not supported in b2b
			uselessFiles.add("resilience-b2b-authentication.md");
			
			// 01/13/2021, too many features which are not available
			uselessFiles.add("protect-m365-from-on-premises-attacks.md");
			
			// 04/15/2021, need my staff and files under saas-app folder  
			uselessFiles.add("frontline-worker-management.md");
			
			// 04/25/2021, many features not available
			uselessFiles.add("security-baseline.md");
			
			// 07/26/2021, many features not available
			uselessFiles.add("azure-active-directory-b2c-deployment-plans.md");
			
			// 07/26/2021, many features not available
			uselessFiles.add("security-operations-applications.md");
			uselessFiles.add("security-operations-devices.md");
			uselessFiles.add("security-operations-infrastructure.md");
			uselessFiles.add("security-operations-introduction.md");
			uselessFiles.add("security-operations-privileged-accounts.md");
			uselessFiles.add("security-operations-privileged-identity-management.md");
			uselessFiles.add("security-operations-user-accounts.md");
			
			// 11/18/2021, some features like sso are not available in mooncake 
			uselessFiles.add("scenario-azure-first-sap-identity-integration.md");
			
			// 11/30/2021, many features not available 
			uselessFiles.add("azure-active-directory-parallel-identity-options.md");
			uselessFiles.add("");
			uselessFiles.add("");
			

			return uselessFiles;
		}
	}

	// TODO
	public static class Governance {
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String> getWarningWords() {
			warningWords.add("myaccess");
			warningWords.add("myaccess.microsoft.com");

			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String> getUselessFiles() {
			
			// 11/37/2020, provision not supported.
			uselessFiles.add("what-is-app-provisioning.md");
			uselessFiles.add("what-is-hr-driven-provisioning.md");
			uselessFiles.add("what-is-provisioning.md");
			uselessFiles.add("what-is-identity-lifecycle-management.md");
			uselessFiles.add("what-is-inter-directory-provisioning.md");
			
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
	}

	// TODO
	public static class Hybrid {
		private static final List<String[]> words = new ArrayList<String[]>(200);
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "-UsageLocation \"China North\"", "-UsageLocation \"CN\"" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			warningWords.add("single sign-on");
			warningWords.add("sso");
			warningWords.add("Single Sign On");

			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "how-to-connect-fed-saml-idp.md", "New-MsolUser 部分的最后一个参数应该是 -UsageLocation CN" });

			attentionWords.add(new String[] { "how-to-connect-install-custom.md", "修改 \"Enabling Single sign on (SSO)\" 部分，不支持，客户反馈修改" }); // ad -> hybrid

			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-accesscontrol-requirements.md",             "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-business-needs.md",                         "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-contentmgt-requirements.md",                "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-dataprotection-requirements.md",            "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-data-protection-strategy.md",               "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-directory-sync-requirements.md",            "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-hybrid-id-management-tasks.md",             "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-identity-adoption-strategy.md",             "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-incident-response-requirements.md",         "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-lifecycle-adoption-strategy.md",            "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-multifactor-auth-requirements.md",          "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-nextsteps.md",                              "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-overview.md",                               "对照global文章修改" });
			attentionWords.add(new String[] { "plan-hybrid-identity-design-considerations-tools-comparison.md",                       "对照global文章修改" });

			attentionWords.add(new String[] { "",  "" });
			attentionWords.add(new String[] { "",  "" });
			attentionWords.add(new String[] { "",  "" });
			
			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// hybrid
			uselessFiles.add("how-to-connect-health-adds.md");
			uselessFiles.add("how-to-connect-health-adfs.md");
			uselessFiles.add("how-to-connect-health-agent-install.md");
			uselessFiles.add("how-to-connect-health-alert-catalog.md");
			uselessFiles.add("how-to-connect-health-data-freshness.md");
			uselessFiles.add("how-to-connect-health-diagnose-sync-errors.md");
			uselessFiles.add("how-to-connect-health-operations.md");
			uselessFiles.add("how-to-connect-health-sync.md");
			uselessFiles.add("how-to-connect-health-ad-fs-sign-in.md");
			uselessFiles.add("how-to-connect-health-adfs-risky-ip-workbook.md");
			
			uselessFiles.add("how-to-connect-sso.md");
			uselessFiles.add("how-to-connect-sso-faq.md");
			uselessFiles.add("how-to-connect-sso-how-it-works.md");
			uselessFiles.add("how-to-connect-sso-quick-start.md");
			uselessFiles.add("how-to-connect-sso-user-privacy.md");
			
			uselessFiles.add("reference-connect-germany.md");
			uselessFiles.add("reference-connect-health-faq.md");
			uselessFiles.add("reference-connect-health-user-privacy.md");
			uselessFiles.add("reference-connect-health-version-history.md");
			
			uselessFiles.add("tshoot-connect-pass-through-authentication.md");
			uselessFiles.add("tshoot-connect-sso.md");
			uselessFiles.add("tutorial-passthrough-authentication.md");
			// 11/09/2018, redirected from connect/active-directory-aadconnect-pass-through-authentication*
			uselessFiles.add("how-to-connect-pta.md");
			uselessFiles.add("how-to-connect-pta-current-limitations.md");
			uselessFiles.add("how-to-connect-pta-faq.md");
			uselessFiles.add("how-to-connect-pta-how-it-works.md");
			uselessFiles.add("how-to-connect-pta-quick-start.md");
			uselessFiles.add("how-to-connect-pta-security-deep-dive.md");
			uselessFiles.add("how-to-connect-pta-upgrade-preview-authentication-agents.md");
			uselessFiles.add("how-to-connect-pta-user-privacy.md");
			
			// 05/26/2020, pta not supported
			uselessFiles.add("how-to-connect-pta-disable-do-not-configure.md");
			
			// 02/13/2019, pta not supported
			uselessFiles.add("plan-migrate-adfs-pass-through-authentication.md");

			// 12/30/2021, ACN location are not supported in this article.
			uselessFiles.add("how-to-connect-sync-feature-preferreddatalocation.md");
			
			// 01/03/2019, need aad.portal.azure.com, not supported.
			uselessFiles.add("plan-migrate-adfs-password-hash-sync.md");
			
			// 01/03/2019, need https://myapps.microsoft.com, not supported
			uselessFiles.add("tutorial-password-hash-sync.md");

			// 02/13/2019, need http://myapps.microsoft.com
			uselessFiles.add("tutorial-phs-backup.md");
			
			// 06/20/2019, sso not supported in "Enterprise application"
			uselessFiles.add("how-to-connect-fed-group-claims.md");

			// connect health not supported
			uselessFiles.add("how-to-connect-health-adfs-risky-ip.md");

			// 11/09/2018, hybrid, redirected from
			// active-directory-azure-ad-connect-hybrid-azure-ad-join-post-config-tasks.md
			uselessFiles.add("how-to-connect-fed-hybrid-azure-ad-join-post-config-tasks.md");

			// 08/14/2019, most of the content are not suitable for acn.
			uselessFiles.add("cloud-governed-management-for-on-premises.md");

			// 08/27/2019, most of the content are not suitable for acn.
			uselessFiles.add("four-steps.md");

			// 10/10/2019, need connect health as one of the Prerequisites.
			uselessFiles.add("whatis-aadc-admin-agent.md");

			// 11/04/2019, too much content that are not available.
			uselessFiles.add("how-to-connect-staged-rollout.md");

			// 12/09/2019, pta not supported
			uselessFiles.add("reference-connect-pta-version-history.md");

			// 04/21/2020, many features are not available in it. 
			uselessFiles.add("choose-ad-authn.md");
			uselessFiles.add("howto-troubleshoot-upn-changes.md");
			
			// 04/21/2020, about goverment cloud, not china cloud.
			uselessFiles.add("reference-connect-government-cloud.md");
			
//			// 04/23/2020, this version history is not fit for china. Many features are not available. 
//			uselessFiles.add("reference-connect-version-history.md");
			
			uselessFiles.add("how-to-connect-group-writeback.md");
			
			// 08/17/2020, this version history is not fit for china. Many features are not available. 
			uselessFiles.add("reference-connect-version-history-archive.md");
			
			//09/21/2020, connect health not supported
			uselessFiles.add("how-to-connect-health-data-retrieval.md");
			
			uselessFiles.add("how-to-connect-pta-faq.yml");
			uselessFiles.add("how-to-connect-sso-faq.yml");
			uselessFiles.add("reference-connect-health-faq.yml");
			
			// 07/23/2021, too many features not available
			uselessFiles.add("migrate-from-federation-to-cloud-authentication.md");
			
			// 12/29/2021, provision not supported currently
			uselessFiles.add("what-is-inter-directory-provisioning.md");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
	}

	// TODO
	public static class Manage_apps {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		private static final List<String> ignoredWords = new ArrayList<String>();
		
		public synchronized static List<String> getIgnoredWords() {
			ignoredWords.add("media/add-application-portal");
			ignoredWords.add("add-application-portal-configure");
			ignoredWords.add("");
			ignoredWords.add("");
		    
		    return ignoredWords;
		}

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			warningWords.add("group assignment");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "methods-for-assigning-users-and-groups.md",	"删掉 group assignment 相关的内容，Jessie Pang 邮件要求的。" });
			attentionWords.add(new String[] { "remove-user-or-group-access-portal.md",  	"powshell 的代码跑不通； \n 删掉 group assignment 相关的内容，Jessie Pang 邮件要求的。" });
			attentionWords.add(new String[] { "application-types.md",   					"删除 \"I want to disable all future user consent operations to any application\" 部分， 没那个选项" });

			attentionWords.add(new String[] { "assign-user-or-group-access-portal.md",		"删掉 group assignment 相关的内容，Jessie Pang 邮件要求的。" });
			attentionWords.add(new String[] { "assign-user-or-group-access-portal.md",		"03242020, global 与 acn 的功能不一样，acn没有 user and groups" });

			attentionWords.add(new String[] { "hide-application-from-user-portal.md",       "删掉: ## Hide Microsoft 365 applications from the My Apps portal" });
			
			attentionWords.add(new String[] { "configure-authentication-for-federated-users-portal.md", " zone pivot=\"graph-hrd\" 的内容要用到 microsoft graph explorer, 不支持" });
			attentionWords.add(new String[] { "prevent-domain-hints-with-home-realm-discovery.md",      " zone pivot=\"graph-hrd\" 的内容要用到 microsoft graph explorer, 不支持" });
			
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// manage-apps
			// 07/03/2018, no single sign on in portal -> ad -> enterprice app -> click app
			// -> left blade,
			// add global ad portal center is not suitable for acn.
			uselessFiles.add("manage-certificates-for-federated-single-sign-on.md");
			// 07/04/2018, most of the content is not available in acn.
			uselessFiles.add("what-is-access-management.md");
			// 07/04/2018, Azure Active Directory App Gallery no supported.
			uselessFiles.add("certificate-signing-options.md");
			
//			// 12/09/2019, got error when execute Get-AzureADPolicy & New-AzureADPolicy
//			uselessFiles.add("configure-authentication-for-federated-users-portal.md");
			
			// 07/04/2018, no All Services > ad > Enterprise Applications > you app >
			// Provisioning
			uselessFiles.add("configure-automatic-user-provisioning-portal.md");
			// 07/04/2018, no All Services > ad > Enterprise Applications > you app > single
			// sign on
			uselessFiles.add("configure-single-sign-on-portal.md");
			// 07/04/2018, most of the content is not available in acn.
			uselessFiles.add("plan-an-application-integration.md");
			// 07/04/2018, saas is not supported in ACN
			uselessFiles.add("tenant-restrictions.md");
			// 07/04/2018, no Azure Active Directory > Enterprise Applications > New
			// application > All > Non-gallery application
			uselessFiles.add("use-scim-to-provision-users-and-groups.md");
			// 08/26/2020, much content is not available in acn.
			uselessFiles.add("what-is-application-management.md");
			// 12/10/2018, most of the content is not available in acn.
			uselessFiles.add("what-is-single-sign-on.md");
			// 08/29/2018, migrage saas app, not supported.
			uselessFiles.add("migrate-adfs-apps-to-azure.md");
			// 10/08/2018, redirected from
			// "application-config-add-app-problem-how-to-choose-application-type.md"
			uselessFiles.add("choose-application-type.md");
			// 10/08/2018, redirected from
			// "application-access-panel-self-service-applications-how-to.md"
			uselessFiles.add("access-panel-manage-self-service-access.md");
			// 10/08/2018, redirected from
			// "application-access-panel-unexpected-application-not-appearing.md"
			uselessFiles.add("access-panel-troubleshoot-application-not-appearing.md");
			// 10/08/2018, redirected from
			// "application-access-panel-self-service-applications-problem.md"
			uselessFiles.add("access-panel-troubleshoot-self-service-access.md");
			// 10/08/2018, redirected from
			// "application-access-panel-unexpected-application-appears.md"
			uselessFiles.add("access-panel-troubleshoot-unexpected-application.md");
			// 10/08/2018, redirected from "application-access-panel-web-sign-in-problem.md"
			uselessFiles.add("access-panel-troubleshoot-web-sign-in-problem.md");
			// 10/08/2018, redirected from
			// "active-directory-saas-provisioning-reporting.md", need saas
			uselessFiles.add("check-status-user-account-provisioning.md");
			// 10/08/2018, redirected from
			// "active-directory-saas-customizing-attribute-mappings.md", need saas
			uselessFiles.add("customize-application-attributes.md");
			// 10/08/2018, redirected from "active-directory-saas-scoping-filters.md", need
			// saas
			uselessFiles.add("define-conditional-rules-for-provisioning-user-accounts.md");
			// 10/08/2018, redirected from "active-directory-saas-ie-group-policy.md", need
			// saas
			uselessFiles.add("deploy-access-panel-browser-extension.md");
			// 10/08/2018, redirected from
			// "active-directory-saas-writing-expressions-for-attribute-mappings.md", need
			// saas
			uselessFiles.add("functions-for-customizing-application-data.md");
			// 10/08/2018, redirected from "active-directory-saas-ie-troubleshooting.md",
			// need saas
			uselessFiles.add("manage-access-panel-browser-extension.md");
			
			// 09/08/2020, no "Enterprise applications" -> "app" -> "self service"
			uselessFiles.add("manage-self-service-access.md");
			
			// 10/08/2018, redirected from
			// "application-access-assignment-how-to-remove-assignment.md"
			uselessFiles.add("methods-for-removing-user-access.md");
			// 10/08/2018, redirected from "active-directory-saas-app-provisioning.md", need
			// saas
			uselessFiles.add("user-provisioning.md");
			// 10/09/2018, most of the content is not suitable for acn.
			uselessFiles.add("migration-resources.md");
//			// 12/10/2018, no **Visible to users?** and no **Users can only see Office 365
//			// apps in the Office 365 portal**
//			uselessFiles.add("hide-application-from-user-portal.md");
			
			// 05/29/2020, most of the content are not suitable for acn.
			uselessFiles.add("end-user-experiences.md");
			
			// 12/08/2020, content and images are used for acom environment.
			uselessFiles.add("add-application-portal.md");
			
			// 02/18/2019, not supported in acn.
			uselessFiles.add("application-provisioning-config-problem-scim-compatibility.md");
//			// 02/18/2019, need premium
//			uselessFiles.add("howto-saml-token-encryption.md");

			// gallery, sso, application-proxy not supported
			uselessFiles.add("application-sign-in-problem-federated-sso-gallery.md");
			uselessFiles.add("application-sign-in-problem-federated-sso-non-gallery.md");
			uselessFiles.add("application-sign-in-problem-on-premises-application-proxy.md");
			uselessFiles.add("application-sign-in-problem-password-sso-gallery.md");
			uselessFiles.add("application-sign-in-problem-password-sso-non-gallery.md");
			uselessFiles.add("adding-gallery-app-common-problems.md");
			uselessFiles.add("adding-non-gallery-app-common-problems.md");

			// 01/03/2020, app proxy not supported
			uselessFiles.add("powershell-assign-group-to-app.md");
			uselessFiles.add("powershell-assign-user-to-app.md");
			uselessFiles.add("powershell-display-users-group-of-app.md");
			uselessFiles.add("powershell-get-all-app-proxy-apps-basic.md");
			uselessFiles.add("powershell-get-all-app-proxy-apps-by-connector-group.md");
			uselessFiles.add("powershell-get-all-app-proxy-apps-extended.md");
			uselessFiles.add("powershell-get-all-connectors.md");
			uselessFiles.add("powershell-get-all-custom-domain-no-cert.md");
			uselessFiles.add("powershell-get-all-custom-domains-and-certs.md");
			uselessFiles.add("powershell-get-all-default-domain-apps.md");
			uselessFiles.add("powershell-get-all-wildcard-apps.md");
			uselessFiles.add("powershell-get-custom-domain-identical-cert.md");
			uselessFiles.add("powershell-get-custom-domain-replace-cert.md");
			uselessFiles.add("powershell-move-all-apps-to-connector-group.md");

			uselessFiles.add("configure-federated-single-sign-on-gallery-applications.md");
			uselessFiles.add("configure-federated-single-sign-on-gallery-applications-problems.md");
			uselessFiles.add("configure-federated-single-sign-on-non-gallery-applications.md");
			uselessFiles.add("configure-federated-single-sign-on-non-gallery-applications-problems.md");
			uselessFiles.add("configure-password-single-sign-on-gallery-applications.md");
			uselessFiles.add("configure-password-single-sign-on-gallery-applications-problems.md");
			uselessFiles.add("configure-password-single-sign-on-non-gallery-applications.md");
			uselessFiles.add("configure-password-single-sign-on-non-gallery-applications-problems.md");
			uselessFiles.add("configure-single-sign-on-non-gallery-applications.md");

			uselessFiles.add("add-gallery-app.md");
			uselessFiles.add("add-non-gallery-app.md");

			// 05/13/2019， need access panel, not available
			uselessFiles.add("access-panel-extension-problem-installing.md");
			uselessFiles.add("application-provisioning-when-will-provisioning-finish-specific-user.md");

			// 07/04/2019, used for saas, not supported
			uselessFiles.add("user-provisioning-sync-attributes-for-mapping.md");

			// 07/30/2018, no "Gallery application" in ad.
			uselessFiles.add("application-provisioning-config-problem-no-users-provisioned.md");
			uselessFiles.add("application-provisioning-config-how-to.md");

			// 07/30/2018, need saas, not supported
			uselessFiles.add("application-provisioning-when-will-provisioning-finish.md");
			// 07/30/2018, no "Users and groups" under ad -> enterprise application -> app
			// -> left blade
			uselessFiles.add("application-provisioning-config-problem-wrong-users-provisioned.md");

			// 07/05/2018, gally app in not supported in acn.
			uselessFiles.add("application-provisioning-config-problem-storage-limit.md");

			// 07/30/2018, no "single sign on" in acn ad.
			uselessFiles.add("application-sign-in-problem-application-error.md");
			// 07/04/2018, myapps.microsoft.com do not accept acn account.
			uselessFiles.add("application-sign-in-other-problem-deeplink.md");
			uselessFiles.add("application-sign-in-other-problem-access-panel.md");

			// 09/04/2020, sso not supported
			uselessFiles.add("troubleshoot-password-based-sso.md");
			
			// 06/20/2018, no blade called "provisioning" in ad -> enterprise application ->
			// app
			uselessFiles.add("application-provisioning-config-problem.md");

			// 08/14/2019, used for saas and need sso, not supported
			uselessFiles.add("isv-choose-multi-tenant-federation.md");
			uselessFiles.add("isv-create-sso-documentation.md");
			uselessFiles.add("isv-sso-content.md");
			uselessFiles.add("isv-tenant-multi-tenant-app.md");
			uselessFiles.add("isv-automatic-provisioning-multi-tenant-apps.md");

			// 08/14/2019, need sso, not supported
			uselessFiles.add("one-click-sso-tutorial.md");
			uselessFiles.add("plan-sso-deployment.md");
			// 08/21/2019, no access panel in China
			uselessFiles.add("access-panel-deployment-plan.md");
			// 08/21/2019, sso not supported
			uselessFiles.add("configure-linked-sign-on.md");
			// 09/30/2019, "Microsoft Graph Explorer" china page function is different from
			// global's.
			uselessFiles.add("export-import-provisioning-configuration.md");
			uselessFiles.add("skip-out-of-scope-deletions.md");
			// 10/12/2019, this version history not fit for acn.
			uselessFiles.add("provisioning-agent-release-version-history.md");

			// 11/04/2019, access panel not available in acn.
			uselessFiles.add("access-panel-workspaces.md");
			// 11/04/2019, no "provisioning" in ad
			uselessFiles.add("application-provisioning-quarantine-status.md");
			
			// 10/26/2020, no "Admin consent requests" under ad -> user settings
			uselessFiles.add("configure-admin-consent-workflow.md");
			// 12/17/2021, need configure-admin-consent-workflow.md
			uselessFiles.add("grant-consent-single-user.md");
			
			// 11/04/2019, connect health not supported
			uselessFiles.add("migrate-adfs-application-activity.md");
			// 11/25/2019, conditional access/identity protection not available
			uselessFiles.add("secure-hybrid-access.md");
			// 11/20/2019, provision not supported
			uselessFiles.add("application-provisioning-configure-api.md");
			// 11/20/2019, provision and Application Proxy not supported
			uselessFiles.add("application-management-fundamentals.md");

			// 12/09/2019, provision not supported.
			uselessFiles.add("plan-cloud-hr-provision.md");
			// 01/03/2020, no provision
			uselessFiles.add("how-provisioning-works.md");
			uselessFiles.add("sap-successfactors-attribute-reference.md");
			uselessFiles.add("workday-attribute-reference.md");

			// 02/05/2020, acn account not supported in myapps
			uselessFiles.add("access-panel-collections.md");

			// 12/17/2021, need "configure-admin-consent-workflow.md"
			uselessFiles.add("manage-consent-requests.md");
			uselessFiles.add("consent-and-permissions-overview.md");
			
			// 04/21/2020, many features are not available in in.
			uselessFiles.add("common-scenarios.md");
			
			// 06/29/2020, gallery application not supported in acn.
			uselessFiles.add("application-saml-sso-configure-api.md");
			
			// 07/06/2020, no sso blade in portal
			uselessFiles.add("add-application-portal-setup-sso.md");
			
			// 08/14/2020, sso not supported
			uselessFiles.add("configure-saml-single-sign-on.md");
			
			// 08/14/2020, no gallery in acn portal
			uselessFiles.add("non-gallery-apps.md");
			
			// 08/17/2020, sso not supported
			uselessFiles.add("sso-options.md");
			
//			// 09/21/2020, not sure group-based assignment supported or not. It need ad premium p1,p2.
//			uselessFiles.add("add-application-portal-assign-users.md");
			
			// 09/21/2020, sso not supported
			uselessFiles.add("troubleshoot-saml-based-sso.md");
			
			// 09/29/2020, sso not supported
			uselessFiles.add("add-application-portal-setup-oidc-sso.md");
			uselessFiles.add("configure-oidc-single-sign-on.md");
			uselessFiles.add("debug-saml-sso-issues.md");
			
			// 10/22/2020, no "Group owner consent for apps accessing data" in portal balade:
			// Azure Active Directory > Enterprise applications > Consent and permissions > User consent settings
			uselessFiles.add("configure-user-consent-groups.md");
			
			// 11/09/2020, not suitable in China
			uselessFiles.add("whats-new-docs.md");
			
			// 11/04/2021, many content and features are not available, such as sso.
			uselessFiles.add("f5-aad-integration.md");
			uselessFiles.add("f5-aad-password-less-vpn.md");
			uselessFiles.add("f5-bigip-deployment-guide.md");
			uselessFiles.add("f5-big-ip-forms-advanced.md");
			uselessFiles.add("f5-big-ip-header-advanced.md");
			uselessFiles.add("f5-big-ip-ldap-header-easybutton.md");
			uselessFiles.add("f5-big-ip-kerberos-advanced.md");
			uselessFiles.add("f5-big-ip-kerberos-easy-button.md");
			uselessFiles.add("f5-big-ip-headers-easy-button.md");
			uselessFiles.add("f5-big-ip-oracle-enterprise-business-suite-easy-button.md");
			uselessFiles.add("f5-big-ip-oracle-jde-easy-button.md");
			uselessFiles.add("f5-big-ip-oracle-peoplesoft-easy-button.md");
			uselessFiles.add("f5-big-ip-sap-erp-easy-button.md");
			uselessFiles.add("");
			
			// 02/22/2021, need application proxy and many not supported files
			uselessFiles.add("my-apps-deployment-plan.md");
			// 02/22/2021, need application proxy
			uselessFiles.add("migrate-application-authentication-to-azure-active-directory.md");
			
			// 03/15/2021, feedback 390625
			// 当前中国区已有关于如何通过Microsoft Cloud App Security 对管理AAD应用的文档《云应用可见性和控制》https://docs.azure.cn/zh-cn/active-directory/manage-apps/cloud-app-security 。
			// 然而当前根据客户和本地测试，通过https://security.microsoftonline.cn/info --> 点击Microsoft云应用安全会跳转到Global Azure 的登录界面。
			// 当前客户对于云安全应用在中国区是否已经可疑存疑，请帮忙核实，谢谢。
			uselessFiles.add("cloud-app-security.md");
			
			// 09/07/2021, global partner
			uselessFiles.add("datawiza-with-azure-ad.md");
			
			// 09/07/2021, much content not available
			uselessFiles.add("protect-against-consent-phishing.md");
			
			// 09/16/2021, need an account on https://www.postman.com
			uselessFiles.add("migrate-applications-from-okta-to-azure-active-directory.md");
			uselessFiles.add("migrate-okta-federation-to-azure-active-directory.md");
			uselessFiles.add("migrate-okta-sign-on-policies-to-azure-active-directory-conditional-access.md");
			uselessFiles.add("migrate-okta-sync-provisioning-to-azure-active-directory.md");
			
			// 09/16/2021, many features are not available in it
			uselessFiles.add("secure-hybrid-access-integrations.md");
			
			// 10/08/2021, need to integrate with https://www.silverfort.com
			uselessFiles.add("silverfort-azure-ad-integration.md");
			
			// 11/05/2021, integrate Azure Active Directory (Azure AD) with [Datawiza](https://www.datawiza.com/)
			uselessFiles.add("datawiza-with-azure-ad.md");
			
			// 12/17/2021, too many features not avialable
			uselessFiles.add("overview-application-gallery.md");
			
			// 12/17/2021, no ad -> Enterprise applications -> app -> Activity -> Admin consent requests
			uselessFiles.add("review-admin-consent-requests.md");
			
			// 02/10/2022, gallery not supported 
			uselessFiles.add("v2-howto-app-gallery-listing.md");
			
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
		
		public static class Scripts {
			private static final List<String> uselessFiles = new ArrayList<String>();
			
			public static synchronized List<String> getUselessFiles() {
				uselessFiles.add("powershell-get-all-app-proxy-apps-basic.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-by-connector-group.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-extended.md");
				
				// 12/08/2020, need app proxy
				uselessFiles.add("powershell-assign-group-to-app.md");
				uselessFiles.add("powershell-assign-user-to-app.md");
				uselessFiles.add("powershell-display-users-group-of-app.md");
				uselessFiles.add("powershell-get-all-connectors.md");
				uselessFiles.add("powershell-get-all-custom-domain-no-cert.md");
				uselessFiles.add("powershell-get-all-custom-domains-and-certs.md");
				uselessFiles.add("powershell-get-all-default-domain-apps.md");
				uselessFiles.add("powershell-get-all-wildcard-apps.md");
				uselessFiles.add("powershell-get-custom-domain-identical-cert.md");
				uselessFiles.add("powershell-get-custom-domain-replace-cert.md");
				uselessFiles.add("powershell-move-all-apps-to-connector-group.md");
				uselessFiles.add("powershell-assign-group-to-app.md");
				uselessFiles.add("powershell-assign-user-to-app.md");
				uselessFiles.add("powershell-display-users-group-of-app.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-basic.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-by-connector-group.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-extended.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-with-policy.md");
				uselessFiles.add("powershell-get-all-connectors.md");
				uselessFiles.add("powershell-get-all-custom-domain-no-cert.md");
				uselessFiles.add("powershell-get-all-custom-domains-and-certs.md");
				uselessFiles.add("powershell-get-all-default-domain-apps.md");
				uselessFiles.add("powershell-get-all-wildcard-apps.md");
				uselessFiles.add("powershell-get-custom-domain-identical-cert.md");
				uselessFiles.add("powershell-get-custom-domain-replace-cert.md");
				uselessFiles.add("powershell-move-all-apps-to-connector-group.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-extended.md");
				
				uselessFiles.add("powershell-get-all-app-proxy-apps-basic.md");
				uselessFiles.add("powershell-get-all-app-proxy-apps-by-connector-group.md");
				uselessFiles.add("powershell-assign-group-to-app.md");
				uselessFiles.add("powershell-assign-user-to-app.md");
				uselessFiles.add("powershell-display-users-group-of-app.md");
				uselessFiles.add("powershell-get-all-connectors.md");
				uselessFiles.add("powershell-get-all-custom-domain-no-cert.md");
				uselessFiles.add("powershell-get-all-custom-domains-and-certs.md");
				uselessFiles.add("powershell-get-all-default-domain-apps.md");
				uselessFiles.add("powershell-get-all-wildcard-apps.md");
				uselessFiles.add("powershell-get-custom-domain-identical-cert.md");
				uselessFiles.add("powershell-get-custom-domain-replace-cert.md");
				uselessFiles.add("powershell-move-all-apps-to-connector-group.md");
				
				uselessFiles.add("");
				uselessFiles.add("");
				uselessFiles.add("");
				uselessFiles.add("");
				uselessFiles.add("");

				return uselessFiles;
			}
		}
	}

	// TODO
	public static class Managed_identities_azure_resources {
		private static final List<String[]> words = new ArrayList<String[]>(200);
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "](/azure/app-service",               "](/app-service" });
			words.add(new String[] { "](/azure/logic-apps",                "](/logic-apps" });
			words.add(new String[] { "](/azure/api-management",            "](/api-management" });
			words.add(new String[] { "](/azure/role-based-access-control", "](/role-based-access-control" });
			words.add(new String[] { "](/azure/storage",                   "](/storage" });
			words.add(new String[] { "](/azure/key-vault",                 "](/key-vault" });
			words.add(new String[] { "](/azure/sql-database",              "](/sql-database" });
			
			words.add(new String[] {
					"[!INCLUDE [preview-notice](~/includes/active-directory-msi-preview-notice-ua.md)]",
					"[!INCLUDE [preview-notice](../../../includes/active-directory-msi-preview-notice-ua.md)]" });
			
			words.add(new String[] {
					"[!INCLUDE [ua-character-limit](~/includes/managed-identity-ua-character-limits.md)]",
					"[!INCLUDE [ua-character-limit](../../../includes/managed-identity-ua-character-limits.md)]" });

			words.add(new String[] { "/active-directory/managed-identities-azure-resources/services-support-msi", "/active-directory/managed-identities-azure-resources/services-support-managed-identities" });
			
			words.add(new String[] { "services-support-msi.md",   "services-support-managed-identities.md" });
			


			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			
			return words;
		}

		public static synchronized List<String> getWarningWords() {
			warningWords.add("[!INCLUDE [preview-notice](~/includes/active-directory-msi-preview-notice-ua.md)]");
			warningWords.add("[!INCLUDE [ua-character-limit](~/includes/managed-identity-ua-character-limits.md)]");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// 07/16/2019, datalake not supported
			uselessFiles.add("tutorial-linux-vm-access-datalake.md");
			uselessFiles.add("tutorial-windows-vm-access-datalake.md");
			// 07/16/2019, no result when execute "az ad sp list --display-name alexvm" even
			// sys and user identity is enabled in alexvm
			// 03/16/2021, need to test it...
//			uselessFiles.add("how-to-view-managed-identity-service-principal-cli.md");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;

		}
	}

	// TODO
	public static class Privileged_Identity_Management {
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
 
		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

	}

	// TODO
	public static class Reports_monitoring {
		private static final List<String[]> words = new ArrayList<String[]>();
		private static final List<String> warningWords = new ArrayList<String>();
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();

		public static synchronized List<String[]> getWords() {
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });
			words.add(new String[] { "", "" });

			return words;
		}

		public static synchronized List<String> getWarningWords() {
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");
			warningWords.add("");

			return warningWords;
		}

		public static synchronized List<String[]> getAttentionWords() {
			// 07/22/2021
			attentionWords.add(new String[] { "howto-integrate-activity-logs-with-log-analytics.md",  "## Send logs to Azure Monitor 部分，只接受 AuditLogs 和 SignInLogs" });
			
//			attentionWords.add(new String[] { "concept-all-sign-ins.md",   "FEEDBACK 487873, 检查这篇文章是否可用然后再上" });
			
			attentionWords.add(new String[] { "howto-find-activity-reports.md", "##Security reports, ### Missing audit data for recent actions in the Azure portal 不能用" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });

			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			// reports-monitoring
			// 08/27/2018, redirected from "active-directory-reporting-security-risky-sign-ins.md"
			uselessFiles.add("concept-risky-sign-ins.md");
			
//			// 08/28/2018, redirected from "active-directory-reporting-faq.md"
//			uselessFiles.add("reports-faq.md");
			
			// 08/28/2018, redirected from "active-directory-report-security-user-at-risk-remediation.md"
			uselessFiles.add("howto-remediate-users-flagged-for-risk.md");
			// 08/15/2019, not sure available or not
			uselessFiles.add("howto-power-bi-content-pack.md");
			
			// 12/30/2021, not suitable for azure china.
			uselessFiles.add("concept-reporting-api.md");
			uselessFiles.add("troubleshoot-graph-api.md");
			// 12/30/2021, need concept-reporting-api.md
			uselessFiles.add("troubleshoot-missing-data-download.md");
			
//			// 07/04/2019, need ad premium
//			uselessFiles.add("concept-usage-insights-report.md");

			// 08/27/2018, redirected from "active-directory-reporting-security-user-at-risk.md"
			uselessFiles.add("concept-user-at-risk.md");
			// 08/27/2018, redirected from "active-directory-reporting-risk-events.md"
			uselessFiles.add("concept-risk-events.md");
			
//			// 05/27/2020, many us dolloar cost in it.
//			uselessFiles.add("concept-activity-logs-azure-monitor.md");

			// 08/21/2019, many referenced files are not available
			uselessFiles.add("plan-monitoring-and-reporting.md");

//			// 07/03/2020, audit log/sign in logs filter items differ from global.
//			uselessFiles.add("howto-find-activity-reports.md");  

			// 09/30/2019, no "Provisioning logs" in ad blade.
			uselessFiles.add("concept-provisioning-logs.md");

			// 06/20/2021, graph explorer china page is differ from global
			uselessFiles.add("quickstart-access-log-with-graph-api.md");
			
			// 12/30/2021, no "Troubleshooting and support" item
			uselessFiles.add("quickstart-analyze-sign-in.md");
			
			// 10/25/2021, "Sign-in logs" -> Add Filters -> Pick a field -> Flagged for review
			uselessFiles.add("overview-flagged-sign-ins.md");
			
			// 11/30/2021, too many features not available in it
			uselessFiles.add("howto-access-activity-logs.md");
			
			// 03/21/2022， Identity protection not available currently
			uselessFiles.add("workbook-risk-analysis.md");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
	}

	// TODO
	public static class Roles {
		private static final List<String[]> attentionWords = new ArrayList<String[]>();
		private static final List<String> uselessFiles = new ArrayList<String>();
		
		public static synchronized List<String[]> getAttentionWords() {
			attentionWords.add(new String[] { "permissions-reference.md",	"\"Device Administrator\", \"Directory Synchronization Accounts\", Modern Commerce User, \"Partner Tier1 Support\", \"Partner Tier2 Support\", 没有" });

			attentionWords.add(new String[] { "prerequisites.md",                    "\"## Graph Explorer\" 部分不支持; \"Graph Explorer\" 相关的内容要删掉" });
			
			attentionWords.add(new String[] { "role-definitions-list.md",            "\"Graph Explorer\" 相关的内容要删掉" });
			
			attentionWords.add(new String[] { "manage-roles-portal.md",               "Graph Explorer 部分不支持" });
			
			attentionWords.add(new String[] { "assign-roles-different-scopes.md",     "Graph Explorer 部分不支持" });
			
			attentionWords.add(new String[] { "list-role-assignments-users.md",       "Graph Explorer 部分不支持" });
			
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			attentionWords.add(new String[] { "", "" });
			
			
			return attentionWords;
		}

		public static synchronized List<String> getUselessFiles() {
			
			// 08/14/2020, no "ad" -> **Groups** > **All groups** > **New group** -> **Azure AD roles can be assigned to the group** 
			// even user have "Privileged Role administrators or Global administrators" role
			uselessFiles.add("groups-create-eligible.md");
			
			// 04/21/2020, my staff does not accept acn account
			uselessFiles.add("my-staff-configure.md");
			
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");
			uselessFiles.add("");

			return uselessFiles;
		}
	}

	
}
