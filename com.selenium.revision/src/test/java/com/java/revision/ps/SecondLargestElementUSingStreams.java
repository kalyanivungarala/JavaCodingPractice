package com.java.revision.ps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondLargestElementUSingStreams {
	public static void main(String[] args) {
		int a[] = {3,5,1,4,2};
		int a2[] = {9,5,11,4,22,1};
		findSecondLargestElement(a);
		fetchCommonElements(a, a2);
		reverseArrayInPlace(a);
		findLengthOfLongestSTring();
		findLengthOfLongestSTringUSingStreams();
	}

	private  static void findSecondLargestElement(int a[] ) {
		int secondLargestElement = Arrays.stream(a).distinct().sorted().skip(1).findFirst().orElseThrow( ()-> new IllegalArgumentException("There is no second element"));
		System.out.println(secondLargestElement);

	}
	
	private static void reverseArrayInPlace(int a[]) {
		IntStream.range(0, a.length/2).forEach(i ->{
			int temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		});
		System.out.println("Array reversed inplace "+Arrays.toString(a));
	}

	private static void fetchCommonElements(int a[], int a2[]) {
		List<Integer> collect = Arrays.stream(a).filter(Number -> Arrays.stream(a2).anyMatch(arrNumber2 -> arrNumber2 == Number )).boxed().collect(Collectors.toList());
		List<Integer> collect2 = Arrays.stream(a).filter(number -> Arrays.stream(a2).anyMatch(number2 -> number2 == number)).boxed().collect(Collectors.toList());

		System.out.println("Common Elements in the list  "+collect);
		System.out.println("Common Elements in the list  "+collect2+collect2);
	}
	
	private static void findLengthOfLongestSTring() {
		String[] fruits = {"Apple","Banana","Apricot","Avocado","Green Grapes"};
		int maxLength = -1;
		String maxString = "";
		for (String fruitName : fruits) {
			int length = fruitName.length();
			if (length >= maxLength) {
				maxLength = length;
				maxString = fruitName;
			}
		}
		System.out.println(maxString+maxLength);
	}

	private static void findLengthOfLongestSTringUSingStreams() {
		String[] fruits = {"Apple","Banana","Apricot","Avocado","Green Grapes"};
		int maxLength = Arrays.stream(fruits).mapToInt(string -> string.length()).max().orElse(0);
		
		System.out.println("Longest string length "+maxLength);
	}

}
