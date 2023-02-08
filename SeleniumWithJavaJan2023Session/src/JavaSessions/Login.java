//Feb 6-2023-P3
package JavaSessions;

public class Login {

	public static void main(String[] args) 
	{
		Login obj=new Login();
		obj.addToCart();
		obj.profile();
		test();
		Login.price();
		
	}
	
	public void login() {
		profile();
	}
	
	public void profile() {
		addToCart();
	}
	public void search() {
		payment();
		price();
		
	}
	public void addToCart() {
		
	}
	public void payment() {
		
	}
	public static void test() {
		price();
		//payment();
	}
	public static void price() {
		test();
	}

}
