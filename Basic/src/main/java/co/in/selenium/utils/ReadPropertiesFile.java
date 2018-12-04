package co.in.selenium.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile implements CustomLogs{

	static final String DIR = System.getProperty("user.dir");
	static final String FILE_PATH = DIR.concat("\\data\\");
	static Properties PROPERTIES = new Properties();
	static String URL;
	static String BROWSER;

	static FileInputStream initializeFile(String fileName) {
		FileInputStream fis = null;
		try {
			log.debug("looking for file at "+ FILE_PATH+fileName);
			fis = new FileInputStream(FILE_PATH+fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fis;
	}

	public static String getUrl() {
		try {
			PROPERTIES.load(initializeFile("global.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		URL = PROPERTIES.getProperty("application.url");
		URL.trim();
		log.debug("URL is "+URL);
		return URL;
	}

	public static String getBrowser() throws FileNotFoundException {
		try {
			PROPERTIES.load(initializeFile("global.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BROWSER = PROPERTIES.getProperty("system.browser");
		BROWSER.trim();
		log.debug("Using  "+BROWSER+" browser");
		return BROWSER;
	}

	public static Boolean debugmode() throws FileNotFoundException {
		try {
			PROPERTIES.load(initializeFile("global.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String s = PROPERTIES.getProperty("debugmode");
		s.trim();
		log.debug("Debug mode is "+s);
		return Boolean.valueOf(s);
	}
}
