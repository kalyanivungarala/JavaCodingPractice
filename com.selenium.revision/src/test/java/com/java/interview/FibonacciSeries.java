package com.java.interview;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number ");
		int number = scanner.nextInt();
		scanner.close();
		int a = 1;
		int b = 1;
		int f = 0;
		System.out.println("Printing the fibonacci series ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		while (f <= number) {
			f =a+b ;
			System.out.print(f+" ");
			a = b;
			b = f;
		}
		
	}

}
