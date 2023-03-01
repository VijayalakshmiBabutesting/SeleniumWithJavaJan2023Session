//Feb 28-2023-P3
package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp=new LoginPage();
		lp.title();//overridden
		lp.url();//overridden
		lp.timeOut();//inherited
		Page.logo();//static method
		lp.forgotPwd();//independent method
		
		//Page p=new Page();--> not possible
		
		// Top casting
		Page p=new LoginPage();// child class object referred by parent class ref variable
		p.title();
		p.url();
		p.timeOut();
		//p.forgotPwd(); -> reference type check fails
		
		
		
		
		
	}

}
