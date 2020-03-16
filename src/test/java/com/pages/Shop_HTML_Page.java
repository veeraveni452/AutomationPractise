package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_HTML_Page {
	static WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	private WebElement shop;
	@FindBy(xpath="//a[contains(text(),'HTML')]")
	private WebElement html;
	@FindBy(xpath="//*[@id=\"content\"]/ul/li[1]/a[2]")
	private WebElement addToBasket;
	public Shop_HTML_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void goToShop() {
		shop.click();
	}
	public void goToHtml() {
		html.click();
		addToBasket.click();
	}
}
