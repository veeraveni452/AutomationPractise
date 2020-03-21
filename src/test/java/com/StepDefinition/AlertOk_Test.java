package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.AlertOk_Page;
import com.pages.Applyingcoupon;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertOk_Test extends WrapperClass{
	//creating an object to the AlertOk_Page
	AlertOk_Page alert;
	@Given("^launch chrome browser$")
	public void lauch_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		LaunchApplication();
	}

	@When("^Home Page is opened$")
	public void Home_Page_is_opened() {
		OpenWebsite();
	}

	@Then("^go to DemoSite$")
	public void go_to_DemoSite() {
		alert=new AlertOk_Page(driver);
		alert.clickDemoSite();
	}

	@Then("^SwithTo alerts$")
	public void SwithTo_alerts() {
		alert.clickSwitchTo();
	}

	@Then("^click the button to display alert Msg$")
	public void click_the_button_to_display_alert_Msg() {
		alert.clickAlertButton();
	}
	@Then("^close chrome application$")
	public void close_chrome_application() {
		quit();
	}

}
