package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscription_Page {
	static WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Your email address']")
	private WebElement mailID;
	@FindBy(xpath="//*[@id=\"mc4wp-form-1\"]/div[1]/p[2]/input")
	private WebElement subscribe;
	public Subscription_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterMailID() {
		mailID.sendKeys("mouni@gmail.com");
	}
	public void clickSubscribe() {
		subscribe.click();
	}
}
