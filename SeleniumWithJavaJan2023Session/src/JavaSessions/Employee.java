//Jan 30-2023-P1
package JavaSessions;

import java.util.ArrayList;

public class Employee {

	//WAP where we pass emp Name(String) and return the employee assets list(Array)
	public static void main(String[] args) {
	
		Employee e1=new Employee();
		String asset_emp[]=e1.getEmployeeAssets("Naik");
		System.out.println("Total assets this emp has " + asset_emp.length);
		
		for(String s : asset_emp) {
			System.out.println(s);
		}
		
		System.out.println("----------------");
		
		ArrayList<String> orderList_emp=e1.getEmpOrders("Naik");
		System.out.println("order for this employee is " + orderList_emp.size());
		
		for(String s : orderList_emp) {
			System.out.println(s);
		}
	}
	
	public String[] getEmployeeAssets(String empName) {
		
		System.out.println("emp name is " + empName);
		
		String asset[]=new String[4];
		
		if(empName.equals("Sky")) {
			asset[0]="Macbook Pro";
			asset[1]="Mouse";
			asset[2]="Keyboard";
			asset[3]="Iphone X";
			
		}
		
		else if(empName.equals("Kiran")) {
			asset[0]="Windows Laptop";
			asset[1]="Mouse";
			asset[2]="Keyboard";
			asset[3]="HeadPhone";
		}
		else {
			System.out.println("this employee " + empName + " is not found, please pass the correct name....");
			return null;
		}
		
		return asset;
	}
	
	
	// WAP - where we pass the empName(String) and returns the 
	//list (ArrayList)of orders taken by that emp
	
	
	public ArrayList<String> getEmpOrders(String empName) {
		
		System.out.println("get Emp Orders for " + empName);
		ArrayList<String> orderList=new ArrayList<String>();
		
		if(empName.equals("Tom")) {
			orderList.add("Iphone");
			orderList.add("Laptop");
			orderList.add("T-shirt");
			orderList.add("Shoes");
			
		}
		
		else if(empName.equals("Steve")) {
			orderList.add("Mouse");
			orderList.add("Macbook");
			
		}
		
		else {
			System.out.println("this employee " + empName + " is not found, please pass the correct name....");
			return null;
		}
		return orderList;
	}
	

}
