package practice;

import java.util.Stack;

public class Queue {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push (int value) {
		while (!s1.empty()) {
			s2.push(s1.pop());
		}
		s1.push(value);
		while (!s2.empty()) {
			s1.push(s2.pop());
		}
	}
	
	public int pop( ) {
		return s1.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
