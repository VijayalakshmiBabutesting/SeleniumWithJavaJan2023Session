//Feb 09-2023-P3
package OOP_Encapsulation;

public class Employee {
	//data members -> (non static) class variables + class methods
	//data hiding -Encapsulation
	//hiding the private data members of class and give access via public getter and setter methods
	private String name;
	private int id;
	private int age;
	private double salary;
	
	//getter and setter methods: (public methods)
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
