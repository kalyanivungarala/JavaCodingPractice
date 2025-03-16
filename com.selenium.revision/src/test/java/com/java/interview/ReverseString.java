package com.java.interview;

public class ReverseString {
	public static void main(String[] args) {
		String str = "TestString 123";
		char[] charArray = str.toCharArray();
		String reverseStr = "";
		for (int i = charArray.length-1; i >= 0; i--) {
			reverseStr = reverseStr+str.charAt(i);
		}
		System.out.println("Reversed String :"+reverseStr);
	}

}
