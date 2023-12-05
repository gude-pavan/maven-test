package PageFactory;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import StepDefenitions.SL_loginsteps_PF;
import StepDefenitions.browsersetup;

public class SL_Products_page_PF extends browsersetup{
	
	WebDriver driver;
	
	@FindBy(className = "product_sort_container")
	WebElement SL_btn_sort;
	@FindBy(xpath = "//select[contains(@class,\"product_sort_container\")]")
	List<WebElement> prd_List;
	@FindBy(xpath ="//span[contains(@class,\"active_option\")]")
	WebElement SL_sort_active_option;
	@FindBy(xpath="//div[contains(@class,\"inventory_item_price\")]")
	List<WebElement> SL_price_details;
	@FindBy(xpath="//div[contains(@class,\"inventory_item_name\")]")
	List<WebElement> SL_Item_names;
	@FindBy(xpath = "//button[contains(@class,\"btn btn_primary btn_small btn_inventory\")]")
	WebElement SL_btn_add_to_cart;
	@FindBy(id="shopping_cart_container")
	WebElement SL_icon_cart;
	
	
	public SL_Products_page_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addtocartvalidate() {
		SL_icon_cart.isDisplayed();
	}
	
	public void clickaddtocart() {
		SL_btn_add_to_cart.click();
		
	}
	
	public void selectdropdownvalue(String sortvalue) {
		Select dropdown = new Select(SL_btn_sort);
		dropdown.selectByVisibleText(sortvalue);
		
	}
	
	public void firstproductname(String firstprod_name) {
		
		String first_prod_name = SL_Item_names.get(0).getText();
		Assert.assertEquals(first_prod_name.trim(), firstprod_name.trim());
		
	}
	
public void firstproductprice(String first_product_price) {
		
		String first_prod_price = SL_price_details.get(0).getText();
		Assert.assertEquals(first_prod_price, String.valueOf(first_product_price));
		
	}
public void lastproductname(String lastprod_name) {
	
	String last_prod_name = SL_Item_names.get(SL_Item_names.size()-1).getText();
	Assert.assertEquals(last_prod_name.trim(), lastprod_name.trim());
	
}

public void lastproductprice(String lastprdo_price) {
	
	String last_prod_price = SL_price_details.get(SL_price_details.size()-1).getText();
	Assert.assertEquals(last_prod_price, String.valueOf(lastprdo_price));
	
}
	
	

}
