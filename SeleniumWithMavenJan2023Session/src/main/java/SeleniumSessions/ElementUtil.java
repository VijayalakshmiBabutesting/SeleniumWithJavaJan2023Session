//April 13-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	/***
	 * 
	 * @param value
	 * @return the By locator
	 */
	public By getLocator(String value) {
		 return By.id(value);
	}
	/***
	 * 
	 * @param locator
	 * @returns a web element
	 */
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/***
	 * this function writes in a text box
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	/***
	 * this function clicks a web element
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}
	/***
	 * 
	 * @param locator
	 * @return this returns the text of a particular element
	 */
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	/***
	 * 
	 * @param locator
	 * @return true/false basis the display of the element or not.
	 */
	public  boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	
	
	
	
	
	
	
}
