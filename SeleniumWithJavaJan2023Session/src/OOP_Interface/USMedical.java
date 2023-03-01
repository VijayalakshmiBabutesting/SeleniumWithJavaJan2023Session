//Feb 23-2023-P1
package OOP_Interface;

public interface USMedical extends WHO {
	
	int admission_fee=50;
	
	//No method body
	//only method declaration --method prototype
	//cannot create the object of an interface
	//by default interface variables are static and final

	public void orthoServices();//abstract methods
	
	public void physioServices();
	
	public void emergencyServices();
	
	public void audiologyServices();
	
	//static
	public static void minFee() {
		System.out.println("Min fee is 10 USD");
	}
	
	
	
}
