package customization.support;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.SSLHandshakeException;

import org.apache.commons.lang3.StringUtils;

import customization.WacnReplace81;

public class LinkSupport2 {

	public synchronized static void checkBrokenLinks(String fileAbsolutePath) {
		List<String> remoteLinks = new ArrayList<String>(); 
		List<String> localLinks = new ArrayList<String>();
		
		getAllLinks(fileAbsolutePath, remoteLinks, localLinks);
		
		// check links from local file system
		List<String> needRemoteCheckLinkList = checkLocalLinks(fileAbsolutePath, localLinks);
		
		// check links that need visit website
		remoteLinks.addAll(needRemoteCheckLinkList);
		
		checkRemoteLinks(remoteLinks);
	}
	
	/**
	 * 
	 * ����ļ��Ƿ��ڱ��ش��ڣ������ڵĻ�ȥԶ�̼��
	 * 
	 * @param fileAbsolutePath
	 * @param localLinks
	 */
	private static synchronized List<String> checkLocalLinks(String fileAbsolutePath, List<String> localLinks) {
		List<String> needRemoteCheckLinkList = new ArrayList<String>();
		
		for(String localLink: localLinks) {
			int count = StringUtils.countMatches(localLink, "../");
			
			File parentFile = new File(fileAbsolutePath).getParentFile();
			for(int i=0; i<count; i++) {
				parentFile = parentFile.getParentFile();
			}
			
			String localFile;
			
			if(ParameterSupport.RUN_TYPE == ParameterSupport.RUN_TO_EN_US) {
				localFile = parentFile.getAbsolutePath().replace("\\", "/")
					                                    .replace(ParameterSupport.GLOBAL_ROOT_FOLDER, ParameterSupport.MOONCAKE_ROOT_FOLDER) + "/" + localLink.replace("../", "").replace("./", "");
			} else {
				localFile = parentFile.getAbsolutePath().replace("\\", "/")
                                                        .replace(ParameterSupport.GLOBAL_ROOT_FOLDER, ParameterSupport.TECH_CONTENT_ROOT_FOLDER) + "/" + localLink.replace("../", "").replace("./", "");
			}
			
			// 01/13/2022, 
			if(localFile.contains("Azure-RMSDocs")) {
				localFile = localFile.replace("Azure-RMSDocs", "information-protection");
			}

			if(!new File(localFile).exists()) {
				if(localFile.contains("includes/")) {
					System.err.println("No include file in local: --> " + localLink);
				} else {
					String fileName = localFile.substring(localFile.lastIndexOf("/"));
					
					if(!fileName.contains(".")) {
						System.err.println("Please check: -->" + localLink);
					} else {
						String remoteLink;
						
						if(ParameterSupport.RUN_TYPE == ParameterSupport.RUN_TO_EN_US) {
							remoteLink = "https://docs.azure.cn/zh-cn" + localFile.replace(ParameterSupport.MOONCAKE_ROOT_FOLDER, "")
																				  .replace("/articles", "")
							                                                      .replace("../", "")
							                                                      .replace("./", "")
							                                                      .replace(".md", "")
							                                                      .replace(".yml", "");
						}
						else {
							remoteLink = "https://docs.azure.cn/zh-cn" + localFile.replace(ParameterSupport.TECH_CONTENT_ROOT_FOLDER, "")
							                                                      .replace("/articles", "")
	                                                                              .replace("../", "")
	                                                                              .replace("./", "")
	                                                                              .replace(".md", "")
	                                                                              .replace(".yml", "");
						}
					
						needRemoteCheckLinkList.add(remoteLink);
					}
				}
			}
		}
		
		return needRemoteCheckLinkList;
	}
	
