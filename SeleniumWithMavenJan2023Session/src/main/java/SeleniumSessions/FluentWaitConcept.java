//Aug 3, 2023-P2
package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		// Thread.sleep(2000);
		driver.get("https://app.hubspot.com");

		By emailId = By.id("username");
		By signUpLink = By.linkText("Sign up");

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(id_email));

//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
//				.ignoring(StaleElementReferenceException.class);
//
//		wait.until(ExpectedConditions.presenceOfElementLocated(emailId)).sendKeys("test@gmail.com");
//
		// waitForElementWithFluentWait(emailId, 5, 2).sendKeys("test@gmail.com");
		waitForElementWithFluentWait(signUpLink, 10, 2).click();
	}

	public static WebElement waitForElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

}
