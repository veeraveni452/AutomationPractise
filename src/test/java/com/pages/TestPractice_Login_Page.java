package com.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestPractice_Login_Page {
	protected WebDriver driver;
	// setting reference by creating an object
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userNameElement;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordElement;
	@FindBy(xpath="//strong[contains(text(),'Error:')]")
	private WebElement errorMessage;
	@FindBy(xpath="//strong[contains(text(),'ERROR')]")
	private WebElement errorMsg;
	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginButton;

	public TestPractice_Login_Page(WebDriver driver) {
		this.driver = driver;
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
	public void showError() {
		String actual= errorMsg.getText();
		Assert.assertEquals(actual, "ERROR");
		System.out.println("The password you entered is incorrect");
	}
	public void errorMessage() {
		String actual= errorMessage.getText();
		Assert.assertEquals(actual, "Error:");
		System.out.println("The password is missing");
	}

	public void clickLogin() {
		loginButton.click();
	}

}
