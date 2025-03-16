package com.java.interview;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scannner = new Scanner(System.in);
		System.out.println("Enter first number  ");
		int firstNum = scannner.nextInt();
		System.out.println("Enter second number  ");
		int secondNum = scannner.nextInt();
		System.out.println("Enter third number  ");
		int thirdNum = scannner.nextInt();
		if (firstNum > secondNum && firstNum > thirdNum) {
			System.out.println("The largest number is "+ firstNum);
		}else if (secondNum > thirdNum) {
			System.out.println("The largest number is "+ secondNum);
		}else System.out.println("The largest number is "+ thirdNum);
	}

}
