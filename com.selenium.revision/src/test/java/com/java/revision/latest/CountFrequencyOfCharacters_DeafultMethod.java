package com.java.revision.latest;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharacters_DeafultMethod {

	public static void main(String[] args) {
		String str = "Madamabedbedam";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);	
	}

}
