package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Register_Page {
	static WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(xpath="//input[@id='reg_email']")
	private WebElement emailid;
	@FindBy(xpath="//input[@id='reg_password']")
	private WebElement passWord;
	@FindBy(xpath="//input[@name='register']")
	private WebElement register;
	@FindBy(xpath="//strong[contains(text(),'Error:')]")
	private WebElement error;
	@FindBy(xpath="//strong[contains(text(),'Error:')]")
	private WebElement errorPass;
	public Register_Page(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickMyAccount() {
		myAccount.click();
	}
	public void enterMail(String mailId) {
		emailid.sendKeys(mailId);
	}
	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}
	public void clickRegister() {
		register.click();
	}
	public void showError() {
		String actual= error.getText();
		Assert.assertEquals(actual, "Error:");
		System.out.println("Please enter a valid mail id");
	}
	public void showErrorPass() {
		String actual= errorPass.getText();
		Assert.assertEquals(actual, "Error:");
		System.out.println("Please enter the password");
	}


}
