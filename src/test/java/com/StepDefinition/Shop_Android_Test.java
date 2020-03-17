package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.WrapperClass;
import com.pages.Shop_Android_Page;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shop_Android_Test extends WrapperClass {
//		WebDriver driver ;
	TestPractice_Login_Page login;
	Shop_Android_Page shopAndroid;

	@Given("^the user1 has to launch the chrome application$")
	public void the_user1_launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		LaunchApplication();
	}

	@When("^the user1 opens the TestPractice Home Page$")
	public void the_user1_open_the_TestPractice_Home_Page() {
		OpenWebsite();
	}

	@Then("^the user1 opens the My Account Page$")
	public void the_user1_open_the_My_Account_Page() {
		login = new TestPractice_Login_Page(driver);
		login.clickMyAccount();
	}

	@Then("^the user1 logins using username and password$")
	public void the_user1_login_using_username_and_password() {
		login.enterUserName("vmcube2@gmail.com");
		login.enterPassword("REyansh123$$");
	}

	@Then("^click on the login button then user1 navigate to next page$")
	public void click_on_the_login_button_user1_navgate_to_next_page() {
		login.clickLogin();
	}

	@Then("^the user1 open the Shop page$")
	public void the_user1_open_the_Shop_page() {
		shopAndroid = new Shop_Android_Page(driver);
		shopAndroid.goToShop();
	}

	@Then("^the user1 click on the android$")
	public void the_user1_click_on_the_android() {
		shopAndroid.clickAndroid();
	}

	@Then("^the user1 click on the android mobile$")
	public void the_user1_click_on_the_android_mobile() {
		shopAndroid.clickAndroidSoftware();
	}

	@Then("^the user1 check stock is available or not$")
	public void the_user1_check_stock_is_available_or_not() {
		shopAndroid.checkStock();
	}
	@Then("^it will close the browser2$")
	public void it_will_close_the_browser2() {
		quit();
	}
}