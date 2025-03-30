package javaPractice;

import java.util.HashMap;

public class CountOccurrenceOfChar {
	
	public static void getCharCount(String givenStr) {
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	char charArray[] =givenStr.toCharArray();
	for(char c : charArray) {
		if (map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	System.out.println(map);
}
	public static void main(String[] args) {
		getCharCount("Vrushaliraut");
	}
}
