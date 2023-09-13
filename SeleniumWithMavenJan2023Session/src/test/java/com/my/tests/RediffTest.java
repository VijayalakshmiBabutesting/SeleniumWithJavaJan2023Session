//Sep 5, 2023-P2
package com.my.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffTest extends BaseTest {

	public static String TITLE = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

	@Test(priority = 1)
	public void rediffTitleTest() {
		driver.get("https://www.rediff.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, RediffTest.TITLE);

	}

	@Test(priority = 2)
	public void rediffURLTest() {
		driver.get("https://www.rediff.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("rediff"));

	}

}
