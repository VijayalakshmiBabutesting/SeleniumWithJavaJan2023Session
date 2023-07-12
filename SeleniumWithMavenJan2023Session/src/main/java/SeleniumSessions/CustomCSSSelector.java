//July 10, 2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Formula
		// id --> #{id value}
		// class --> .classname (.c1.c2.c3..)

		// #username
		// .form-control.private-form__control.login-email

		// .form-control.private-form__control.login-password.m-bottom-3

		// .login-email
		// .login-password
		// #username.login-email
		// .login-email#username
		// .form-control.private-form__control.login-email#username
		// #username.form-control.private-form__control.login-email

		// input#username
		// input.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username
		// input#username.form-control.private-form__control.login-email

		// By.cssSelector(".form-control.private-form__control.login-email");
		// By.className("form-control private-form__control login-email"); -->wrong
		// By.xpath("//input[@class='form-control private-form__control login-email']");

		// input[@id='username'] -xpath
		// HTMLtag[@attr='value']-xpath

		// Formaula
		// HTMLtag[attr='value']
		// input[id='username']

		// By.cssSelector("input[id='username']");
		// input[id='username'][type='email']

		// parent to child
		// .private-form__input-wrapper input[id='username']
		// div.private-form__input-wrapper input[id='username']
		// div.private-form__input-wrapper > input[id='username']
		// .private-form__input-wrapper > [id='username']
		// .private-form__input-wrapper > #username

		// child to parent : not possible
		// child to ancestor : not possible
		// backward traversing is not possible in CSSSelector

		// id="test_1234"
		// id="test_2345"

		// input[id*=test_] ->contains
		// input[id*=test]
		// input[id*='username']
		// input[id*='user']
		// input[id*='ser']
		// input[id*='name']

		// input[id^='username'] -> starts with
		// input[id^='usern']
		// input[id^='name'] -> not correct

		// input[id$='username'] -> ends with
		// input[id$='rname']

		// comma in css:
		// input#username, input#password, button#loginBtn

		int loginPageMandatoryItems = driver
				.findElements(By.cssSelector("input#username, input#password, button#loginBtn")).size();
		if (loginPageMandatoryItems == 3) {
			System.out.println("all mandatory elements are present");
		} else {
			System.out.println("");
		}

		// nth-of-type
		// ul.sc-ace17a57-0.sc-4f15dcd9-0.kTjuIu.gkmXaP li:nth-of-type(3)
		// ul.sc-ace17a57-0.sc-4f15dcd9-0.kTjuIu.gkmXaP li:nth-of-type(n)

	}

}
