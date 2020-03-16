package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithoutUsernameTest extends WrapperClass {
	TestPractice_Login_Page login;
	@Given("^the user launches chrome application$")
	public void the_user_launches_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	  LaunchApplication();
	}
	@When("^the user opens TestPractice Home Page$")
	public void the_user_opens_TestPractice_Home_Page() {
		OpenWebsite();
	}
	@Then("^the user open My Account Page$")
	public void the_user_open_My_Account_Page() {
		login=new TestPractice_Login_Page(driver);
		login.clickMyAccount();
	}
	@Then("^the user try to login using valid password and empty username$")
	public void the_user_try_to_login_using_valid_password_and_empty_username() {
		login.enterUserName("");
		login.enterPassword("REyansh123$$");
	}
	@Then("^click on the login button2$")
	public void click_on_the_login_button1() {
		login.clickLogin();
	}
	@Then("^application will show an error message$")
	public void application_will_show_an_error_message() {
		login.errorMessage();;
	}
	@Then("^close the browser6$")
	public void close_the_browser6() {
			quit();
	}
}
