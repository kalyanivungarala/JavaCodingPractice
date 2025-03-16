package com.java.revision;

import java.util.Set;
import java.util.TreeSet;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a = { 55, 39, 26, 78, 55, 99, 30 };
		Set<Integer> mySet = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			mySet.add(a[i]);
		}
		System.out.println(mySet.toString());

	}

}
