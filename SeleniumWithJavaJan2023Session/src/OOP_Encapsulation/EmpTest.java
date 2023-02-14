//Feb 09-2023-P4
package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		//e1.name="Tom";
		e1.setName("Tom");
		System.out.println(e1.getName());
		
		Company c1=new Company();
		c1.setName("IBM");
		System.out.println(c1.getName());
		c1.getpolicyInfo();
	}
}
