package com.krishnasProject.Pages;

import java.time.Duration;

import com.krishnasProject.feature.CollectionVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainBasePage {

	WebDriver driver;
	WebDriverWait driverWait;
	JavascriptExecutor executor;

	public MainBasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driverWait = new WebDriverWait(driver,
				Duration.ofSeconds(Integer.parseInt(CollectionVariables.configurationEnv.getTimeOut())));
		executor = (JavascriptExecutor) driver;
	}

	public By lnkWithText(String linktxt) {
		return By.xpath(String.format("//a[text()='%s']", linktxt));
	}

	public By txtbxWithid(String id) {
		return By.xpath(String.format("//input[@id='%s']", id));
	}

	public By btnWithId(String btnId) {
		return By.xpath(String.format("//button[@id='%s']", btnId));
	}

	public By inputWithText(String txt) {
		return By.xpath(String.format("//input[text()='%s']", txt));
	}

	public By selectWithId(String txtid) {
		return By.xpath(String.format("//select[@id='%s']", txtid));
	}

	public By btnWithText(String btnTxt) {
		return By.xpath(String.format("//button[text(),'%s']", btnTxt));
	}

	public boolean CheckifElementPresent(By locatorPath) {
		try {

			driverWait.until(ExpectedConditions.presenceOfElementLocated(locatorPath));
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			CollectionVariables.LOGGER.error("Error Message in Method CheckifElementPresent --> " + e.getMessage());
			// e.printStackTrace();
			return false;
		}
	}

	public boolean CheckifElementPresentWithScroll(By locatorPath) {

		try {

			while (!CheckifElementPresent(locatorPath)) {
				WebElement element = driver.findElement(locatorPath);
				executor.executeScript("arguments[0].scrollIntoView(false);", element);
				Thread.sleep(2000);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			CollectionVariables.LOGGER
					.error("Error Message in Method CheckifElementPresentWithScroll --> " + e.getMessage());
			// e.printStackTrace();
			return false;
		}
	}

	public boolean ScrollSingle(int Times) throws Exception {
		while (Times > 0) {
			executor.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(3000);
			Times--;
		}
		return true;
	}
}