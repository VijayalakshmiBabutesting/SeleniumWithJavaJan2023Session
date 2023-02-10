//Feb 09-2023-P1
package JavaSessions;

import java.util.ArrayList;

public class Product {

	String name;
	double price;
	String color;
	ArrayList<String> sellerList;
	
	public Product(String name, double price) {
		this.name=name;
		this.price=price;
	}
	public Product(String name, double price, String color) {	
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public Product(String name, double price, String color, ArrayList<String> sellerList) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerList = sellerList;
	}
	
}
