//June 1, 2023 -P2
package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.linkText("Terms")).click();

		// set stores dynamic and unique

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		// The parent window id is 4318FBD2B5CC15AA289110642EA94E51
		String parentWindowId = it.next();
		System.out.println("The parent window id is " + parentWindowId);

		// The child window id is 68367713D646EF5CAA8D8FB13D9311A2
		String childWindowId = it.next();
		System.out.println("The child window id is " + childWindowId);

		Thread.sleep(2000);
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is " + driver.getTitle());
		driver.close();

		Thread.sleep(2000);
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is " + driver.getTitle());
		driver.quit();

//		The parent window id is B9DDBD5831888986F69CF0A4128E2F76
//		The child window id is 6CB7EEDC60F23564CC7581B069201FD6
//		child window title is Google Terms of Service – Privacy & Terms – Google
//		parent window title is Gmail
	}

}
