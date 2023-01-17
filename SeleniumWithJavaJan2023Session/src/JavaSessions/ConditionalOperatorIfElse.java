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
		 
		System.out.println("------- ");  
		int balance=100;
		if(balance!=100) {
			System.out.println("balance is not correct");
		}
		System.out.println("------- "); 
		//WAP to find the greatest of 3 numbers.
		
		int x=1000;
		int y=200;
		int z=600;
	
		if(x>y && x>z) {
			System.out.println("x is the greatest");
		} else if(y>z) {
			System.out.println("y is the greatest");
		} else {
			System.out.println("z is the greatest");
		}
		System.out.println("------- XXX------- "); 
		//WAP to check browser value and then launch the respective browser.
		
		//1. if
		String browsers="opera";
		
//		if(browsers.equals("chrome")) {
//			System.out.println("Launch chrome browser");
//		}
//			
//		if(browsers.equals("firefox")) {
//			System.out.println("Launch firefox browser");
//		}
//		
//		if(browsers.equals("ie")) {
//			System.out.println("Launch ie browser");
//		}
//			
//		if(browsers.equals("safari")) {
//			System.out.println("Launch safari browser");
//		}	
//			
//		else {
//			System.out.println("please pass the correct browser");
//		}
		//comment - command + / to comment and uncomment selected lines
		//2. if -elseif-else	
			
		if(browsers.equals("chrome")) {
			System.out.println("Launch chrome browser");
		}
		
		else if(browsers.equals("firefox")) {
			System.out.println("Launch firefox browser");
		}
		
		else if(browsers.equals("ie")) {
			System.out.println("Launch ie browser");
		}
		
		else if(browsers.equals("safari")) {
			System.out.println("Launch safari browser");
		}
		
		else {
			System.out.println("please pass the correct browser");
		}
		
		//3. switch-case --> control+space
//		switch (browsers) {
//		case "chrome":
//			System.out.println("Launch chrome browser");
//			break;
//		case "firefox":
//			System.out.println("Launch firefox browser");
//			break;
//		case "ie":
//			System.out.println("Launch ie browser");
//			break;
//		case "safari":
//			System.out.println("Launch safari browser");
//			break;
//		default:
//			System.out.println("please pass the correct browser");
//			break;
//		}
		
	
	}

}
