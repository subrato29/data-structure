package stack_queue;
import javax.xml.soap.Node;

public class StackImplementUsingLinkedlist {
	
	Node head;
	
	class Node {
		int value;
		Node next;
	}
	
	StackImplementUsingLinkedlist () {
		head = null;
	}
	
	public void push (int value) {
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
	}
	
	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty");
		}
		
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		StackImplementUsingLinkedlist lls = new StackImplementUsingLinkedlist();
		//System.out.println(lls.pop());
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(50);
		lls.push(60);
		printList(lls.head);
		
		System.out.println("element removed or popped from stack: " + lls.pop());
		System.out.println("element removed or popped from stack: " + lls.pop());
		
		lls.push(45);
		System.out.println("element removed or popped from stack: " + lls.pop());
		
		printList(lls.head);
	}

}
