package com.java.revision.latest;

public class FindMissingNumberWithXOR {
	
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
		int missingNumber  = 0;
		
		for (int no : numbers) {
			missingNumber = missingNumber ^ no;
		}
		
		for (int i = 0; i <= numbers.length+1; i++) {
			missingNumber = missingNumber ^ i;
		}
		
		System.out.println("Missing Number "+missingNumber);
	}

}
