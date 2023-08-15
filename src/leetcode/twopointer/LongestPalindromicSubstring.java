/**
 * 5. Longest Palindromic Substring
 *
 * Medium 26.6K 1.6K Companies Given a string s, return the longest palindromic
 *
 * substring in s.
 *
 *
 * Example 1: Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.
 *
 * Example 2: Input: s = "cbbd" Output: "bb"
 */
package leetcode.twopointer;

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() == 1) {
            return str;
        }
        String longest = str.substring(0, 1);

        for (int i = 1; i < str.length(); i++) {
            String temp = helper(str, i - 1, i + 1);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
            temp = helper(str, i - 1, i);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest;
    }

    public static String helper(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) != str.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }


    public static void main(String[] args) {

    }

}
