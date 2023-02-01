//Jan 31-2023-P2
package JavaSessions;

public class EmpTest {

	String name;//default value is null
	int age;//default value is 0
	boolean status;// default value is false
	double salary;//default value is 0.0
	static String lastName;
	
	
	public static void main(String[] args) {
		
		final int total=100;//constant
		
		System.out.println(total);
		
		EmpTest e1=new EmpTest();
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.status);
		System.out.println(e1.salary);
		System.out.println(lastName);
		
		final int days=7;
		//days=10;
		System.out.println(100*days*200);
		
	}

}
