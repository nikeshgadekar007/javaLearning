package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

public class Practice {

	public static void main(String[] args) {
		
//		ArrayList<Object> data1 = new ArrayList<Object>();
//		data1.add("Nikesh");
//		data1.add("Nikesh");
//		data1.add(false);
//		
//		for(Object name:data1) {
//		System.out.println(name);
//	}
		
//		LinkedHashSet<String> set=new LinkedHashSet<String>();  
//		set.add("Ravi");  
//		set.add("Vijay");  
//		set.add("Ravi");  
//		set.add(null);
//		Iterator<String> itr=set.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		 
		

		
		Map<String, String>  map = new HashMap<String, String>();
		
		map.put(null, "Nikesh");
		map.put(null, "Aman");
		map.put("sa", "Dipesh");
		map.put("dsa", "Danile");
		map.put("name", "dasd");
		map.put("name", "Girish");
		map.put("fasf", "Girish");

		
		for(Map.Entry<String, String> map1: map.entrySet()) {
			System.out.println(map1.getKey()+ "="+ map1.getValue());
		}
		
		
		
//		Map<String, String>  map = new LinkedHashMap<String, String>();
//		
//		map.put("dasd", "Nikesh");
//		map.put("cbxvds", "Aman");
//		map.put(null, "Amit");
//		map.put("sa", "Dipesh");
//		map.put("dsa", "Danile");
//		map.put("name", "Girish");
//
//		
//		for(Map.Entry<String, String> map1: map.entrySet()) {
//			System.out.println(map1.getKey()+ "="+ map1.getValue());
//		}
		
		// output
//		        dasd=Nikesh
//				cbxvds=Aman
//				null=Amit
//				sa=Dipesh
//				dsa=Danile
//				name=Girish
//		
		
//		Map<String, String>  map = new TreeMap<String, String>();
//		
//		map.put("dasd", "Nikesh");
//		map.put("cbxvds", "Aman");
//		map.put("sa", "Dipesh");
//		map.put("dsa", "Danile");
//		map.put("name", "Girish");
//
//		
//		for(Map.Entry<String, String> map1: map.entrySet()) {
//			System.out.println(map1.getKey()+ "="+ map1.getValue());
//		}


//		Map<String, String>  map = new Hashtable<String, String>();
//		
//		map.put("dasd", "Nikesh");
//		map.put("cbxvds", "Aman");
//		map.put("sa", "Dipesh");
//		map.put("dsa", "Danile");
//		map.put("name", "Girish");
//
//		for(Map.Entry<String, String> map1: map.entrySet()) {
//			System.out.println(map1.getKey()+ "="+ map1.getValue());
//		}
		
		
//		List<Integer> list = Arrays.asList(1,4,2,5,7,4,3);
//		
//		
//		list.forEach(new Consumer<Integer>() {
//		    public void accept(Integer value) {
//		        System.out.println(value);
//		    }
//		});
//		
//
//		list.forEach((Integer value) -> System.out.println(value));
		
//		Multithreading thread1 = new Multithreading();
//		thread1.start();
//		
//		Multithreading thread2 = new Multithreading();
//		thread2.start();
		
	
		
//		Map<Employee, String> map = new HashMap<Employee, String>();
//		
//		Employee emp1 = new Employee(1);
//		Employee emp2 = new Employee(1);
//		
//		map.put(emp1, "nikesh");
//		map.put(emp2, "nikesh");
//		
//		System.out.println(map.size());
//		
//		
//		Map<Integer, String> map1 = new HashMap<Integer, String>();
//		map1.put(1, "nikesh");
//		map1.put(1, "nikesh");
//		
//		System.out.println(map1.size());
		
	}
		
	}	
	

