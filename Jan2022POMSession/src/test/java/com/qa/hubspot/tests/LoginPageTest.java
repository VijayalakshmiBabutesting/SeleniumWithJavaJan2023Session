package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BaseTest;
import com.qa.hubspot.utils.Constants;

public class LoginPageTest extends BaseTest {

	// PASSED: loginTest
	// PASSED: verifyLoginPageTitleTest
	// PASSED: verifySignUpLinkTest

	// PASSED: verifyLoginPageTitleTest
	// PASSED: verifySignUpLinkTest
	// PASSED: loginTest

	// PASSED: verifySignUpLinkTest
	// PASSED: loginTest
	// PASSED: verifyLoginPageTitleTest

	@Test(priority = 3)
	public void verifyLoginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("Login page title is " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 1)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(loginPage.isSignUpLinkExist());

	}

	@Test(priority = 2)
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

}
