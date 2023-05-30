//May 25, 2023 -P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		// By rightClickButton=By.xpath("//span[text()='right click me']");
		// WebElement rightClickButto=driver.findElement(rightClickButton);

		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);
		act.contextClick(rightClickButton).build().perform();

		List<WebElement> optionsList = driver
				.findElements(By.xpath("//ul/li[contains(@class, 'context-menu-item context-menu-icon')]"));
		// int size=optionsList.size();
		// System.out.println(size);
		System.out.println(optionsList.size());

		// for loop
//		for (int i = 0; i < optionsList.size(); i++) {
//			String text = optionsList.get(i).getText();
//			System.out.println(text);

//		}
		System.out.println("------------------");
		// for each
		for (WebElement e : optionsList) {
			// System.out.println(e.getText());
			String texts = e.getText();
			System.out.println(texts);

			if (texts.equals("Copy")) {
				e.click();
				break;
			}

		}
	}

}
