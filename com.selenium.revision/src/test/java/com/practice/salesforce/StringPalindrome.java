package com.practice.salesforce;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pleae provide the input : ");
		String input = scanner.next();
		
		String reversedStr = "";
		char[] chars = input.toCharArray();
		for (int i = chars.length-1; i >= 0; i--) {
			char c = chars[i];
			reversedStr = reversedStr+ c;
			
		}
		System.out.println("Reversed string is "+reversedStr);
		if (input.equals(reversedStr)) {
			System.out.println("Given string is a palindrome string");
		}else System.out.println("Given string is not a palindrome string");
		scanner.close();
	}

}
