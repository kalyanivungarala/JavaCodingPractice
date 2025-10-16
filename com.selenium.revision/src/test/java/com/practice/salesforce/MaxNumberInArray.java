package com.practice.salesforce;

public class MaxNumberInArray {
	
	public static void main(String[] args) {
		int[] nums = {1,6,2457,3,99,12,6,58};
		int maxNumber = nums[0];
		for(int number : nums) {
			if (number > maxNumber) {
				maxNumber = number;
			}
		}
		
		System.out.println("Maximum nunber in the array "+maxNumber);
	}

}
