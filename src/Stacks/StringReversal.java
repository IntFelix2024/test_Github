package Stacks;

import java.util.LinkedList;

public class StringReversal {
	
	public static String reverseString(String input) {	
		LinkedList<Character> stack = new LinkedList<>();
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		StringBuilder reversed = new StringBuilder();
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		return reversed.toString();
	}
	

	public static void main(String[] args) {
		System.out.println(reverseString("ABCDEFG"));

	}

}
