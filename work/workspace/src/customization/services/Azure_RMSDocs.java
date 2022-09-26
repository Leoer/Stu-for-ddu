package customization.services;

import java.util.ArrayList;
import java.util.List;

// Azure Information Protection
// Information Rights Management (IRM)

/*
 * 
 * The AIP docs are synced from an external repo:  https://github.com/MicrosoftDocs/Azure-RMSDocs-pr
 * 
 * to https://github.com/MicrosoftDocs/mc-docs-pr/tree/main/articles/information-protection 
 * 
 */

public class Azure_RMSDocs {
	/*
	 * The unavailable features of AIP for Mooncake are listed at: 
	 * 
	 * https://docs.microsoft.com/en-us/microsoft-365/admin/services-in-china/parity-between-azure-information-protection?view=o365-21vianet 
	 * 
	 * and this page may update from time to time, you should check if any updates everytime before adapting AIP docs. 
	 */
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
    /*
     * 
       One thing should be paid attention to is Azure portal is not yet available for AIP, but the related content in docs are not removed, instead we add a note as below in docs. 

	   [!INCLUDE [portal-unavailable](./includes/information-protection-portal-unavailable-for-mooncake.md)]
	   [!INCLUDE [portal-unavailable](../includes/information-protection-portal-unavailable-for-mooncake.md)]
   
       The note is an include file under the path *articles\information-protection\includes\information-protection-portal-unavailable-for-mooncake.md*, with the content below. 

   	   >[!Note] 
	   > Azure Information Protection is not currently supported on Azure China portal. 
	   > You can achieve the same functionality using the [Azure Information Protection PowerShell commands](https://docs.microsoft.com/powershell/module/azureinformationprotection/?view=azureipps). 
		   
     */
	
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("");
		
	    return ignoredWords;
	}
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "https://docs.microsoft.com/office365/servicedescriptions/microsoft-365-service-descriptions/microsoft-365-tenantlevel-services-licensing-guidance/microsoft-365-security-compliance-licensing-guidance#information-protection", 
				                 "https://www.azure.cn/pricing/details/information-protection" });
		
		words.add(new String[] { "", "" });
		words.add(new String[] { "", "" });
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
		// https://docs.microsoft.com/en-us/microsoft-365/admin/services-in-china/parity-between-azure-information-protection?view=o365-21vianet
		
		// 12/29/2021, from Derek
//		warningWords.add("Office Professional Plus");                       // Office Professional Plus doesn't support AD RMS.
		
//		warningWords.add("Migration");                                      // Migration from AD RMS to AIP is currently not available.
		
//		warningWords.add("protected emails");                               // Sharing of protected emails with users in the commercial cloud is supported.
		warningWords.add("documents and email attachments with users");     // Sharing of documents and email attachments with users in the commercial cloud is currently not available.
		
		warningWords.add("IRM with SharePoint");                            // IRM with SharePoint (IRM-protected sites and libraries) is currently not available.
		
		warningWords.add("Mobile Device Extension");   // The Mobile Device Extension for AD RMS is currently not available.
		warningWords.add("Mobile Viewer");             // The Mobile Viewer is not supported by Azure China 21Vianet.
		
		warningWords.add("AIP area");                  // The AIP area of the Azure portal is unavailable to customers in China.
//		warningWords.add("Azure portal");
		
		warningWords.add("");
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
		
		// 12/29/2021, from Derek, from https://docs.microsoft.com/en-us/microsoft-365/admin/services-in-china/parity-between-azure-information-protection?view=o365-21vianet
		uselessFiles.add("active-directory-rights-manage-mobile-device.md");
		uselessFiles.add("migrate-from-ad-rms-phase1.md");
		uselessFiles.add("migrate-from-ad-rms-phase2.md");
		uselessFiles.add("migrate-from-ad-rms-phase3.md");
		uselessFiles.add("migrate-from-ad-rms-phase4.md");
		uselessFiles.add("migrate-from-ad-rms-phase5.md");
		uselessFiles.add("migrate-from-ad-rms-to-azure-rms.md");
		uselessFiles.add("migrate-hsmkey-to-hsmkey.md");
		uselessFiles.add("migrate-portal.md");
		uselessFiles.add("migrate-softwarekey-to-hsmkey.md");
		uselessFiles.add("migrate-softwarekey-to-softwarekey.md");
		
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	public static class Develop {
		
	}
	
	public static class Rms_client {
		public synchronized static List<String> getUselessFiles() {
			
			uselessFiles.add("mobile-app-faq.md");
			uselessFiles.add("");

			return uselessFiles;
		}
	}
	
	public static class Includes {
		
	}
	
	
}
