/**
 * 3. Longest Substring Without Repeating Characters
 *
 * Medium 36.1K 1.6K Companies
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

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int uniqueCharindex = 0;
        int duplicateCharIndex = 0;

        while (uniqueCharindex < s.length()) {
            char ch = s.charAt(uniqueCharindex);
            if (!set.contains(ch)) {
                set.add(ch);
                uniqueCharindex++;
                maxLength = Math.max(set.size(), maxLength);
            }
            else {
                set.remove(s.charAt(duplicateCharIndex));
                duplicateCharIndex++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}