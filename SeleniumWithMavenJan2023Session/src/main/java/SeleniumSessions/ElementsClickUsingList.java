//May 8-2023, p1

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsClickUsingList {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//cntrl+shift+O
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
		
		By footerLinks=By.xpath("//ul[@class='sc-ace17a57-0 sc-37672556-0 kTjuIu PoUXa']/li/a");
//		
//		List<WebElement> footerList=driver.findElements(By.xpath("//ul[@class='sc-ace17a57-0 sc-37672556-0 kTjuIu PoUXa']/li/a"));
//	
//		for(int i=0; i<footerList.size(); i++) {
//		String text=footerList.get(i).getText();
//		System.out.println(text);
//		if(text.equals("Customers")) {
//			footerList.get(i).click();
//				break;
//			}			
//		}
		doClickFromList(footerLinks, "Freshworks Neo");
//		doClickFromList(footerLinks, "News");
//		doClickFromList(footerLinks, "About");
	}

	
	//Element is not clickable at point (130, 6303) -> Use JavaScriptExecutor instead Selenium.
	
	public static void doClickFromList(By locator, String linkText) {
		
		List<WebElement> footerList=driver.findElements(locator);
		
		for(int i=0; i<footerList.size(); i++) {
		String text=footerList.get(i).getText();
		System.out.println(text);
		if(text.equals(linkText)) {
			footerList.get(i).click();
				break;
			}			
		}
		
	}
}
		
	
	
	
	

