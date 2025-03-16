package com.java.interview;
import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //12345
		System.out.println("Enter input value ");
		int number = scanner.nextInt();
		int count = 0;
		while (number != 0) {
			count++;
			number = number/10;
			
		}
		System.out.println("Number of digits " + count);
		scanner.close();
		
		
	}

}
