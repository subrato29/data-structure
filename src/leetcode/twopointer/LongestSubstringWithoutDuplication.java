/**
 * Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
 */

package leetcode.twopointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplication {

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
