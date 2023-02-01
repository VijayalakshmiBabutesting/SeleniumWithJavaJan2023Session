//Jan 31-2023-P1
package JavaSessions;

public class CarDesign 
{
	//Global variables
	String name;
	int price;
	String model;
	static int wheels;
	
	public void start() 
	{
		System.out.println("Car starts");
	}
	
	public void stop() 
	{
		System.out.println("Car stops");
	}
	
	static public void run() 
	{
		System.out.println("Car runs");
	}
	
	public static void main(String[] args) 
	{
		//static int i=10;-> local variable cant be declared as static
	
		//how to call static members - variables+methods
		//1. call them directly, no need to create the object
		wheels=4;
		System.out.println(wheels);
		run();
		
		//2. call by class name:
		CarDesign.wheels=5;
		System.out.println(wheels);
		CarDesign.run();
		
		CarDesign c1=new CarDesign();
		c1.name="BMW";
		c1.model="320x";
		c1.price=75000;
		//c1.wheels=4--> not recommended
		c1.start();
		c1.stop();
		//c1.run();-> not recommended
		
		System.out.println(c1.name + " " +c1.price + " " + c1.model + " " + CarDesign.wheels);
		

	}

}
