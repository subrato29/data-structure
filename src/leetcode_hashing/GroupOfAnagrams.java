/**
 * Given an array of strings, group anagrams together.
 *
 * <p>For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], Return:
 *
 * <p>[ ["ate", "eat","tea"], ["nat","tan"], ["bat"] ] Note: All inputs will be in lower-case.
 */
package leetcode_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {

	public static List<List<String>> solution (List<String> listOfWords) {
		Map<String, List<String>> map = new HashMap <String, List<String>>();
		
		for (String word : listOfWords) {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			
			if (map.containsKey(sorted)) {
				map.get(sorted).add(word);
			} else {
				map.put(sorted, new ArrayList<String>(Arrays.asList(word)));
			}
		}
		return new ArrayList<>(map.values());
	}
	
	public static void main(String[] args) {
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(solution (Arrays.asList(arr)));
	}

}
