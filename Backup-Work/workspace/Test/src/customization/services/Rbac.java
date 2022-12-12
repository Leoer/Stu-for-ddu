package customization.services;

import java.util.ArrayList;
import java.util.List;

public class Rbac {
	private static final List<String[]> words = new ArrayList<String[]>();
	private static final List<String> warningWords = new ArrayList<String>();
	private static final List<String[]> attentionWords = new ArrayList<String[]>();
	private static final List<String> uselessFiles = new ArrayList<String>();
	
	public static synchronized List<String[]> getWords() {
		// build-in-roles.md
		words.add(new String[] { "[Learn more](/azure/architecture/reference-architectures/n-tier/linux-vm)", "" });
		words.add(new String[] { "[Learn more](../cdn/cdn-app-dev-net.md)", "" });
		words.add(new String[] { "[Learn more](../avere-vfxt/avere-vfxt-deploy-plan.md)", "" });
		words.add(new String[] { "[Learn more](../avere-vfxt/avere-vfxt-manage-cluster.md)", "" });
		words.add(new String[] { "[Learn more](../databox/data-box-logs.md)", "" });
		words.add(new String[] { "[Learn more](../data-lake-analytics/data-lake-analytics-manage-use-portal.md)", "" });
		words.add(new String[] { "[Learn more](../azure-maps/azure-maps-authentication.md)", "" });
		words.add(new String[] { "[Learn more](../aks/manage-azure-rbac.md)", "" });
		words.add(new String[] { "[Learn more](../data-share/concepts-roles-permissions.md)", "" });
		words.add(new String[] { "[Learn more](../blockchain/service/configure-aad.md)", "" });
		words.add(new String[] { "[Learn more](../cognitive-services/custom-vision-service/role-based-access-control.md)", "" });
		words.add(new String[] { "[Learn more](../cognitive-services/qnamaker/reference-role-based-access-control.md)", "" });
		words.add(new String[] { "[Learn more](../applied-ai-services/metrics-advisor/how-tos/alerts.md)", "" });
		words.add(new String[] { "[Learn more](../iot-hub-device-update/device-update-control-access.md)", "" });
		words.add(new String[] { "[Learn more](../remote-rendering/how-tos/authentication.md)", "" });
		words.add(new String[] { "[Learn more](../spatial-anchors/concepts/authentication.md)", "" });
		words.add(new String[] { "[Learn more](../healthcare-apis/azure-api-for-fhir/configure-azure-rbac.md)", "" });
		words.add(new String[] { "[Learn more](../logic-apps/add-artifacts-integration-service-environment-ise.md)", "" });
		words.add(new String[] { "[Learn more](../attestation/troubleshoot-guide.md)", "" });
		words.add(new String[] { "[Learn more](../devtest-labs/devtest-lab-add-devtest-user.md)", "" });
		words.add(new String[] { "[Learn more](../sentinel/tutorial-monitor-your-data.md)", "" });
		words.add(new String[] { "[Learn more](../sentinel/roles.md)", "" });
		words.add(new String[] { "[Learn more](../azure-arc/kubernetes/azure-rbac.md)", "" });
		words.add(new String[] { "[Learn more](../azure-arc/servers/onboard-service-principal.md)", "" });
		words.add(new String[] { "[Learn more](../azure-arc/kubernetes/connect-cluster.md)", "" });
		words.add(new String[] { "[Learn more](../cost-management-billing/costs/understand-work-scopes.md)", "" });
		words.add(new String[] { "[Learn more](../cost-management-billing/manage/manage-billing-access.md)", "" });
		words.add(new String[] { "[Learn more](../cost-management-billing/reservations/prepare-buy-reservation.md)", "" });
		words.add(new String[] { "[Learn more](../virtual-desktop/rbac.md)", "" });
		words.add(new String[] { "[Learn more](../virtual-desktop/delegated-access-virtual-desktop.md)", "" });
		words.add(new String[] { "[Learn more](/services-hub/health/sh-connector-roles)", "" });
		words.add(new String[] { "[Learn more](../digital-twins/concepts-security.md)", "" });
		words.add(new String[] { "[Learn more](../backup/backup-managed-disks.md)", "" });
		words.add(new String[] { "[Learn more](../backup/restore-managed-disks.md)", "" });
		words.add(new String[] { "[Learn more](../backup/disk-backup-faq.yml)", "" });
		words.add(new String[] { "[Learn more](../attestation/quickstart-powershell.md)", "" });
		words.add(new String[] { "[Learn more](../lab-services/add-lab-creator.md)", "" });
		words.add(new String[] { "[Learn more](../azure-monitor/insights/container-insights-update-metrics.md)", "" });
		words.add(new String[] { "[Learn more](../governance/blueprints/overview.md)", "" });
		words.add(new String[] { "[Learn more](../lighthouse/how-to/remove-delegation.md)", "" });
		words.add(new String[] { "[Learn more](../azure-portal/supportability/how-to-create-azure-support-request.md)", "" });
		
		// resource-provider-operations.md
		words.add(new String[] { "Azure service: [Content Delivery Network](../cdn/index.yml)",             "Azure service: Content Delivery Network" });
		words.add(new String[] { "Azure service: [Azure Data Share](../data-share/index.yml)",              "Azure service: Azure Data Share" });
		words.add(new String[] { "Azure service: [Azure NetApp Files](../azure-netapp-files/index.yml)",    "Azure service: Azure NetApp Files" });
		words.add(new String[] { "Azure service: [StorSimple](../storsimple/index.yml)",                    "Azure service: StorSimple" });
		words.add(new String[] { "Azure service: [Azure Maps](../azure-maps/index.yml)",                    "Azure service: Azure Maps" });
		words.add(new String[] { "Azure service: [Azure Databricks](/azure/databricks/)",                   "Azure service: [Azure Databricks](/databricks/)" });
		words.add(new String[] { "Azure service: [Data Lake Analytics](../data-lake-analytics/index.yml)",  "Azure service: Data Lake Analytics" });
		words.add(new String[] { "Azure service: [Power BI Embedded](/azure/power-bi-embedded/)",           "Azure service: [Power BI Embedded](/power-bi-embedded/)" });
		words.add(new String[] { "Azure service: [Azure Purview](../purview/index.yml)",                    "Azure service: Azure Purview" });
		words.add(new String[] { "Azure service: [Azure Blockchain Service](../blockchain/workbench/index.yml)", "Azure service: Azure Blockchain Service" });
		words.add(new String[] { "Azure service: [Azure Bot Service](/azure/bot-service/)",                 "Azure service: Azure Bot Service" });
		words.add(new String[] { "Azure service: [Device Update for IoT Hub](../iot-hub-device-update/index.yml)", "Azure service: Device Update for IoT Hub" });
		words.add(new String[] { "Azure service: [IoT Central](../iot-central/index.yml)",                  "Azure service: IoT Central" });
		words.add(new String[] { "Azure service: [IoT security](../iot-fundamentals/iot-security-architecture.md)", "Azure service: IoT security" });
		words.add(new String[] { "Azure service: [Azure Spatial Anchors](../spatial-anchors/index.yml)",    "Azure service: Azure Spatial Anchors" });
		words.add(new String[] { "Azure service: [Azure Stack Edge](../databox-online/azure-stack-edge-overview.md)", "Azure service: Azure Stack Edge" });
		words.add(new String[] { "Azure service: [Data Catalog](../data-catalog/index.yml)",                "Azure service: Data Catalog" });
		words.add(new String[] { "Azure service: [Azure Sentinel](../sentinel/index.yml)",                  "Azure service: Azure Sentinel" });
		words.add(new String[] { "Azure service: [Azure Lab Services](../lab-services/index.yml)",          "Azure service: Azure Lab Services" });
		words.add(new String[] { "Azure service: [Azure DevOps](/azure/devops/)",                           "Azure service: Azure DevOps" });
		words.add(new String[] { "Azure service: [Azure Migrate](../migrate/migrate-services-overview.md)", "Azure service: Azure Migrate" });
		words.add(new String[] { "Azure service: [Cost Management + Billing](../cost-management-billing/index.yml)", "Azure service: Cost Management + Billing" });
		words.add(new String[] { "Azure service: [Azure Blueprints](../governance/blueprints/index.yml)",   "Azure service: Azure Blueprints" });
		words.add(new String[] { "Azure service: [Azure Arc](../azure-arc/index.yml)",                      "Azure service: Azure Arc" });
		words.add(new String[] { "Azure service: [Azure Arc enabled Kubernetes](../azure-arc/kubernetes/overview.md)", "Azure service: Azure Arc enabled Kubernetes" });
		words.add(new String[] { "Azure service: [Azure Kubernetes Service (AKS)](/azure/aks/)",            "Azure service: [Azure Kubernetes Service (AKS)](/aks/)" });
		words.add(new String[] { "Azure service: [Azure Lighthouse](../lighthouse/index.yml)",              "Azure service: Azure Lighthouse" });
		words.add(new String[] { "Azure service: [Azure Digital Twins](../digital-twins/index.yml)",        "Azure service: Azure Digital Twins" });
		words.add(new String[] { "Azure service: [Services Hub](/services-hub/)",                           "Azure service: Services Hub" });
		words.add(new String[] { "Azure service: [Cost Management](../cost-management-billing/index.yml)", "Azure service: Cost Management" });
		
		words.add(new String[] { "聽", " " });
		words.add(new String[] { "", "" });
		words.add(new String[] { "", "" });
		
		return words;
	}
	
