package com.practice.salesforce;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSort {
	
	public static void main(String[] args) {
//		//John, 25;       
//		Alice, 30;  
//		Bob, 20;         
//		Eve, 28;
//		o/p:
//		Bob 20
//		John 25
//		Eve 28
//		Alice 30
		
		Map<String, Integer> nameVsAge = new HashMap<String, Integer>();
		nameVsAge.put("John", 25);
		nameVsAge.put("Alice", 30);
		nameVsAge.put("Bob", 20);
		nameVsAge.put("Eve", 28);
		
		System.out.println("Before Sorting "+nameVsAge);
		
		//Need to sort the map on value's.
		Set<Entry<String,Integer>> entrySet = nameVsAge.entrySet();
		
		
		
		
	}

}
