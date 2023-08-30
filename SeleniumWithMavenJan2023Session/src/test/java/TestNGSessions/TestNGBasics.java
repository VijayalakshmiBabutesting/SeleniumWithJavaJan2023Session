//Aug 22, 2023 - P1
package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	// TestNG -> Test Next Generation (a unit test framework)
	// is used to design, maintain and run the test cases
	// Annotations : to write the test steps and test cases

	// Pre condition --> Test case steps(Actual vs Expected Result) --> Post steps
	// launch chrome --> enter the url(google vs google) --> close the browser

//	Before Suite -- connect with DB
//	Before Test -- create user in db
//	Before Class -- launch browser and url
//		Before Method -- login to App
//		T1-	checkUserIsActiveTest
//		After Method -- log out
//			Before Method -- login to App
//			T2-checkUserProfile
//			After Method -- log out
//				Before Method -- login to App
//				T3-getUserInfoTest
//				After Method -- log out
//	After Class -- close browser
//	After Test -- delete user in db
//	After Suite -- disconnect DB

	@BeforeSuite
	public void connectDB() {
		System.out.println("Before Suite -- connect with DB");
	}

	@BeforeTest
	public void createUserInDB() {
		System.out.println("Before Test -- create user in db");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class -- launch browser and url");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("Before Method -- login to App");
	}

	@Test
	public void getUserInfoTest() {
		System.out.println("getUserInfoTest");
	}

	@Test
	public void checkUserIsActiveTest() {
		System.out.println("checkUserIsActiveTest");
	}

	@Test
	public void checkUserProfile() {
		System.out.println("checkUserProfile");
	}

	@AfterMethod
	public void loginOut() {
		System.out.println("After Method -- log out");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class -- close browser ");
	}

	@AfterTest
	public void deleteUserFromDB() {
		System.out.println("After Test -- delete user in db");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("After Suite -- disconnect DB");
	}

}
