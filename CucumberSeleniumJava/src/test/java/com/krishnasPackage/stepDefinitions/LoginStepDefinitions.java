package com.krishnasPackage.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
    WebDriver driver;

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");  // Replace with actual URL
    }

    @When("the user enters valid username and password")
    public void user_enters_valid_credentials() throws Exception{
        driver.findElement(By.id("email")).sendKeys("testuser");
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("testpass");
        Thread.sleep(5000);
    }

    @When("clicks the login button")
    public void user_clicks_login_button() {
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
    }

    @Then("the user should be redirected to the homepage")
    public void user_redirected_to_homepage() {
        Assert.assertEquals("https://www.tutorialspoint.com/selenium/practice/login.php", driver.getCurrentUrl()); // Replace with actual home URL
        driver.quit();
    }
}
