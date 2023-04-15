//April 13-2023-P2
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLoginTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtils br=new BrowserUtils();
		WebDriver driver=br.init_driver("chrome");
		br.launchURL("https://app.hubspot.com/login");
		
		
		By email=By.id("username");
		By pwd=By.id("password");
		By loginButton=By.id("loginBtn");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(email, "manish@gmail.com");
		eleUtil.doSendKeys(pwd, "manish123");
		Thread.sleep(2000);
		eleUtil.doClick(loginButton);
		
		
	}

}
