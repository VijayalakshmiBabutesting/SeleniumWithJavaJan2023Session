//Jan 16-2023-p1
package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// print 1 to 10
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
		
		System.out.println("----------");
		// loops
		// 1. While
		int i=1;//initialization
		while(i<=10) //condition
		{
			System.out.println(i);
			i++;//increments the value of i by 1
		}
		System.out.println("----------");
		//2. do while loop
		int n=11;//initialization
		do {
			System.out.println(n);
			n++;//increment
		} while(n<=10);// condition
		
		System.out.println("----------");
		
		//3. for loop
		for(int k=1; k<=10; k++)
		{
			System.out.println(k);
		}
		System.out.println("----------");
		//3. even numbers : 0 2 4 6 8 10
		
		for(int even=0; even<=10; even+=2) {
			System.out.println(even);
		}
		System.out.println("----------");
		
		//4. odd numbers : 1 3 5 7 9
		for(int odd=1; odd<=9; odd=odd+2) {
			System.out.println(odd);
		}
		System.out.println("----------");
		
		for(int p=1; p<=10;) {
			System.out.println(p);
			p++;
		}
		System.out.println("----------");
		
		for(int h=1; h<=100;h++) {
			System.out.println(h);
			if(h%5==0) {
				System.out.println("hello");
			}
		}
		
		System.out.println("----------");
		
		for(char c='a'; c<='z'; c++) {
			System.out.println("char -->" + c);
		}
		
		System.out.println("----------");
		for (byte b=1; b<=5; b++) {
			System.out.println("Byte -->" + b);
		}
		
		System.out.println("----------");
		for(double d=1.1; d<10; d++) {
			System.out.println("double -->" +d);
		}
		
		
		System.out.println("----------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
