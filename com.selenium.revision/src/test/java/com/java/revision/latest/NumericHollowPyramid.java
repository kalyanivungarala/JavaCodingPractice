package com.java.revision.latest;

public class NumericHollowPyramid {
	public static void main(String[] args) {
		int numberOfRows = 5;
		int numberOfColums = 5;
		for (int i = 1; i <= numberOfRows; i++) {
			for (int j = 1; j <= i; j++) {
				if (j==1 || i==j || i==5) {
					
					System.out.print(j);
				}else { System.out.print(" "); }
			}
			System.out.println();
		}
	}

}
