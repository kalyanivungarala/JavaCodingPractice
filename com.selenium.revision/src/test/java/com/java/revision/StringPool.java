package com.java.revision;

public class StringPool {

	public static void main(String[] args) {
		String s1 = "Bhargav";
		String s2 = "Ram";
		String s3 = "Bhargav";

		String s4 = new String("Bhargav");
		String s5 = new String ("Bhargav");
		String s6 = new String("Bhargav").intern();

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s5==s6);
		System.out.println(s1==s6);
	}

}
