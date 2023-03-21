//Mar 20-2023-p1
package JavaSessions;

public class FinalizeMethodConcept {

	public static void main(String[] args) {

		String s=new String("Manish");
		
		FinalizeMethodConcept obj=new FinalizeMethodConcept();
		//obj=null;
		s=null;
		
		System.gc();//garbage collector
		System.out.println("Done");
		
	}
	
	//finalize is associated with System.gc();
	public void finalize() {
		System.out.println("this is my finalize method");
	}

}
