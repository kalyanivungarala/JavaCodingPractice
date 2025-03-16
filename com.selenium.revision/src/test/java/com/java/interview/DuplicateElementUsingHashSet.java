package com.java.interview;

import java.util.HashSet;

public class DuplicateElementUsingHashSet {
	
	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,2,5,3,7,1,8,5};
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (set.add(a[i]) == false) {
				System.out.println("Element is duplicated in the array "+a[i]);
			}
		}
	}

}
