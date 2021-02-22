package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	
	protected static WebDriver driver;
	public  static WebDriver initialize(String B) {
		
		try {
			
		
		switch(B) {
		
		
		case "firefox":
		
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Ravi Pathak\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
			
			System.setProperty("webdriver.gecko.driver","src/test/java/Utilities/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
        return driver;
        
        
		case "chrome":
			System.setProperty("","chrome.exe path");
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        return driver;
	        
	        default:
	        	//return null;
	        	
	        	System.setProperty("webdriver.gecko.driver","src/test/java/Utilities/drivers/geckodriver.exe");
	            driver = new FirefoxDriver();
	            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	            driver.manage().deleteAllCookies();
	    		driver.manage().window().maximize();
	    		return driver;
		}	
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
		
		}
		
		
		
	
	
}
