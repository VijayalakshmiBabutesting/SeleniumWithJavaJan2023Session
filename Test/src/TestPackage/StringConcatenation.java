//Jan 11-2023-P1
package TestPackage;

public class StringConcatenation {

	public static void main(String[] args) {
		
		double c=12.33;
		double d=23.33;
		
		int a=300;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		
		System.out.println(a+b);//500
		System.out.println(c+d);//35.66
		System.out.println(x+y);
		System.out.println(a+b+x+y);//500HelloWorld
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));//helloWorld500
		
		System.out.println(x+y+c+d+a+b);//HelloWorld12.3323.33300200
		System.out.println(c+d+x+y+(a+b));//35.66HelloWorld500
		System.out.println(c+d+(x+y)+a+b);//35.66HelloWorld300200
		
		System.out.println("The value of a is "+a);
		
		//int i=4/2.0;
		System.out.println(4/2);
		System.out.println(5/2);//2
		System.out.println(5.0/2);
		System.out.println(5/2.0);
		System.out.println(5.0/2.0);
		
		double k=9/2.0;
		System.out.println(k);
		
		//int p=9/0;
		//System.out.println(p);//ArithmeticException: / by zero
		
		System.out.println("-------");
		
		int n=0/9;
		System.out.println(n);
		
//		int m=0/0;
//		System.out.println(m);//ArithmeticException: / by zero
		
		
		
		
		
		
		

	}

}
