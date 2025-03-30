package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
	
	public static void main(String[] args) {
		
		String input= "The more you give, the more you get";
		LinkedHashMap<String, Integer> result=findDuplicateWords(input);
		System.out.println(result);
		
	}
	
	public static LinkedHashMap<String, Integer> findDuplicateWords(String s){
		
		String str=s.toLowerCase();
		if(str==null || str.isEmpty()) {
			throw new IllegalArgumentException("String cannot be null or empty");
		}
		LinkedHashMap<String, Integer> map= new LinkedHashMap<>();
		String[] strArray=str.split("");
		for(String string: strArray) {
			if(map.containsKey(string)) {
				map.put(string, map.get(string)+1);
			}else {
				map.put(string, 1);
			}
			}
		Set<Map.Entry<String, Integer>> set= map.entrySet();
		System.out.println("Duplicate characters in a string- " + str + ":");
		LinkedHashMap<String,Integer>duplicate = new LinkedHashMap<>();
		for(Map.Entry<String, Integer>entry : set) {
			if(entry.getValue()>1) {
				duplicate.put(entry.getKey(), entry.getValue());
			}
		}
		return duplicate;
	}
 }

	
	

