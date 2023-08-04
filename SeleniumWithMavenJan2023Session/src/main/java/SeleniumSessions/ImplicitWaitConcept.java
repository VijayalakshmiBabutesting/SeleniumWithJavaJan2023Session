//July 24, 2023 - P1
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com");

		// Implicitly wait -
		// dynamic wait
		// Its a global wait
		// Its for web elements only
		// Its not applicable for non web elements - url, title,alert

		// Thread.sleep(10000);// static
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("test@123");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("loginBtn")).click();
		// driver.getCurrentUrl();
		// driver.getTitle();

	}

}
