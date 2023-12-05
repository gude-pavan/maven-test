package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NTTLMS_PF {
	
	WebDriver driver;
	public NTTLMS_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
