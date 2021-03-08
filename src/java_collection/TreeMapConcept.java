package java_collection;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(4, "D");
		map.put(2, "A");
		map.put(5, "G");
		map.put(7, "A");
		map.put(1, "B");
		System.out.println(map);
		map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap(5).keySet());
		System.out.println(map.tailMap(5).keySet());
	}

}
