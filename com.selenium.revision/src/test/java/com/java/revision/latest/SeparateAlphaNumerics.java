package com.java.revision.latest;

public class SeparateAlphaNumerics {
	public static void main(String[] args) {
		String input = "Ra123j";
		StringBuilder alphabts = new StringBuilder();
		StringBuilder numerics = new StringBuilder();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (Character.isAlphabetic(c)) {
				alphabts.append(c);
			}else if (Character.isDigit(c)) {
				numerics.append(c);
			}
		}
		System.out.println("The alphabets string is .."+alphabts);
		System.out.println("The numerics string is .."+numerics);
		
	}

}
