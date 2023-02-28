//Feb 21-2023-p3
package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {

		BMW b=new BMW();
		b.stop();//inherited from Car
		b.refuel();//inherited from Car
		b.start();//Overridden method
		b.autoParking();//independent method of BMW
		BMW.wheels();//static methods
		b.engine();
		
		System.out.println("-------");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.wheels();//static methods
		c.engine();
		System.out.println("-------");
		
		
		//Top Casting
		Car c1=new BMW();//child class object referred by parent class reference variable
		c1.start();//overridden
		c1.stop();//inheritance
		c1.refuel();//inheritance
		//c1.autoparking();-->reference type check
		
		
		Vehicle v=new Vehicle();
		v.engine();
		
		
		Vehicle v1=new BMW();
		v1.engine();
		
	}

}
