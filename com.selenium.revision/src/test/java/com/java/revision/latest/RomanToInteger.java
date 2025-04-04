package com.java.revision.latest;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static void main(String[] args) {
		Map<Character, Integer> romanMAp = new HashMap<Character, Integer>();
		romanMAp.put('I', 1);
		romanMAp.put('X', 10);
		romanMAp.put('V', 5);
		String input = "IX";
		int result = 0;
		int currentValue = 0;
		int previousValue = 0;
		for (int i = input.length()-1; i >= 0; i--) {
			char charAt = input.charAt(i);
			currentValue = romanMAp.get(charAt);
			if (currentValue >= previousValue) {
				result = result+currentValue;
			}else result = result-currentValue;
			previousValue = currentValue;
		}
		System.out.println("REsult is  "+result);
	}
}
