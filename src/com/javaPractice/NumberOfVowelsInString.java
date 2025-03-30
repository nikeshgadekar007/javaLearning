package javaPractice;

import java.util.Scanner;

public class NumberOfVowelsInString {
	public static void main(String[] args) {
		NumberOfVowelsInString vowels=new NumberOfVowelsInString();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputStr= scanner.nextLine();
		if(inputStr == null || inputStr.isEmpty()) {
			System.out.println("String cannot be null or empty");
			return;
		}
		int count= vowels.countVowels(inputStr);
		System.out.println("Totally " + count + " vowels in a given string");
	}
	
	public int countVowels(String str) {
		if(str == null || str.isEmpty()) {
			throw new IllegalArgumentException("String cannot be null or empty");
		}
         int vowelCount=0;
         str= str.toLowerCase();
         for(char c: str.toCharArray()) {
        	 if (c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        	 {
        		 vowelCount++;
        	 }
        	 }
         return vowelCount;
         }
		
	}

