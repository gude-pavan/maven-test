package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefenitions.browsersetup;

public class SL_Loginpage_PF {
	
	@FindBy(id="user-name")
	WebElement SL_txt_username;
	@FindBy(id="password")
	WebElement SL_txt_password;
	@FindBy(id="login-button")
	WebElement SL_btn_login;
//	@FindBy(id="shopping_cart_container")
//	WebElement SL_icon_cart;
	//@FindBy(className = "error-button")
	@FindBy(xpath = "//h3")
	WebElement SL_btn_login_error;
	
	WebDriver driver;
	
	public SL_Loginpage_PF (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigatetoswaglabs() {
		driver.navigate().to("https://www.saucedemo.com");
	}
	
	public void enterusername(String username) {
		SL_txt_username.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		SL_txt_password.sendKeys(password);
	}

	public void clickonloginbutton() {
		SL_btn_login.click();
	}
	
	public void checkloginerror() {
		String error_msg = "Epic sadface: Username and password do not match any user in this service";
		String act = SL_btn_login_error.getText();
		System.out.println("Error message is: "+ act);
		Assert.assertEquals(error_msg, act);
	}
	public void checklockedusererror() {
		String error_msg = "Epic sadface: Sorry, this user has been locked out.";
		String act = SL_btn_login_error.getText();
		System.out.println("Error message is: "+ act);
		Assert.assertEquals(error_msg, act);
	}

}
