//Aug 17 2023,p1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Depart' and @type='text']")).click();

		// start date
		List<WebElement> startDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class, 'day')]"));

		for (WebElement e : startDateList) {
			if (e.getText().equals("23")) {
				e.click();
				break;
			}

		}

		driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();

		String monthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();// sep 2023

		while (!monthValue.equals("December 2023")) {
			driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[2]")).click();
			monthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();// dec
		}

		Thread.sleep(2000);
		// end date
		List<WebElement> endDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[4]/table//div[contains(@class, 'day')]"));

		for (WebElement e : endDateList) {
			if (e.getText().equals("20")) {
				e.click();
				break;
			}

		}

	}

}
