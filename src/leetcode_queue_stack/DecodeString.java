package leetcode_queue_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DecodeString {

	public static String solution (String input) {
		Stack<Character> digit = new Stack<>();
		Stack<Character> bracket = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			char curr = input.charAt(i);
			
			if (Character.isDigit (curr)) {
				digit.push (curr);
			}
			if (curr == '[') {
				bracket.push (']');
				bracket.push ('[');
			}
		}
		
		int count = 0;
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == digit.peek ()) {
				if (input.charAt(i + 1) == bracket.peek ()) {
					bracket.pop ();
					while (count < input.length()) {
						if (input.charAt(count) == bracket.peek ()) {
							bracket.pop ();
							System.out.println(input.substring (i + 2, count));
						}
						count ++;
					}
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "2[abc]3[cd]ef";
		System.out.println(solution (input));
	}

}
