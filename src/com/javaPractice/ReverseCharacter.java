package javaPractice;

import java.util.Scanner;

public class ReverseCharacter {
	
	public static void reverseChar() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string:");
	String givenStr= scan.nextLine();
	String reversedStr="";
	char[] givenStrCharArray= givenStr.toCharArray();
	for(int i=givenStrCharArray.length-1; i>=0;i--) {
		reversedStr=reversedStr+givenStrCharArray[i];
	}
	System.out.println(reversedStr);
	}
	public static void main(String[] args) {
		reverseChar();
	}
		                
	}
	
