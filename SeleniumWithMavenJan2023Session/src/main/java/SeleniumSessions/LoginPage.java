//April 4-2023-P2
package SeleniumSessions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtils br=new BrowserUtils();
		br.init_driver("safari");
		br.launchURL("https://www.makemytrip.com/");
		String title=br.getPageTitle();
		System.out.println(title);
		//System.out.println(br.getPageTitle());
		if(title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		Thread.sleep(3000);
		br.closeBrowser();
		//br.quitBrowser();
	}

}
