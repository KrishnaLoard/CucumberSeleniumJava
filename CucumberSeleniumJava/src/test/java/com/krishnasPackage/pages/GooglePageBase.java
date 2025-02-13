package com.krishnasPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePageBase extends MainBasePage{

	public WebDriver driver;
	
	public By lnkContainsText(String txt) {
		return By.xpath("//a[text()='" + txt + "']");
	}

	public GooglePageBase(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}
	
	public boolean islnkWithTextVisible(String text) {
		return driver.findElement(lnkContainsText(text)).isDisplayed();
	}

}
