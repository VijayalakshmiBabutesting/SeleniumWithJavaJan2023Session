package com.qa.hubspot.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BaseTest;
import com.qa.hubspot.utils.Constants;

public class HomePageTest extends BaseTest {

	@BeforeClass
	public void homePageSetUp() {

		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	// browser value is firefox
	// Login with : manishchugh1981@gmail.com and lamba@Maji789

	// User Guide | HubSpot
	// user account name is :Waterloo
	// home page header is : User Guide

//	PASSED: homePageTitleTest
//	PASSED: verifyAccountNameTest
//	PASSED: verifySettingsIconTest
//	PASSED: verifyhomePageHeaderTest
//
//	===============================================
//	    Default test
//	    Tests run: 4, Failures: 0, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 4, Passes: 4, Failures: 0, Skips: 0
//	===============================================

	@Test
	public void homePageTitleTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = homePage.getHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}

	@Test
	public void verifyhomePageHeaderTest() {
		String headerValue = homePage.getHeaderValue();
		System.out.println("home page header is : " + headerValue);
		Assert.assertEquals(headerValue, Constants.HOME_PAGE_HEADER);
	}

	@Test
	public void verifySettingsIconTest() {
		Assert.assertTrue(homePage.isSettingsIconExist());
	}

	@Test
	public void verifyAccountNameTest() {
		String accountName = homePage.getAccountNameValue();
		System.out.println("user account name is :" + accountName);
		Assert.assertEquals(accountName, prop.getProperty("accountName"));
	}

}
