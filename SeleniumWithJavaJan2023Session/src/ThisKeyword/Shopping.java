//Mar 7-2023-P2
package ThisKeyword;

public class Shopping {

	public static void main(String[] args) {
		
		EComm e1=new EComm();
		e1
		.login("manish@123", "manish123")
		.search("Apple Macbook")
		.addToCart("Apple Macbook")
		.checkOut("Apple Macbook")
		.doPayment("3433 3434 2454 4534", 123)
		.generateOrder("Apple Macbook");
		
		System.out.println("-------------");

		e1
		.login("manish@123", "manish123")
		.addToCart("Nike Shoes")
		.doPayment("2342 2343 3433 3433", 4334)
		.generateOrder("Nike Shoes");
		
		System.out.println("-------------");
		
		e1
		.addToCart("Rayban")
		.doPayment("2342 2343 3433 3433", 4334)
		.generateOrder("Rayban");
		
		
	}

}
