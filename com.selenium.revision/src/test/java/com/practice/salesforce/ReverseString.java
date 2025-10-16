package com.practice.salesforce;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "My name is Kalyani";
		String string = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed STring "+string);
	}

}
