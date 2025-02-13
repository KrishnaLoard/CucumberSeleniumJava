package com.krishnasPackage.pages;

import org.openqa.selenium.WebDriver;

public class ArtofTestingPage extends MainBasePage {

	public WebDriver driver;

	public ArtofTestingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}

	public boolean isElementExists() {
		return false;
	}
}
