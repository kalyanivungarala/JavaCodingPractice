package com.selenium.revision;

public class NonRepeatChars {
	
	public static void main(String[] args) {
		//FIRST NON-REPEATING CHARACTER IN A STRING
		 
		String str = "Doing Selenium automation";
		for (int i = 0; i < str.length(); i++) {
			String charac = str.substring(i,i+1);
			String substr = str.substring(i+1);
		//	System.out.println(substr);
			//if character is repeated
			if (!(substr.contains(charac))) {
				System.out.println(charac);
				break;
			}
		}
	}

}
