package PageFactory;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HYRtutorials_Iframes_PF {
	
	
WebDriver driver;
	
	public HYRtutorials_Iframes_PF (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	WebElement HYR_main_page_text_box;
	
	@FindBy(id = "frm1")
	WebElement HYR_Iframe_1;
	@FindBy(id = "frm2")
	WebElement HYR_Iframe_2;
	@FindBy(id = "frm3")
	WebElement HYR_Iframe_3;
	
	
	@FindBy(className ="selectnav")
	WebElement HYR_Ifrmae_Main_menu_selection;
	@FindBy(className="tyheading-head")
	WebElement HYR_iframe_home_icon;
	
//	@FindBy(xpath="//div[contains(@class,\"tyheading-head\")]//h2[contains(@class,\"title\")]")
//	List<WebElement> HYR_sub_headers;
	@FindBy(xpath = "//h1[contains(@itemprop,\"name\")]")
	WebElement HYR_contact_me_header;
	
	public void navigatetoiframepage() {
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
//		driver.findElement(By.className("frmTextBox")).clear();
		HYR_main_page_text_box.clear();
	}
	
	public void frame1task() {
		driver.switchTo().frame(HYR_Iframe_1);
		Select mainoption = new Select(HYR_Ifrmae_Main_menu_selection);
		mainoption.selectByVisibleText("Home");  //Frame1 option selection
		HYR_iframe_home_icon.isDisplayed();
		driver.switchTo().defaultContent();
	}
	
	public void frame2task() {
		driver.switchTo().frame(HYR_Iframe_2);
		Select mainoption = new Select(HYR_Ifrmae_Main_menu_selection);
		mainoption.selectByVisibleText("Contact");  //Frame1 option selection
		HYR_contact_me_header.isDisplayed();
		driver.switchTo().defaultContent();
	}
	
	public void frame3task() {
		driver.switchTo().frame(HYR_Iframe_3);
		driver.switchTo().frame(HYR_Iframe_1);
		Select mainoption = new Select(HYR_Ifrmae_Main_menu_selection);
		mainoption.selectByVisibleText("Home");  //Frame1 option selection
		HYR_iframe_home_icon.isDisplayed();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(HYR_Iframe_2);
		Select mainoption2 = new Select(HYR_Ifrmae_Main_menu_selection);
		mainoption2.selectByVisibleText("Contact");  //Frame1 option selection
		HYR_contact_me_header.isDisplayed();
		driver.switchTo().defaultContent();
	}
	
	
	public void entertextinmainpage(String frametask) {
		driver.switchTo().defaultContent();
		HYR_main_page_text_box.sendKeys(frametask); //mainpagetextbox
	}
	
	public void validatemainpagetextbox() {
		String expected = "Frame1 task completedFrame2 task completedFrame3 task completed";
		String act = HYR_main_page_text_box.getText();
		System.out.println("Error message is: "+ act);
		Assert.assertEquals(expected, act);
	}
	
	
	
}
