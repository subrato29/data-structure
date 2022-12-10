/**
 * 14. Longest Common Prefix
 * Easy
 * 11.6K
 * 3.6K
 * Companies
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
package leetcode.topInterviewQuestions;

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf (prefix) != 0) {
                prefix = prefix.substring (0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
