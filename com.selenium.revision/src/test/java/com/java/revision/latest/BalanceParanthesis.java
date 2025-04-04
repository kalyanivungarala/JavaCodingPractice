package com.java.revision.latest;

import java.util.Stack;

public class BalanceParanthesis {

	public static void main(String[] args) {
		String paran = "((";

		checkBalancePAranethesis(paran);
	}

	private static boolean checkBalancePAranethesis(String paran) {
		char[] charArray = paran.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char character : charArray) {
			if (character == '(') {
				stack.push(character);
			}else {
				if (character == ')') {
					if (stack.isEmpty()) {
						return false;
					}else {
						Character pop = stack.pop();
						if (pop != '(') {
							return false;
						}
					}
				}
			}
		}
		
		return stack.isEmpty();

	}

}
