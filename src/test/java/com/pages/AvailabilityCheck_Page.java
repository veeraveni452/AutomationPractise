package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvailabilityCheck_Page {
	static WebDriver driver;
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")
	private WebElement html;
	@FindBy(xpath="//p[@class='stock in-stock']")
	private WebElement availability;
	public AvailabilityCheck_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickHtml() {
		html.click();
	}
	public void checkAvailability() {
		String stock= availability.getText();
		System.out.println(stock);
	}
}
