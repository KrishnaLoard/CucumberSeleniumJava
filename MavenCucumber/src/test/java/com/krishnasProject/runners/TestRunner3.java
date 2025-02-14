package com.krishnasProject.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Sample.feature", // Path to your feature files
        glue = "com.krishnasProject.stepDefinations", // Path to step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Generates reports
)
public class TestRunner3 {

	public TestRunner3() {
		// TODO Auto-generated constructor stub
	}

}
