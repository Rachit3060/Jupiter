package smoke;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\rachit.srivastava\\eclipse-workspace\\Universe\\src\\test\\resources\\resourcesU\\config.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
		
	}

}