package com.java.interview;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String str = "Kalyani likes to spend time with Kids";
		String[] split = str.split(" ");
		String reversedString = "";
		for (String word : split) {
			String reverseWord = "";
			for (int i = word.length()-1; i >= 0; i--) {
				reverseWord = reverseWord+word.charAt(i);
			}
//			System.out.println( "Reversed Word :"+reverseWord);
			reversedString = reversedString+reverseWord;
		}
		System.out.println( "Reversed reversedString :"+reversedString);
		char c= 'M';
		System.out.println("Ascii value"+(int)c);
		System.out.println("This is a stament.\nThis is a stament.\n\tThis is a stament.\n\n\tThis is a stament");
	}

}
