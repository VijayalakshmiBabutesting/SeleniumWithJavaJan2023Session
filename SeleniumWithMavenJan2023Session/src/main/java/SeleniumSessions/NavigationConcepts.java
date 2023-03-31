//Mar 30-2023-P2
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.amazon.ca");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.navigate().refresh();
	
	}
	

}
