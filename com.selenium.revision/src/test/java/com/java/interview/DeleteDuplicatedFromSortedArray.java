package com.java.interview;

import java.util.Arrays;

public class DeleteDuplicatedFromSortedArray {
	
	public static void main(String[] args) {
		int sortedArray[] = {1,2,2,2,3,3,4,5,5,5,6,6,7,8,8};
		System.out.println("Array values before sorting"+Arrays.toString(sortedArray));
		int j= 0;
		for (int i = 0; i < sortedArray.length-1; i++) {
			if (sortedArray[i] != sortedArray[i+1]) {
				sortedArray[j] = sortedArray[i]; 
				j++;
			}
		}
		System.out.println("Array values after sorting"+Arrays.toString(sortedArray));
		for (int k = 0; k < j; k++) {
			System.out.print(sortedArray[k]+"  ");
		}
	
	}

}
