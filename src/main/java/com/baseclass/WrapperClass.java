package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.XLSXFileRead;

public class WrapperClass extends XLSXFileRead{
	protected WebDriver driver;
	

	public void LaunchApplication( ) {
		// To launch chrome browser
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				//driver.get("http://practice.automationtesting.in/");
				
	}
	public void OpenWebsite() {
		driver.get("http://practice.automationtesting.in/");
	
	
	
	}
	// To close the browser
	public void quit() {

		driver.close();
	}

}
