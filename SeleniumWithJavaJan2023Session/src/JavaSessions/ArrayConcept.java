//Jan 17-2023-P1
package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

//		int i=10;
//		i=20;
//		i=30;
//		int i1=40;
//		System.out.println(i1);
		
		//Array -> is a collection of multiple values of similar data type.
		//Two major limitations of array:
		//1. static array -size is fixed -> to overcome this issue, we use dynamic arrays(ArrayList)
		//2. it stores only similar data type. to overcome this, we can use object static array and ArrayList
	
	
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;ArrayIndexOutOfBoundsException:
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		System.out.println("Lowest index " +0);
		System.out.println(i.length);
		System.out.println("highest index " + (i.length-1));
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException:
		
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		//syso+cntrl+space
		
		System.out.println("--------");
		// For loop -> to print all the values from an array
		
		//int l=i.length;
//		for(int p=0; p<i.length; p++) {
//			System.out.println(i[p]);
//		}
		System.out.println("--------");
		// For each loop
		for(Integer e : i) {
			System.out.println(e);
		}
		
		System.out.println("--------");
		
		
		double d[]=new double[2];
		d[0]=33.33;
		d[1]=43.56;
		
		for(Double f : d) {
			System.out.println(f);
		}
		System.out.println("--------");
		float f[]=new float[2];	
		f[0]=1.33f;
		f[1]=4.33f;
		
		for(Float r : f) {
			System.out.println(r);
		}
		System.out.println("--------");
		
		char c[]=new char[3];
		c[0]='A';
		c[1]='N';
		c[2]='A';
		
		for(Character cc : c) {
			System.out.println(cc);
		}
		
		System.out.println("--------");
		
		String student[]=new String[3];
		student[0]="Priya";
		student[1]="Rashmi";
		student[2]="Ana";
		
		for(int h=0; h<student.length; h++)
		{
			System.out.println(student[h]);
		}
		System.out.println("--------");
		for(String ss : student) {
			System.out.println(ss);
		}
		
		//Object static Array
		//Object - is the super class of all classes in java
		System.out.println("-----XXXXXXX---");
		Object obj[]=new Object[5];
		obj[0]="Tom";
		obj[1]=25;
		obj[2]=12.33;
		obj[3]='m';
		obj[4]=true;
		
		for(int h=0; h<obj.length; h++) 
		{
			System.out.println(obj[h]);
		}
		
		System.out.println("-----XXXXXXX---");
		
		for(Object oo : obj) {
			System.out.println(oo);
		}
	}

}
