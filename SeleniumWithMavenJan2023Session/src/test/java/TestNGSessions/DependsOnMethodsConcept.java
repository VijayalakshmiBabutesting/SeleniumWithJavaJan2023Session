//Aug 28, 2023 - P2
package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void loginTest() {
		System.out.println("loginTest");
		int i = 9 / 0;

	}

	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}

	@Test
	public void homePageUserInfoTest() {
		System.out.println("homePageUserInfoTest");
	}
}
