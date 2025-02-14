package com.krishnasPackage.stepDefinitions;

import com.krishnasPackage.fatures.CollectionVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.krishnasPackage.fatures.CollectionVariables.*;

public class SearchStepDefinitions {

    public SearchStepDefinitions() {

    }

    @Given("Check Page Is Loaded")
    public void TestCaseStep1() {
        LOGGER.info("Checking First STEP1");
    }

    @When("User Enters the FirstName {string} and Email {string}")
    public void TestCaseStep2(String firstname, String lastname) {
        LOGGER.info("Checking First STEP2 {}And {}", firstname, lastname);
    }

    @Then("Entered Value {string} Successfully")
    public void TestCaseStep3New(String Male) {
        LOGGER.info("Checking First STEP3 --> {}", Male);
    }

    @When("User Checks Gender Checkbox and Selects the {string} Gender")
    public void TestCaseStep4(String GenderFemale) {
        LOGGER.info("Checking First STEP4 --> " + GenderFemale);
    }

    @Then("User Enters the Mobile Number After Checking {string}")
    public void TestCaseStep5(String Mobile) {
        LOGGER.info("Checking First STEP5 --> {}", Mobile);
    }
}
