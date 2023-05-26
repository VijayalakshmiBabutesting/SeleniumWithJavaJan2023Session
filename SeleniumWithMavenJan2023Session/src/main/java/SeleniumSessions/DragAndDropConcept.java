//May 23, 2023 -P2
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement targetElement = driver.findElement(By.id("droppable"));
		WebElement sourceElement = driver.findElement(By.id("draggable"));

		Thread.sleep(2000);
		Actions act = new Actions(driver);
		// act.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

		act.dragAndDrop(sourceElement, targetElement).perform();

	}

}
