package customization.support;

import java.util.ArrayList;
import java.util.List;

import customization.WacnReplace81;

public class ParameterSupport {

	public static final int RUN_TO_EN_US = Integer.parseInt(WacnReplace81.getProperties().get("RUN_TO_EN_US").toString());
	
	public static final int RUN_TO_ZH_CN = Integer.parseInt(WacnReplace81.getProperties().get("RUN_TO_ZH_CN").toString());
	
	public static final String GLOBAL_ROOT_FOLDER = WacnReplace81.getProperties().get("GLOBAL_ROOT_FOLDER").toString();
	
	public static final String MOONCAKE_ROOT_FOLDER = WacnReplace81.getProperties().get("MOONCAKE_ROOT_FOLDER").toString();
	
	public static final String TECH_CONTENT_ROOT_FOLDER = WacnReplace81.getProperties().get("TECH_CONTENT_ROOT_FOLDER").toString();
	
	public static final String LOCAL_IMAGE_ROOT = WacnReplace81.getProperties().get("LOCAL_IMAGE_ROOT").toString();
	
	public static final String TEST_FOLDER = WacnReplace81.getProperties().get("TEST_FOLDER").toString();
	
	public static final String LIST_FILE = WacnReplace81.getProperties().get("LIST_FILE").toString();
	
	public static final String SERVICE_CLASS_MAP = WacnReplace81.getProperties().get("SERVICE_CLASS_MAP").toString();
	
	public static int RUN_TYPE = RUN_TO_EN_US;
	
	public static final String MS_AUTHER = WacnReplace81.getProperties().get("MS_AUTHER").toString();
	
	public static final String AUTHER = WacnReplace81.getProperties().get("AUTHER").toString();
	
	public static final String PRINT_ALL_LINKS = WacnReplace81.getProperties().get("PRINT_ALL_LINKS").toString();
	
	public static String RUN_SERVICE = null;

	public static boolean WRITE_LOG_TO_FILE = false;
	
	public static final List<String> LOG_LIST = new ArrayList<String>(100);

	public static String SOURCE_FOLDER = "";

	public static String DESTINATION_FOLDER = "";
}
