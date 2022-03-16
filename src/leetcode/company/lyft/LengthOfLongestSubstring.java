/**
 * 3. Longest Substring Without Repeating Characters
Medium

22101

993

Add to List

Share
Given a string s, find the length of the longest substring without repeating characters.

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
 */
package leetcode.company.lyft;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int unique_char_pointer = 0;
        int duplicate_char_pointer = 0;
        int max = 0;
        HashSet < Character > set = new HashSet < Character > ();
        while (unique_char_pointer < s.length()) {
            char ch = s.charAt(unique_char_pointer);
            if (!set.contains(ch)) {
                set.add(ch);
                unique_char_pointer++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(duplicate_char_pointer));
                duplicate_char_pointer++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}