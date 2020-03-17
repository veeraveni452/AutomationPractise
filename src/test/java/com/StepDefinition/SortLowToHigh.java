package com.StepDefinition;

import com.baseclass.WrapperClass;
import com.pages.AvailabilityCheck_Page;
import com.pages.SortLowToHigh_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SortLowToHigh extends WrapperClass {
	SortLowToHigh_Page sort;
	@Given("^the 1stuser first launch the chrome application$")
	public void the_user_first_launch_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
	   LaunchApplication();
	}

	@When("^the 1stuser then open TestPractice Home Page$")
	public void the_1st_user_then_open_TestPractice_Home_Page() {
		OpenWebsite();
	}

	@Then("^clicks on the shop page$")
	public void clicks_on_the_shop_page()  {
	    // Write code here that turns the phrase above into concrete actions
		sort=new SortLowToHigh_Page(driver);
		sort.clickShop();
	}
	@Then("^sort the products from low to high$")
	public void sort_the_products_from_low_to_high() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		sort.clickDropDown();
	}
	@Then("^close the chrome browser$")
	public void close_the_chrome_browser() {
			quit();
	}
}
