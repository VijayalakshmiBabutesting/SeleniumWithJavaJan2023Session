//Aug 29, 2023 - P1
package com.my.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static String TITLE = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");

	}

	@Test(priority = 1)
	public void amazonTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, AmazonTest.TITLE);

	}

	@Test(priority = 2)
	public void amazonURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));

	}

	@Test(priority = 3)
	public void mobilesLinkPresentTest() {
		// boolean b = driver.findElement(By.linkText("Mobiles")).isDisplayed();
		// Assert.assertTrue(b);
		Assert.assertTrue(driver.findElement(By.linkText("Mobiless")).isDisplayed());

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
