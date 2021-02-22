package com.ravi.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class HomePagePO{
	
	

	 public HomePagePO(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(how = How.XPATH, using = "//img[@class='logo img-responsive']") 
	 private WebElement HomeLogo;
	 
	 
	 @FindBy(how = How.LINK_TEXT, using = "Sign in") 
	 private WebElement signinBtn;
	 
	 @FindBy(how = How.ID, using = "email") 
	 private WebElement emailAdd;
	 
	 @FindBy(how = How.ID, using = "passwd") 
	 private WebElement password;
	 
	 @FindBy(how = How.ID, using = "SubmitLogin") 
	 private WebElement LoginBtn;
	 
	
	 
	 public void HomePageLogoCheck()  {
		 
		 try {
			
		HomeLogo.isDisplayed();
		 } catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 public void SignClick() {
		 try {
			
		signinBtn.click();
		 } catch (Exception e) {
				e.printStackTrace();
			}
		 }
	 
	 public void EnteruserId(String email) {
		 try {
			
	
		 
		 emailAdd.sendKeys(email);
		 } catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
 public void EnterPassword(String pass) {
	 try {
		

	 password.sendKeys(pass);
	 
	 
		} catch (Exception e) {
			e.printStackTrace();
		}
	 } 
	 
 public void LoginBtnClick() {
	 try {
		
	
	 LoginBtn.click();
	 } catch (Exception e) {
		 e.printStackTrace();
		}
	 } 

}
