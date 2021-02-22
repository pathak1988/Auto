package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	
	public void ApllicationLogOut(WebDriver driver) {
		try {
	
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
