package support;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import customization.support.ParameterSupport;

public class CheckLinksIssue {

	public static synchronized void main(String[] args) {
		
		startCheck("E:\\my_files\\mooncake\\mc-docs-pr.en-us\\articles\\active-directory");

	}

	public static synchronized void startCheck(String folderName) {
        List<String> fileList = new ArrayList<String>(200);
        
        CheckBrokenLinks.readFileNameFromSourceFolder(folderName, fileList);        		
        
        System.out.println("Start checking links issues ...\n"); 
        
        int count = 1;
        for(String file: fileList) {
        	List<String> lineList = checkLinks(new File(file));
        	
        	if(!lineList.isEmpty()) {
        		System.out.println(count++ + ". " + file.substring(file.lastIndexOf("\\") + 1));  
        		
        		for(String line: lineList) {
        			System.err.println(line);
        		}
        	}
        }
        
        System.out.println("\nChecking links issues done....");
    }
	
	public static synchronized List<String> checkLinks(String cusomizedFile) {
		File file = new File(ParameterSupport.SOURCE_FOLDER + "/" + cusomizedFile);
		
		return checkLinks(file);
	}
	
	public static synchronized List<String> checkLinks(File file) {
		List<String> lineList = new ArrayList<String>();
		
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));

			boolean inCode = false;
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				
				if(!inCode && line.trim().contains("```")) {
					inCode = true;
				} else if(inCode && line.trim().contains("```")) {
					inCode = false;
				}
				
				// do not check links surrounded by ```...```
				if(!inCode) {
					if(needCheck(line) || needCheck_2(line)) {
						lineList.add(line);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (reader != null) {
					reader.close();
					reader = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return lineList;
	}
	
	/**
	 * 
	 * sample: 
	 * 
	 * 1. com.<your name>.identitysample.MSALMacOS
	 * 2. myapps.com.cn?tenantId=<tenant id>
	 * 
	 * // rule : contains ".<", "=<"
	 * 
	 */
	private static synchronized boolean needCheck(String line) {
		if (newString(line).contains(".<") && needCheck_3(line, ".<")) {
			return true;
		}
		
		if (newString(line).contains("=<") && needCheck_3(line, "=<")) {
			return true;
		}
		
		return false;
	}
	
	private static synchronized boolean needCheck_2(String line) {
		String newStr = newString_2(line);
		
		if(newStr.contains("http://") || newStr.contains("https://")){
			return needCheck_3(line, "http"); 
		}
		
		return false;
	}
	
	private static synchronized boolean needCheck_3(String line, String keyWord) {
		int keyWordIndex = line.indexOf(keyWord);
		
		String subStr = line.substring(0, keyWordIndex);
		
		if(!subStr.contains("`")) {
			return true;
		} else {
			int count = StringUtils.countMatches(subStr, "`");
			
			if(count % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	private static synchronized String newString(String oldStr) {
		return oldStr.replace("</", "")
				      .replace("<p>", "")
				      .replace("<span", "")
				      .replace("<br", "")
				      .replace("<BR", "")
					  .replace(".<li>", "") 
					  .replace(".<ol>", "") 
					  .replace(".<ul>", "")
					  .replace(".<b>", "")
					  .replace(".<app.bundle.id>", "")
		              .replace("**", "")
		              .replace(",", "");
	}
	
	private static synchronized String newString_2(String oldStr) {
		return oldStr.replace("(http", "")
				     .replace("[http", "")
				     .replace("]( http", "") 
				     
				     .replace("href: http", "")
				     .replace("url: http", "")
				     
				     .replace("[!VIDEO https", "")
					 .replace("<a href=\"http", "") 
					 .replace("<img alt=\"\" src=\"http", "") 
					 .replace("src: http", "") 
				     
				     .replace("]: http", "")
					 .replace("]:http", "");
	}
	

}
















