package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortLowToHigh_Page {
static WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	private WebElement shop;
	@FindBy(xpath="//select[@name='orderby']")
	private WebElement dropDown;
	public SortLowToHigh_Page(WebDriver driver) {
	//	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickShop() {
		shop.click();
	}
	public void clickDropDown() throws InterruptedException {
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
}
