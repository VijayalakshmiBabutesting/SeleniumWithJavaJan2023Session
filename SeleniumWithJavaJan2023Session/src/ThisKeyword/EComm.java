//Mar 7-2023-P1
package ThisKeyword;

public class EComm {

	// Builder pattern using this keyword
	public EComm login(String un, String pwd) {
		System.out.println("Login with : " + un +" "+ pwd);
		return this;// this -> returns the current class object
	}
	
	public EComm search(String productName) {
		System.out.println("search :" +productName);
		return this;
	}
	
	public EComm search(String productName, int price) {
		System.out.println("search : " +productName +"" +price);
		return this;
	}
	
	public EComm addToCart(String productName) {
		System.out.println("Adding to the cart " +productName);
		return this;
	}
	public EComm checkOut(String productName) {
		System.out.println("Check out this product " +productName);
		return this;
	}
	
	public EComm doPayment(String CC, int pwd) {
		System.out.println("payment is done using " + CC + "and pwd : " + pwd);
		return this;
	}
	
	public EComm generateOrder(String productName) {
		System.out.println("Your order id is " +12345 + "for this product"+productName);
		return this;
	}
}
