//Aug 28, 2023 - P1
package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityTestCases {
//the test cases which don't have any priority mentioned will be executed
//first in the default(alphabetical) order.
	@Test
	public void aTest() {
		System.out.println("a test");
	}

	@Test
	public void bTest() {
		System.out.println("b test");
	}

	@Test(priority = 3)
	public void cTest() {
		System.out.println("c test");
	}

	@Test(priority = 2)
	public void dTest() {
		System.out.println("d test");
	}

	@Test(priority = 1)
	public void eTest() {
		System.out.println("e test");
	}

}
