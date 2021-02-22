package com.ravi.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPO {

	public PersonalInfoPO(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	
	
	 @FindBy(how = How.ID, using = "firstname") 
	 private WebElement firstname;
	 
	 @FindBy(how = How.ID, using = "old_passwd") 
	 private WebElement CurrPass;
	 
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]") 
	 private WebElement SaveBtn;
	 
	 @FindBy(how = How.XPATH, using = "//p[@class='alert alert-success']") 
	 private WebElement UpdateSucceMsg;
	

	 public void updatePerInfo(String FirstName, String password) {
		 
		 try {
		
		 firstname.clear();
		 firstname.sendKeys(FirstName);
		 CurrPass.sendKeys(password);
		 SaveBtn.click();
		 
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 public void sucessMsgValidation(String message) {
		 
		 try {
	
		 
		 String accountActual = UpdateSucceMsg.getText();
			String accountExpected = message;
			
			 Assert.assertEquals(accountExpected, accountActual);
			 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 
}
