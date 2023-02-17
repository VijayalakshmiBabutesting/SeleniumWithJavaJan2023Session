//Feb 16-P1-2023
package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String str="hello This is my first java code and I am so happy";
		
		System.out.println(str.length());
		System.out.println("li" + 0);
		System.out.println("hi = " + (str.length()-1));
		
		System.out.println(str.charAt(5));//index -5
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(43));
		//System.out.println(str.charAt(44));StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("i"));//1st occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("manish"));//-1
		
		String messg="welcome admin";
		if(messg.indexOf("admin")>0) {
			System.out.println("correct welcome messsage");
		}
		else {
			System.out.println("Incorrect welcome messsage");
		}
		
		//trim:
		String s="     hello World      ";
		System.out.println(s.trim());
		
		//replace:
		System.out.println(s.trim().replace(" ", ""));
		
		String dob="01-01-1980";// 01/01/1980
		System.out.println(dob.replace("-", "/"));
		
		//upper/lower cases
		String s1="this is my java code";
		System.out.println(s1.toUpperCase());
		
		String s2="HELLO WELCOME TO TESTING WORLD";
		System.out.println(s2.toLowerCase());
		
		//contains:
		String s3="Your browser is chrome";
		System.out.println(s3.contains("chrome"));
		
		String browser="chrome";
		if(browser.contains("Chrome")) {
			System.out.println("launch chrome browser");
		}
		
		//String Comparisons -> .equals
		System.out.println(browser.equals("Chrome"));
		System.out.println(browser.equalsIgnoreCase("Chrome"));
		
		System.out.println("---------------");
		String f1="Hello World";
		String f2="hello world ";
		System.out.println(f1.equals(f2));
		System.out.println(f1.equalsIgnoreCase(f2));
		System.out.println(f1.equalsIgnoreCase(f2.trim()));
		
		System.out.println(f1.concat(f2));
		System.out.println(f1+f2);
		
		//split
		String lang="Java;Python;JavaScript;Ruby";
		String language[]=lang.split(";");
		
		System.out.println(language.length);
		System.out.println(language[2]);
		
		for(String ele : language) {
			System.out.println(ele);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
