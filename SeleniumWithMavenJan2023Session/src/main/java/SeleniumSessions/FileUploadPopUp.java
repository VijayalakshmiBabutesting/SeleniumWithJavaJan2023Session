//May 18, 2023 -P2
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// type=file
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(2000);

		WebElement chooseFile = driver.findElement(By.name("upfile"));// don't click the element
		chooseFile.sendKeys("/Users/mchugh/Desktop/Tracker.xlsx");// path of the file
	}

}
