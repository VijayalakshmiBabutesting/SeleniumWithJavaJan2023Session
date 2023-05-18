//May 16,2023-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownValueWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {

		// Dropdown HTML Tag is : select
		// But do not use Select class from selenium

		By country = By.xpath("//select[@id='Form_getForm_Country']/option");

//		List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		System.out.println("Total elements in the drop down is " + countryList.size());
//		// for each loop
//		for (WebElement e : countryList) {
//			// System.out.println(e.getText());
//			String text = e.getText();
//			// System.out.println(text);
//
//			if (text.equals("Vatican City")) {
//				e.click();
//				break;
//			}
//		}

		selectDropDownValueWithoutSelectClass(country, "Yemen");
	}

	public static void selectDropDownValueWithoutSelectClass(By locator, String value) {
		List<WebElement> countryList = driver.findElements(locator);

		for (WebElement e : countryList) {
			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

}
