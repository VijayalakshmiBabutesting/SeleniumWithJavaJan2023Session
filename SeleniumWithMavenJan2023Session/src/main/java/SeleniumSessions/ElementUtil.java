//April 13-2023-P1
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

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
	 * @return this returns a list of web elements
	 */
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
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
	/***
	 * 
	 * @param tagName
	 * @return this returns the size of particular type of element type on a page
	 */
	public int getElementsCount(String tagName) {
		return driver.findElements(By.tagName(tagName)).size();
	}
	
	/***
	 * 
	 * @param tagName
	 * @param attributeName
	 * @returns the values of a particular attribute for a particular element type 
	 */
	public List<String> getAttributesList(String tagName, String attributeName) {
	
	List<String> attrList=new ArrayList<String>();
		List<WebElement> elementList=driver.findElements(By.tagName(tagName));
		for(WebElement e : elementList) {
			String text=e.getAttribute(attributeName);
			attrList.add(text);
	}
		
	return attrList;
	}
	
	/***
	 * This method clicks on an element from a list.
	 * @param locator
	 * @param linkText
	 */
	public void doClickFromList(By locator, String linkText) {
		
		List<WebElement> footerList=getElements(locator);
		
		for(int i=0; i<footerList.size(); i++) {
		String text=footerList.get(i).getText();
		System.out.println(text);
		if(text.equals(linkText)) {
			footerList.get(i).click();
			break;
			}			
		}
		
	}
	
}	
	
	
	
	
	
	
	

