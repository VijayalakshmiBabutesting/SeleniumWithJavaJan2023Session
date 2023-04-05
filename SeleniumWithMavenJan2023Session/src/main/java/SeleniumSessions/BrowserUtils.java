//April 4-2023-P1
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	WebDriver driver;
	
	/***
	 * 
	 * @param browserName
	 * @return this method returns driver
	 */
	public WebDriver init_driver(String browserName) {
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("safari")){
		driver=new SafariDriver();
		}
		
		else {
			System.out.println("please pass the correct browser" + browserName);
		}
		
		return driver;
		
	}
	/***
	 * This method launches a particular URL
	 * @param url
	 */
	public void launchURL(String url) {
		driver.get(url);
	}
	
	/***
	 * This method launches a particular URL using navigate method
	 * @param url
	 */
	public void navigateToURL(String url) {
		driver.navigate().to(url);
	}
	/***
	 * this method returns the page title
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	/***
	 * this method quits the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
	/***
	 * this method closes the browser
	 */
	public void closeBrowser() {
		driver.close();
	}
	
}
