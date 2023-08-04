//Aug 3, 2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForURLConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://amazon.in");
		driver.findElement(By.linkText("About Us")).click();

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		boolean b = wait.until(ExpectedConditions.urlContains("aboutamazon"));
		boolean b = waitForURL("aboutamazon", 5);
		System.out.println(b);
		System.out.println(driver.getCurrentUrl());

		// Expected condition failed: waiting for url to contain "aboutamazon".
		// Current url: "https://www.amazon.in/" (tried for 2 second(s) with 500
		// milliseconds interval)
	}

	public static Boolean waitForURL(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlValue));
	}

}
