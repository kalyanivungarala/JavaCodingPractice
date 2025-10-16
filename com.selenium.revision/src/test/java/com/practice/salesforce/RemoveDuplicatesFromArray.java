package com.practice.salesforce;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		int nums[] = {3,4,66,5,3,88,123,66,3,123};
		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> duplicates  = new HashSet<Integer>();
		for(int number : nums) {
			
			if (!(seen.add(number))) {
				duplicates.add(number);
			}
		}
		
		System.out.println("Duplicates "+duplicates);
	}

}
