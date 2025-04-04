package com.java.revision.latest;

public class KeysChange {
	
	public static void main(String[] args) {
		String input = "abBcdefFgGG";
		char[] charArray = input.toCharArray();
		char lastKey = charArray[0];
		lastKey = Character.toLowerCase(lastKey);
		int count = 0;
		for (int i = 1; i <input.length(); i++) {
			char currentKey = charArray[i];
			currentKey = Character.toLowerCase(currentKey);
			if (lastKey != currentKey) {
				count++;
			}
			
			lastKey = currentKey;
		}
		
		System.out.println("Count of Key changes is "+count);
	}

}
