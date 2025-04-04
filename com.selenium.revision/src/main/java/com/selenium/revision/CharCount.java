package com.selenium.revision;

public class CharCount {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] charArray = str.toCharArray();
		//System.out.println("Count of the Char Array is "+charArray.length);

		int count = 0;
		while (true) {
			try {
				str.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Count of the characters is "+count);
				break;
			}
		}
	}

}
