package com.practice.salesforce;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		Map<Character, Integer> frequencyOFCharacters = getFrequencyOFCharacters("Apple");
		System.out.println(frequencyOFCharacters);
		
	}
	
	private static Map<Character,Integer> getFrequencyOFCharacters(String str) {
		Map<Character,Integer> freq = new TreeMap<Character,Integer>();
		for(char ch : str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0)+1);
		}
		return freq;
	}

}
