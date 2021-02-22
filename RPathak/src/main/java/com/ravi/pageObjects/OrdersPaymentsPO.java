package com.ravi.pageObjects;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.Browsers;


public class OrdersPaymentsPO extends Browsers {

	 public OrdersPaymentsPO(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 String orderRef = null;
	 
	 JavascriptExecutor jse = (JavascriptExecutor)driver;

	 @FindBy(how = How.XPATH, using = "//div[@class ='button-container']//span[contains(text(),'Add to cart')]") 
	 private WebElement AddToCart;
	 
	 @FindBy(how = How.XPATH, using = "(//img[@class='replace-2x img-responsive'])[2]") 
	 private WebElement TShirtImg;
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='btn btn-default button button-medium']") 
	 private WebElement ProceedToCheckOut;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Faded Short Sleeve T-shirts") 
	 private WebElement TableVal;
	 
	 @FindBy(how = How.XPATH, using = "//i[@class = 'icon-trash']") 
	 private WebElement DeleteOrder;
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='button btn btn-default standard-checkout button-medium']") 
	 private WebElement CheckoutPaySummary;
	 
	 @FindBy(how = How.ID, using = "addressesAreEquals") 
	 private WebElement DeliveryAsBilling;
	 
	 @FindBy(how = How.XPATH, using = "//button[@class='button btn btn-default button-medium']") 
	 private WebElement CheckoutPayAddress;
	 
	 @FindBy(how = How.ID, using = "cgv") 
	 private WebElement AgreeTerms;
	 
	 @FindBy(how = How.XPATH, using = "//button[@class='button btn btn-default standard-checkout button-medium']") 
	 private WebElement CheckoutPayShipping;
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='bankwire']") 
	 private WebElement PayByBankWire;
	 
	 @FindBy(how = How.XPATH, using = "//button[@class='button btn btn-default button-medium']") 
	 private WebElement ConfirmOrder;
	 
	 @FindBy(how = How.XPATH, using = "//div[@class='box']//strong") 
	 private WebElement OrderConfirmMsg;
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='account']") 
	 private WebElement MyAccount;
	 @FindBy(how = How.XPATH, using = "//i[@class='icon-list-ol']") 
	 private WebElement OrderDetails;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div/text()[6]") 
	 private WebElement OrderReference;
	 @FindBy(how = How.XPATH, using = "(//span[@class='footable-sort-indicator'])[1]") 
	 private WebElement DateTimeSorting;
	 
	 @FindBy(how = How.XPATH, using = "(//a[@class='color-myaccount'])[1]") 
	 private WebElement OrderRefinTable;
	 
	 
	 public void AddToCart()  {
		 try {
		
		 jse.executeScript("window.scrollBy(0,550)");
		 
		 System.out.println("scrolled");
		 
	
		 Actions action = new Actions(driver);
		 
		 
		 WebElement element = TShirtImg;
		 action.moveToElement(element).moveToElement(AddToCart).click().build().perform();
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
	
		 
		 System.out.println("added to cart");
		 
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		 
		 
	 }
	 
	 public void checkourPopUp() {
		 try {
		
		 ProceedToCheckOut.click();
		 
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 public void orderSummaryProceedBtn() {
		 
		 try {
		
		 jse.executeScript("window.scrollBy(0,550)");
			CheckoutPaySummary.click();
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 public void DeliveryBillingProceed() {
		 
		 try {
		
		 DeliveryAsBilling.isSelected();
		 jse.executeScript("window.scrollBy(0,550)");
		 CheckoutPayAddress.click();
		 
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 public void termsShippingProceed() {
		 AgreeTerms.click();
		 CheckoutPayShipping.click();
	 }
	 
	 public void PayTypeConfirm(String payType) {
		 
		 try {
		
		 if(payType.equalsIgnoreCase("bankwire")) {
		 jse.executeScript("window.scrollBy(0,550)");
		 PayByBankWire.click();
		 }
		 else {
			 System.out.println("Payment type invalid");
		 }
		 jse.executeScript("window.scrollBy(0,550)");
		 ConfirmOrder.click();
		 
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 public void msgValidate(String message) {
		 
		 try {
	
		 
		 String accountActual = OrderConfirmMsg.getText();
			String accountExpected = message;
			
			 Assert.assertEquals(accountExpected, accountActual);
			 
			 System.out.println("CONFIRMATION MESSAGE IS " + message);
			 
		
				
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
	 }
	 public void headerClickOrderHistory() {
		 
		 try {
		
		 
		 jse.executeScript("window.scrollBy(0,-550)");
		 MyAccount.click();
		 OrderDetails.click();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		 
	 }
	 
	 public void validateOrderRefNo() {
		 try {
		

		 OrderRefinTable.isDisplayed();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 
	 

	 
	
	




}
