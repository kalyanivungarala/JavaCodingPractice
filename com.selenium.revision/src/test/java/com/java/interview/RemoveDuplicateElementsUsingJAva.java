package com.java.interview;

public class RemoveDuplicateElementsUsingJAva {
	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,2,5,3,7,1,8,5};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
			if (a[i] == a[j]) {
				System.out.println("Element is duplicated in the array "+a[i]);
			}	
			}
		}
	}

}
