package com.java.revision;

public class AlphabetsCount {
	
	public static void main(String[] args) {
		String name = "My name is Kalyani Vungarala ***";
		int numberOfAlphabets = 0;
		char[] charArray = name.toCharArray();
		for (char c : charArray) {
			boolean alphabetic = Character.isAlphabetic(c);
			if (alphabetic) {
			numberOfAlphabets++;	
			}
		}
		System.out.println("numberOfAlphabets ...."+numberOfAlphabets);
	}

}
