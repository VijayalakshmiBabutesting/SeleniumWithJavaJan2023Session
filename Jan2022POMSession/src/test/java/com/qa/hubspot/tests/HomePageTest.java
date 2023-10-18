package com.qa.hubspot.tests;

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

	@Test
	public void homePageTitleTest() {
		String title = homePage.getHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}

}
