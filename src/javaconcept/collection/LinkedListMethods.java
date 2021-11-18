package javaconcept.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		
		Iterator<String> itr = names.iterator();
		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println(names);
		
		names.add(1, "F");
		names.add(1, "G");
		System.out.println(names);
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("AA");
		list.add("BB");
		
		names.addAll(list);
		System.out.println(names);
		
		names.addFirst("First");
		names.addLast("Last");
		System.out.println(names);
		
		names.removeAll(list);
		System.out.println(names);
		
		names.removeFirst();
		names.removeLast();		
		System.out.println(names);
		
		LinkedList<String> lang = new LinkedList<String>();
		lang.add("Javascript");
		lang.add("Go");
		lang.add("Java");
		lang.add("Python");
		
		Iterator langItr = lang.descendingIterator();
		while (langItr.hasNext()) {
			System.out.println(langItr.next());
		}
	}

}
