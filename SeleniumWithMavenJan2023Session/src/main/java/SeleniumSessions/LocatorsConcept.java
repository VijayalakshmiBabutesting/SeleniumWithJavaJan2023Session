//April 3-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(1000);
		
		//create the webelement + action(sendkeys, click)
		
		//1. id: unique locator
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2nd
//		WebElement email=driver.findElement(By.id("username"));
//		WebElement pwd=driver.findElement(By.id("password"));
//		WebElement loginButton=driver.findElement(By.id("loginBtn"));
//		
//		email.sendKeys("test@gmail.com");
//		pwd.sendKeys("test1231231");
//		loginButton.click();
//		
//		email.sendKeys("rest@gmail.com");
		
		//3rd
		
//		By email=By.id("username");
//		By pwd=By.id("password");
//		By loginButton=By.id("loginBtn");
//		
//		WebElement email_ele=driver.findElement(email);
//		WebElement pwd_ele=driver.findElement(pwd);
//		WebElement loginButton_ele=driver.findElement(loginButton);
//		
//		email_ele.sendKeys("test@gmail.com");
//		pwd_ele.sendKeys("test123m");
//		loginButton_ele.click();
		
		//4th 
//		getElement(email).sendKeys("test@gmail.com");
//		getElement(pwd).sendKeys("test123");
//		getElement(loginButton).click();
//		
		//5th
		
//		doSendKeys(email, "test@gmail.com");
//		doSendKeys(pwd, "test@123");
//		doClick(loginButton);
//		
		//6th 
	
		String email_id="username";
		String pwd_id="password";
		String loginButton_id="loginBtn";
		
		doSendKeys(getLocator(email_id), "test@gmail.com");
		doSendKeys(getLocator(pwd_id), "test123");
		doClick(getLocator(loginButton_id));
	}
	
	
	public static By getLocator(String value) {
		 return By.id(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
