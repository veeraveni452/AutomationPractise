package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.WrapperClass;
import com.pages.TestPractice_LoginAndLogout_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestPractice_LoginAndLogout extends WrapperClass {
	//WebDriver driver;
	TestPractice_LoginAndLogout_Page loginlogout;

	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	  LaunchApplication();
	}
	@When("^the user open the TestPractice Home Page$")
	public void the_user_open_the_TestPractice_Home_Page() {
		OpenWebsite();
	}
	@Then("^the user open the My Account Page$")
	public void the_user_open_the_My_Account_Page() {
		loginlogout=new TestPractice_LoginAndLogout_Page(driver);
		loginlogout.clickMyAccount();
	}
	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() {
		loginlogout.enterUserName("vmcube1@gmail.com");
		loginlogout.enterPassword("REyansh123$");
	}
	@Then("^click on the login button user navigate to next page$")
	public void click_on_the_login_button_user_navgate_to_next_page() {
		loginlogout.clickLogin();
	}
	@Then("^click on the logout button$")
	public void click_on_the_logout_button() {
		loginlogout.clickLogout();
	}
	@Then("^close the browser$")
	public void close_the_browser() {
		quit();
	}
	
}
