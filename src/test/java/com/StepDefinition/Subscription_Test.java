package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.Shop_HTML_Page;
import com.pages.Subscription_Page;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Subscription_Test extends WrapperClass {
	Subscription_Page subscribe;
	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		LaunchApplication();
	}

	@When("^TestPractice Home Page is opened$")
	public void TestPractice_Home_Page_is_opened() {
		OpenWebsite();
	}

	@Then("^enter the email in subscription$")
	public void enter_the_email_in_subscription() {
		subscribe= new Subscription_Page(driver);
		subscribe.enterMailID();
	}

	@Then("^click on subscribe$")
	public void click_on_subscribe() {
		subscribe.clickSubscribe();
	}
	@Then("^close the chrome application$")
	public void close_the_chrome_application() {
		quit();
	}
}

