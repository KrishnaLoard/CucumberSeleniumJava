package com.krishnasPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods extends MainBasePage {

	public WebDriver driver;
	
	public CommonMethods(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub		
	}
	
    public By findElementDynamicallyLocators(String locatorType, String locatorValue) {
        switch(locatorType.toLowerCase()) {
            case "id":
                return By.id(locatorValue);
            case "name":
                return By.name(locatorValue);
            case "class":
                return By.className(locatorValue);
            case "css":
                return By.cssSelector(locatorValue);
            case "xpath":
                return By.xpath(locatorValue);
            case "linktext":
                return By.linkText(locatorValue);
            case "partiallinktext":
                return By.partialLinkText(locatorValue);
            case "tagname":
                return By.tagName(locatorValue);
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
        }
    }
}
