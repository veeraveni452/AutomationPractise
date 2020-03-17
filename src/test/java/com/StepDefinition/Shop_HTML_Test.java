package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.Shop_Android_Page;
import com.pages.Shop_HTML_Page;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shop_HTML_Test extends WrapperClass {
	TestPractice_Login_Page login;
	Shop_HTML_Page html;
	@Given("^first user1 has to launch the chrome application$")
	public void first_user1_launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		LaunchApplication();
	}

	@When("^the user1 opened the TestPractice Home Page$")
	public void the_user1_opened_the_TestPractice_Home_Page() {
		
	}

	@Then("^the user1 opened the My Account Page$")
	public void the_user1_opened_the_My_Account_Page() {
		login = new TestPractice_Login_Page(driver);
		login.clickMyAccount();
	}

	@Then("^the user1 logined using username and password$")
	public void the_user1_logined_using_username_and_password() {
		login.enterUserName("vmcube2@gmail.com");
		login.enterPassword("REyansh123$$");
	}

	@Then("^click on the login button user1 navigates to next page$")
	public void click_on_the_login_button_user1_navgates_to_next_page() {
		login.clickLogin();
	}

	@Then("^the user1 click the Shop page$")
	public void the_user1_click_the_Shop_page() {
		html = new Shop_HTML_Page(driver);
		html.goToShop();
	}
	@Then("^the user1 click on the HTML and Add to Basket$")
	public void the_user1_click_on_the_HTML_and_Add_to_Basket() {
		html.goToHtml();
	}
	@Then("^browser should be closed$")
	public void browser_should_be_closed() {
		quit();
	}
}
