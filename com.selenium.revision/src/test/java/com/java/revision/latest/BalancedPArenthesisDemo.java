package com.java.revision.latest;

import java.util.Stack;

public class BalancedPArenthesisDemo {
	
	public static void main(String[] args) {
		String input = "((()))()";
		boolean checkIsBalncePArwntheiss = checkIsBalncePArwntheiss(input);
		System.out.println(checkIsBalncePArwntheiss);
	}

	private static boolean checkIsBalncePArwntheiss(String input) {
		char[] charArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : charArray) {
			if (c == '(') {
				stack.push(c);
			}else {
				if (stack.isEmpty()) {
					return false;
				}else {
					Character pop = stack.pop();
					if (pop != '('	) {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}

}
