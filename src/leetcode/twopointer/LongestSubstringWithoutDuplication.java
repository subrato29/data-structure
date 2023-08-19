/**
 * 3. Longest Substring Without Repeating Characters
 *
 * Medium
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1: Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2: Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length of 1.
 *
 * Example 3: Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the length of 3. Notice that the
 * answer must be a substring, "pwke" is a subsequence and not a substring.
 */

package leetcode.twopointer;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplication {

    public int lengthOfLongestSubstring(String s) {
        int uniqueIndex = 0;
        int duplicateIndex = 0;
        int longest = 0;
        Set<Character> set = new HashSet();

        while (uniqueIndex < s.length()) {
            char ch = s.charAt(uniqueIndex);
            if (!set.contains(ch)) {
                set.add(ch);
                uniqueIndex++;
                longest = Math.max(longest, set.size());
            }
            else {
                set.remove(s.charAt(duplicateIndex));
                duplicateIndex++;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

}
