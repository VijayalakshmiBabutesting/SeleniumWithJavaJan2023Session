//July 4, 2023 -P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/contacts");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("manishchugh1981@gmail.com");
		driver.findElement(By.name("password")).sendKeys("iloveU@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		String checkbox_xpath = "//a[text()='Tenveer Hussain']//parent::td//preceding-sibling::td//input[@type='checkbox' and @name='id']";
		// driver.findElement(By.xpath(checkbox_xpath)).click();

		WebElement ele = driver.findElement(By.xpath(checkbox_xpath));

		JavaScriptUtil js = new JavaScriptUtil(driver);
		js.clickElementByJS(ele);
	}
}
