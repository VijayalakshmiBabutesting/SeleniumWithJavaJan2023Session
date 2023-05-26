//May 15 2023, P1
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownFeatures {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		// WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");

//		Select select=new Select(driver.findElement(country));
//
//		List<WebElement> countryOptionsList=select.getOptions();
//
//		System.out.println(countryOptionsList.size());//233
//
//		//for loop
//		for(int i=0; i<countryOptionsList.size(); i++) {
//			System.out.println(countryOptionsList.get(i).getText());
//		}
//
//		//for each loop
//		for(WebElement e : countryOptionsList) {
//			System.out.println(e.getText());
//		}

//		System.out.println("total values in the country dropdown is" +doGetDropDownOptions(country).size());
//		System.out.println("values in the drop down are" + doGetDropDownOptions(country));

		List<String> countryList = doGetDropDownOptions(country);
		System.out.println("total values in the country dropdown is " + countryList.size());
//		System.out.println(countryList);

		// for each

		for (String e : countryList) {
			System.out.println(e);
		}

		List<String> employeeList = doGetDropDownOptions(employee);
		System.out.println("total values in the employee dropdown is " + employeeList.size());
//		System.out.println(employeeList);

		for (String e : employeeList) {
			System.out.println(e);
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> doGetDropDownOptions(By locator) {

		List<String> optionsValueList = new ArrayList<String>();

		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			optionsValueList.add(e.getText());
		}

		return optionsValueList;
	}

}
