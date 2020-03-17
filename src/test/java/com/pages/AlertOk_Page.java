package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertOk_Page {
	static WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu-item-251\"]/a")
	private WebElement demoSite;
	@FindBy(xpath="//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
	private WebElement switchTo;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement clickButton;
	public AlertOk_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickDemoSite() {
		demoSite.click();
	}
	public void clickSwitchTo() {
		switchTo.click();
		switchTo.sendKeys(Keys.ARROW_DOWN);
		switchTo.sendKeys(Keys.ENTER);
	}
	public void clickAlertButton() {
		clickButton.click();
		driver.switchTo().alert().accept();
	}
	
}
