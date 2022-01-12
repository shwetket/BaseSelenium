package main.java.co.in.startup.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomWaitImpl extends WebDriverWait implements CustomLogs{
	public CustomWaitImpl(WebDriver driver, Duration timeout) {
		super(driver, timeout);
	}

	
	/*
	public CustomWaitImpl(WebDriver driver, long timeOutInSeconds) {
		super(driver, timeOutInSeconds);
		try {
			CustomWaitImpl.driver= new BrowserImpl().initializeDriver();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public static void implicitWait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		log.debug("Debug ==> Sleep for "+ i+ "seconds");
	}

	public static void explicitWait(int i, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		log.debug("Debug ==> waiting for "+ element);
		wait.until(ExpectedConditions.visibilityOf(element));
		

	}
*/
/*	public void fluentWait() {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	}*/

}
