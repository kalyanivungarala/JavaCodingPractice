package com.java.interview;

import java.util.Scanner;

public class Factors {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int number = scanner.nextInt();
		int count =0;
		System.out.println("The factors are ");
		for (int i = 1; i < number-1; i++) {
			if (number % i == 0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("The number of factors are "+count);
		scanner.close();
		
	}

}
