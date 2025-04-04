package com.java.interview;

public class FibonacciUSingREcursion {

	public static void main(String[] args) {
		int inputNum = 9;
		int fibonacciNumber = fibonacciNumber(inputNum);
		System.out.println(fibonacciNumber);

	}

	private static int fibonacciNumber(int n) {
		if (n <= 1) {
			return n;
		}else return fibonacciNumber(n-1)+fibonacciNumber(n-2);
	}
}
