//Aug 28, 2023 - P3
package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;

	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void loginTest() {
		System.out.println("loginTest");
		// int i = 9 / 0;

		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		obj.name = "Manish"; // -> this will throw exception

		// System.out.println("Bye");
	}

}
