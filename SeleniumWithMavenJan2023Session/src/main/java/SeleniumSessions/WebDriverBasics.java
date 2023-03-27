//Mar 23-2023-p1
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//cmd+shift+O
		System.setProperty("webdriver.chrome.driver", "/Users/mchugh/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		//The path to the driver executable must be set by the 
		//webdriver.chrome.driver system property; for more information, 
		//see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. 
		//The latest version can be downloaded from
		//http://chromedriver.storage.googleapis.com/index.html
		
	}

}
