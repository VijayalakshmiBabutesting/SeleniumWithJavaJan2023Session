//Feb 23-2023-P4
package OOP_Interface;

public class FortisHospital extends CentralizedHospital 
							implements USMedical, UKMedical, IndiaMedical{

	//US Medical
	@Override
	public void orthoServices() {

		System.out.println("FH---orthoServices");

	}

	@Override
	public void physioServices() {

		System.out.println("FH---physioServices");

	}

	@Override
	public void emergencyServices() {

		System.out.println("FH---emergencyServices");
	}


	@Override
	public void audiologyServices() {
		System.out.println("FH---audiologyServies");

	}
	//UK Medical
	@Override
	public void ENTServices() {

		System.out.println("FH---ENTServices");
	}

	@Override
	public void pediaServices() {

		System.out.println("FH---pediaServices");
	}

	//India Medical
	@Override
	public void oncologyervices() {
		System.out.println("FH---oncologyervices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");

	}

	@Override
	public void gyncServices() {
		System.out.println("FH---gyncServices");

	}

	// non-overridden methods
	
	public void OpdServices() {
		System.out.println("FH--gyncServices");
	}
	
	public void neuroServices() {
		System.out.println("FH--neuroServices");
	}
	//WHO
	@Override
	public void covidTest() {
		System.out.println("FH---covidTest");
		
	}

	@Override
	public void pandemicControl() {
		System.out.println("FH---pandemicControl");
		
	}
	
}
