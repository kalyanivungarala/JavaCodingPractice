package com.java.revision.ps;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int a[] = {2,3,55,34,355,6};
		int firstLargest = -1;
		int seondLargest = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > firstLargest) {
				firstLargest = a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > seondLargest && a[i] !=  firstLargest) {
				seondLargest = a[i];
			}
		}
		System.out.println("Printing forst Largest "+ firstLargest);
		System.out.println("Printing second Largest "+ seondLargest);
	}

}
