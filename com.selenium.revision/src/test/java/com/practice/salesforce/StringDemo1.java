package com.practice.salesforce;

public class StringDemo1 {
	
	public static void main(String[] args) {
		//i/p: "Welcome to capgemini"
//		o/p: emocleW ot inimegpac
		 
		String input = "Welcome to capgemini";
		String output = "";
		String[] split = input.split(" ");
		for (String word : split) {
			char[] charArray = word.toCharArray();
			String reversedword = "";
			for (int i = word.length()-1; i >= 0; i--) {
				char c = charArray[i];
				reversedword = reversedword+c;
			}
			System.out.println("Reversed Word "+reversedword);
			output = output+reversedword;
			output = output+ " ";
		}
		
		System.out.println("Reversed Word "+output);
		
	}

}
