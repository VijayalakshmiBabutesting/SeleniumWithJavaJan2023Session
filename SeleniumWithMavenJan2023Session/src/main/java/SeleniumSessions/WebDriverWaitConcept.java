//July 27, 2023 - P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		// driver.findElement(By.id("username")).sendKeys("test@gmail.com");

		By id_email = By.id("username");
		By signUpLink = By.linkText("Sign up");

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//	WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(id_email));
//		email_ele.sendKeys("test@gmail.com");

		waitForElementToBeLoaded(id_email, 5).sendKeys("tesmgta@gmail.com");

		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();

		waitForElementToBeLoaded(signUpLink, 3).click();

	}

	public static WebElement waitForElementToBeLoaded(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
