package com.java.interview;

public class SumOfAllElements {
	public static void main(String[] args) {
		int a[] = {6,33,4,5,6,10,8,2};
		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum+a[i];
//		}
//		System.out.println("Sum of the all the elemtnts int he array :"+sum);
		
		for (int i : a) {
			sum= sum+i;
		}
		System.out.println("Sum of the all the elemtnts int he array :"+sum);
	}

}
