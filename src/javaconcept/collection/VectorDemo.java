package javaconcept.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(3);
		vector.add(10);
		vector.add(6);
		vector.add(4);
		
		System.out.println(vector);
		vector.remove(2);
		System.out.println(vector);
		
		Vector<Integer> vector1 = new Vector<Integer>();
		
		vector1.add(200);
		vector1.add(300);
		
		vector.addAll(vector1);
		System.out.println(vector);
		
		for (Integer e : vector) {
			System.out.println(e);
		}
		
		Iterator<Integer> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(vector);
		
		System.out.println(vector);
	}

}
