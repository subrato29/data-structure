package leetcode_queue_stack;

import java.util.ArrayList;
import java.util.List;

public class Stack_Using_List {
	
	List<Integer> list = new ArrayList<>();
	int index = 0;
	
	public boolean isEmpty () {
		if (list.size () == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push (int value) {
		list.add (value);
		index ++;
	}
	
	public void pop () {
		if (isEmpty ()) {
			System.out.println("List is empty"); 
		}
		System.out.println("Deleted element: " + list.get (index - 1));
		list.remove (index - 1);
		index --;
	}
	
	public int top () {
		if (isEmpty ()) {
			return 0;
		}
		return list.get (index - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Using_List obj = new Stack_Using_List ();
		obj.push (1);
		obj.push (2);
		obj.push (3);
		obj.push (4);
		obj.push (5);
		System.out.println(obj.list);
		
		obj.pop ();
		obj.pop ();
		System.out.println(obj.top ());
		
		System.out.println(obj.list);
	}

}
