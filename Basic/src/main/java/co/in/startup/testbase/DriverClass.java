package main.java.co.in.startup.testbase;

import main.java.co.in.startup.utils.CustomLogs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass implements CustomLogs {

	public static WebDriver driver;
	private static final String executableFolder = System.getProperty("user.dir")+"\\executables\\";
	
	public WebDriver getChromeDriver() {
		//System.setProperty("webdriver.chrome.driver",getExecutablefolder()+"chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public WebDriver getFirefoxDriver() {
		//System.setProperty("webdriver.chrome.driver",getExecutablefolder()+"geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;
	}
	
	public WebDriver getOperaDriver() {
		//System.setProperty("webdriver.chrome.driver",getExecutablefolder()+"operadriver_win32\\operadriver.exe");
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
		return driver;
	}

	public WebDriver getEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;
	}

	public WebDriver getIEDriver() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver(); 
		return driver;
	}
	
	public static String getExecutablefolder() {
		return executableFolder;
	} 

}
