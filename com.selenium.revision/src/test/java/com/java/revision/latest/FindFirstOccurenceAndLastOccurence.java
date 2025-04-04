package com.java.revision.latest;

public class FindFirstOccurenceAndLastOccurence {
	
	public static void main(String[] args) {
		String str = "Hello World";
		char[] charArray = str.toCharArray();
		int firstIndex = -1;
		int lastIndex = -1;
		for (int index = 0; index < charArray.length; index++) {
			if (str.charAt(index) == 'o') {
				firstIndex = index;
				break;
			}
		}
		for (int index = charArray.length-1; index >=0; index--) {
			if (str.charAt(index) == 'o') {
				lastIndex = index;
				break;
			}
		}
		
		System.out.println("First occurence of the given character "+ firstIndex);
		System.out.println("Last occurence of the given character "+ lastIndex);
		
	}

}
