//Feb 13-2023-P2
package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowserVersion();
		checkBrowserOSVersion();
		interactWithOSServices();
		checkRAMSpace();
		System.out.println("chrome browser is launched");
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	
	private void checkBrowserOSVersion() {
		System.out.println("checkBrowserOSVersion");
	}
	
	private void interactWithOSServices() {
		System.out.println("interactWithOSServices");
	
	}
	
	private void checkRAMSpace() {
		System.out.println("check RAM space....");
	}
}
