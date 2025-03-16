package com.java.interview;

import java.util.Scanner;

public class RandomNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double random = Math.random();
		int range =500;
		System.out.println((int)(random*range));
	}

}
