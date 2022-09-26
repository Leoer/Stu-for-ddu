package customization.support;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @since 04/28/2020
 * 
 * @author Alex Chen
 *
 */
public class CodeSupport {
	
	public static void main(String[] args) {
		
		System.out.println(CodeSupport.revertToCode(":::code language=\"json\" source=\"~/quickstart-templates/101-recovery-services-create-vm-and-configure-backup/azuredeploy.json\" range=\"1-24\" highlight=\"221-245\":::"));
		
//		System.out.println(CodeSupport.revertToCode("[!code-powershell[main](../../../powershell_scripts/api-management/scale-and-addregion-apim-service/scale_and_addregion_apim_service.ps1 \"Scale the APIM service instance\")]"));
		
		System.out.println(CodeSupport.revertToCode("[!code-csharp[Main](../../../media-services-v3-dotnet-tutorials/AMSV3Tutorials/AnalyzeVideos/Program.cs#CreateMediaServicesClient?range=1-30)]"));
	}
	
	private static final String GLOBAL_PUBLISH_JSON_FILE_PATH = ParameterSupport.GLOBAL_ROOT_FOLDER + "\\.openpublishing.publish.config.json";
	
	public synchronized static String revertToCode(String line) {
		Map<String, String> codeInfoMap = null;

		if (line != null && line.trim().startsWith(":::code")) {
			codeInfoMap = parseLine_1(line);
		} else if (line != null && line.trim().startsWith("[!code")) {
			codeInfoMap = parseLine_2(line);
		} else {
			return line;
		}

		String language = codeInfoMap.get("language");
		String source = codeInfoMap.get("source");
		String range = codeInfoMap.get("range");
		String repo = codeInfoMap.get("repo");
		
		if(language.equals("azurecli-interactive")) {
			language = "azurecli";
		} else if(language.equals("powershell-interactive")) {
			language = "powershell";
		}

		String rawFileURL = getRawFileURL(getRepoURL(repo));

		if (rawFileURL != null) {
			String sourceURL = source.replace("~/", "").replace("../", "").replace(repo, rawFileURL); 

			List<String> contentList = getContent(sourceURL, range);
			
			if(contentList.isEmpty()) {
				System.err.println("code: " +  line.trim());
				System.err.println("sourceURL: " +  sourceURL);
				
				throw new NullPointerException("The content is empty. Please get the code from global page.");
			}

			String contentStr = "```" + language + "\r\n";

			for (String element : contentList) {
				contentStr += element + "\r\n";
			}

			contentStr += "```";

			return contentStr;
		} else {

			System.err.print("Repo not found:" + line);
			return line;
		}
	}
	
	// :::code
	private synchronized static Map<String, String> parseLine_1(String line) {
		Map<String, String> codeInfoMap = new HashMap<String, String>();
		
		String subStr = null;
		
		if(line.indexOf("language=\"") > 0) {
			subStr = line.substring(line.indexOf("language=\"") + "language=\"".length());
			String language = subStr.substring(0, subStr.indexOf("\""));
			
			codeInfoMap.put("language", language);
		}
		
		if(line.indexOf("source=\"") > 0) {
			subStr = line.substring(line.indexOf("source=\"") + "source=\"".length());
			String source = subStr.substring(0, subStr.indexOf("\""));
			
			codeInfoMap.put("source", source);
			
			String str = source.replace("~/", "");
			String repo = str.substring(0, str.indexOf("/"));
			
			codeInfoMap.put("repo", repo);
		}
		
		if(line.indexOf("range=\"") > 0) {
			subStr = line.substring(line.indexOf("range=\"") + "range=\"".length());
			String range = subStr.substring(0, subStr.indexOf("\""));
			
			if(range.contains("&")) {
				range = range.substring(0, range.indexOf("&")); 
			}
			
			codeInfoMap.put("range", range);
		}
		
		return codeInfoMap;
	}
	
	// [!code
	private synchronized static Map<String, String> parseLine_2(String line) {
		Map<String, String> codeInfoMap = new HashMap<String, String>();
		
		String subStr = line.replace("[!code-", "").trim();
		String language = subStr.substring(0, subStr.indexOf("[")); 
		
		subStr = subStr.substring(subStr.indexOf("(") + 1, subStr.indexOf(")"));
		if(subStr.indexOf(" ") > 0) {
			subStr = subStr.substring(0, subStr.indexOf(" "));
		}
		
		String source;
		String range = null;
		if(subStr.indexOf("?") > 0) {
			source = subStr.substring(0, subStr.indexOf("?"));
			
			if(subStr.contains("range=")) {
				range = subStr.substring(subStr.indexOf("?") + 1).replace("range=", "");
				
				if(range.contains("&")) {
					range = range.substring(0, range.indexOf("&")); 
				}
			}
		} else {
			source = subStr;
		}
		
		subStr = subStr.replace("../", "").replace("~/", "");
		String repo = subStr.substring(0, subStr.indexOf("/"));  
		
		codeInfoMap.put("language", language);
		codeInfoMap.put("source", source);
		codeInfoMap.put("range", range);
		codeInfoMap.put("repo", repo);
		
		return codeInfoMap;
	}
	
	private synchronized static String getRawFileURL(String repoURL) {
		if (repoURL != null) {
			return repoURL.replace("https://github.com", "https://raw.githubusercontent.com") + "/master";
		}

		return null;
	}
	
	private synchronized static String getRepoURL(String repo) {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(GLOBAL_PUBLISH_JSON_FILE_PATH), "utf-8"));

			String line = null;
			boolean urlFound = false;
			String targetRoot = "\"path_to_root\": \"" + repo + "\"";
			
			targetRoot = targetRoot.toLowerCase();
			
			while ((line = reader.readLine()) != null) {
				if(urlFound == true) {
					String repoURL = line.replace("\"url\": \"", "").replace("\",", "").trim();
					
					return repoURL;
				}
				
				if(line.trim().startsWith(targetRoot)) { 
					urlFound = true;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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

		return null;
	}

	private synchronized static List<String> getContent(String urlStr, String range) {
		List<String> contentList = getContent(urlStr);
		
		if(range != null) {
			int startLine;
			int endLine;
			
			if(range.contains("-")) {
				String[] rangeArr = range.split("-");
				
				startLine = Integer.parseInt(rangeArr[0]);
				endLine = Integer.parseInt(rangeArr[1]);
			} else {
				startLine = Integer.parseInt(range);
				endLine = Integer.parseInt(range);
			}
			
			List<String> newContentList = new ArrayList<String>();
			
			int lineNo = 0;
			for(String line: contentList) {
				lineNo ++;
				
				if(lineNo >= startLine && lineNo <= endLine) {
					newContentList.add(line);
				}
			}
			
			return newContentList;
		} else {
			return contentList;
		}
	}
	
	
	private synchronized static List<String> getContent(String urlStr) {
		List<String> contentList = new ArrayList<String>();
		
		HttpURLConnection connection = null;
		BufferedReader reader = null;
		
		try {
			URL url = new URL(urlStr);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			int respCode = connection.getResponseCode();
			
			if (respCode != 404) {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));

				String line = null;
				while ((line = reader.readLine()) != null) {
					contentList.add(line);
				}
			}
			
			if(contentList.isEmpty()) {
				System.err.println("Can't find code content. ---------------------------");
			}
			
			return contentList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();
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
		
		return contentList;
	}
	
}
