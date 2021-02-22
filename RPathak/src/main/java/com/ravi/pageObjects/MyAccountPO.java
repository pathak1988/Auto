package com.ravi.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPO {

	 public MyAccountPO(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }

	 
	 @FindBy(how = How.XPATH, using = "//*[@class='account']/span") 
	 private WebElement accountName;
	 
	 @FindBy(how = How.XPATH, using = "(//*[contains(text(),'T-shirts')])[2]") 
	 private WebElement TShirtLink;
	 
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'My personal information')]") 
	 private WebElement PersonalInfo;
	
	 
 public void ValidateAccount(String Name) {
		 
	 
		String accountActual = accountName.getText();
		String accountExpected = Name;
		
		 Assert.assertEquals(accountExpected, accountActual);
	 }
	 
 
 public void ClickTShirtLink() {
	 
	 try {
		
	
	 
	 TShirtLink.click();
	 System.out.println("reached");
	 
	 } catch (Exception e) {
			e.printStackTrace();
		}
	 
 }
 
 public void ClickPeronalInfo() {
	 try {
		
	
	 
	 PersonalInfo.click();
	 } catch (Exception e) {
			e.printStackTrace();
		}
 }
 
}
