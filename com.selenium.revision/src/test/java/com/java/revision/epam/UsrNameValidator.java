package com.java.revision.epam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsrNameValidator {
	public static void main(String[] args) {
		Scanner scannner = new Scanner(System.in);
		Set< String> userNames  = new HashSet<String>();

		while(true) {
			System.out.println("Enter user name :");
			String username = scannner.nextLine();

			if (validUserName(username, userNames)) {
				userNames.add(username);
				System.out.println("Valid UserName : "+username);
			}else {
				System.out.println("InValid UserName : "+username);
			}
		}
	}

	private static boolean validUserName(String username, Set<String> userNames) {
		//checking for duplicates
		if (userNames.contains(username)) {
			return false;
		}

		//check for alpha numeric characters only
		if (!username.matches("[a-zA-Z0-9]+")) {
			return false;	
		}
		return true;
	}

}
