package java_collection;

public class Singly_LinkedList {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node (int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void print () {
		Node obj = head;
		while (obj != null) {
			System.out.println(obj.data);
			obj = obj.next;
		}
	}
	
	public static void main(String[] args) {
		Singly_LinkedList sll = new Singly_LinkedList ();
		
		Node first = sll.new Node (10);
		sll.head = first;
		
		Node second = sll.new Node (20);
		first.next = second;
		
		Node third = sll.new Node (30);
		second.next = third;
		
		sll.print();
	}

}
