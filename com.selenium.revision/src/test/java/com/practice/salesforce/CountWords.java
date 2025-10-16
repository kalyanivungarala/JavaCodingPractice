package com.practice.salesforce;

import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide me input : ");
		
		//String input = scanner.next();
		
		String input = "My name is Kalyani";
		
		
		String[] words = input.split(" ");
		System.out.println("Number of words "+words.length);
		
		
		scanner.close();
		
	}

}
