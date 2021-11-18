package javaconcept.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//Compare by key, value
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//Compare by keys
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		//find out extra key in hashmap
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(map1.keySet());
		set.addAll(map4.keySet());
		set.removeAll(map1.keySet());
		System.out.println(set);
		
		//Compare by values of hashmap
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		
		//duplicates are not allowed
		System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<String>(map6.values())));
		System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<String>(map7.values())));
		
		//duplicates are allowed
		System.out.println(new HashSet<String>(map5.values()).equals(new HashSet<String>(map6.values())));
		System.out.println(new HashSet<String>(map5.values()).equals(new HashSet<String>(map7.values())));
	}

}
