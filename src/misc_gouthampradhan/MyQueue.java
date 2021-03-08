package misc_gouthampradhan;

import java.util.Stack;

class MyQueue {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push (int value) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(value);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public int pop () {
		return s1.pop();
	}
	
	public int peek () {
		return s1.peek();
	}
	
	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
	public static void main (String[] args) {
		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		System.out.println(obj.s1);
		System.out.println(obj.peek());
	}
}
