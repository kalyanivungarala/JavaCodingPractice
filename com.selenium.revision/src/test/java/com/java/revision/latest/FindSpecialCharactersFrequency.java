package com.java.revision.latest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindSpecialCharactersFrequency {

	public static void main(String[] args) {
		String str = "abc!@#@#$$%!!!*(*))";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charVsFrequency = new HashMap<Character, Integer>();
		for (Character c : charArray) {
			boolean letterOrDigit = Character.isLetterOrDigit(c);
			if (! letterOrDigit) {
				if (charVsFrequency.containsKey(c)) {
					charVsFrequency.put(c, charVsFrequency.get(c)+1);
				}else charVsFrequency.put(c, 1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySet = charVsFrequency.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println("Character "+entry.getKey()+" repeated "+entry.getValue()+" times");
		}
	}

}
