//Mar 2-2023-P3
package ExceptionHandling;

public class TryCatchBlock2 {

	public static void main(String[] args) {

	System.out.println("Hello Testing");
	
	try
	{
	int i=9/0;
	}
	
	catch(Exception e)
	{
		System.out.println("some exception is coming...");
		System.out.println(e.getMessage());
		
	}
}

}
