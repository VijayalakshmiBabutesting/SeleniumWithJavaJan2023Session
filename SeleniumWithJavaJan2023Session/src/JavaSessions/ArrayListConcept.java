//Java 19-2023-P1
package JavaSessions;

import java.util.ArrayList;

/**
 * 
 * @author mchugh
 * This program is about array list
 */

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList id a default class in java
		//dynamic array
		//order based/index based
		//Lowest Index=0
		//highest Index= size-1
		//size=ar.size()
		
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());// size of array
		
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		
		ar.add(500);//4
		ar.add(600);//5
		System.out.println("-----");
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(5));
		
		System.out.println("-----");
		//System.out.println(ar.get(7));IndexOutOfBoundsException
		
		ar.add(700);//6
		ar.remove(6);
		//System.out.println(ar.get(6));IndexOutOfBoundsException:
		
		ar.add(800);//7
		System.out.println(ar.get(6));
		//System.out.println(ar.get(7));IndexOutOfBoundsException
		
		ar.add(1100);
		ar.add(1200);
		System.out.println(ar.get(7));
		System.out.println(ar.get(8));
		
		ar.add(12.33);
		ar.add("Hello");
		ar.add(true);
		ar.add('m');
		ar.add("Sam");
		
		System.out.println("--XXXXXXX---");
		//for loop
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(90);
		marks.add(60);
		
		
		System.out.println("--XXXXXXX---");
		
		ArrayList<String> countryList=new ArrayList<String>();
		countryList.add("India");//0
		countryList.add("UK");//1
		countryList.add("US");//2
		countryList.add("Germany");//3
		
		System.out.println(countryList.size());
		
		for(int i=0; i<countryList.size(); i++) {
			System.out.println(countryList.get(i));
		}
		System.out.println("------00000-----");
		for(String s : countryList) {
			System.out.println(s);
		}
		
		System.out.println("------X------");
		
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Tom");//0
		empData.add(25);//1
		empData.add('m');//2
		empData.add(false);//3
		empData.add(12.22);//4
		
		for(Object obj : empData) {
			System.out.println(obj);
		}
	}

}
