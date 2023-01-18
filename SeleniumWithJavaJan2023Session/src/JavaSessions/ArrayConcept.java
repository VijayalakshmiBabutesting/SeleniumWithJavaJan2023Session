//Jan 17-2023-P1
package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

//		int i=10;
//		i=20;
//		i=30;
//		int i1=40;
//		System.out.println(i1);
		
		
		
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;//ArrayIndexOutOfBoundsException:
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		System.out.println("Lowest index " +0);
		System.out.println(i.length);
		System.out.println("highest index " + (i.length-1));
		System.out.println(i[4]);//ArrayIndexOutOfBoundsException:
		
		System.out.println(i[-1]);

	}

}
