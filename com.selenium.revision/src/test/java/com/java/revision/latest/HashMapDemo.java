package com.java.revision.latest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	//Create a simple Java program that uses a HashMap to store and retrieve key-value pairs.
	public static void main(String[] args) {

		getCountryNameForCountryCode();
	}

	private static void getCountryNameForCountryCode() {

		Map<String, String> countryCodeVsName = new HashMap<String, String>();
		countryCodeVsName.put("U.S.", "United States");
		countryCodeVsName.put("U.K.", "United Kingdom");
		countryCodeVsName.put("U.A.E.", "United Arab Emirates");

		//Possible operates on Map are put, get, isEmpty,remove,size etc.

		Set<Entry<String,String>> entrySet = countryCodeVsName.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("Country name for the given Country code "+entry.getKey()+" is "+entry.getValue());
		}
	}


}
