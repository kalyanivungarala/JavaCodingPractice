package com.practice.salesforce;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
	
	public static void main(String[] args) {
		int[] arr1 = {33,2,4,5,6,7,8,11,12};
		int[] arr2 = {3,22,4,5,6,7,8,11,1244,66,99,23};
		
		Set<Integer> commonElements = getCommonElements(arr1, arr2);
		System.out.println(commonElements);
	}
	
	private static Set<Integer> getCommonElements(int[] arr1, int[] arr2){
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> result  = new HashSet<Integer>();
		for(int num:arr1) {
			set1.add(num);
		}
		
		for(int num:arr2) {
			if(set1.contains(num)) result.add(num);
		}
		
		return result;
	}

}
