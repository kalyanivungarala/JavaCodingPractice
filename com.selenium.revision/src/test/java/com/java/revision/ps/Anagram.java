package com.java.revision.ps;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first word");
		String nextLine = scanner.nextLine();
		System.out.println("Enter second word");
		String nextLine2 = scanner.nextLine();
		char[] charArray = nextLine.toCharArray();
		char[] charArray2 = nextLine2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("Given words are Anagrams");
		}else
		System.out.println("Given words are NOT Anagrams");
		scanner.close();
	}

}
