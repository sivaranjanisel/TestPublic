package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import java.util.Properties;

public class ReadValue {
	

	static String filePath = System.getProperty("user.dir")+"\\config.properties";
/*	
	public static void main(String args[]) throws IOException {
		System.out.println("the file path" +filePath);
		String val= readConfigFile("username");
		System.out.println(val);
	}

	*/
	public static String readConfigFile(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}
}
