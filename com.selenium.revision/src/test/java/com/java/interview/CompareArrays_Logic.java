package com.java.interview;

public class CompareArrays_Logic {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,9};
		int b[] = {1,2,3,4};
		boolean isEqual = true;
		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				if (a[i] != b[i]) {
					isEqual = false;
					break;
				}
			}
		}else isEqual = false;
		
		if (isEqual) {
			System.out.println("Arrays are equal");
		}else
		System.out.println("Arrays are not equal");
		
	}

}
