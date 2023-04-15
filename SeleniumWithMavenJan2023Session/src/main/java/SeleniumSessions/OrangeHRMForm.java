//Mar 30-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMForm {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		driver.getTitle();
		WebElement firstName=driver.findElement(By.id("Form_getForm_FullName"));
		firstName.sendKeys("Manish Chugh");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("687 323 2342");
		
		WebElement OrangeHRMLink=driver.findElement(By.linkText("OrangeHRM"));
		OrangeHRMLink.click();
		
	}

}
