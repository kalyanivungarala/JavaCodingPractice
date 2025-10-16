package com.practice.salesforce;

import java.util.ArrayList;
import java.util.List;

public class StringClass {
	public static void main(String[] args) {
		String str= "My name is Kalyani vungarala";
		String[] split = str.split(" ");
		List<String> list = new ArrayList<String>();
		for (String string : split) {
			list.add(string);
		}
		
		System.out.println(list);
		
		list.remove(list.size()-1);
		list.add("Meesala");
		System.out.println(list);

	}
}
