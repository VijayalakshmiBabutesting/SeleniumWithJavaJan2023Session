//Feb 09-2023-p@
package JavaSessions;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {

		Product p1=new Product("Nike Shoes", 5000);
		System.out.println(p1.name+" "+p1.price);
		
		ArrayList<String> appleSellerList=new ArrayList<String>();
		appleSellerList.add("Neon Enterprise");
		appleSellerList.add("Delta Infotech");
		appleSellerList.add("Ali IT Store");
		
		Product p2=new Product("Apple Macbook",2300,"White", appleSellerList );
		System.out.println(p2.name+" "+p2.price+ " "+p2.color +" "+p2.sellerList);
		System.out.println(appleSellerList.get(1));
		
		for(String ele : p2.sellerList) {
			System.out.println(ele);
		}
		
	}

}
