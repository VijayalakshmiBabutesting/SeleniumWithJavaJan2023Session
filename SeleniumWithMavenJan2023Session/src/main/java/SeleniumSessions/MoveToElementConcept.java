//May 23, 2023 -P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");

		Actions act = new Actions(driver); // pass driver in the constructor
		act.moveToElement(driver.findElement(By.className("menulink"))).perform();

		// build--> build the action
		// perform--> perform the action
		// if there is only one action we can use perform method only.
		Thread.sleep(2000);

		driver.findElement(By.linkText("COURSES")).click();
	}

}
