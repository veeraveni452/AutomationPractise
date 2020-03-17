package com.StepDefinition;

import org.openqa.selenium.ElementNotInteractableException;

import com.baseclass.WrapperClass;
import com.pages.Applyingcoupon;
import com.pages.Review_Page;
import com.pages.TestPractice_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Review_Test  extends WrapperClass  {
		Review_Page review;
		@Given("^the user first launched the chrome application$")
		public void the_user_first_launched_the_chrome_application() {
		    // Write code here that turns the phrase above into concrete actions
		   LaunchApplication();
		}

		@When("^the user first opened TestPractice Home Page$")
		public void the_user_first_opened_TestPractice_Home_Page() {
		    // Write code here that turns the phrase above into concrete actions
			OpenWebsite();
		}

		@Then("^click on the Selenium WebDriver Recepies in Ruby$")
		public void click_on_the_Selenium_WebDriver_Recepies_in_Ruby()  {
		    // Write code here that turns the phrase above into concrete actions
			review = new Review_Page(driver);
			review.seleniumRuby();
		}

		@Then("^click on the reviews$")
		public void click_on_the_reviews()  {
		    // Write code here that turns the phrase above into concrete actions
			review.reviews();
		}

		@Then("^click on rating$")
		public void click_on_rating()  {
		    // Write code here that turns the phrase above into concrete actions
			review.yourRating();
		}

		@Then("^enter your review$")
		public void enter_your_review() {
		    // Write code here that turns the phrase above into concrete actions
			review.yourReview();
		}

		@Then("^close the opened browser8$")
		public void close_the_opened_browser8(){
		    // Write code here that turns the phrase above into concrete actions
			quit();
		}


}

