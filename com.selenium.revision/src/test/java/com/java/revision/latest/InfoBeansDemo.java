package com.java.revision.latest;

public class InfoBeansDemo {

	//	input = "aabcc"
	//			Output = 2
	//
	//			input = "aabcbdc"
	//			Output = 5
	//
	//			input = "aabbcdcd"
	//			Output = -1

	public static void main(String[] args) {
		int index = getIndex();
		System.out.println(index);
	}

	private static int getIndex() {
		String input = "aabcc";
		char[] charArray = input.toCharArray();
		boolean isRepeated = false;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				//charArray[i] == charArray[j]

				if (charArray[i] == charArray[j]) {
					isRepeated = true;
					break;
				} 
				//else System.out.println("Non repeating character is "+charArray[i]+ " at index "+i);
			}
			
			if (! isRepeated) {
				return i;
			}

		}
		
		return -1;
	}

}
