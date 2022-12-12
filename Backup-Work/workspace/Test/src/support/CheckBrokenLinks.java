package support;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import customization.support.LinkSupport2;
import customization.support.ParameterSupport;

/**
 * 
 * 2020.7.3
 * 
 * @author alexch2
 */
public class CheckBrokenLinks {
	
	public static synchronized void main(String[] args) throws Exception{
		ParameterSupport.RUN_TYPE  = 0;
		startCheck("E:\\my_files\\mooncake\\mc-docs-pr\\articles\\active-directory\\develop");
		
//		ParameterSupport.RUN_TYPE  = 1;
//		startCheck("E:\\my_files\\mooncake\\mc-docs-pr.zh-cn\\articles\\active-directory\\develop");
    }
	
	private static synchronized void startCheck(String folderName) {
        List<String> fileList = new ArrayList<String>(200);
        
        readFileNameFromSourceFolder(folderName, fileList);        		
        
        System.out.println("Start checking broken links: " + folderName + "\n"); 
        
        int count = 1;
        for(String file: fileList) {
        	System.out.println(count++ + ". " + file.substring(file.lastIndexOf("\\") + 1));  
        	 
//        	if(file.contains("cloud-services-guestos-msrc-releases.md")) continue;
        	
        	LinkSupport2.checkBrokenLinks(file);
        }
        
        System.out.println("\nChecking broken links done....");
    }
	
	public static synchronized void readFileNameFromSourceFolder(String folderName, List<String> fileList) {
		File sourceFolder = new File(folderName);

		for (File file : sourceFolder.listFiles()) {
			if (file.isFile() && (file.getName().endsWith(".md") || file.getName().endsWith(".yml"))) {
				fileList.add(file.getAbsolutePath());
			} else if(file.isDirectory()) {
				readFileNameFromSourceFolder(file.getAbsolutePath(), fileList);
			}
		}
	}
}
