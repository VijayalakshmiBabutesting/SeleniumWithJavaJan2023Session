//Jan 12-2023-p2
package JavaSessions;

public class ConditionalOperatorIfElse {

	public static void main(String[] args) {

		int a=100;
		int b=20;
		System.out.println(a>b);
		
		
		  if(a>b) {
		  System.out.println("a is greater than b"); 
		  } 
		  
		  else {
		  System.out.println("b is greater than a"); 
		  }
		 
		
		/*
		 * if(false) { 
		 * System.out.println("hello world"); 
		 * 
		 * } 
		 * else {
		 * System.out.println("bye"); 
		 * }
		 */
		  //Java is case sensitive, H and h are not same
		  String s="Hello";
		  String s1="hello";
		  
		  //To compare 2 strings, use .equals or .equalsIgnoreCase
		  if(s.equals(s1)) {
			  System.out.println("both are equal");
		  }
		  else {
			  System.out.println("both are not equal");
		  }
		  
		  String browser="CHROME";
		  
		  if(browser.equalsIgnoreCase("chrOmE")) {
			  System.out.println("Start the chrome browser");
		  }
		  else {
			  System.out.println("please pass the correct browser name");
		  }
		  
		  int total=101;
		  int fee=100;
		  
		  if(total==fee) {
			  System.out.println("total is fee");
		  }
		  else {
			  System.out.println("total is not fee");
		  }
		  
		  // >, <, >=, <=, ==, != conditional operators
		  
		  int c=20000;
		  int d=2001;
		  if(d>=c) {
			  System.out.println("PASS");
		  }
		  else
			  System.out.println("FAIL");
		  
		  
	}

}
