package customization.support;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import customization.WacnReplace81;

public class ConfigureSupport2 {
	private static final List<String[]> words = WordsSupport.getWords();
	private static final List<String> warningWords = WarningWordsSupport.getWarningWords();
	private static final List<String> ignoredWords = IgnoreWordsSupport.getIgnoredWords();
	private static final List<String> ignoredLinks = IgnoredLinks.getIgnoredLinks();
	private static final List<String[]> attentionWords = WacnReplace81.getAttentionWords();
	private static final List<String> uselessFilesList = WacnReplace81.getUselessFilesList();

	private static final List<String> SERVICE_CLASS_MAP = WacnReplace81.readToList(ParameterSupport.SERVICE_CLASS_MAP);
	
	public static synchronized void configure() {
		words.clear();
		warningWords.clear();
		attentionWords.clear();
		ignoredWords.clear();
		ignoredLinks.clear();
		uselessFilesList.clear();

		WordsSupport.setWords();
		WarningWordsSupport.setWarningWords();
		IgnoreWordsSupport.setIgnoredWords();
		IgnoredLinks.setIgnoredLinks();
		WacnReplace81.setUselessFilesList();

		addConfigure(ParameterSupport.RUN_SERVICE, words, warningWords, ignoredWords, attentionWords, uselessFilesList);
		
	}

	public static synchronized boolean isUsefull(String file) {
		String fileName = file.substring(file.lastIndexOf("/") + 1); 
		
		List<String> uselessFileList = getUselessFiles(ParameterSupport.RUN_SERVICE);
		
		if (uselessFileList.contains(fileName)) {
			return false;
		}

		return true;
	}

	@SuppressWarnings({ "unchecked"})
	public static void addConfigure(String service, List<String[]> words, List<String> warningWords, List<String> ignoredWords, List<String[]> attentionWords, List<String> uselessFilesList) {
		if(service.startsWith("includes")) {
			return;
		}
		
		String className = getClassNameByService(service);

		try {
			Class<?> clazz = Class.forName(className);

			Method method;
			Object obj;

			try {
				method = clazz.getMethod("getWords");
				obj = method.invoke(clazz.newInstance());
				words.addAll((List<String[]>) obj);
			} catch (NoSuchMethodException e) {
			} 

			try {
				method = clazz.getMethod("getWarningWords");
				obj = method.invoke(clazz.newInstance());
				warningWords.addAll((List<String>) obj);
			} catch (NoSuchMethodException e) {
			} 

			try {
				method = clazz.getMethod("getIgnoredWords");
				obj = method.invoke(clazz.newInstance());
				ignoredWords.addAll((List<String>) obj);
			} catch (NoSuchMethodException e) {
			} 

			try {
				method = clazz.getMethod("getAttentionWords");
				obj = method.invoke(clazz.newInstance());
				attentionWords.addAll((List<String[]>) obj);
			} catch (NoSuchMethodException e) {
			} 

			try {
				method = clazz.getMethod("getUselessFiles");
				obj = method.invoke(clazz.newInstance());
				uselessFilesList.addAll((List<String>) obj);
			} catch (NoSuchMethodException e) {
			} 
			
			// add declaring class's words, warningWords and ignoredWords
			addDeclaringClassConfigure(clazz.getDeclaringClass(), words, warningWords, ignoredWords);
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("No class found");
		}
	}
	
	@SuppressWarnings({ "unchecked"})
	private static void addDeclaringClassConfigure(Class<?> declaringClass, List<String[]> words, List<String> warningWords, List<String> ignoredWords) {
		if (declaringClass != null) {
			Method method;
			Object obj;

			try {
				try {
					method = declaringClass.getMethod("getWords");
					obj = method.invoke(declaringClass.newInstance());
					words.addAll((List<String[]>) obj);
				} catch (NoSuchMethodException e) {
				}

				try {
					method = declaringClass.getMethod("getWarningWords");
					obj = method.invoke(declaringClass.newInstance());
					warningWords.addAll((List<String>) obj);
				} catch (NoSuchMethodException e) {
				}

				try {
					method = declaringClass.getMethod("getIgnoredWords");
					obj = method.invoke(declaringClass.newInstance());
					ignoredWords.addAll((List<String>) obj);
				} catch (NoSuchMethodException e) {
				}
				
				addDeclaringClassConfigure(declaringClass.getDeclaringClass(), words, warningWords, ignoredWords);
			} catch (Exception e) {
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> getUselessFiles(String service) {
		String className = getClassNameByService(service);
		
		try {
			Class<?> clazz = Class.forName(className); 

			Method method = clazz.getMethod("getUselessFiles");

			Object obj = method.invoke(clazz.newInstance());

			return (List<String>) obj;
		} catch (Exception e) {
		}

		return new ArrayList<String>(1);
	}
	
	public static String getClassNameByService(String currentService) {
		for(String serviceClassMap: SERVICE_CLASS_MAP) {
			String[] serviceClassArr = serviceClassMap.split("=");
			
			String service = serviceClassArr[0].trim();
			String className = serviceClassArr[1].trim();
			
			if(currentService.equals(service)) {
				return className;
			}
		}
		
		return null;
	}
	
	public static String getServiceByClassName(String currentClassName) {
		for(String serviceClassMap: SERVICE_CLASS_MAP) {
			String[] serviceClassArr = serviceClassMap.split("=");
			
			String service = serviceClassArr[0].trim();
			String className = serviceClassArr[1].trim();
			
			if(currentClassName.equals(className)) {
				return service;
			}
		}
		
		return null;
	}
}
