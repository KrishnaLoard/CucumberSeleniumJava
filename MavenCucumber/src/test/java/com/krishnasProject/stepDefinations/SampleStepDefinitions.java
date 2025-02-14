package com.krishnasProject.stepDefinations;


import com.krishnasProject.BaseClass.BaseDriverClass;
import com.krishnasProject.feature.CollectionVariables;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleStepDefinitions extends BaseDriverClass {

	public SampleStepDefinitions() throws Exception {
		// TODO Auto-generated constructor stub
		super();
	}

	@Given("I want to write a step with precondition")
	public void TestStep1() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}

	@When("I complete action")
	public void TestStep2() {
		CollectionVariables.LOGGER.info("First Step Execution Starting --> With Parameter");
	}

	@And("some other action")
	public void TestStep3() {
		CollectionVariables.LOGGER.info("Second Test Step Execution with Parameter --> {}");
		
	}
	
	@And("yet another action")
	public void TestStep4() {
		CollectionVariables.LOGGER.info("Second Test Step Execution with Parameter --> {}");
	}
	
	@Then("I validate the outcomes")
	public void TestStep5() {
		
		CollectionVariables.LOGGER.info("Second Test Step Execution with Parameter --> {}");
		driver.quit();
		
	}

}
