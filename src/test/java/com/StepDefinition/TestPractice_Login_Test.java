package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.WrapperClass;
import com.pages.TestPractice_LoginAndLogout_Page;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestPractice_Login_Test extends WrapperClass {
	//WebDriver driver;
	TestPractice_Login_Page login;

	@Given("^the user1 launch the chrome application$")
	public void the_user1_launch_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	  LaunchApplication();
	}
	@When("^the user1 open the TestPractice Home Page$")
	public void the_user1_open_the_TestPractice_Home_Page() {
		OpenWebsite();
	}
	@Then("^the user1 open the My Account Page$")
	public void the_user1_open_the_My_Account_Page() {
		login=new TestPractice_Login_Page(driver);
		login.clickMyAccount();
	}
	@Then("^the user1 login using username and password$")
	public void the_user1_login_using_username_and_password() {
		login.enterUserName("vmcube2@gmail.com");
		login.enterPassword("REyansh123$$");
	}
	@Then("^click on the login button user1 navigate to next page$")
	public void click_on_the_login_button_user1_navgate_to_next_page() {
		login.clickLogin();
	}
	@Then("^closes the browser1$")
	public void closes_the_browser1() {
		quit();
	}
}
