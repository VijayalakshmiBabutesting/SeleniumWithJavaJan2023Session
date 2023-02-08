//Feb 6-2023-P1
package JavaSessions;

public class A {

	public static void main(String[] args) {

		System.out.println("A -- main method");
		B.main(args);//StackOverflowError
		
		
	}

}
