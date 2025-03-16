package com.java.interview;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //12345
		System.out.println("Enter input value ");
		int number = scanner.nextInt();
		int sumOfDigits = 0;
		while (number != 0) {
			int reminder = number%10;
			sumOfDigits=sumOfDigits+reminder ;
			number = number/10;
			
		}
		System.out.println("Number of digits " + sumOfDigits);
		scanner.close();
		
		
	}

}
