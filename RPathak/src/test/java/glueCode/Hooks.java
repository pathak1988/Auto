package glueCode;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Browsers;

public class Hooks extends Browsers{

	
	
	@Before
	
	public void LaunchBrowser() {
		
		super.initialize("firefox");
		
		driver.get("http://automationpractice.com/index.php");
	}
	
	
@After
	
	public void closeAllOpenedBrowsers(){
		
		driver.quit();
		System.out.println("closed all browsers");
	}
	
}
