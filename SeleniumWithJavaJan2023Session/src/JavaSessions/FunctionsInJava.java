//Jan 24-2023-P1

package JavaSessions;

public class FunctionsInJava 
{
	//functions can't be created inside a function
	//functions are parallel to each other
	
	public static void main(String[] args) 
	{
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		obj.printName();
		obj.total();
		int s=obj.add();//300
		System.out.println(s+10+15);
		
		//System.out.println(obj.add());
		
		String n=obj.getTrainerName();
		System.out.println(n);
		
		int s1=obj.getSum(40, 50);
		System.out.println(s1);
		
		int s2=obj.getSum(2,19);
		System.out.println(s2);
		
		String capital=obj.getCapitalName("France");
		System.out.println(capital);
		
		int marks=obj.getStudentMarks("Tom");
		System.out.println(marks);
		
//		boolean x=obj.launchBrowser("ie11");
//		System.out.println(x);
		
		System.out.println(obj.launchBrowser("chrome"));
	}
	
	//1. no input and no return
	//void --no return
	
	public void test() 
	{
		System.out.println("test method...");
	}
	
	public void printName() 
	{
		System.out.println("Manish");
	}
	
	public void total() 
	{
		System.out.println("Total Method");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	//2. no input and some return
	public int add() 
	{
		System.out.println("add method");
		int x=100;
		int y=200;
		int z=x+y;//300
	
		return z;
	}
	public String getTrainerName() 
	{
		System.out.println("get trainer name");
		String name="Manish";
		int i=100;
		return name;
		//return i; a method can't return multiple values
	}
	
	//3. some input and some return
	public int getSum(int a, int b) {
		System.out.println("get sum method");
		int sum=a+b;
		return sum;
	}
	
	
	//WAP to get the capital name of the country we pass as a argument.
	
	public String getCapitalName(String countryName) {
		
		System.out.println("getting capital for " + countryName);
		
		if(countryName.equals("India")) {
			return "New Delhi";
		}
		
		else if(countryName.equals("USA")) {
			return "Washington DC";
		}
		
		else if(countryName.equals("UK")) {
			return "London";
		}
		
		else {
			System.out.println("this country is not found in the list " +countryName);
			return null;// default value of String is null
		}
		
	}
		//WAP where the student name(String) is passed and then function returns the marks(int) of that student
		
		public int getStudentMarks(String studentName) {
			
			int marks=-1;
			System.out.println("getting the marks for " + studentName);
			
			if(studentName.equals("Mohan")) {
				marks= 90;
			}
			
			else if(studentName.equals("Kanika")) {
				marks=49;
			}
			
			else if(studentName.equals("Pratik")) {
				marks=94;
			}
			else if(studentName.equals("Manish")) {
				marks=20;
			}
			else {
				System.out.println("Student not found " + studentName);
				return -1;
			}
			
			return marks;
			
		}
		
		//WAP - where we will pass the browsername(String), and launch the browser and return true/false (boolean).
	
		
		public boolean launchBrowser(String browserName) {
			
			System.out.println("Launching browser " +browserName);
			boolean flag=false;
			//switch + cntrl+space
			
			switch (browserName) {
			case "chrome":
				System.out.println("Launching chrome");
				flag=true;
				break;

			case "firefox":
				System.out.println("Launching firefox");
				flag=true;
				break;
				
			case "safari":
				System.out.println("Launching safari");
				flag=true;
				break;
			
			default:
				System.out.println("browser is not found " +browserName);
				break;
			}
			
			return flag;
		}
	
	
	
}
