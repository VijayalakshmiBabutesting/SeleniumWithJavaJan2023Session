//Feb 27-2023-P1
package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh=new FortisHospital();
		fh.orthoServices();
		fh.audiologyServices();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.physioServices();
		fh.neuroServices();
		fh.OpdServices();
		fh.pediaServices();
		fh.oncologyervices();
		fh.pathology();
		USMedical.minFee();
		System.out.println(USMedical.admission_fee);
		//USMedical.admission_fee=100;
		
		//USMedical us=new USMedical(); not possible
		
		//Top casting
		USMedical us=new FortisHospital();//child class object referred by parent interface variable
		us.orthoServices();
		us.audiologyServices();
		us.physioServices();
		us.emergencyServices();
		
		//us.neuroServices();reference check will fail
		
		
		
		
	}

}
