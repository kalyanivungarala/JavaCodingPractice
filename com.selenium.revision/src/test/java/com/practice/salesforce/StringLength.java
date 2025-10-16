package com.practice.salesforce;

public class StringLength {
	public static void main(String[] args) {
		String str = "aabbbccccccdda";
		char[] charArray = str.toCharArray();
		int startIndex = 0;
		int length = 0;
		char prevChar = charArray[0];
		for (int i = 1; i < charArray.length; i++) {
			if (prevChar == charArray[i]) {
				System.out.println("Characters are same");
				length++;
			}
			prevChar = charArray[i];
			System.out.println(prevChar);
			System.out.println(length);
		}
			
			
	}

}