	private static synchronized void checkRemoteLinks(List<String> remoteLinks) {
		Set<String> allRemoteLinkSet = new TreeSet<String>(remoteLinks);

		if(IgnoredLinks.getIgnoredLinks().isEmpty()) {
			IgnoredLinks.setIgnoredLinks();
		}
		
		BufferedReader reader = null;
		int respCode;
		
		for (String link : allRemoteLinkSet) {
			link = link.trim();
			
			respCode = -1;
			
			// 01/13/2022, 
			if(link.contains("Azure-RMSDocs")) {
				link = link.replace("Azure-RMSDocs", "information-protection");
			}
			
			// links can be ignored
			if(IgnoredLinks.getIgnoredLinks().contains(link)) {
				continue;
			}
			
			HttpURLConnection connection = null;
			
			try {
				URL url = new URL(link);
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setDoInput(true);
				connection.setDoOutput(true);
				connection.setUseCaches(false);
				connection.setInstanceFollowRedirects(true);
				connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				
				if(ParameterSupport.PRINT_ALL_LINKS.trim().toLowerCase().equals("t") || ParameterSupport.PRINT_ALL_LINKS.trim().toLowerCase().equals("true")) {
					System.out.println(link);
				}	
				
				respCode = connection.getResponseCode();
				
				if(respCode == 200 || respCode == 403 || respCode == 401) {
//					InputStream is = connection.getInputStream();
//                    BufferedReader in = new BufferedReader(new InputStreamReader(is, "UTF-8"));
//                    StringBuffer buffer = new StringBuffer();
//                    String line = "";
//                    while((line = in.readLine()) != null){
//                        buffer.append(line);
//                    }
//                    
//                    String result = buffer.toString();
//                    
//                    if(result.contains("404")) {
//                    	WacnReplace81.system_err_println("Possible 404 : --> " + link);
//                    }
					
				    continue;
				} else if (respCode == 404) {
					WacnReplace81.system_err_println("404 error: --> " + link);
				} else if(respCode == 502) {
					WacnReplace81.system_err_println("502 error: --> " + link);
				} else {
					WacnReplace81.system_err_println("Manual inspection: --> " + link);
				}
			} catch (SSLHandshakeException se) {
				WacnReplace81.system_err_println("Manual inspection: --> " + link);
			} catch (ConnectException se) {
				WacnReplace81.system_err_println("Manual inspection: --> " + link);
			} catch (FileNotFoundException fe) {
				WacnReplace81.system_err_println("404 error: --> " + link);
			} catch (UnknownHostException ue) { 
				WacnReplace81.system_err_println("404 error: --> " + link);
			} catch (Exception e) {
				WacnReplace81.system_err_println("Manual inspection: --> " + link);
			} finally {
				if(connection != null) {
					connection.disconnect();
					connection = null;
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
	}
	
	private static synchronized void getAllLinks(String fileAbsolutePath, List<String> remoteLinks, List<String> localLinks) {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileAbsolutePath), "utf-8"));

			boolean isCommented = false;
			final String COMMENT_START_STR = "<!--";
			final String COMMENT_END_STR = "-->";
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				line = line.trim();
				
				// ========================================================= 01/26/2021, ignore commented content
				// <!-- AAA   -->
				if(!isCommented && line.contains(COMMENT_START_STR) && line.contains(COMMENT_END_STR)) {
					String commentContent = line.substring(line.indexOf(COMMENT_START_STR), line.indexOf(COMMENT_END_STR)); 
					line = line.replace(commentContent, "");
					
				// aa <!-- AAA
				} else if(!isCommented && line.contains(COMMENT_START_STR) && !line.contains(COMMENT_END_STR)) {
					isCommented = true;
					String commentContent = line.substring(line.indexOf(COMMENT_START_STR)); 
					line = line.replace(commentContent, "");

				// BBB  -->bb
				} else if(isCommented && line.contains(COMMENT_END_STR)) {
					isCommented = false;
					String commentContent = line.substring(0, line.indexOf(COMMENT_END_STR)); 
					line = line.replace(commentContent, "");
				} else if(isCommented && !line.contains(COMMENT_END_STR)) {
					continue;
				}
				// =========================================================
				
				
				// ignore some issues like -> [System.Timespan]::FromDays(1)) -Permission Read,List
				line = line.replace("::", "");
				
				//[desc](link)
				getLineLinks(line, remoteLinks, localLinks);

				//[desc]: link
				getLineLinks_2(line, remoteLinks, localLinks);
				
				// <a href=
				getLineLinks_3(line, remoteLinks, localLinks);
			    				
				// check ".yml"
				if (fileAbsolutePath.endsWith(".yml")) {
					getLineLinks_4(line, remoteLinks, localLinks);
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
	}
	
	private static synchronized void getLineLinks(String line, List<String> remoteLinks, List<String> localLinks) {
		String patternStr = "(\\[[^\\[]+\\]\\([^\\[]+\\))+";
		Pattern pattern = Pattern.compile(patternStr);

		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
			String matchedString = matcher.group();

			String subStr = matchedString.substring(matchedString.lastIndexOf("]"));

			String url = subStr.substring(subStr.indexOf("(") + 1, subStr.lastIndexOf(")")).trim();

			if(url.contains(")") && !url.contains("(")) {
				url = url.substring(0, url.indexOf(")"));
			}
			
			// [request units](../cosmos-db/request-units.md). Point read operations (GET)
			if(url.contains("(") && url.contains(")") && url.indexOf(")") < url.indexOf("(")) {
				url = url.substring(0, url.indexOf(")"));
			}
			
			handleUrl(url, remoteLinks, localLinks);
		}
	}
	
