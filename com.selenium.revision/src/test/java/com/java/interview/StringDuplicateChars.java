package com.java.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicateChars {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input string ::  ");
		String inputString = scanner.nextLine(); //Kalyani Vungarala
		char[] charArray = inputString.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		
		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			if (map.get(character) > 1) {
				System.out.println("The character "+character+ " is repeated "+map.get(character)+" times in the input string");
				
			}
		}
		scanner.close();
		
	}

}
