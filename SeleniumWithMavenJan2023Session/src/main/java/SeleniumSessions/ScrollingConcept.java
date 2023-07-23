//July 20, 2023 - P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/");

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		// jsUtil.scrollPageDown();
		// jsUtil.scrollPageDown("800");
		Thread.sleep(4000);
		// jsUtil.scrollPageUp();

		WebElement BackUpHeader = driver.findElement(By.xpath("//h3[text()='Backup & Security']"));

		jsUtil.scrollIntoView(BackUpHeader);

	}

}
