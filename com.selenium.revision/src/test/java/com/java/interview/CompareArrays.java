package com.java.interview;

import java.util.Arrays;

public class CompareArrays {
	
	public static void main(String[] args) {
		int a[] = {1,4,5,6};
		int b[] = {1,4,5,9,4};
		
		boolean equals = Arrays.equals(a, b);
		if (equals) {
			System.out.println("Arrays are equal ");
		}else
		System.out.println("Arrays are not equal ");
		
	}

}
