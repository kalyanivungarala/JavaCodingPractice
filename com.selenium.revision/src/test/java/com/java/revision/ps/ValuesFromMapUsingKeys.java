package com.java.revision.ps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValuesFromMapUsingKeys {
	public static void main(String[] args) {
		Map<String, Integer> namesVsAges = new HashMap<String, Integer>();
		namesVsAges.put("Tulasi", 11);
		namesVsAges.put("Srinivas", 35);
		namesVsAges.put("Kalyani", 34);
		namesVsAges.put("Bhargav", 5);
		
		Set<String> keySet = namesVsAges.keySet();
		for (String name : keySet) {
			Integer age = namesVsAges.get(name);
			System.out.print(" "+name);
			System.out.println(" : "+age);
		}
	}

}
