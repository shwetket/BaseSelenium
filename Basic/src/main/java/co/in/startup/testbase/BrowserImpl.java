package main.java.co.in.startup.testbase;

import main.java.co.in.startup.utils.ReadPropertiesFile;

import java.io.FileNotFoundException;

public class BrowserImpl extends DriverClass {

	public BrowserImpl() {
		initializeDriver();
	}


	public void initializeDriver() {
		String browser = ReadPropertiesFile.getBrowser();
		if (browser.equalsIgnoreCase("chrome")) {
			log.info("Chrome Driver get initialized");
			driver = getChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			log.info("FireFox Driver get initialized");
			driver = getFirefoxDriver();
		} else if (browser.equalsIgnoreCase("opera")) {
			log.info("Opera Driver get initialized");
			driver = getOperaDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			log.info("Opera Driver get initialized");
			driver = getEdgeDriver();
		} else if (browser.equalsIgnoreCase("iexplorer")) {
			log.info("IE Driver get initialized");
			driver = getIEDriver();
		} else {
			System.err.println("Browser no Found");
			log.info("No Driver get initialized");
		}

	}

	public void openBrowser() {
		String url = ReadPropertiesFile.getUrl();
		driver.get(url);
		log.info("Driver get initialized");
		driver.manage().window().maximize();
		log.info("Launched " + url);
	}

	public void closeBrowser() {
		driver.close();
		log.info("Closed browser");
	}

	public void quiteBrowser() {
		driver.quit();
		log.info("Closed all browsers");
	}

}
