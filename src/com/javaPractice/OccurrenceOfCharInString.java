package javaPractice;

import java.util.Scanner;

public class OccurrenceOfCharInString {

	public void occurrenceOfCharInStr(String str) {
		int occurrence = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the char to find");
		char toFind = scanner.next().charAt(0);
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (toFind == charArray[i]) {
				occurrence++;
			}
		}
		System.out.println("Character " + toFind + " occurres " + occurrence + " times");
	}

	public static void main(String[] args) {
		OccurrenceOfCharInString occurrence = new OccurrenceOfCharInString();
		occurrence.occurrenceOfCharInStr("VrushaliRaut");
	}
}
