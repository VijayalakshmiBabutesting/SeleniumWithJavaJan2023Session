//May 9 2023, P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropDown {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

//		WebElement country_ele=driver.findElement(By.id("Form_getForm_Country"));
//		WebElement employee_list=driver.findElement(By.id("Form_getForm_NoOfEmployees"));
//		// drop down ->HTML TAG : select
//		// we have to use Select class in Selenium
//
//		Select select=new Select(country_ele);// pass the webelement ...
//		select.selectByVisibleText("Vatican City");
//		//select.selectByIndex(3);
//		//select.selectByValue("Vatican City");
//
//		Select select1=new Select(employee_list);
//		select1.selectByIndex(5);

		By country = By.id("Form_getForm_Country");
		By employees = By.id("Form_getForm_NoOfEmployees");

		doSelectDropDownByVisibleText(country, "India");
		doSelectDropDownByValue(employees, "701 - 800");
		doSelectDropDownByIndex(employees, 19);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
