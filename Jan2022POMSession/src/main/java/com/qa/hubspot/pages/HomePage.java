package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class HomePage extends BasePage {

	private WebDriver driver;

	// 1. By Locators
	private By header = By.cssSelector(".private-header__heading");
	private By settingIcon = By.id("hs-global-toolbar-settings-list-item");
	private By accountName = By.xpath("//button[@id='hs-global-toolbar-accounts']/span");

	// 2. Constructor of the page class
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page actions: features(Behaviour) of the page in form of methods

	public String getHomePageTitle() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		;
		return driver.getTitle();
	}

	public String getHeaderValue() {
		if (driver.findElement(header).isDisplayed()) {
			return driver.findElement(header).getText();
		}
		return null;
	}

	public boolean isSettingsIconExist() {
		// driver.findElement(settingIcon).isDisplayed();
		if (driver.findElements(settingIcon).size() > 0) {
			return true;
		}
		return false;
	}

	public String getAccountNameValue() {
		if (driver.findElement(accountName).isDisplayed()) {
			return driver.findElement(accountName).getText();
		}
		return null;
	}

}
