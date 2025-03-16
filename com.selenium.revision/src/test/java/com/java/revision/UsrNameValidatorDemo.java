package com.java.revision;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsrNameValidatorDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> userNames =  new HashSet<String>();
		
		while (true) {
			System.out.println("Enter username 123 :");
			String userName = scanner.nextLine();
			
			if (valisUserName(userName,userNames)) {
				System.out.println("Valid user name" + userName);
			}else {
				System.out.println("Invalid user name "+userName);
			}
		}
	}

	private static boolean valisUserName(String userName, Set<String> userNames) {
		//checking for duplicates
		if (userNames.contains(userName)) {
			return false;
		}
		
		//checking that user name should contain only alpha numeric characters
		if (! userName.matches("[a-zA-Z0-9]+")) {
			return false;
			
		}
		return true;
	}

}
