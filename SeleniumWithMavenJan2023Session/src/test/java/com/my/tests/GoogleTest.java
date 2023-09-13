//Sep 5, 2023-P1
package com.my.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	public static String TITLE = "Google";

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, GoogleTest.TITLE);

	}

	@Test(priority = 2)
	public void googleURLTest() {
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));

	}

}
