package main.java.co.in.startup.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

public class ReadPropertiesFile implements CustomLogs {

    static final String DIR = System.getProperty("user.dir");
    static final String FILE_PATH = DIR.concat("\\data\\");
    static final Properties PROPERTIES = new Properties();
    static String URL;
    static String BROWSER;

    static FileInputStream initializeFile() {
        FileInputStream fis = null;
        try {
            log.info("looking for file at " + FILE_PATH + "global.properties");
            fis = new FileInputStream(FILE_PATH + "global.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    }

    public static String getUrl() {
        try {
            PROPERTIES.load(initializeFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        URL = PROPERTIES.getProperty("application.url").trim();
        log.info( "URL is " + URL);
        return URL;
    }

    public static String getBrowser() {
        try {
            PROPERTIES.load(initializeFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BROWSER = PROPERTIES.getProperty("system.browser").trim();
        log.info( "Using  " + BROWSER + " browser");
        return BROWSER;
    }

}
