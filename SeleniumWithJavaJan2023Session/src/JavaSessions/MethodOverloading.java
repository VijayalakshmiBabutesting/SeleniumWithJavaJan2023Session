//Feb 2-2023-P1
package JavaSessions;

public class MethodOverloading 
{	
	//Method Overloading: is a type of Polymorphism - Poly+morphism
	//Within same class, when you have different methods with:
	//1. same name
	//2. having different parameters
	//3. the sequence of the parameters is different
	
	// compile time polymorphism
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.test(10, 20);
		obj.test("Manish", 5);
		
	}
	public void test() 
	{
		System.out.println("test method");
	}
	public void test(int i) 
	{
		System.out.println(i);
	}
	public void test(int k, int p) 
	{
		System.out.println(k+p);
	}
	public void test(int k, String p) 
	{
		System.out.println(k+p);
	}
	public void test(String p, int k) 
	{
		System.out.println(p+k);
	}
	

}