	public synchronized static List<String> getWarningWords() {
		// 05/27/2020, feedback: 226775
		warningWords.add("Microsoft.Support");
		
		// 12/08/2021, not available currently
		warningWords.add("security attributes");
		
		warningWords.add("hsm");
		warningWords.add("");
		warningWords.add("");
		
		return warningWords;
	}
	
	public synchronized static List<String[]> getAttentionWords() {
		// 05/27/2020, feedback: 226775
		attentionWords.add(new String[]{"custom-roles-powershell.md",      "Microsoft.Support 不支持，要删掉"});
		attentionWords.add(new String[]{"custom-roles-cli.md",             "Microsoft.Support 不支持，要删掉"});
		
		attentionWords.add(new String[]{"role-assignments-portal-managed-identity.md",      "\"Add role assignment\" 在 System assigned 和 User assigned 里面都没有， 要修改"});
		
		attentionWords.add(new String[]{"",      ""});
		attentionWords.add(new String[]{"",      ""});
		attentionWords.add(new String[]{"",      ""});
		attentionWords.add(new String[]{"",      ""});
		
		return attentionWords;
	}
	
	public synchronized static List<String> getUselessFiles() {
		
		// 05/27/2020， use "Microsoft.Support" as an example which is not available
		uselessFiles.add("tutorial-custom-role-cli.md");
		uselessFiles.add("tutorial-custom-role-powershell.md");
		
		return uselessFiles;
	}
}


















