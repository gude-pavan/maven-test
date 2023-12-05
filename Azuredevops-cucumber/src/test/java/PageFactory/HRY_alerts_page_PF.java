package PageFactory;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRY_alerts_page_PF {
	
WebDriver driver;
	
	public HRY_alerts_page_PF (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "alertBox")
	WebElement HYR_alert_box;
	
	@FindBy(id = "output")
	WebElement HYR_output_box;
	
	public void navigatetoalertpage() {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
	}
	
	public void clickonbuttonandperformaction(String boxname,String action) throws InterruptedException {
		
		driver.findElement(By.id(boxname)).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		
		if (boxname.equalsIgnoreCase("promptBox"))
		{
		
			alert.sendKeys("Pavan Kumar");
		
		}
		if (action.equalsIgnoreCase("Accept")) {
			
				alert.accept();  
		}
		if (action.equalsIgnoreCase("Reject")) {
		        	 alert.dismiss();
			      }    
		
			}
	
	public void validatealertboxtext(String actionoutput) throws InterruptedException {
		
		String act = driver.findElement(By.id("output")).getText();
//		System.out.println(actionoutput.trim());
//		System.out.println(act.trim());
		Assert.assertEquals(actionoutput.trim(), act.trim());
		
		}	
		
	}
	





