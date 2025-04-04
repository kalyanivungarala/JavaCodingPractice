package com.java.revision.latest;

public class MonotonicArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,34,3,1};
		boolean isIncreasing = true;
		boolean isDecreasing = true;
		for (int i = 1; i < a.length; i++) {
			if (a[i]>a[i-1]) {
				isIncreasing = false;
			}else isDecreasing = false;
		}
		if (isIncreasing || isDecreasing) {
			System.out.println("Array is monotonic"+isIncreasing+isDecreasing);
		}else System.out.println("Array is not  monotonic"+isIncreasing+isDecreasing);
	}

}
