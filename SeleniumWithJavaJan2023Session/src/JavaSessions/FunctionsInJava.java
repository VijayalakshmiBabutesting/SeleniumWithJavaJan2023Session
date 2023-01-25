//Jan 24-2023-P1

package JavaSessions;

public class FunctionsInJava 
{
	//functions cant be created inside a function
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
	
	public void total() {
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
		
	}
	
	//3. some input and some return
	public int getSum(int a, int b) {
		System.out.println("get sum method");
		int sum=a+b;
		return sum;
	}

}
