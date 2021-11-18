package javaconcept.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		map.put("F", 6);
		System.out.println(map);
		
		//Iterator over keys
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			int value = map.get(key);
			System.out.println(key + " ------------- " + value);
		}
		System.out.println("===============================");
		
		//Iterator over set(pair)
		Iterator<Entry<String, Integer>> itr1 = map.entrySet().iterator();
		while (itr1.hasNext()) {
			Entry<String, Integer> entry = itr1.next();
			System.out.println(entry.getKey() + " ------------- " + entry.getValue());
		}
		System.out.println("===============================");
		
		//Iterate through java 8 for each and lambda;
		map.forEach((key, value) -> System.out.println(key + " ------------- " + value));
	}

}
