package javaPractice;

import java.util.HashMap;

public class CountOccorrenceOfAlphabet {

	public void countWord(String string) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] strArray = string.split("");
		for(String s : strArray) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		CountOccorrenceOfAlphabet occurrence= new CountOccorrenceOfAlphabet();
		occurrence.countWord("Practice makes anyone perfect");
	}
}
