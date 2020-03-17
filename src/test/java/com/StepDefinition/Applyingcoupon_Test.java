package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.Applyingcoupon;
import com.pages.Shop_Android_Page;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Applyingcoupon_Test extends WrapperClass {
	TestPractice_Login_Page login;
	Applyingcoupon apply;

	@Given("^the user first launches chrome application$")
	public void the_user_first_launches_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		LaunchApplication();
	}

	@When("^the user first opens TestPractice Home Page$")
	public void the_user_first_opens_the_TestPractice_Home_Page() {
		OpenWebsite();
	}

	@Then("^the user opens My Account Page$")
	public void the_user_opens_My_Account_page() {
		login = new TestPractice_Login_Page(driver);
		login.clickMyAccount();
	}

	@Then("^the user tries to login using valid password and username$")
	public void the_user_tries_to_login_using_valid_password_and_username() {
		login.enterUserName("vmcube2@gmail.com");
		login.enterPassword("REyansh123$$");
	}

	@Then("^click on the login button3$")
	public void click_on_the_login_button() {
		login.clickLogin();
	}

	@Then("^goto shop page$")
	public void goto_shop_page() {
		apply = new Applyingcoupon(driver);
		apply.goToShop();
	}

	@Then("^click on the javascript$")
	public void click_on_the_javascript() {
		apply.selectJavascript();
	}

	@Then("^select functional JS and click on add to basket$")
	public void select_functional_JS_and_click_on_add_to_basket() {
		apply.addFunctionJS();
	}

	@Then("^click on view basket$")
	public void click_on_view_basket() {
		apply.clickViewBasket();
	}

	@Then("^add coupon code$")
	public void add_coupon_code() {
		apply.enterCoupon();
	}

	@Then("^click on apply coupon code$")
	public void click_on_apply_coupon_code() {
		apply.clickApplyCoupon();
	}
	@Then("^close the exsisting browser7$")
	public void close_the_browser7() {
		quit();
	}

}
