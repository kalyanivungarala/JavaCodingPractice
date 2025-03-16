package com.java.revision.ps;

import java.util.ArrayList;

public class CommonElements {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Srinivas");
		list1.add("Kalyani");
		list1.add("Tulasi");
		list1.add("Bhargav");
		list1.add("Meesala");
		list1.add("Vungarala");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Srinivas");
		list2.add("Kalyani");
		list2.add("Tulasi");
		list2.add("Bhargav");
		
		boolean retainAll = list1.retainAll(list2);
		
		System.out.println(list1);
	}

}
