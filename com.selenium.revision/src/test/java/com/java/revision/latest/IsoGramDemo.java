package com.java.revision.latest;

import java.util.HashSet;
import java.util.Set;

public class IsoGramDemo {
	
	public static void main(String[] args) {
		String input = "pen";
		char[] charArray = input.toCharArray();
		Set<Character> charset = new HashSet<Character>();
		boolean isISogram = true;
		for (char c : charArray) {
			if (charset.contains(c)) {
				isISogram = false;
			}else charset.add(c);
		}
		System.out.println("Is given string ISogram "+isISogram);
	}

}
