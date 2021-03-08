package stack_queue;

import java.util.Arrays;


public class StackImplementUsingArray {

	int size;
	int arr[];
	int top;
	
	StackImplementUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public boolean isEmpty () {
		return (top == -1);
	}
	
	public boolean isFull () {
		return (size - 1 == top);
	}
	
	public int peek () {
		if (!this.isEmpty()) {
			return arr[top];
		}else {
			System.out.println("Stack is emplty: ");
			return -1;
		}
	}
	
	public void push(int ele) {
		if(!isFull()) {
			top ++;
			arr[top] = ele;
			System.out.println("pused element: "+ele);
		}else {
			System.out.println("Stack is full now");
		}
	}


	public int pop() {
		if(!isEmpty()) {
			int returnedTop = top;
			top --;
			System.out.println("popped element: "+arr[returnedTop]);
			return arr[returnedTop];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public static void main(String[] args) {

		StackImplementUsingArray stack = new StackImplementUsingArray(10);
		stack.pop();
		
		System.out.println("----------------------------------------");
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		System.out.println("----------------------------------------");
		System.out.println(stack.peek());
		
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	
	}

}

