//Mar 23-2023-p1
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		//cmd+shift+O
		
		//windows
//		System.setProperty("webdriver.chrome.driver", "C:\\My Documents\\drivers\\chromedriver.exe");
//		
//		//Mac
//		System.setProperty("webdriver.chrome.driver", "/Users/mchugh/Downloads/chromedriver_mac64/chromedriver");
//		
		//Automation Steps
		//WebDriver driver=new WebDriver();// cant create the object of an interface
		
		//Top Casting
		//WebDriver driver=new ChromeDriver();// launch the chrome browser
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();//launch the Chrome browser
		//WebDriver driver=new FirefoxDriver(); //launch the FF browser
		driver.get("https://td.com/ca/en/personal-banking");//navigate to the URL
		String title=driver.getTitle();
		System.out.println(title);
		//System.out.println(driver.getTitle());
	
		// checkPoint/verification point:
		if(title.equals("TD Canada Trust - Personal, Small Business Banking & Investing")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
	
		//get the current url
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("personal-banking")) {
			System.out.println("url is correct");
		}
	
		//get the page source
		System.out.println(driver.getPageSource());
		
	}
	

}
