package com.java.interview;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give input number ");
		int originalNumber = scanner.nextInt();
		scanner.close();
		int reverseNumber = 0;
		
		int number = originalNumber;
		
		while (number != 0) {
			int reminder = number%10; //reminder
			reverseNumber = (reverseNumber*10)+reminder;
			number = number/10;
			
		}
		
		if (originalNumber == reverseNumber) {
			System.out.println(" The given number is a palindrome");
		}else System.out.println(" The given number is not a palindrome");
		
		
		
	}

}
