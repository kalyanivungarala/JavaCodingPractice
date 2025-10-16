package com.java.revision.latest;

public class Syncronized {
	
	//1. Write a program to demonstrate the use of the synchronized keyword in Java.
	
	public static void main(String[] args) {
		createUser();
	}

	private static synchronized void createUser() {
		//Here i m trying to create the User and i use "synchronized" keyword because i want this method 
		//to be thread-safe means i dont want any other thread to execute when this method is executing .
		//So all the other threads wait till this thread execution is Completed and User is created.
		
		//This could be a a scenario when we are creating Users for Accounts like Banks,E-commerce apps like Amazon, Walmart etc.
		
	}

}
