package leetcode_twopointer;

import java.util.HashMap;
import java.util.Map;

public class longestSubstringWithoutDuplication {

	public static String longestSubstringWithoutDuplication(String str) {
		Map<Character, Integer> lastSeen = new HashMap<Character, Integer>();
		int[] longest = {0, 1};
		int startIndex = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (lastSeen.containsKey(c)) {
				startIndex = Math.max(startIndex, lastSeen.get(c) + 1);
			}
			if (longest[1] - longest[0] < i + 1 - startIndex) {
				longest = new int[] {startIndex, i + 1};
			}
			lastSeen.put(c, i);
		}
		String result = str.substring(longest[0], longest[1]);
		return result;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubstringWithoutDuplication("clementisacap"));
	}

}
