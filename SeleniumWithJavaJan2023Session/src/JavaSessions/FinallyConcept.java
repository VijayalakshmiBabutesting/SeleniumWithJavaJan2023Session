//Mar 9-2023-p2

package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {

		
		//associated with try catch block
		//finally is a block - it will be executed all the time doesn't matter
		//if an exception is coming or not
		
		
		int p=10;
		
		try {
		
			System.out.println("1. This is before exception");
			System.out.println("DB Connection -- trying to establish");
			System.out.println("DB Connection -- is connected");
		int z=p/0;
		
		}catch(ArithmeticException e) {
			System.out.println("2. some exception is coming");
			
		}
		
		finally {
			System.out.println("3. executing finally block");
			System.out.println("flush/ close the connection");
			}
		
		System.out.println("------------------");
		
		
		int m=getMarks("Ali");
		System.out.println(m);
		
		
	}
	

	public static int getMarks(String name) {
		
		try {
		if(name.equals("Neha")) {
			return 100;
			
		}else if(name.equals("Shweta")) {
			return 95;
			
		}else if(name.equals("Ali")) {
			int i=9/0;
			return 90;
			
		}else {
			return -1;
		}
		}catch(Exception e) {
			return -2;
		}
		finally {
			System.out.println("Bye");
			//return -3;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
