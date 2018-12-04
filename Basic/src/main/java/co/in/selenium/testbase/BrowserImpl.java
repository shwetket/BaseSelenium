package co.in.selenium.testbase;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;

import co.in.selenium.utils.ReadPropertiesFile;

public class BrowserImpl extends DriverClass {

	public BrowserImpl() {
		try {
			initializeDriver();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebDriver initializeDriver() throws FileNotFoundException {
		String browser = ReadPropertiesFile.getBrowser();
		if (browser.equalsIgnoreCase("chrome")) {
			log.debug("Chrome Driver is initilizing");
			return driver = getChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			log.debug("FireFox Driver got initilizing");
			return driver = getFirefoxDriver();
		} else if (browser.equalsIgnoreCase("opera")) {
			log.debug("Opera Driver got initilizing");
			return driver = getOperaDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			log.debug("Opera Driver got initilizing");
			return driver = getEdgeDriver();
		} else if (browser.equalsIgnoreCase("iexplorer")) {
			log.debug("Opera Driver got initilizing");
			return driver = getIEDriver();
		} else {
			System.err.println("Browser no Found");
			log.debug("No Driver for initilized");
			return null;
		}

	}

	public void openBrowser() throws FileNotFoundException {
		String url = ReadPropertiesFile.getUrl();
		driver.get(url);
		log.debug("Driver is initilized");
		driver.manage().window().maximize();
		log.debug("Launched " + url);
	}

	public void closeBrowser() {
		driver.close();
		log.debug("Closed brower");
	}

	public void quiteBrowser() {
		driver.quit();
		log.debug("Closed all browers");
	}

}
