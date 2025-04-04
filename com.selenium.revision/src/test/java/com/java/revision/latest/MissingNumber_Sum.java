package com.java.revision.latest;

public class MissingNumber_Sum {
	
	public static void main(String[] args) {
		int numbers[] = {1,2,3,5,6};
		int missingNumber = 0;
		int sumOfArray = 0;
		int totalNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumOfArray = sumOfArray+numbers[i];
		}
		System.out.println("Sum Of Arrays :"+sumOfArray);
		
		int n = numbers.length+1;
		totalNumbers = (n*(n+1))/2;

		System.out.println("Total numbers sum :"+totalNumbers);
		missingNumber = totalNumbers - sumOfArray;
		System.out.println("Missing Number is  :"+missingNumber);
	}

}
