package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Shop_Android_Page {
	static WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	private WebElement shop;
	@FindBy(xpath="//a[contains(text(),'Android')]")
	private WebElement android;
	@FindBy(xpath="//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']")
	private WebElement androidSoftware;
	@FindBy(xpath="//p[@class='stock out-of-stock']")
	private WebElement stockCheck;
	public Shop_Android_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	public void goToShop() {
		shop.click();
	}
	public void clickAndroid() {
		android.click();
	}
	public void clickAndroidSoftware() {
		androidSoftware.click();
	}
	public void checkStock() {
		String actual= stockCheck.getText();
		Assert.assertEquals("Out of stock", actual);
	}
}
