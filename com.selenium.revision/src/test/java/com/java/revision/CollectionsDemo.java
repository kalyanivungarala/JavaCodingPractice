package com.java.revision;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Java");
		a1.add("Ruby");
		a1.add("Python");
		a1.add("C");
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);
	}
}
