package com.krishnasPackage.stepDefinitions;

import com.krishnasPackage.basePackage.BaseDriverClass;
import com.krishnasPackage.fatures.CollectionVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SampleGoogleTest extends BaseDriverClass {
    public SampleGoogleTest() throws Exception {
        super();
    }

    @Given("User is on Google Home Page.")
    public void TESTCASESTEP1() throws Exception {
        CollectionVariables.LOGGER.info("Started Test Case --> {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        CollectionVariables.LOGGER.info("Get Current URL --> {}", driver.getCurrentUrl());
        driver.get(CollectionVariables.configurationEnv.getBaseUrl());
        Thread.sleep(2000);
    }

    @When("User is On Login Page.")
    public void TESTCASESTEP2() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        assert title.contains("Google") : "Title does not match!";
    }

    @And("Check Google Logo")
    public void TESTCASESTEP3() {
        String title = driver.getTitle();
        CollectionVariables.LOGGER.info("STEP: 3 --> Checking Title of Google Page");
        CollectionVariables.LOGGER.info("Page title is: {}", title);
        assert title.contains("Google") : "Title does not match!";
    }

    @Then("Assert Certain GooglePage Elements. Kill Driver.")
    public void TESTCASESTEP4() {
        CollectionVariables.LOGGER.info("STEP: 4 --> Checking Link Visible");
        Assert.assertTrue("Gmail Link is not Visible on the Page.", basePage.CheckifElementPresent(googleBasePage.lnkContainsText("Gmail")));
        Assert.assertTrue("Images is not Visible", basePage.CheckifElementPresent(googleBasePage.lnkContainsText("Images")));
        driver.quit();
    }
}
