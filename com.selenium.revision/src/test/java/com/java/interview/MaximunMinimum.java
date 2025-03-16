package com.java.interview;

public class MaximunMinimum {
	public static void main(String[] args) {
		int a[] = {666,2,9,7,88,4,3,22,9};
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
			min = a[i];	
			}
		}
		System.out.println("Maximum nuber is "+ max);
		System.out.println("Minimum nuber is "+ min);
		
	}

}
