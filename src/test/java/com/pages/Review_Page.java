package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.WrapperClass;

public class Review_Page extends  WrapperClass {
	static WebDriver driver;
	@FindBy(xpath="//h3[contains(text(),'Selenium Ruby')]")
	private WebElement seleniumRuby;
	@FindBy(xpath="//a[contains(text(),'Reviews (0)')]")
	private WebElement reviews;
	@FindBy(xpath="//a[@class='star-5']")
	private WebElement yourrating ;
	
	@FindBy(xpath="//textarea[@id='comment']")
	private WebElement yourreview;
	public Review_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	public void seleniumRuby() {
		seleniumRuby.click();
	}
	public void reviews() {
		reviews.click();
	}
	public void yourRating() {
	yourrating.click();
	}
	public void yourReview() {
	yourreview .sendKeys("You app is the best thing which I found in this website");
	}

}
