//May 18, 2023 -P1
package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Thread.sleep(2000);

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();// switches to alert
		String text = alert.getText();
		System.out.println(text);

		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct text");
		}

		// alert.accept();//accept
		alert.dismiss();

		driver.switchTo().defaultContent();// switches to web page

	}

}
