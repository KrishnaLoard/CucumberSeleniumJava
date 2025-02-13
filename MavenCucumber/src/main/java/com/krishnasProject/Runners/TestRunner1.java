package com.krishnasProject.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TestCaseValidationForm.feature", // Path to your feature files
        glue = "com.krishnasPackage.stepDefinationsCases", // Path to step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Generates reports
        monochrome = true // Better console output
)
public class TestRunner1 {
}
