//Mar 30-2023-P3
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		WebElement firstName=driver.findElement(By.id("Form_getForm_FullName"));
		firstName.sendKeys("Manish Chugh");
		
		//StaleElementReferenceException: 
		//stale element reference: element is not attached to the page document
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		firstName=driver.findElement(By.id("Form_getForm_FullName"));
		
		firstName.sendKeys("Manish Chugh");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
