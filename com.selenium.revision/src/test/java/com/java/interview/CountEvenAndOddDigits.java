package com.java.interview;
import java.util.Scanner;

public class CountEvenAndOddDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //12345
		System.out.println("Enter input value ");
		int number = scanner.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		while (number != 0) {
			int reminder = number%10;
			if (reminder %2 == 0) {
				evenCount++;
			}else oddCount++;
			number = number/10;
			
		}
		System.out.println("Number of even and odd digits " + evenCount + " Odd "+oddCount);
		scanner.close();
		
		
	}

}
