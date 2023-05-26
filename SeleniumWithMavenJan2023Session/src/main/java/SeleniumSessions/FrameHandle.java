//May 23, 2023 -P3
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text);

		// no such element: Unable to locate element:
		// {"method":"xpath","selector":"/html/body/h2"}

		driver.switchTo().defaultContent();// switches to web page
		driver.switchTo().parentFrame();// switches to the parent frame
	}

}
