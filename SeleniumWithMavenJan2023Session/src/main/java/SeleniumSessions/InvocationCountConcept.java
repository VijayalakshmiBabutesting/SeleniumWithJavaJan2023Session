//Aug 28, 2023 - P4
package SeleniumSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10)
	public void createUserTest() {
		System.out.println("create user test");
	}

}
