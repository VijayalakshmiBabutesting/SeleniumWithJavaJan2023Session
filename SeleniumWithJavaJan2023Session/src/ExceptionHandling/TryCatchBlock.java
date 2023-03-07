//Mar 2-2023-P2
package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		int k=10/0;
		
		try {
		System.out.println("Hello");
		int i=9/3;
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		}
		catch(ArithmeticException e)
		{
			System.out.println("some exception is coming...Bye");
			//e.printStackTrace();
			//java.lang.ArithmeticException: / by zero
			//at ExceptionHandling.TryCatchBlock.main(TryCatchBlock.java:14)
			//System.out.println(e.getMessage());
			// / by zero
		}
		System.out.println("Hi");
		System.out.println("Hi");
		
	}

}
