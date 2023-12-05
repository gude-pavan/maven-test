package StepDefenitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Commonsteps {
	

	browsersetup browsersetup;
	
	public Commonsteps (browsersetup browsersetup)
	{
		this.browsersetup = browsersetup;
	}
	
	@When("Open the chrome browser")
	public void open_the_chrome_browser() {
		System.out.println("===Opening Chrome Browser===");
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		browsersetup.setDriver(driver);
		browsersetup.initializebrowser(driver);
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		System.out.println("===Closing the browser====");
		browsersetup.closebrowser(scenario);
	}
	

}
