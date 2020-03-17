package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Applyingcoupon {
	static WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	private WebElement shop;
	@FindBy(xpath="//a[contains(text(),'JavaScript')]")
	private WebElement javascript;
	@FindBy(xpath="//*[@id=\"content\"]/ul/li[1]/a[2]")
	private WebElement functionalJS;
	@FindBy(xpath="//a[@class='added_to_cart wc-forward']")
	private WebElement viewbasket;
	@FindBy(xpath="//input[@id='coupon_code']")
	private WebElement coupon;
	@FindBy(xpath="//input[contains(@name,'apply_coupon')]")
	private WebElement applycoupon;
	@FindBy(xpath="//div[@class='woocommerce-message']")
	private WebElement message;
	
	public Applyingcoupon(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	public void goToShop() {
		shop.click();
	}
	public void selectJavascript() {
		javascript.click();
	}
	public void addFunctionJS() {
		functionalJS.click();
	}
	public void  clickViewBasket() {
		viewbasket.click();
		}
	public void  enterCoupon() {
		coupon.sendKeys("krishnasakinala");
		}
	public void  clickApplyCoupon() {
		applycoupon.click();
		}
//	public void checkMessage() {
//		String actual= message.getText();
//		Assert.assertEquals("Coupon code applied successfully", actual);
//		System.out.println("Coupon code applied successfully");
//		
//	}
	
	
}
