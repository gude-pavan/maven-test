package StepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HYR_alerts_page_steps_PF {
	
	browsersetup browsersetup;
	
	public HYR_alerts_page_steps_PF (browsersetup browsersetup)
	{
		this.browsersetup = browsersetup;
	}
	
	
	@When("Navigate to HYR tutorials alert page")
	public void navigate_to_hyr_tutorials_alert_page() throws InterruptedException {
		browsersetup.Hyralertspage.navigatetoalertpage();
		Thread.sleep(10000);
	}

	@And("^click on click me button and do provided action (.*) and (.*)$")
	public void click_on_button_and_perform_action(String boxname, String action) throws InterruptedException {
		browsersetup.Hyralertspage.clickonbuttonandperformaction(boxname, action);
		Thread.sleep(3000);
	}

	@Then("^validate the text in popup box output (.*)$")
	public void validate_the_text_in_popup_box(String actionoutput) throws InterruptedException {
		
		browsersetup.Hyralertspage.validatealertboxtext(actionoutput);
		
	   
	}


}
