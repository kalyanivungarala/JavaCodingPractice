package com.practice.salesforce;

public class PrimeNumber {
	
	public static void main(String[] args) {
		boolean isPrime = isPrime(12);
		System.out.println(isPrime);
	}
	
	private static boolean  isPrime(int num) {
		if(num<=1) return false;
		for(int j=2;j <= Math.sqrt(num);j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}
