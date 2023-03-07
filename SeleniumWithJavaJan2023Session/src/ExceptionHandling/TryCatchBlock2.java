//Mar 2-2023-P3
package ExceptionHandling;

public class TryCatchBlock2 {
	
	String name="Tom";	
	public static void main(String[] args) {

		System.out.println("Hello Testing");
	
		TryCatchBlock2 obj=new TryCatchBlock2();
	
		obj=null;
		
		try {
			int i=9/3;//ArithmeticException
			System.out.println(obj.name);//NullPointerException
			}
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
		}
		catch(ArithmeticException e) {
			System.out.println("AME is coming");
		}
//		catch(Exception e) {
//			System.out.println("Exception is coming");
//		}
	
		System.out.println("after null pointer");
				
}

}
