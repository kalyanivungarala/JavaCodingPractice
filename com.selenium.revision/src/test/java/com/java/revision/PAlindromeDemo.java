package com.java.revision;

public class PAlindromeDemo {
	
	public static void main(String[] args) {
		
	String input = "radaras";
	String output = "";
	for (int i = input.length() - 1; i >= 0; i--) {
		output = output+input.charAt(i);
	}
	
	System.out.println("input  "+input);
	System.out.println("output   "+output);
	
	
	if (input.equals(output)) {
		System.out.println("Palindrome");
	} else System.out.println("Not palindrome");
	}

}
