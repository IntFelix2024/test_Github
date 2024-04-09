package Stacks;

import java.util.Stack;

public class Aufgabe1{

	public static String reverseString(String input) {
		Stack <Character> stackIn = new Stack<>();
		Stack <Character> stackOut = new Stack<>();
		for(int i = 0; i < input.length(); i++) {
			stackIn.push(input.charAt(i));
		}
		
		while (!stackIn.isEmpty()) {
			stackOut.add(stackIn.lastElement());
		}
		String output = stackOut.toString();
		return output;
	}
	
	public static void main(String[] args) {
		String input1 = "Hello";
		System.out.println("Original: " + input1);
		System.out.println("Reversed: " + reverseString(input1));

		String input2 = "OpenAI";
		System.out.println("Original: " + input2);
		System.out.println("Reversed: " + reverseString(input2));

		String input3 = "Java";
		System.out.println("Original: " + input3);
		System.out.println("Reversed: " + reverseString(input3));
	}
}