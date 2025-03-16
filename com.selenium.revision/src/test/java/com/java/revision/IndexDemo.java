package com.java.revision;

public class IndexDemo {
	public static void main(String[] args) {
		int a[] = {2,3,5,4,7,11,15};
		int target = 9;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length ; j++) {
				int sum = a[i]+a[j];
//				System.out.print("sum  "+sum);
				if (sum ==  target) {
					
					System.out.println("My indices are +"+ i+","+j);
				}
			}
			System.out.println("");
		}
	}

}
