//Jan 12-2023-P1
package JavaSessions;

public class IncrementalAndDecrementalOperator {

	public static void main(String args[]) {
		
		//1. post increment
		 int a=7; //a=a+1, a++, ++a, a=a+10
		 int b=a++; //assign and then increment
		 
		 System.out.println(a);//8
		 System.out.println(b);//7
		
		 System.out.println("-----");
		 
		 //2. pre increment
		 int a1=9;
		 int b1=++a1;//increment first and then assign
		 
		 System.out.println(a1);//10
		 System.out.println(b1);//10
		 
		 System.out.println("-----");
		 
		 //3. post decrement
		 int c=99;
		 int d=c--;//assign first and then decrement
		 
		 System.out.println(c);//98
		 System.out.println(d);//99
		 
		 //4. pre decrement
		 int m=13;
		 int n=--m; //decrement first and then assign
		 
		 System.out.println("-----");
		 System.out.println(m);//12
		 System.out.println(n);//12
		 
		 int v=2;
		 System.out.println(++v);//3
		 System.out.println(v);//3
		 
	
		
	}
	

}
