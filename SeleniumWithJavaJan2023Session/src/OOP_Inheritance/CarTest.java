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
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.wheels();//static methods
		c.engine();
		
		
	}

}
