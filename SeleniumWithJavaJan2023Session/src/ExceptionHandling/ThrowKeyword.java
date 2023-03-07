//Mar 6-2023-P2
package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("Hello Testing");
		
		try {
		throw new Exception("Some exception is coming..");
		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("Custom exception");
			
		}
		
		System.out.println("Custom exception handled");
	}

}
