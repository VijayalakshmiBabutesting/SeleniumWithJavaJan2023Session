//June 6 2023, P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {
	static WebDriver driver;
	static final String SELECT_ALL_OPTIONS = "All";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox")).click();

//		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		System.out.println(choiceList.size());
//
//		for (int i = 0; i < choiceList.size(); i++)
//		{
//			String text = choiceList.get(i).getText();
//			System.out.println(text);
//
//			if (text.equals("choice 2"))
//			{
//				choiceList.get(i).click();
//				break;
//			}
//		}

		By choice_span = By.xpath("//span[@class='comboTreeItemTitle']");
		// single selection
		// selectChoiceFromDropDown(choice_span, "choice 7");
		// Multiple selection
		// selectChoiceFromDropDown(choice_span, "choice 6", "choice 2", "choice 6 2 3",
		// "choice 7");

		// All selection
		selectChoiceFromDropDown(choice_span, SELECT_ALL_OPTIONS);
		// element not interactable

	}

	public static void selectChoiceFromDropDown(By locator, String... value) {

		List<WebElement> choiceList = driver.findElements(locator);
		System.out.println(choiceList.size());

		if (!value[0].equalsIgnoreCase("all")) {

			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}

				}
			}

		} // select all the values:
		else {
			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {

			}
		}
	}

}
