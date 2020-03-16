package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TesPractice_IncorrectLogin_Test extends WrapperClass {
	TestPractice_Login_Page login;
	@Given("^the user1 launches the chrome application$")
	public void the_user1_launches_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	  LaunchApplication();
	}
	@When("^the user1 open TestPractice Home Page$")
	public void the_user1_open_the_TestPractice_Home_Page() {
		OpenWebsite();
	}
	@Then("^the user1 opens My Account Page$")
	public void the_user1_opens_My_Account_Page() {
		login=new TestPractice_Login_Page(driver);
		login.clickMyAccount();
	}
	@Then("^the user1 try to login using incorrect username and password$")
	public void the_user1_trry_to_login_using_incorrect_username_and_password() {
		login.enterUserName("vmcube2@gmail.com");
		login.enterPassword("REyansh123$");
	}
	@Then("^click on the login button$")
	public void click_on_the_login_button() {
		login.clickLogin();
	}
	@Then("^application shows an error msg$")
	public void application_shows_an_error_msg() {
		login.showError();
	}
	@Then("^close the browser4$")
	public void close_the_browser() {
			quit();
	}
}
