package com.krishnasProject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SampleCase1.feature", // Path to your feature files
        glue = "com.krishnasProject.stepDefinations", // Path to step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Generates reports
        monochrome = true, // Better console output
        tags = "@Regression"
)
public class TestRunner2 {
}
