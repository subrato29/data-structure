package java_collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortingHashMapByKey {

	public static void main(String[] args) {
		
		HashMap<Integer, String> unsortedMap = new HashMap<Integer, String>();
		unsortedMap.put(5, "A");
		unsortedMap.put(11, "C");
		unsortedMap.put(4, "Z");
		unsortedMap.put(77, "Y");
		unsortedMap.put(9, "P");
		unsortedMap.put(66, "Q");
		unsortedMap.put(0, "R");
		System.out.println("Before sorting: " + unsortedMap);
		
		Map<Integer, String> sortedMap = new TreeMap<Integer, String>();
		
		Iterator<Integer> itr = unsortedMap.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			String value = unsortedMap.get(key);
			sortedMap.put(key, value);
		}
		
		System.out.println("After sorting by key: " + sortedMap);
		
	}

}
