package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.Register_Page;
import com.pages.Review_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_InvalidEmail extends WrapperClass {
	Register_Page reg;
	@Given("^launch chrome browser$")
	public void launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   LaunchApplication();
	}

	@When("^Home Page is opened$")
	public void Home_Page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		OpenWebsite();
	}

	@Then("^go to myaccount page$")
	public void go_to_myaccount_page()  {
	    // Write code here that turns the phrase above into concrete actions
		reg=new Register_Page(driver);
		reg.clickMyAccount();
	}

	@Then("^enter mail id$")
	public void enter_mail_id()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterMail("dwerrgeget");
	}

	@Then("^enter password$")
	public void enter_password()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterPassword("12dsio54$");
	}
	@Then("^click register$")
	public void click_register() {
		reg.clickRegister();
	}
	@Then("^close chrome application$")
	public void close_chrome_application(){
	    // Write code here that turns the phrase above into concrete actions
		quit();
	}


}
