//Mar 9-2023-p1
package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		//Collection - dynamic
		//stores the values : key -value pair
		//not indexed based
		
		Map<String, String> EmpMap=new HashMap<String, String>();
		EmpMap.put("name", "Tom");//put is used to add data in a hashmap
		EmpMap.put("Id", "101");
		EmpMap.put("Id", "201");//same keys will be overridden
		EmpMap.put("City", "Paris");
		EmpMap.put("Country", "France");
		EmpMap.put(null, "1000");
		EmpMap.put(null, "2000");//only one null key is allowed
		EmpMap.put("age", null);
		EmpMap.put("phone", null);
		
		
		
		System.out.println(EmpMap.get("name"));// get is to retrieve the data from a Hashmap
		System.out.println(EmpMap.get("Id"));
		System.out.println(EmpMap.get("Id"));
		System.out.println(EmpMap.get("City"));
		System.out.println(EmpMap.get("Country"));
		System.out.println(EmpMap.get("Salary"));//null
		System.out.println(EmpMap.get(null));
		System.out.println(EmpMap.get("age"));
		System.out.println(EmpMap.get("phone"));
		
		
		for(Map.Entry<String, String> entry : EmpMap.entrySet()) {
			System.out.println("Key =" +entry.getKey() + "value = " +entry.getValue());
		}
		
		System.out.println("--------------------");
		
		
		//keySet(): to get the keys:
		for(String e: EmpMap.keySet()) {
			System.out.println("Key =" + e);
		}
		
		System.out.println("--------------------");
		
		//values(): for getting the values
		for(String e: EmpMap.values()) {
			System.out.println("value =" + e);
		}
		
		
	}

}
