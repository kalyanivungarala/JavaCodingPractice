package com.java.interview;

public class CharOccurenceInString {
	public static void main(String[] args) {

		String str = "Kalyani Vungarala";

		char[] charArray = str.toCharArray();
		int count = 0;
		for (char c : charArray) {
			if ('V' == c) {
				count++;
			}

		}
		System.out.println("Number of occurences of the character "+count);
	}


}
