//Feb 28-2023-P1
package OOP_Abstract;

public abstract class Page {
	
	// Can't create the object of an abstract class
	// may or may not have abstarct methods
	// Can I create the constructor of page class? --YES
	
	public Page() {
		System.out.println("Page Constructor");
		
	}
	
	public abstract void title();//asbtract method
	public abstract void url();
	
	//can have non abstract method --yes
	
	public void timeOut() {
		System.out.println("Page--time out");
	}
	
	//static methods
	public static void logo() {
		System.out.println("Page--Logo");
	}

}
