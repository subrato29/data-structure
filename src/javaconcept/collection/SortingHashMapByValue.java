package javaconcept.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class SortingHashMapByValue {

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
		
		HashMap<Integer, String> sortedMap = new LinkedHashMap<>();

		List<String> listOfValues = new ArrayList<String>(unsortedMap.values());
		Collections.sort(listOfValues);
		
		Iterator<Integer> itr = unsortedMap.keySet().iterator();
		for (int i = 0; i < listOfValues.size(); i++) {
			String value = listOfValues.get(i);
			while (itr.hasNext()) {
				Integer key = itr.next();
				String value1 = unsortedMap.get(key);
				if (value.equals(value1)) {
					sortedMap.put(key, value1);
					unsortedMap.remove(key);	
					itr = unsortedMap.keySet().iterator();
					break;
				}
			}
		}
		System.out.println("After sorting by value: " + sortedMap);
	}

}
