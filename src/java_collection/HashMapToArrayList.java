package java_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "D");
		map.put(2, "B");
		map.put(3, "G");
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " == " + entry.getValue());
 		}
	}

}
