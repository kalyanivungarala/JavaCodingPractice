package com.java.interview;

public class EvenOddNumbersInArray {
	
	public static void main(String[] args) {
		int a[] = {6,33,4,5,6,10,8,2};
		
		for (int number : a) {
			if (number % 2 == 0) {
				System.out.println("Even number :"+ number);
			}else System.out.println("Odd number :"+ number);
		}
	}

}
