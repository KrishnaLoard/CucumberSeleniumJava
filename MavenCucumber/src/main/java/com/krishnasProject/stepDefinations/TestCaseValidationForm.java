package com.krishnasProject.stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.krishnasProject.BaseClass.BaseDriverClass;
import com.krishnasProject.feature.CollectionVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseValidationForm extends BaseDriverClass {

	public TestCaseValidationForm() throws Exception {
		super();
	}

	@Given("Check Page Is Loaded")
	public void TestCaseStep1() throws Exception {
		CollectionVariables.LOGGER.info("Checking First STEP1");
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		Assert.assertTrue(
				artofTestingPage.CheckifElementPresent(By.xpath("//h1[text()='Selenium - Automation Practice Form']")));
		CollectionVariables.LOGGER.info("Checking First STEP1 --> PASS");
	}

	@When("User Enters the FirstName {string} and Email {string}")
	public void TestCaseStep2(String firstname, String lastname) throws Exception {
		CollectionVariables.LOGGER.info("Checking FirstName STEP2 " + firstname + "And " + lastname);
		driver.findElement(artofTestingPage.txtbxWithid("name")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(artofTestingPage.txtbxWithid("email")).sendKeys(lastname);
		Thread.sleep(1000);
		CollectionVariables.LOGGER.info("Checking FirstName STEP2 " + firstname + "And " + lastname + " --> PASS");
	}

	@Then("User Should be Able to Enter the Values {string} Successfully")
	public void TestCaseStep3(String Male) throws Exception {
		CollectionVariables.LOGGER.info("Checking Male Radio STEP3 --> {}", Male);
		driver.findElement(By.xpath(String.format("//label[text()='%s']/preceding-sibling::input", Male))).click();
		Thread.sleep(5000);
		CollectionVariables.LOGGER.info("Checking Male Radio STEP3 --> {} --> PASS", Male);

	}

	@When("User Checks Gender Checkbox and Selects the {string} Gender")
	public void TestCaseStep4(String GenderFemale) {
		System.out.print("Checking First STEP4 --> " + GenderFemale);
	}

	@Then("User Enters the Mobile Number After Checking {string}")
	public void TestCaseStep5(String Mobile) {
		System.out.print("Checking First STEP5 --> " + Mobile);
		driver.quit();
	}
}
