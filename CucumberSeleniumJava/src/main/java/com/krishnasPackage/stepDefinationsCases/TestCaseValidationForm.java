package com.krishnasPackage.stepDefinationsCases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseValidationForm {

    public TestCaseValidationForm() {

    }

    @Given("Check Page Is Loaded")
    public void TestCaseStep1() {
        System.out.println("Checking First STEP1");
    }

    @When("User Enters the FirstName {string} and Email {string}")
    public void TestCaseStep2(String firstname, String lastname) {
        System.out.println("Checking First STEP2 " + firstname + "And " + lastname);
    }

    @Then("Entered Value {string} Successfully")
    public void TestCaseStep3New(String Male) {
        System.out.print("Checking First STEP3 --> " + Male);
    }

    @When("User Checks Gender Checkbox and Selects the {string} Gender")
    public void TestCaseStep4(String GenderFemale) {
        System.out.print("Checking First STEP4 --> " + GenderFemale);
    }

    @Then("User Enters the Mobile Number After Checking {string}")
    public void TestCaseStep5(String Mobile) {
        System.out.print("Checking First STEP5 --> " + Mobile);
    }
}
