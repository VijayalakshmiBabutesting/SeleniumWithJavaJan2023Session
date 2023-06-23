//June 1, 2023 -P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		Thread.sleep(2000);
		driver.findElement(By.name("field-keywords")).sendKeys("purple");
		Thread.sleep(2000);
		List<WebElement> optionsList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"
				+ "/div/div/div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		System.out.println("Total options in the list are " + optionsList.size());

		// for each loop
		for (WebElement e : optionsList) {
			System.out.println(e.getText());
		}

		// driver.quit();
		driver.close();
	}
}
