package com.practice.salesforce;

import java.util.ArrayList;
import java.util.List;

public class Demo22 {
	
	public static void main(String[] args) {
		String str = "abcd1234";
		char[] charArray = str.toCharArray();
		List<Character> alphabets = new ArrayList<Character>();
		List<Character> numbers = new ArrayList<Character>();
		for (char ch : charArray) {
			if (Character.isAlphabetic(ch)) {
				alphabets.add(ch);
			}else if (Character.isDigit(ch)) {
				numbers.add(ch);
			}
		}
		
		System.out.println("Alphabets given in the string are : "+alphabets);
		System.out.println("Numbers given in the string are : "+numbers);
	}

}
