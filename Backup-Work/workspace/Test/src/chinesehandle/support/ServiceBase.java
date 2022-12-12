package chinesehandle.support;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class ServiceBase {
	public static final String CONFIG_FILE_PATH = "D:\\my_others\\my_workspace\\wacn\\src\\chinesehandle\\config.properties";
	
	public static final int SOME_FILE_NOT_TRANSLATED = 0;
	
	public static final int ALL_FILE_TRANSLATED = 1;
	
	private static final Set<String> updatedFileSet;
	
	private static final Set<String> redirectedFileSet;
	
	private static final Map<String, String> updatedFileMap = new HashMap<String, String>();
	
	private static final Map<String, String> redirectedFileMap = new HashMap<String, String>();
	
	private static final Properties properties = new Properties();
	
	public static final List<String[]> ReplacementList = new ArrayList<String[]>();
	
	static {
		loadProperties();
		
		FileUtil.getFileMap(updatedFileMap, redirectedFileMap); 
		
		updatedFileSet = new TreeSet<String>(updatedFileMap.keySet());
		
		redirectedFileSet = new TreeSet<String>(redirectedFileMap.keySet());
		
		// 10/21/2020, replace \*\*\*\* from translated articles
		ReplacementList.add(new String[] {"\\*\\*\\*\\*", ""});
	}
	
	public static synchronized Properties getProperties() {
		return properties;
	}
	
	public static synchronized String getProperty(String key) {
		return (String)properties.get(key);
	}
	
	public static synchronized Set<String> getUpdatedFileSet() {
		return updatedFileSet;
	}
	
	public static synchronized Set<String> getRedirectedFileSet() {
		return redirectedFileSet;
	}
	
	private static synchronized void loadProperties() {
		try {
			Reader reader = new BufferedReader(new FileReader(CONFIG_FILE_PATH));
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
