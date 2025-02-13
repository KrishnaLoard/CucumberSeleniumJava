package com.krishnasPackage.stepDefinationsCases;

import com.krishnasPackage.basePackage.BaseDriverClass;
import com.krishnasPackage.fatures.CollectionVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SamplePageTest1 extends BaseDriverClass {

    public SamplePageTest1() throws Exception {
        super();
    }

    @Given("Check Page Is Loaded.")
    public void TestCaseStep1() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        CollectionVariables.LOGGER.info("STEP: 1 --> Page Loaded Successfully");

        CollectionVariables.LOGGER.info("STEP: 2 --> Checking if the FirstName Txt Box is Visible");
        Assert.assertTrue("Text Box for the Name is not Visible", commonMethods.CheckifElementPresent(artofTestingPage.txtbxWithid("name")));

        CollectionVariables.LOGGER.info("STEP: 3 --> Checking if the Email Txt Box is Visible");
        Assert.assertTrue("Text Box for the Email is not Visible", commonMethods.CheckifElementPresent(artofTestingPage.txtbxWithid("email")));
    }

    @When("User Enters the FirstName {string} and Email {string}")
    public void TestCaseStep2(String firstname, String email) throws Exception {

        CollectionVariables.LOGGER.info("STEP: 4 --> Sending the First Name Supplied --> {}", firstname);
        driver.findElement(artofTestingPage.txtbxWithid("name")).sendKeys(firstname);
        Thread.sleep(2000);

        CollectionVariables.LOGGER.info("STEP: 5 --> Sending the Email Name Supplied --> {}", email);
        driver.findElement(artofTestingPage.txtbxWithid("email")).sendKeys(email);
        Thread.sleep(5000);
    }

    @Then("User Should be Able to Enter the Values Successfully.")
    public void TestCaseStep3() {
        driver.quit();
    }
}
