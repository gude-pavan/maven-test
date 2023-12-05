package StepDefenitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.SL_Loginpage_PF;
import PageFactory.SL_Products_page_PF;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SL_loginsteps_PF{
	
	
	browsersetup browsersetup;
	
	public SL_loginsteps_PF (browsersetup browsersetup)
	{
		this.browsersetup = browsersetup;
	}
	
	
//	@When("Open the chrome browser")
//	public void open_the_chrome_browser() {
//		System.out.println("===Opening Chrome Browser===");
//		String projectpath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		driver.manage().window().maximize();
//		browsersetup.setDriver(driver);
//		browsersetup.initializebrowser(driver);
//		
//	}
	
	@And("User is on login Page")
	public void user_is_on_login_page() throws InterruptedException {
		//.navigate().to("https://www.saucedemo.com");
		browsersetup.login.navigatetoswaglabs();
		Thread.sleep(4000);
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException{
		browsersetup.login.enterusername(username);
		browsersetup.login.enterpassword(password);
//		login = new SL_Loginpage_PF(driver);
//		login.enterusername(username);
//		login.enterpassword(password);
		Thread.sleep(4000);
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		browsersetup.login.clickonloginbutton();
		//driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
	}

	@Then("Browser navigates to login home page")
	public void browser_navigates_to_login_page() {
//		products = new SL_Products_page_PF(driver);
		browsersetup.products.addtocartvalidate();	
//		driver.findElement(By.id("shopping_cart_container")).isDisplayed();
//		driver.close();
//		driver.quit();
	}
	
	@Then("Browser displays error message")
	public void browser_displays_error_message() {
		browsersetup.login.checkloginerror();
//		driver.findElement(By.id("shopping_cart_container")).isDisplayed();
//		driver.close();
//		driver.quit();
	}
	@Then("Browser displays locked user error message")
	public void browser_displays_locked_user_error_message() {
		browsersetup.login.checklockedusererror();
//		driver.findElement(By.id("shopping_cart_container")).isDisplayed();
//		driver.close();
//		driver.quit();
	}

	
	
}
