package com.krishnasPackage.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com.krishnasPackage.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Generates reports
        monochrome = true // Better console output
)
public class TestRunner1 {
}
