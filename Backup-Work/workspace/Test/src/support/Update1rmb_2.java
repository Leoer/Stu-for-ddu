package support;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Update1rmb_2 {
	
	private static final List<String[]> words = new ArrayList<String[]>();
	
	public static synchronized List<String[]> getWords() {
		words.add(new String[] { "https://www.azure.cn/pricing/1rmb-trial/?ref=microsoft.com&utm_source=microsoft.com&utm_medium=docs&utm_campaign=visualstudio", "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		
		words.add(new String[] { "https://www.azure.cn/pricing/1rmb-trial/?WT.mc_id=redis_cache_hero",    "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		
		words.add(new String[] { "https://www.azure.cn/pricing/1rmb-trial/?WT.mc_id=A261C142F",           "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		
		words.add(new String[] { "https://www.azure.cn/pricing/1rmb-trial/",                              "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		
		words.add(new String[] { "https://www.azure.cn/pricing/1rmb-trial",                               "https://www.microsoft.com/china/azure/index.html?fromtype=cn" });
		
		words.add(new String[] { "免费创建 Azure 订阅",                      "创建 Azure 订阅" });
		
		words.add(new String[] { "Create an Azure subscription for free",   "Create an Azure subscription" });
		
		words.add(new String[] { "Azure 1 元人民币试用订阅",                 "Azure 试用帐户" });
		
		words.add(new String[] { "Azure 一元试用版",                        "Azure 试用帐户" });
		
		words.add(new String[] { "1 元试用版",                              "试用帐户" });
		
		words.add(new String[] { "1rmb-trial of Azure",                    "Azure trial account" });
		
		words.add(new String[] { "Azure 1rmb-trial",                       "Azure trial account" });
		
		words.add(new String[] { "1rmb-trial",                             "trial account" });
	
		return words;
	}

	public static void main(String[] args) {
		List<String> allFiles = getAllFiles();
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		int count = 0;
		for(String filePath: allFiles) {
			System.out.println(++count + ". " + filePath.replace("E:\\my_files\\mooncake\\", "")); 
			
			String allContent = "";
			
			try {
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));

				String line = null;
				while ((line = reader.readLine()) != null) {
					for (String[] word : Update1rmb_2.getWords()) {
						line = line.replace(word[0], word[1]);
					}
			
					allContent = allContent + line + "\r\n";
				}
				
				writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "utf-8"));
				writer.write(allContent);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (writer != null) {
						writer.close();
						writer = null;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					if (reader != null) {
						reader.close();
						reader = null;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Done");
	}
	
	private static List<String> getAllFiles() {
		List<String> allFiles = new ArrayList<String>(4000);
		
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\includes", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\active-directory", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\active-directory-b2c", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\active-directory-domain-services", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\application-gateway", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\azure-cache-for-redis", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\azure-functions", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\cloud-services", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\power-bi-embedded", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\power-bi-workspace-collections", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\role-based-access-control", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\service-health", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\time-series-insights", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\virtual-machine-scale-sets", allFiles);
//		CommonAction.getAllFilesIncludingSubFolder_2("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\spring-cloud", allFiles);
		
		return allFiles;
	}
	
	
}
