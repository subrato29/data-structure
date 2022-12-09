/**
 * 3. Longest Substring Without Repeating Characters
 * Medium
 * 30.7K
 * 1.3K
 * Companies
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring
 */

package leetcode.topInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {
        int uniquePointer = 0;
        int duplicatePointer = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (uniquePointer < s.length ()) {
            char ch = s.charAt (uniquePointer);
            if (!set.contains (ch)) {
                set.add (ch);
                uniquePointer++;
                maxLength = Math.max (set.size (), maxLength);
            } else {
                set.remove (s.charAt (duplicatePointer));
                duplicatePointer++;
            }
        }
        return maxLength;
    }

}
