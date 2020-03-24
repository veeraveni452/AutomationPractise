package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.Register_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_WithoutMail extends WrapperClass {
	Register_Page reg;
	@Given("^launching chrome browser$")
	public void launching_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   LaunchApplication();
	}

	@When("^Home Page should open$")
	public void Home_Page_should_opened() {
	    // Write code here that turns the phrase above into concrete actions
		OpenWebsite();
	}

	@Then("^go to myaccount$")
	public void go_to_myaccount()  {
	    // Write code here that turns the phrase above into concrete actions
		reg=new Register_Page(driver);
		reg.clickMyAccount();
	}

	@Then("^leave mail id$")
	public void enter_mail_id()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterMail("");
	}

	@Then("^enter the pass$")
	public void enter_the_password()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterPassword("12dsio54$");
	}
	@Then("^click on register$")
	public void click_on_register() {
		reg.clickRegister();
		reg.showError();
	}
	@Then("^close chrome app$")
	public void close_chrome_app(){
	    // Write code here that turns the phrase above into concrete actions
		quit();
	}


}
