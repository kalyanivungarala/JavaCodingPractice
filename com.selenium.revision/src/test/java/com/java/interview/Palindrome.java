package com.java.interview;

public class Palindrome {
	public static void main(String[] args) {
		String str = "MOM";
		char[] charArray = str.toCharArray();
		String reverseStr = "";
		for (int i = charArray.length-1; i >= 0; i--) {
			reverseStr = reverseStr+str.charAt(i);
		}
		System.out.println("Reversed String :"+reverseStr);
		
		if (str.equals(reverseStr)) {
			System.out.println("The given string is a palindrome");
		}else {
			System.out.println("The given string is not a palindrome");
		}
	}

}
