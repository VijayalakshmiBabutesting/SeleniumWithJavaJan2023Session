////April 18-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		//1. id: unique
		//2. name: not unique
		
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		
		//3. className : not unique
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.className("form-control private-form__control login-email"))
		//								.sendKeys("test@gmail.com");
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		//4. xpath : is not an attribute. its a locator(address of an element in the DOM)
		
		//driver.findElement(By.xpath("//*[@id=\"username"]")).sendKeys("test@gmail.com");
		
		//5. CSS Selector : is not an attribute. its a locator(address of an element in the DOM)
		
		//driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
		
		//6. linkText: only for links : having <a> html tag
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText : only for links 
		//driver.findElement(By.partialLinkText("Sign u")).click();
		
		//8. tagName
		String h2_text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(h2_text);
		
		System.out.println(driver.findElement(By.tagName("h1")).getText());
	}

}
