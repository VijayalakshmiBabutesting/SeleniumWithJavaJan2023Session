//Feb 7-2023-p1
package JavaSessions;

public class Persons {
	// class variables or global variables
	
	String name;//default value is null
	int age;//default value is 0
	double salary;//default value is 0.0
	boolean isPermanent;////default value is false
	char gender;//default value is blank
	
	//Constructors is used to initialize the class variables
	public Persons() {
		System.out.println("Hello Persons");
	}
	
	public Persons(String name) {
		this.name = name;
	}

	public Persons(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public Persons(String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public Persons(String name, int age, double salary, boolean isPermanent) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
	}
	
	public Persons(String name, int age, double salary, boolean isPermanent, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}
	public static void main(String[] args) {
		
		Persons p1=new Persons("Nikita", 25);
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Persons p2=new Persons("Supriya", 22, 45.55);
		System.out.println(p2.name+" "+p2.age + " " +p2.salary);
		
		Persons p3=new Persons("Anu", 24, 23.44, false, 'f');
		System.out.println(p3.name +" " +p3.age + " "+p3.gender+""+p3.isPermanent+""+p3.salary );
		
	}
}
