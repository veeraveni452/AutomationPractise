package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.Register_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_WithoutPassword extends WrapperClass {
	Register_Page reg;
	@Given("^launching the chromeBrowser$")
	public void launching_the_chromeBrowser() {
	    // Write code here that turns the phrase above into concrete actions
	   LaunchApplication();
	}

	@When("^open home page$")
	public void open_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		OpenWebsite();
	}

	@Then("^click on myaccountpage$")
	public void click_on_myaccountpage()  {
	    // Write code here that turns the phrase above into concrete actions
		reg=new Register_Page(driver);
		reg.clickMyAccount();
	}

	@Then("^enter the mailid$")
	public void enter_the_mailid()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterMail("mm3cube@gmail.com");
	}

	@Then("^leave the password$")
	public void leave_the_password()  {
	    // Write code here that turns the phrase above into concrete actions
		reg.enterPassword("");
	}
	@Then("^click the register button$")
	public void click_the_register_button() {
		reg.clickRegister();
		reg.showErrorPass();
	}
	@Then("^close the chromeApplication$")
	public void close_the_chromeApplication(){
	    // Write code here that turns the phrase above into concrete actions
		quit();
	}


}
