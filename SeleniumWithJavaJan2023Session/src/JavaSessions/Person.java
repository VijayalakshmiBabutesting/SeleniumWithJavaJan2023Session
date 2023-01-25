//Jan 23-2023-P1
package JavaSessions;

public class Person {

	String name;
	int age;
	char gender;
	
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.name="Tom";
		p1.age=30;
		p1.gender='m';
		
		Person p2=new Person();
		p2.name="James";
		p2.age=32;
		p2.gender='m';
		
		Person p3=new Person();
		p3.name="Sara";
		p3.age=22;
		p3.gender='f';
		
		
		System.out.println(p1.name + " " + p1.age + " " + p1.gender);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender);
		System.out.println(p3.name + " " + p3.age + " " + p3.gender);
		
		System.out.println("------");
		p1=p2;
		p2=p3;
		
		System.out.println(p1.name + " " + p1.age + " " + p1.gender);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender);
		System.out.println(p3.name + " " + p3.age + " " + p3.gender);
		
		p3=p1;
		System.out.println("------");
		System.out.println(p1.name + " " + p1.age + " " + p1.gender);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender);
		System.out.println(p3.name + " " + p3.age + " " + p3.gender);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
