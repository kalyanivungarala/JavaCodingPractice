package com.java.interview;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		int originalNumber = 153;
		int number = originalNumber;
		int cubedNumber = 0;
		while (number > 0) {
			int reminder = number%10;
			cubedNumber = cubedNumber+(reminder*reminder*reminder);
			number = number/10;
		}
		
		if (cubedNumber == originalNumber) {
			System.out.println("Given number is an Armstrong number");
		}else 
			System.out.println("Given number is not an Armstrong number");
	}

}
