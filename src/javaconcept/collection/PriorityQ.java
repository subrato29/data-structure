package javaconcept.collection;

import java.util.PriorityQueue;

public class PriorityQ {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
		
		pr.add(50);
		pr.add(750);
		pr.add(900);
		pr.add(500);
		pr.add(100);
		
		System.out.println(pr); //[25, 100, 50, 750, 500, 900]
		System.out.println(pr.size()); //5
		System.out.println(pr.poll()); //50
		
	}

}
