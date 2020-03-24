package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.AvailabilityCheck_Page;
import com.pages.Review_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AvailabilityCheck_Test extends WrapperClass {
	AvailabilityCheck_Page check;
	@Given("^the user first launch the chrome application$")
	public void the_1st_user_first_launch_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	   LaunchApplication();
	}

	@When("^the user then open TestPractice Home Page$")
	public void the_user_then_open_TestPractice_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		OpenWebsite();
	}

	@Then("^click on the Thinking in HTML$")
	public void click_on_the_Thinking_in_HTML()  {
	    // Write code here that turns the phrase above into concrete actions
		check= new AvailabilityCheck_Page(driver);
		check.clickHtml();
	}
	@Then("^check the availability of stock$")
	public void check_the_availability_of_stock()  {
	    // Write code here that turns the phrase above into concrete actions
		check.checkAvailability();
	}
	@Then("^close this browser9$")
	public void close_this_browser9() {
			quit();
	}
}
