//Feb 2-2023-P3
package JavaSessions;

public class MainMethodOverloading {

	public static void main(String []x) 
	{
		System.out.println("Hello Manish");
		main(10, 80);
		login();
	}
	
	public static void main(int i) 
	{
		System.out.println(i);
	}
	public static void main(int i, int k) 
	{
		System.out.println(i+k);
	}
	public void main(int i, String k) 
	{
		System.out.println(i+k);
	}

	// can we overload static methods
	public static void login() {
		System.out.println("user logs in");
	}
	public static void login(long ph) {
		
	}
	public static void login(long ph, int otp) {
	
}
	
}
