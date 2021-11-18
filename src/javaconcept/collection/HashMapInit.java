package javaconcept.collection;

import java.util.Collections;
import java.util.Map;

public class HashMapInit {

	public static void main(String[] args) {
		
		//Immutable map with a single map
		Map<String, Integer> singletonMap = Collections.singletonMap("A", 1);
		System.out.println(singletonMap.get("A"));
		System.out.println(singletonMap);
		singletonMap.put("B", 2);
		System.out.println(singletonMap);
		
	}

}
