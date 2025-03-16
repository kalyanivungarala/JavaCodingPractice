package com.java.interview;

public class RemoveCharsFromString {
	public static void main(String[] args) {
		String str = "This a test dtring !@#456";
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Post replace string "+replaceAll);
		
		String str1 = "A   B          C          D";
		String replaceAll1 = str1.replaceAll("\\s", "");
		System.out.println("Post replace string "+replaceAll1);
	}

}
