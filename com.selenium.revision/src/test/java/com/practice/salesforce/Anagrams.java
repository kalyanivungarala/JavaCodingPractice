package com.practice.salesforce;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		
		boolean checkAnagrams = checkAnagrams("Worth", "Throwac");
		System.out.println(checkAnagrams);
	}
	
	private static boolean  checkAnagrams(String str, String str2) {
		char[] ch = str.replace("\\s", "").toLowerCase().toCharArray();
		char[] ch2 = str2.replaceAll("\\s","").toLowerCase().toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		return Arrays.equals(ch, ch2);
		
	}

}
