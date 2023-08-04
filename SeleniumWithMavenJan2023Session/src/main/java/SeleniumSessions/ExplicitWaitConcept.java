//July 27, 2023 - P1
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		// ExplicitWait: -> concept/idea
		// 1. WebDriverWait extends FluentWait
		// 2. FluentWait
		// Both are implementing wait Interface

		// WebDriverWait is a class
		// its a dynamic wait
		// its a custom wait for a specific webelement
		// not a global wait
		// can be applied to non web elements also(url, title, alert)

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		WebDriverWait wait = new WebDriverWait(driver, 3, 500);// ->polling time(500 ms=.5s)
		wait.until(ExpectedConditions.titleIs("HubSpot Login"));

		// wait.until(ExpectedConditions.titleContains("Login"));

		System.out.println(driver.getTitle());

	}

}
