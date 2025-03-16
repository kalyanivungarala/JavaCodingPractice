package com.java.revision;

public class PatternDemo {

	public static void main(String[] args) {
		String str = "*";
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}

}
