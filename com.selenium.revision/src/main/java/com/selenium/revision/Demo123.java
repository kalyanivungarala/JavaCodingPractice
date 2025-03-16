package com.selenium.revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo123 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.nextLine();
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		int thirdNum = scanner.nextInt();
		System.out.println("Numbers entered by user :"+firstNum+","+secondNum+","+thirdNum);
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(firstNum);
		numbers.add(secondNum);
		numbers.add(thirdNum);
		int result = doMathOperation(operation,numbers);
		System.out.println("Result of the operation on the numbers :"+result);
		int age = 2/0;
	}

	private static int doMathOperation(String operation, List<Integer> numbers) {
		int result = 0;
		switch (operation) {
		case "Add":
			//logic to math
			for (Integer number : numbers) {
				result = result+number;
			}
			break;
		case "Multiply":
			//logic to math
			int multiply = 1;
			for (Integer number : numbers) {
				multiply = multiply*number;
			}
			result = multiply;
			break;
			
			

		default:
			break;
		}
		return result;
	}

}
