package misc_gouthampradhan;

import java.util.Stack;

public class MinStack {
	
	Integer min = Integer.MAX_VALUE;
	Stack<Integer> stack = new Stack<>();
	
	public void push (int num) {
		if (min >= num) {
			stack.push(min);
			min = num;
		}
		stack.push(num);
	}
	
	public void pop() {
		int pop = stack.pop();
		if (pop == min) {
			min = pop;
		}
	}
	
	public int top () {
		return stack.peek();
	}
	
	public int getMin () {
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
		obj.push(7);
		obj.push(5);
		obj.push(2);
		obj.push(4);
		System.out.println(obj.stack);
		obj.pop();
		System.out.println(obj.stack);
		
		obj.pop();
		System.out.println(obj.stack);
		
		System.out.println(obj.top());
		System.out.println(obj.getMin());
	}

}
