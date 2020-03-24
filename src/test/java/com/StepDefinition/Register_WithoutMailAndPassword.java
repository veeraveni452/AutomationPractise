package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.Register_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_WithoutMailAndPassword extends WrapperClass {
	Register_Page reg;
	@Given("^launching the chrome browser$")
	public void launching_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   LaunchApplication();
	}

	@When("^Home Page should be open$")
	public void Home_Page_should_be_opened() {
	    // Write code here that turns the phrase above into concrete actions
		OpenWebsite();
	}

	@Then("^go to myaccountpage$")
	public void go_to_myaccountpage()  {
	    // Write code here that turns the phrase above into concrete actions
		reg=new Register_Page(driver);
		reg.clickMyAccount();
	}

	@Then("^leave mailid$")
	public void enter_mailid()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterMail("");
	}

	@Then("^leave password$")
	public void leave_password()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterPassword("");
	}
	@Then("^click on register button$")
	public void click_on_register_button() {
		reg.clickRegister();
		reg.showError();
	}
	@Then("^close the chrome app$")
	public void close_the_chrome_app(){
	    // Write code here that turns the phrase above into concrete actions
		quit();
	}


}
