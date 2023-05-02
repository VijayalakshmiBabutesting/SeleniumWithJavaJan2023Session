//May 1, 2023 -P2
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		List<WebElement> imagesList=driver.findElements(By.tagName("img"));
		System.out.println(imagesList.size());
		
		for(WebElement e : imagesList) {
			String src=e.getAttribute("src");
			System.out.println(src);
		}
		
	}

}
