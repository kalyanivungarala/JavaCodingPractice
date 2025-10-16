package com.practice.salesforce;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NonRepeatingCharacter {
	
	public static void main(String[] args) {
		char c = getfirstNonRepeatedChar();
		System.out.println("First Non repeated character "+c);
	}
	
	private static char getfirstNonRepeatedChar(){
		String str = "zababcddefgcgh";
		Map<Character,Integer> frequncy = new HashMap<Character,Integer>();
		for(char c:str.toCharArray()) {
			frequncy.put(c,frequncy.getOrDefault(c, 0)+1);
		}

		Set<Entry<Character,Integer>> entrySet = frequncy.entrySet();
		for(Map.Entry<Character,Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '-';
	}

}
