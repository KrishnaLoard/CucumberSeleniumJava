package com.krishnasProject.stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import com.krishnasProject.BaseClass.BaseDriverClass;
import com.krishnasProject.feature.CollectionVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions extends BaseDriverClass {

	public SearchStepDefinitions() throws Exception {
		super();
	}

	@Given("Check Page Is Loaded")
	public void TestCaseStep1() throws Exception {
		CollectionVariables.LOGGER.info("STEP: 1 --> Checking First");
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		Assert.assertTrue(
				artofTestingPage.CheckifElementPresent(By.xpath("//h1[text()='Selenium - Automation Practice Form']")));
		CollectionVariables.LOGGER.info("STEP: 1 --> Checking First STEP1 --> PASS");
	}

	@When("User Enters the FirstName {string} and Email {string}")
	public void TestCaseStep2(String firstname, String lastname) throws Exception {
		CollectionVariables.LOGGER.info("STEP: 1 --> Checking FirstName " + firstname + "And " + lastname);
		driver.findElement(artofTestingPage.txtbxWithid("name")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(artofTestingPage.txtbxWithid("email")).sendKeys(lastname);
		Thread.sleep(1000);
		CollectionVariables.LOGGER
				.info("STEP: 1 --> Checking FirstName STEP2 " + firstname + "And " + lastname + " --> PASS");
	}

	@Then("User Should be Able to Enter the Values {string} Successfully")
	public void TestCaseStep3(String Male) throws Exception {
		CollectionVariables.LOGGER.info("STEP: 2 --> Checking Male Radio --> {}", Male);
		driver.findElement(By.xpath(String.format("//label[text()='%s']/preceding-sibling::input", Male))).click();
		Thread.sleep(5000);
		CollectionVariables.LOGGER.info("STEP: 2 --> Checking Male Radio STEP3 --> {} --> PASS", Male);

	}

	@When("User Checks Gender Checkbox and Selects the {string} Gender")
	public void TestCaseStep4(String GenderFemale) throws Exception {
		CollectionVariables.LOGGER.info("STEP: 3 --> Checking First --> " + GenderFemale);
		driver.findElement(By.xpath(String.format("//label[text()='%s']/preceding-sibling::input", GenderFemale)))
				.click();
		Thread.sleep(2000);
		CollectionVariables.LOGGER.info("STEP: 3 --> Checking First --> " + GenderFemale + " --> PASS");
	}

	@Then("User Enters the Mobile Number After Checking {string}")
	public void TestCaseStep5(String Mobile) throws Exception {
		CollectionVariables.LOGGER.info("STEP: 4 --> Checking First --> " + Mobile);
		driver.findElement(artofTestingPage.txtbxWithid("mobile")).sendKeys(Mobile);
		Thread.sleep(2000);
		CollectionVariables.LOGGER.info("STEP: 4 --> Checking MobileNumber --> " + Mobile + " --> PASS");
	}

	@When("Enter the Date of Birth {string}")
	public void TestCaseStep6(String Dob) throws Exception {
		CollectionVariables.LOGGER.info("STEP: 5 --> Checking First --> " + Dob);
		driver.findElement(artofTestingPage.txtbxWithid("dob")).sendKeys(Dob.split("-")[0]);
		Thread.sleep(3000);
		driver.findElement(artofTestingPage.txtbxWithid("dob")).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(artofTestingPage.txtbxWithid("dob")).sendKeys(Dob.split("-")[1]);
		Thread.sleep(3000);
		driver.findElement(artofTestingPage.txtbxWithid("dob")).sendKeys(Dob.split("-")[2]);
		Thread.sleep(3000);
		CollectionVariables.LOGGER.info("STEP: 5 --> Checking First --> " + Dob + " --> PASS");
	}

	@Then("Check The Date of Birth Is Correct {string}.")
	public void TestCaseStep7(String DobDate) throws Exception {
		CollectionVariables.LOGGER.info("STEP: 6 --> Entering the Subject Name --> {}", DobDate);
		driver.findElement(artofTestingPage.txtbxWithid("subjects")).sendKeys(DobDate);
		Thread.sleep(2000);
		CollectionVariables.LOGGER.info("STEP:6 --> Entering the Subject Name --> {} --> PASS", DobDate);
	}

	@When("Select {string} As Hobbies")
	public void TestCaseStep8(String Hobbies) throws Exception {
		CollectionVariables.LOGGER.info("STEP: 7 --> Entering the Subject Name --> {}", Hobbies);
		driver.findElement(By.xpath("//label[text()=\"" + Hobbies + "\"]/preceding-sibling::input")).click();
		Thread.sleep(2000);
		CollectionVariables.LOGGER.info("STEP: 7 --> Entering the Subject Name --> {} --> PASS", Hobbies);
	}

	@Then("Select File As DropOff")
	public void TestCaseStep9() throws Exception {
		CollectionVariables.LOGGER.info("STEP: 8 --> Entering File");
		driver.findElement(artofTestingPage.txtbxWithid("picture"))
				.sendKeys(System.getProperty("user.dir") + "/SeleniumConfigFile.json");
		Thread.sleep(2000);
		CollectionVariables.LOGGER.info("STEP: 8 --> Entering File --> PASS");
	}

	@When("Enter Address into the TextArea {string}")
	public void TestCaseStep10(String Address) {
		CollectionVariables.LOGGER.info("STEP: 9 --> Enter the Address");
		driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys(Address);
		CollectionVariables.LOGGER.info("STEP: 9 --> Enter the Address --> PASS");

	}

	@Then("Select City and State OR Whatever.")
	public void TestCaseStep11() throws Exception {
		CollectionVariables.LOGGER.info("STEP: 10 --> Select City and State OR Whatever.");
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("NCR");
		
		Select selectOther = new Select(driver.findElement(By.id("city")));
		selectOther.selectByVisibleText("Agra");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		CollectionVariables.LOGGER.info("STEP: 10 --> Select City and State OR Whatever. --> PASS");
		driver.quit();
	}
}
