package leetcode.misc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortCharByFrequency {

	public static String sort (String str) {
		
		StringBuilder sb = new StringBuilder();
		
		List<Character> list = new ArrayList<>();
		char [] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length ; i++) {
			list.add (arr[i]);
		}
		
		Collections.sort(list);
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			sb.append (itr.next());
		}
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sort ("traaee"));

	}

}
