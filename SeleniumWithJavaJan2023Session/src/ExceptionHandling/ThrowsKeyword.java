//Mar 6-2023-P1
package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) 
	{
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.m1();
	}

	public void m1() 
	{
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() 
	{
		System.out.println("m2 method");
		
		m3();
		
	}
	
	public void m3() 
	{
		System.out.println("m3 method");
		try {
		int i=9/0;
		}catch(ArithmeticException e) {
			System.out.println("AME is coming");
		}
	}

	
}
