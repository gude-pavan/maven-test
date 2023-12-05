package StepDefenitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.SL_Loginpage_PF;
import PageFactory.SL_Products_page_PF;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SL_sort_filters_steps_PF {

//	WebDriver driver;
//	SL_Loginpage_PF login;
//	SL_Products_page_PF products;

	browsersetup browsersetup;
	
	public SL_sort_filters_steps_PF (browsersetup browsersetup)
	{
		this.browsersetup = browsersetup;
	}
	
	@When("^provides the Sort value (.*)$")
	public void sort_the_filter(String sortvalue) throws InterruptedException {
		browsersetup.products.selectdropdownvalue(sortvalue);
		Thread.sleep(5000);
	}

	@Then("^Validate the first product and price (.*) and (.*)$")
	public void validate_the_product_and_prices(String first_product_name, String first_product_price) {
		browsersetup.products.firstproductname(first_product_name);
		browsersetup.products.firstproductprice(first_product_price);
		
	}
	
	@And("^Validate the last product and price (.*) and (.*)$")
	public void validate_the_product_and_price(String last_product_name, String last_product_price) {
		browsersetup.products.lastproductname(last_product_name);
		browsersetup.products.lastproductprice(last_product_price);
		
	}
	

	
}
