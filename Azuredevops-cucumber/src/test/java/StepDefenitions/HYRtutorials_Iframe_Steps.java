package StepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HYRtutorials_Iframe_Steps {
	
browsersetup browsersetup;
	
	public HYRtutorials_Iframe_Steps (browsersetup browsersetup)
	{
		this.browsersetup = browsersetup;
	}
	
	@When("Navigate to HYR tutorials Iframes page")
	public void navigate_to_hyr_iframe_page() throws InterruptedException {
			browsersetup.hyriframe.navigatetoiframepage();
			Thread.sleep(2000);
			}

	@And("Select home page in Frame1 and validate it")
	public void select_home_page_in_frame1_and_validate_it() throws InterruptedException {
	    browsersetup.hyriframe.frame1task();
	    Thread.sleep(5000);

	}

	@And("^Record it in main page text box (.*)$")
	public void record_it_in_main_page_text_box_frame1_task_completed(String frametask) {
	    browsersetup.hyriframe.entertextinmainpage(frametask);
	}

	@And("Select Contact page in Frame2 and validate it")
	public void select_contact_page_in_frame2_and_validate_it() throws InterruptedException {
		browsersetup.hyriframe.frame2task();
	    Thread.sleep(5000);
	}

	@And("Select home page and Contact page in Frame3 and validate it")
	public void select_home_page_and_contact_page_in_frame3_and_validate_it() throws InterruptedException {
		browsersetup.hyriframe.frame3task();
	    Thread.sleep(10000);
	   
	}

}
