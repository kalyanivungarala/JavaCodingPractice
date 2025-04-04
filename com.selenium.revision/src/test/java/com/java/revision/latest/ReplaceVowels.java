package com.java.revision.latest;

public class ReplaceVowels {
	public static void main(String[] args) {
		String input = "My NAME is Kalyani";
		char[] charArray = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char c : charArray) {
			if (c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u' || c == 'A' || c == 'E'
					|| c == 'I' || c == 'O' || c == 'U') {
				sb.append('x');
			}else sb.append(c);
		}
		
		System.out.println("Modified string is "+sb.toString());
	}

}
