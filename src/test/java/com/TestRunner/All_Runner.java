package com.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\main\\resources\\feature\\Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_TestPractice,@TC02_TestPractice,@TC03_TestPractice,@TC04_TestPractice,@TC05_TestPractice"
				+ ",@TC06_TestPractice,@TC07_TestPractice,@TC018_TestPractice,@TC09_TestPractice,@TC10_TestPractice"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)

public class All_Runner {

}
