package com.java.revision.ps;

import java.util.Arrays;

public class SecondLargestInArray_Sort {
	public static void main(String[] args) {
		int a[] = {2,3,55,34,355,6};

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Printing second Largest "+ a[a.length-2]);
	}
	

}
