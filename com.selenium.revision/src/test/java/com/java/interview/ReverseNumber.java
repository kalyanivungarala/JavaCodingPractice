package com.java.interview;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give input number ");
		int originalNumber = scanner.nextInt();
		scanner.close();
		int reverseNumber = 0;
		
		int number = originalNumber;

		while (number != 0) {
			int reminder = number %10;
			reverseNumber = reverseNumber*10 + reminder;
			number = number/10;
		}
		
		
		System.out.println("Reverse number "+ reverseNumber);
	}

}
