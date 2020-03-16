package com.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPractice_LoginAndLogout_Page {
	static WebDriver driver;
	// setting reference by creating an object
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userNameElement;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordElement;
	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginButton;
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	private WebElement logout;

	public TestPractice_LoginAndLogout_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void clickMyAccount() {// click on my account
		myAccount.click();
	}
	public void enterUserName(String username) {
		userNameElement.sendKeys(username);
	}
	public void enterPassword(String password) {
		passwordElement.sendKeys(password);
	}
	public void clickLogin() {
		loginButton.click();
	}
	public void clickLogout() {
		logout.click();
	}
	}
