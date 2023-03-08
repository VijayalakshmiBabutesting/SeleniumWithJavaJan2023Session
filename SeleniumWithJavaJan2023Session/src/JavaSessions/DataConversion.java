//Mar 7-2023-P3

package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String to int:
		String x="100";
		System.out.println(x+20);//10020
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);//120
		
		
		//String amount ="1000";
		
		//String to double:
		String y="34.55";
		System.out.println(y+20);//34.5520
		
		double d=Double.parseDouble(y);
		System.out.println(d+20);//54.55
		
//		String h="100A";
//		int p=Integer.parseInt(h);
//		System.out.println(p+20);
		
		
		int k=100;
		System.out.println(k+20);//120
		
		String k1=String.valueOf(k);
		System.out.println(k1+20);//10020
		
		
	}

}
