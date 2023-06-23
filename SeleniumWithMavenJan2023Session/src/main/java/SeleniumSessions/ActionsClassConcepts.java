//May 29, 2023 -P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

//		driver.findElement(By.id("username")).sendKeys("manish@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123@");
//		driver.findElement(By.id("loginBtn")).click();

		// By locators
		By email = By.id("username");
		By pwd = By.id("password");
		By login = By.id("loginBtn");

		// WebElement email1=driver.findElement(By.id("username"));

		// Actions class
		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(email), "manish@gmail.com").build().perform();
//		action.sendKeys(driver.findElement(pwd), "test123@").build().perform();
//		Thread.sleep(2000);
//		// action.click(driver.findElement(login)).build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();

		doActionsSendKeys(email, "manish@gmail.com");
		doActionsSendKeys(pwd, "test@123");
		doActionsClick(login);

		// action.doubleClick(); //Performs a double-click at the current mouse
		// location.
		// action.doubleClick(WebElement);//Performs a double-click at middle of the
		// given element.

		action.moveToElement(driver.findElement(email)).sendKeys("manish@gmail.com").build().perform();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).build().perform();
	}

	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}

	public static void doActionsSendKeysWithMoveToElement(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}

	public static void doActionsClickWithMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click().build().perform();

	}

}
