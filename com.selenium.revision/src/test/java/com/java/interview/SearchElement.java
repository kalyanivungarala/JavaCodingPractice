package com.java.interview;

public class SearchElement {
	public static void main(String[] args) {
		int a[] = {3,4,59,2,66};
		int searchNum = 66;
		for (int num : a) {
			if (num ==  searchNum) {
				System.out.println("Matching element found "+num);
				break;
			}
		}
	}

}
