//Feb 21-2023-p2
package OOP_Inheritance;

public class BMW extends Car{
//Method Overriding:
//When you have a method in parent class with the same name and 
//same number of parameters	also available in the child class--- it is called
//method overriding
//static methods can't be overridden
	
	
	@Override
	public void start() {
		System.out.println("BMW---starts");
	}
	
	
	public void autoParking() {
		System.out.println("BMW---auto parking");
	}
	@Override
	public String price() 
	{
		System.out.println("BMW---price");
		return "BMW price";
		
	}

	public static void wheels() {
		System.out.println("BMW---wheels");
	}
	
}
