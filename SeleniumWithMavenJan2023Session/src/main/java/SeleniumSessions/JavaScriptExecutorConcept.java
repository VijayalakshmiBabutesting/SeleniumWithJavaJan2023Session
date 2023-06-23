//June 22, 2023 - P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		Thread.sleep(2000);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

//		System.out.println(driver.getTitle());// selenium
//		String title = jsUtil.getTitleByJS();// by JS
//		System.out.println(title);

		// driver.navigate().refresh();// selenium
		// jsUtil.refreshBrowserByJS();//JS

		// System.out.println(driver.getPageSource());// selenium

		// System.out.println(jsUtil.getPageInnerText());// JS

		// By lnktext=By.linkText("Sign Up");
		WebElement signupLink = driver.findElement(By.linkText("Sign up"));
		// jsUtil.clickElementByJS(signupLink);//JS
		// driver.findElement(By.linkText("Sign up")).click(); //selenium

		// jsUtil.sendKeysUsingWithId("username", "manish");//js
		// driver.findElement(By.id("username")).sendKeys("manish");//selenium

		WebElement loginForm = driver.findElement(By.id("hs-login"));
		// jsUtil.drawBorder(signupLink);
		jsUtil.drawBorder(loginForm);

	}

}
