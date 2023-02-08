//Feb 6-2023-P4
package JavaSessions;

public class ConstructorConcept {
//class variables
	String name;
	int age;
	int empId;
	double salary;
	boolean isPermanent;
	char gender;
	
	//Constructor of the class:
	//looks like a function, but it is not a function
	//constructor name will be same as class name
	//a function may or may not return a value but a constructor will never return a value
	//no return and void keywords in constructor
	//can overload the constructors
	//Constructor will be called when we create the object of the class
	
	
	public ConstructorConcept() {// this is a default constructor  or 0 parameter constructor
		System.out.println("default constructor");
		System.out.println("Hello constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("1 parameter constructor");
		
	}
	
	public ConstructorConcept(int i, String p) {// this is a default constructor or 0 parameter constructor
		System.out.println("2 parameter constructor");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		//Constructor will be called when we create the object of the class
		ConstructorConcept cc=new ConstructorConcept();
		ConstructorConcept cc1=new ConstructorConcept(10);
		ConstructorConcept cc2=new ConstructorConcept();
		ConstructorConcept cc3=new ConstructorConcept(10, "testing");
		
	}

}
