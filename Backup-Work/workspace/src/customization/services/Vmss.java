package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Vmss {
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	private static final List<String> ignoredWords = new ArrayList<String>();
	
	public synchronized static List<String> getIgnoredWords() {
		ignoredWords.add("China North 2");
		ignoredWords.add("chinanorth2");
	    
		ignoredWords.add("ms.subservice: availability");
		ignoredWords.add("availability set");
		ignoredWords.add("high availability");
		ignoredWords.add("Availability and performance");
		
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		ignoredWords.add("");
		
	    return ignoredWords;
	}
	
	public synchronized static List<String> getWarningWords() {
		warningWords.add("low priority");
		warningWords.add("low-priority");
		warningWords.add("Availability Zone");
		
		// 05/21/2020, 统一使用china north 2
		warningWords.add("china east");
		warningWords.add("chinaeast");
		warningWords.add("china north");
		warningWords.add("chinanorth");
		
		// 09/28/2020, not available, johnny yan confirmed
		warningWords.add("virtual-machines/linux/image-builder-overview");
		warningWords.add("virtual-machines/linux/image-builder-gallery-update-image-version");
		
		warningWords.add("");
		warningWords.add("");
		
		return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		attentionWords.add(new String[]{"tutorial-create-and-manage-powershell.md",      "\"了解 VM 实例大小\" 部分， GS 和 G 系列不可用，要删掉"});
		
		attentionWords.add(new String[]{"tutorial-use-disks-powershell.md",              "搜索 \"G\", 所有 G 系列的都要删掉，不可用"});
		
		attentionWords.add(new String[]{"virtual-machine-scale-sets-mvss-guest-based-autoscale-linux.md",      "\"protectedsettings\" 部分要加 China 的 endpoint"});
		
		attentionWords.add(new String[]{"",      ""});
		
		attentionWords.add(new String[]{"",      ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		// 08/22/2019, got error "New-AzProximityPlacementGroup : The resource type could not be found in the namespace 'Microsoft.Compute' for api version '2019-03-01'."
//		uselessFiles.add("proximity-placement-groups.md");
//		uselessFiles.add("co-location.md");
		// 09/29/2018, no "Limit to a single placement group" when create vmss.
//		uselessFiles.add("virtual-machine-scale-sets-placement-groups.md");
		// 04/25/2018, got error when execute: az vmss update --name myVMSS --resource-group myResourceGroup --set UpgradePolicy.AutomaticOSUpgradePolicy.EnableAutomaticOSUpgrade=true
		// It says: Automatic OS Upgrade is not supported for this Virtual Machine Scale Set because a health probe or health extension was not specified.
		// but a health probe is configured in application-gateway
//		uselessFiles.add("virtual-machine-scale-sets-automatic-upgrade.md");
		
//		// 08/31/2020, "Automation -> Runbooks -> Browse Gallery" is not supported in automation account.
//		uselessFiles.add("virtual-machine-scale-sets-vertical-scale-reprovision.md");
		
		// 01/11/2022, no "Availability zones" when create vmss in portal
		uselessFiles.add("virtual-machine-scale-sets-use-availability-zones.md");

//		// 01/10/2019, got error when execute: az vmss create...
//		// usage error: --platform-fault-domain-count COUNT --zones ZONES
//		uselessFiles.add("virtual-machine-scale-sets-manage-fault-domains.md");
		
		// 01/11/2022, no "Azure Spot instance" when create vmss in portal
		uselessFiles.add("use-spot.md");
		
		// 10/30/2019, need key vault hsm, not supported
		uselessFiles.add("disk-encryption-key-vault.md");
		
		// 01/11/2022, no "Create a virtual machine scale set" -> "Health" -> "Automatic repair policy"
		uselessFiles.add("virtual-machine-scale-sets-automatic-instance-repairs.md");

		// 01/11/2022, "virtual-machines\flexible-virtual-machine-scale-sets" not available
		// 01/11/2022, no "Orchestration" when creating vmss in portal
		uselessFiles.add("virtual-machine-scale-sets-orchestration-modes.md");
		uselessFiles.add("orchestration-modes-api-comparison.md");
		
		// 04/09/2021, "virtual-machines/linux/azure-hybrid-benefit-linux.md" not available as "Can not Click on the checkbox to enable AHB conversion and use cloud access licenses." from Johnny Yan
		uselessFiles.add("azure-hybrid-benefit-linux.md");
		uselessFiles.add("");
		uselessFiles.add("");
		
		return uselessFiles;
	}
	
	public static class Scripts {
		private static final List<String> uselessFiles = new ArrayList<String>();
		
		public synchronized static List<String> getUselessFiles() {
			// 2019?2018? not available, pm confirmed.
			uselessFiles.add("powershell-sample-zone-redundant-scale-set.md");
			uselessFiles.add("cli-sample-single-availability-zone-scale-set.md");
			uselessFiles.add("cli-sample-zone-redundant-scale-set.md");
			
			// 06/22/2020, available zone not supported in vmss. virtual-machine-scale-sets/scripts/powershell-single-av-zone-scale-set.md
			uselessFiles.add("powershell-single-av-zone-scale-set.md");
			
			uselessFiles.add("");
			uselessFiles.add("");
			
			return uselessFiles;
		}
	}
	
}


















