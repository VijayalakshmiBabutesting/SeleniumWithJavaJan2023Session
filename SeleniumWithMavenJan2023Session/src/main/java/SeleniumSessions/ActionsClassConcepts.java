//May 29, 2023 -P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcepts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

//		driver.findElement(By.id("username")).sendKeys("manish@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123@");
//		driver.findElement(By.id("loginBtn")).click();

		By email = By.id("username");
		By pwd = By.id("password");
		By login = By.id("loginBtn");

		// WebElement email1=driver.findElement(By.id("username"));

		// Actions class
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(email), "manish@gmail.com").build().perform();
		action.sendKeys(driver.findElement(pwd), "test123@").build().perform();
		Thread.sleep(2000);
		// action.click(driver.findElement(login)).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

	}

}
