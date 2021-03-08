package practice;

import javax.xml.soap.Node;

public class LinkedlistStack {
	Node head;
	
	class Node {
		int value;
		Node next;
	}
	
	LinkedlistStack() {
		head = null;
	}
	
	public void push (int value) {
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value + " ");
			temp = temp.next;
		}		
	}
	
	public int pop() {
		if (head == null) {
			System.out.println("Your linklist stack is empty");
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public static void main(String[] args) {
		
		LinkedlistStack obj = new LinkedlistStack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		
		printList(obj.head);
		
		obj.pop();
		obj.pop();
		System.out.println("===========");
		
		printList(obj.head);

	}

}
