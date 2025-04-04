package com.java.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharacterCount {
	//In given string found the count of each character and replace it whenever its duplicate
	// Input = "Automation"
	// Output= "2u22m22i2n"
	public static void main(String[] args) {
		String input = "Automation";
		Map<Character, Integer> charCount  = new HashMap<Character, Integer>();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (charCount.containsKey(c)) {
				Integer count = charCount.get(c);
				charCount.put(c, ++count);
			}else {
				charCount.put(c, 1);
			}
			
		}
		for (char c : charArray) {
			int count = charCount.get(c);
			if (count > 1) {
				input.replace(c, '2');
				System.out.println("Count of char is "+c+"  "+count);
				System.out.println("Modified string " +input);
			}
		}
		
		System.out.println(charCount);
		System.out.println("Modified string " +input);
	}

}
