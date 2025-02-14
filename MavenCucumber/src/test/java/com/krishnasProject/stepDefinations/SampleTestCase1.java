package com.krishnasProject.stepDefinations;

import com.krishnasProject.BaseClass.BaseDriverClass;
import com.krishnasProject.feature.CollectionVariables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTestCase1 extends BaseDriverClass {

	public SampleTestCase1() throws Exception {
		// TODO Auto-generated constructor stub
		super();
	}

	@Given("Load the Main Page")
	public void TestStep1() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}

	@When("FirstName is Visible {string} in step")
	public void TestStep2(String firstname) {
		CollectionVariables.LOGGER.info("First Step Execution Starting --> With Parameter {}", firstname);
	}
	
	@Then("Verify the Textbox and Enter the value {string} in step")
	public void TestStep3(String firstnamevalue) {
		CollectionVariables.LOGGER.info("Second Test Step Execution with Parameter --> {}", firstnamevalue);
		driver.quit();
	}

}
