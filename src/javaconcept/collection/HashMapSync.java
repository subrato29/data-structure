package javaconcept.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "D");
		map.put(2, "B");
		map.put(3, "G");
		
		//Synchronized map
		Map<Integer, String> syncMap = Collections.synchronizedMap(map);
		System.out.println(syncMap);
		
		//ConcurrentHashMap
		ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put (7, "G");
		concurrentMap.put (12, "A");
		concurrentMap.put (10, "L");
		
		System.out.println(concurrentMap.get(12));
		
	}

}
