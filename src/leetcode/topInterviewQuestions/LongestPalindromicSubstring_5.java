/**
 * 5. Longest Palindromic Substring
 * Medium
 * 22.9K
 * 1.3K
 * Companies
 * Given a string s, return the longest
 * palindromic
 *
 * substring
 *  in s.
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 */
package leetcode.topInterviewQuestions;

public class LongestPalindromicSubstring_5 {

    public String longestPalindrome(String s) {
        if (s.length () == 1 || s.isEmpty ()) {
            return s;
        }
        String longest = s.substring (0, 1);
        for (int i = 0; i < s.length (); i++) {
            String newSubstring = getLongest (s, i, i);
            if (longest.length() < newSubstring.length()) {
                longest = newSubstring;
            }
            newSubstring = getLongest (s, i - 1, i);
            if (longest.length() < newSubstring.length()) {
                longest = newSubstring;
            }
        }
        return longest;
    }

    public String getLongest (String s, int start, int end) {
        while (start >= 0 && end < s.length () && s.charAt (start) == s.charAt (end)) {
            start--;
            end++;
        }
        return s.substring (start + 1, end);
    }

}
