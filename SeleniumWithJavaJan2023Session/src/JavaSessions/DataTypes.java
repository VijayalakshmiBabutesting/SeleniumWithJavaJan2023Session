//Jan10-2023-P1
package JavaSessions;
/**
 * 
 * @author mchugh
 * This program is about data types
 */
public class DataTypes {

	public static void main(String[] args) {

		//data types
		//Integer Family : byte, short, int, long
		//Floating Family : float, double
		//Character Family : char
		//boolean: true/false
		//String: -> is not a datatype. Its a class in Java
		
		//1.byte
		//size : 1 byte = 8 bits
		//range : -128 to 127
		 byte b=10;
		// b=30;
		 byte b1=20;
		 byte b2=-128;
		 byte b3=-30;
		 System.out.println(b);
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);
		 System.out.println(b+b1+b3);//0
		 
		 System.out.println("---------------");
		 //2. short
		 //size: 2 bytes = 16 bits
		 //range: -32768 to 32767
		 
		 short s=-32768;
		 short s2=-1000;
		 System.out.println(s);
		 System.out.println(s2);
		 
		 System.out.println("---------------");
		 
		 //3. int
		//size: 4 bytes = 32 bits
		//range: -21474883648 to 21474883647
		 
		 int i=10;
		 int total=20000;
		 
		 System.out.println(i);
		 System.out.println(total);
		 
		 
		 System.out.println("---------------");
		 //4. long
		//size: 8 bytes = 64 bits
		//range: check it!
		 System.out.println("---------------");
		 long l=234242234;
		 System.out.println(l);
		 
		 
		 System.out.println("---------------");
		 //5. float
		//size: 4 bytes = 32 bits
		//range: around 7 digits after .
		 float f=12.33f;
		 float f1=(float)34.55;
		 float f2=100;//100.0
		 
		 System.out.println(f);
		 System.out.println(f1);
		 System.out.println(f2);
		 System.out.println("---------------");
		
		 //5. double
		//size: 8 bytes = 64 bits
		//range: around 15 digits after .
		 
		 double d=12.33;
		 double d1=34.242;
		 System.out.println(d);
		 System.out.println(d1);
		 System.out.println("---------------");
		 
		 //6. char
		 //size = 2 bytes
		 char c='a';
		 char gender='f';
		 char c1='@';
		 char c2='_';
		 System.out.println(c1);
		 
		 //7. boolean
		 //size = 1 bit
		 boolean manish=true;
		 boolean flag=false;
		 System.out.println(flag);
		 System.out.println(manish);
		 
		 //8. String -> String is not a data type. Its a class in Java
		 
		 String str="Hello World";
		 System.out.println(str);
		 
		 String str1="100";
		 System.out.println(str1);
		 
		 System.out.println(str+str1);//Hello World100 ->concatenation operator
		 System.out.println(1000);
		 System.out.println("Hello Selenium");
		 System.out.println("str");
		 System.out.println(10+20);//30
		 System.out.println("testing" +100);//testing100
		 System.out.println("hello"+" "+"World");//helloWorld
		 
		 System.out.print(80+"\n");
		 System.out.println(60);
		 
		 System.err.println("some error is coming");
		 
		 System.out.println(4/2);
		 System.out.println(4%2);
		 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
