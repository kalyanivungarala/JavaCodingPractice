package com.java.interview;

public class Factorial {
	
	public static void main(String[] args) {
		int number = 5;
		int factorial = factorial(4);
		System.out.println("Factorial of the number is  "+ factorial);
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}else return n*factorial(n-1);
	}

}
