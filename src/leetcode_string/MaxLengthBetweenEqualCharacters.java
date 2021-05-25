package leetcode_string;

import java.util.HashMap;
/**
 * 1624. Largest Substring Between Two Equal Characters
 * 
 * Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.

Example 1:
Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.

Example 2:
Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".

Example 3:
Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.

Example 4:
Input: s = "cabbac"
Output: 4
Explanation: The optimal substring here is "abba". Other non-optimal substrings include "bb" and "".
 */
import java.util.Map;

public class MaxLengthBetweenEqualCharacters {

	public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int largest = -1;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr)) {
                largest = Math.max(largest, i - map.get(curr) - 1);
            } else {
                map.put(curr, i);   
            }
        }
        return largest;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
