package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithoutPasswordTest extends WrapperClass {
	TestPractice_Login_Page login;
	@Given("^the user1 launches chrome application$")
	public void the_user1_launches_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	  LaunchApplication();
	}
	@When("^the user1 opens TestPractice Home Page$")
	public void the_user1_opens_TestPractice_Home_Page() {
		OpenWebsite();
	}
	@Then("^the user1 open My Account Page$")
	public void the_user1_open_My_Account_Page() {
		login=new TestPractice_Login_Page(driver);
		login.clickMyAccount();
	}
	@Then("^the user1 try to login using username and without password$")
	public void the_user1_try_to_login_using_username_and_without_password() {
		login.enterUserName("vmcube2@gmail.com");
		login.enterPassword("");
	}
	@Then("^click on the login button1$")
	public void click_on_the_login_button1() {
		login.clickLogin();
	}
	@Then("^application will show an error msg$")
	public void application_will_show_an_error_msg() {
		login.errorMessage();;
	}
	@Then("^the opened chrome browser will be closed$")
	public void the_opened_chrome_browser_will_be_closed() {
			quit();
	}
}
