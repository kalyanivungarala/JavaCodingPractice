package com.java.interview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int num[] = {14,1,2,5,6,5,5,7,8,17,1,8,9};
		System.out.println("Values in array"+Arrays.toString(num));
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set.toString());
		Integer[] array = set.toArray(new Integer[set.size()]);
		System.out.println("After removing duplicates "+Arrays.toString(array));
	}

}
