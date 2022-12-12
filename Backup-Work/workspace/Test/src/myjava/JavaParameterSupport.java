package myjava;

public class JavaParameterSupport {
//
	public static final int RUN_TO_EN_US = Integer.parseInt(JavaReplace.getProperties().get("RUN_TO_EN_US").toString());
	
	public static final int RUN_TO_ZH_CN = Integer.parseInt(JavaReplace.getProperties().get("RUN_TO_ZH_CN").toString());
	
	public static final String GLOBAL_ROOT_FOLDER = JavaReplace.getProperties().get("GLOBAL_ROOT_FOLDER").toString();
	
	public static final String MOONCAKE_ROOT_FOLDER = JavaReplace.getProperties().get("MOONCAKE_ROOT_FOLDER").toString();
	
	public static final String TECH_CONTENT_ROOT_FOLDER = JavaReplace.getProperties().get("TECH_CONTENT_ROOT_FOLDER").toString();
	
	public static final String TEST_FOLDER = JavaReplace.getProperties().get("TEST_FOLDER").toString();
	
	public static final String LIST_FILE = JavaReplace.getProperties().get("LIST_FILE").toString();
 
	public static final String MS_AUTHER = JavaReplace.getProperties().get("MS_AUTHER").toString();
	
	public static int RUN_TYPE = RUN_TO_EN_US;
	
	public static String SOURCE_FOLDER = "";

	public static String DESTINATION_FOLDER = "";
}
