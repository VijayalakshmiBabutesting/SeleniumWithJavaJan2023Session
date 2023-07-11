//June 27, 2023 - P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.className("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.tagName("")).click();
		driver.findElement(By.partialLinkText("")).click();
		driver.findElement(By.cssSelector("")).sendKeys("");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys();
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"))
				.sendKeys("manish");
		driver.findElement(By.className("login-email")).sendKeys("manish");

		// 1. Absolute Xpath : html/body/div/div[2]/div[3]/form/div/a
		// 2. Relative Xpath :

		// Formula = //HTMLtag[@attr='value']
		// input[@id='username']

		// Formula =//HTMLtag[@attr1='value' and @attr2='value']
		// input[@id='username' and @type='email']

		// button[@id='loginBtn']
		// button[@id='loginBtn' and @type='submit']

		// input[@class='form-control private-form__control login-email']
		// a[@href='https://legal.hubspot.com/privacy-policy']
		// a[@target='_blank']

		// text():
		// Formula = //HTMLtag[text()='textvalue']
		// a[text()='Sign Up']
		// h2[text()='Happy customers. Energized employees. That’s impact.']

		// contains(): --> very important
		// Formula= //HTMLtag[contains(@id,'value')]
		// input[contains(@id,'username')]
		// input[contains(@id,'user')]
		// input[contains(@id,'name')]

		// dyanmic ID: //input[contains(@id, 'test_123')]
		// <input id = test_123>
		// <input id = test_345>
		// <input id = test_789>

		// input[contains(@id, 'test_')]
		// input[contains(@id, 'test')]

		// contains() with text()
		// HTMLtag[contains(text(), 'textvalue')]
		// span[contains(text(), 'Trusted by 60,000+ businesses of all sizes')]
		// span[contains(text(), 'Trusted by 60,000+ businesses')]
		// span[contains(text(), 'Trusted by 60,000+ ')]
		// span[contains(text(), '60,000+ businesses')]

		// a[contains(text(), 'Sign Up')]
		// a[contains(text(), ' Up')]
		// a[contains(text(), 'Up')]

		// input[@type='submit' and @value='Login']
		// input[@type='submit']
		// input[contains(@type, 'submit') and @value='Login']
		// input[contains(@type, 'submit') and contains(@value,'Login')]

		// a[@href='https://classic.freecrm.com/register/' and contains(text(),'Sign
		// Up')]

		// starts-with
		// input[starts-with(@id, 'username')]
		// input[starts-with(@id, 'user')]
		// input[starts-with(@id, 'name')] -> incorrect

		// parent to child:

		// direct child:
		// //div[@class='private-form__input-wrapper']/input[@id='username']
		// div/div - 16(only direct child)

		// indirect child
		// div//div - 26 (direct+Indirect)

		// child to parent:
		// backward traversing in xpath
		// input[@id='username']/..
		// input[@id='username']/../../../../../../../../../..
		// input[@id='username']//parent::div

	}

}
