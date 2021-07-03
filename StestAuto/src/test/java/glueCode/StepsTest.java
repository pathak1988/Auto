package glueCode;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;import com.ravi.pageObjects.HomePagePO;
import com.ravi.pageObjects.MyAccountPO;
import com.ravi.pageObjects.OrdersPaymentsPO;
import com.ravi.pageObjects.PersonalInfoPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Browsers;
import utilities.LogOut;
import utilities.Screenshots;

public class StepsTest extends Browsers{
	
	
	String orderRef= null;
	HomePagePO home;
	MyAccountPO account;
	
	 Actions action;
	 OrdersPaymentsPO orders;
	PersonalInfoPO perinfo;
	LogOut logout;
	
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	
		home = new HomePagePO(driver);
		home.HomePageLogoCheck();
        
	} 
	
	

	@When("^user clicks on sign-in and navigates to Login page$")
	public void user_navigates_to_Login_page() throws Throwable {
	
		System.out.println("2");
	home = new HomePagePO(driver);
		
		home.SignClick();
	}

	@When("^user enters \"(.*?)\" and \"(.*?)\" and click login button$")
	public void user_enters_username_and_password_click_login_button(String username, String password) throws Throwable {
	
	home = new HomePagePO(driver);
	
		home.EnteruserId(username.trim());
		home.EnterPassword(password.trim());
		home.LoginBtnClick();
	}

	@Then("^success message is displayed$")
	public void sucess_message_is_displayed() throws Throwable {
	    
		
		String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
    	String actual = driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
        //driver.quit(); 
	}
	
	@Then("^user can see the full \"(.*?)\"$")
	public void user_can_see_the_full_name(String Name) throws Throwable {
		account = new MyAccountPO(driver);
		account.ValidateAccount(Name);
		
	}
	
	@Then("^user click T-Shirt link$")
	public void i_click_tShirt_link() throws Throwable{
			
			account = new MyAccountPO(driver);
			account.ClickTShirtLink();
		}
	
	@Then("^user hover on t-shirt and click add to basket$")
	public void i_hover_t_shirt_click_add_basket() throws Throwable {
		
		//Actions action= new Actions(driver);
		orders = new OrdersPaymentsPO(driver);
		orders.AddToCart();
	}
	
	@Then("^user clicks on Proceed to Checkout pop-up link$")
		public void user_clicks_proceed_checkout() throws Throwable {
		orders = new OrdersPaymentsPO(driver);
		orders.checkourPopUp();;
		
	}
	
	
	@Then("^user take screenshot$")
	public void I_take_screenshot() throws IOException {
		
		Screenshots screen = new Screenshots();
		
		screen.takeScreenShot(driver);
	}
	
	
	@Then("^user clicks on My Personal Info link$")
	public void user_clicks_Personal_Info() throws Throwable {
		account = new MyAccountPO(driver);
		account.ClickPeronalInfo();
		
	}
	
	@Then("^user updates \"(.*?)\" and confirms pass \"(.*?)\" and save the record$")
	public void user_updates_first_name_verifies_password(String FirstName, String password) throws Throwable {
		
		perinfo = new PersonalInfoPO(driver);
		perinfo.updatePerInfo(FirstName,password);
		
	}
	
	@Then("^user should see sucess message \"(.*?)\"$")
	public void user_see_sucess_message(String message) throws Throwable {
		
		perinfo = new PersonalInfoPO(driver);
		
		perinfo.sucessMsgValidation(message);
	}
	
	@Then("^user clicks on proceed to checkout on order summary page$")
	public void user_clicks_proceed_checkout_order_summary() throws Throwable {
		orders = new OrdersPaymentsPO(driver);
		
		orders.orderSummaryProceedBtn();
	}
	@Then("^user checks deliver and billing add on address page and clicks proceed to checkout$")
	public void user_checks_deliver_Billing_address_clicks_proceed() throws Throwable {
		orders = new OrdersPaymentsPO(driver);
		orders.DeliveryBillingProceed();
	}
	
	@Then("^user clicks terms&conditions on shipping page and proceed checkout$")
	public void user_clicks_terms_shipping_Proceed() throws Throwable {
		orders = new OrdersPaymentsPO(driver);
		orders.termsShippingProceed();
	}
		
	
	@Then("^user chooses \"(.*?)\" on payments page and clicks confirm order button$")
	public void user_chooses_paymentType_confirm(String PayType) throws Throwable {
		orders = new OrdersPaymentsPO(driver);
		orders.PayTypeConfirm(PayType);
		
	}
	
	@Then("^user should see order confirmation message \"(.*?)\" on screen$")
	public void user_order_validate_message(String message) throws Throwable {
		orders = new OrdersPaymentsPO(driver);
		orders.msgValidate(message);
		
	}
	
	@Then("^user clicks on the account header and clicks on Order history$")
	public void user_clicks_header_order_history() throws Throwable {
		orders = new OrdersPaymentsPO(driver);
		orders.headerClickOrderHistory();
		
	}
	
	@Then("^user validates the order with order reference number$")
	public void user_validates_order_refernce_number() throws Throwable{
		
		orders = new OrdersPaymentsPO(driver);
		orders.validateOrderRefNo();
	}
	
	@Then("^user logs out of the application$")
	public void user_logs_out_application() throws Throwable {
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}
	
	
		
	
	
	
}
