package com.java.interview;

import java.util.Scanner;

public class FirstLetterCpaital {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String ");
		String originalStr = scanner.nextLine();
		scanner.close();
		String[] words = originalStr.split(" ");
		String completeStmt = "";
		for (String word : words) {
			String capitalizedString = "";
			char[] charArray = word.toCharArray();
			String firstChar = String.valueOf(charArray[0]).toUpperCase();
			capitalizedString = firstChar;
			for (int i = 1; i < charArray.length; i++) {
				capitalizedString = capitalizedString+charArray[i];
			}
			System.out.println("capitalizedString :"+capitalizedString);
			completeStmt = completeStmt+capitalizedString + " ";
		}
		System.out.println("Complete Statment "+completeStmt);
	}

}
