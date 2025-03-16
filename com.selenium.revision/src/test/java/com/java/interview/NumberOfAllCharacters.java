package com.java.interview;

import java.util.Scanner;

public class NumberOfAllCharacters {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide the input string ");
		String nextLine = scanner.nextLine();
		scanner.close();
		int digits = 0;
		int letters = 0;
		int spaces = 0;
		int others = 0;
		
		char[] charArray = nextLine.toCharArray();
		for (Character c : charArray) {
			if (Character.isDigit(c)) {
				digits++;
			}else if (Character.isLetter(c)) {
				letters++;
			}else if (Character.isSpaceChar(c)) {
				spaces++;
			} else {
				others++;
			}
		}
		
		
		System.out.println("The number of digits in the given string - " + digits );
		System.out.println("The number of letters in the given string - " + letters );
		System.out.println("The number of spaces in the given string - " + spaces );
		System.out.println("The number of digits in the given string - " + others );
		
	}

}
