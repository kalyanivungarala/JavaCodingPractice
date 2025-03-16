package com.java.revision;

public class ReverseString {

	public static void main(String[] args) {
		String input = "This is Kalyani";
		String output = "";
		for (int i = input.length()-1; i >= 0; i--) {
			output = output+input.charAt(i);
		}
		System.out.println("  Hello         :"+output);
	}

}
