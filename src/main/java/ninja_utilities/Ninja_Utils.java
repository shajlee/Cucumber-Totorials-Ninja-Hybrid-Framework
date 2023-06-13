package ninja_utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Ninja_Utils {
	public static Properties prop;
	public static FileInputStream ip;
	
	public static Properties initializeProperties() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\ninja_config\\ninja_configurations.properties");
		prop.load(ip);
		return prop;
		
	}
	public static final int IMPLICIT_WAIT = 10;
	public static final int PAGELOAD_TIME = 10;
	public static final int SCRIPT_TIME= 10;
	
		
		
		
	}


