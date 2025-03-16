package com.java.interview;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int a[] = {3,4,59,2,66,1};
		Arrays.parallelSort(a);
		System.out.println("Sorted Array "+ Arrays.toString(a));
	}

}
