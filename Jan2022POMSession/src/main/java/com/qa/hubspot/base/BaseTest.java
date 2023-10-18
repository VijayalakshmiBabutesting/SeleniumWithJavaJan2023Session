package com.qa.hubspot.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class BaseTest {

	public BasePage basePage;
	public LoginPage loginPage;
	public HomePage homePage;
	public Properties prop;
	public WebDriver driver;

	@BeforeTest
	public void setUp() {

		basePage = new BasePage();
		prop = basePage.init_prop();
		String browser = prop.getProperty("browser");
		driver = basePage.init_driver(browser); // chrome or firefox
		loginPage = new LoginPage(driver);
		driver.get(prop.getProperty("url"));// login page
		// cant write code here to login so that the user is able to navigate to the
		// homepage
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
