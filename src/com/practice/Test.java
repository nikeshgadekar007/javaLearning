
package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args){
		
//		/* String reverse */
//		String name = "Nikesh";
//		StringBuilder str =  new StringBuilder();
//		str.append(name);
//		System.out.println(str.reverse());
//		
		
		
		/* String reverse without api*/
//		String str = "nikesh";
//		String source = "";
//		
//		for(int i = str.length()-1; i >= 0; i--) {
//			source =  source + str.charAt(i);
//		}
//			System.out.println(source);
	

//		int num[] = {4,6,3,2,5,6};
//		
//		for(int i: num) {
//			System.out.println(i);
//		}
//		
//	}
		
		//Employee emp = new Employee();
//		System.out.println(emp.getName());
//		System.out.println(emp.getId());
		
//		
//		System.out.println(emp.add(4, 5));
//		System.out.println(emp.add(4, 5, 5));
//		
//		emp.getData();
		
//		Person per = new Person();
//		per.getData();
		
//		List<String> list = new ArrayList<String>();
//		list.add("nikesh");
//		list.add("gadekar");
//		list.add("gadekar");
//		list.add("aman");
//		list.add("dipesh");
//		
//		Collections.sort(list);
//		
//		for(String name:list) {
//			System.out.println(name);
//		}
//		
		
		
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "Nikesh");
		
//		custom comparator 
		
//		List<Employee> list =  new ArrayList<Employee>();
//		
//		for(int i =0; i< 100; i++) {
//			Employee emp = new Employee(i);
//			emp.setId((int)Math.random()*100+1);
//			list.add(emp);
//			
//		}
//		Collections.sort(list, new CustomComparator());
//		
//		Iterator<Employee> customComp = list.iterator();
//		while(customComp.hasNext()) {
//			Employee e = customComp.next();
//			System.out.println(e.getId());
//		}
		
//		HashSet
		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("Nikesh");
//		set.add("gadekar");
//		set.add("gadekar");
//		set.add("aman");
//		set.add("dipesh");
//
//		
//		for(String name:set) {
//			System.out.println(name);
//		}
		
		
//		LinkedHashSet
		
//		LinkedHashSet<String> lHashSet = new LinkedHashSet<String>();
//		lHashSet.add("Nikesh");
//		lHashSet.add("Gadekar");
//		lHashSet.add("Gadekar");
//		lHashSet.add("HK");
//		
//		for(String name: lHashSet) {
//			System.out.println(name);
//		}
		
		
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("name", "Nikesh");
//		map.put("city", "HK");
//		map.put("age", "23");
//
//		for(Map.Entry<String, String> list : map.entrySet()) {
//			System.out.println(list.getKey() + "=" + list.getValue() );
//		}
		
		
		
//		Map<String, String> map = new TreeMap<String, String>();
//		
//		map.put("name", "Nikesh");
//		map.put("city", "HK");
//		map.put("age", "23");
//
//		for(Map.Entry<String, String> list : map.entrySet()) {
//			System.out.println(list.getKey() + "=" + list.getValue() );
//		}
//		
		
		
//			Set<String> set = new HashSet<String>();
//			
//			set.add("Nikesh");
//			set.add("gadekar");
//			set.add("HK");
//			set.add("IT");
//			
//			
//			Iterator<String> itr= set.iterator();
//			while(itr.hasNext()) {
//				System.out.println(itr.next());
//			}
		
//		List<Integer> list  = new ArrayList<Integer>();
//		list.add(2);
//		list.add(4);
//		list.add(32);
//		list.add(87);
//		list.add(3);
//		
//		Collections.sort(list);
//		
//		for(Integer num: list) {
//			System.out.println(num);
//		}
		
		
//		Employee emp = new Employee(1);
//		Employee emp1 = new Employee(1);
//		Map<Employee, String> map = new HashMap<Employee, String>();
//		map.put(emp, "Nikesh");
//		map.put(emp1, "Nikesh");
//		System.out.println(map.size());
//		
//		
//
//		Integer val = new Integer(1);
//		Integer val1 = new Integer(1);
//		Map<Integer, String> map1 = new HashMap<Integer, String>();
//		map1.put(val, "Nikesh");
//		map1.put(val1, "Nikesh");
//		System.out.println(map1.size());
		
//		int[] numbers = new int[]{1,2,3,4,4,5,6,8,2};

//		for(int i=0 ;i<numbers.length -1;i++) {
//			for(int j=i+1; j < numbers.length; j++) {
//				if(numbers[i] == numbers[j]) {
//					System.out.println("The duplicate elemenet is:"+ numbers[j]);
//				}
//			}
//		}
		
//		HashSet<Integer> set = new HashSet<Integer>();
//			for(Integer num: numbers) {
//				if(set.add(num)==false) {
//					System.out.println("The duplicate element is:"+ num);
//				}
//			}
		


//		//Write a program to check if String has all unique characters in java?
//		public static boolean hasAllUniqueChars (String word) {
//			 
//		     HashSet alphaSet = new HashSet();
//		 
//		     for(int i = 0; i < word.length(); i ++)   {
//		      
//		         char c = word.charAt(i);
//		 
//		         // If Hashset's add method return false,that means it is already present in HashSet
//		         if(!alphaSet.add(c))
//		              return false;
//		     }
//		 
//		     return true;
//		 }
			 
//		String str = "nikesh";
//		String source = "";
//		
//		for(int i = str.length()-1; i >= 0; i--) {
//			source =  source + str.charAt(i);
//		}
//			System.out.println(source);
		
		
		
////		find the smallest & largest number
//		
//		int[] numbers = new int[]{1,2,76,3,4,8};
//		int smallest = numbers[0];
//		int largest = numbers[0];
//		
//		for(int i = 0 ; i< numbers.length; i++) {
//			if(numbers[i] <= smallest) {
//				smallest = numbers[i];
//			}else if(numbers[i] >= smallest) {
//				largest = numbers[i];
//			}
//		}
//		
//		System.out.println("smallest number is: " + smallest);
//		System.out.println("largest number is: "+largest);
		
		
		
////		Number reverse
//		int num = 1234;
//		String str= Integer.toString(num);
//		StringBuilder str1 =  new StringBuilder();
//		str1.append(str);
//		System.out.println(str1.reverse());
		
		
		
	}

}
