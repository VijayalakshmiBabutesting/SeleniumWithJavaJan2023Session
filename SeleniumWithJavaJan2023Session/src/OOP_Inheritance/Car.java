//Feb 21-2023-p1
package OOP_Inheritance;

public class Car extends Vehicle{


	public  void start()
	{
		System.out.println("Car---starts");
	}
	
	public String price() {
		System.out.println("Car---price");
		return "car price";
		
	}
	public void stop()
	{
		System.out.println("Car---stops");
	}
	
	public void refuel()
	{
		System.out.println("Car---refuels");
	}

	public static void wheels() {
		System.out.println("Car---wheels");
	}
	
}