	private static synchronized void getLineLinks_2(String line, List<String> remoteLinks, List<String> localLinks) {
		String patternStr = "(\\[[^\\[]+\\]):.+";
		Pattern pattern = Pattern.compile(patternStr);

		Matcher matcher = pattern.matcher(line);
		if(line.trim().startsWith("[") && matcher.find()) {
			String matchedString = matcher.group();

			String subStr = matchedString.substring(matchedString.indexOf("]"));

			String url = subStr.substring(subStr.indexOf(":") + 1).trim();

			handleUrl(url, remoteLinks, localLinks);
		}
	}
	
	private static synchronized void getLineLinks_3(String line, List<String> remoteLinks, List<String> localLinks) {
		if(StringUtils.countMatches(line, "<a href=\"")> 0) {
						
			String url = line.substring(line.indexOf("<a href=\"") + 9);
			
			String url_head = url.substring(0, url.indexOf("\""));
			
			handleUrl(url_head, remoteLinks, localLinks);
			
			String url_tail = url.substring(url.indexOf("\""));
			
			getLineLinks_3(url_tail, remoteLinks, localLinks);
		}
	}
	
	private static synchronized void getLineLinks_4(String line, List<String> remoteLinks, List<String> localLinks) {
		if (line.indexOf("href:") > -1) {
			String url = line.substring(line.indexOf("href:") + "href:".length()).replace("\"", "").replace("\'", "").trim();

			handleUrl(url, remoteLinks, localLinks);
		} else if (line.indexOf("tocHref:") > -1) {
			String url = line.substring(line.indexOf("tocHref:") + "tocHref:".length()).replace("\"", "").replace("\'", "").trim();

			handleUrl(url, remoteLinks, localLinks);
		} else if (line.indexOf("topicHref:") > -1) {
			String url = line.substring(line.indexOf("topicHref:") + "topicHref:".length()).replace("\"", "").replace("\'", "").trim();

			handleUrl(url, remoteLinks, localLinks);
		} else if (line.indexOf("url:") > -1) {
			String url = line.substring(line.indexOf("url:") + "url:".length()).replace("\"", "").replace("\'", "").trim();

			handleUrl(url, remoteLinks, localLinks);
		}
	}

	/*
	 * http:
	 * www.
	 * https:
	 * ../media
	 * ./media
	 * media
	 * /powershell
	 * ../articles
	 * ../includes
	 * #
	 * mailto:
	 * ..\\
	 * .\
	 * 
	 */
	private static void handleUrl(String url, List<String> remoteLinks, List<String> localLinks) {
		url = url.trim();
		
		// example: https://github.com/Azure-Samples/active-directory-javascript-singlepageapp-dotnet-webapi-v2 "GitHub active-directory-javascript-singlepageapp-dotnet-webapi-v2 sample"
		if(url.contains("\"")) {
			url = url.substring(0, url.indexOf("\"")).trim();
		}
		
		if(url.startsWith("..\\") || url.startsWith(".\\")) {
			System.err.println("Wrong slash: " + url);
			
		} else if(url.startsWith("/")) {
			remoteLinks.add("https://docs.azure.cn/zh-cn" + url);
			
		} else if(url.startsWith("http:") || url.startsWith("https:") || url.contains("www.")) {
			if (url.startsWith("www")) {
				url = "http://" + url;
			}
			
			remoteLinks.add(url);
		} else if(!url.startsWith("mailto:") && !url.startsWith("#")) {
			// example: role-assignments-portal.md#remove-a-role-assignment
			if(url.contains("#")) {
				url = url.replace("/#", "#"); // ./active-directory-authentication-scenarios.md/#claims-in-azure-ad-security-tokens
				url = url.substring(0, url.indexOf("#")); 
			}
			
			// example: ../active-directory/fundamentals/active-directory-whatis.md?context=/azure/active-directory-domain-services/context/azure-ad-ds-context
			if(url.contains("?")) {
				url = url.substring(0, url.indexOf("?")); 
			}
			
			localLinks.add(url);
		}
	}

}
