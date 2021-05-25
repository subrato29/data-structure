/**
 * 680. Valid Palindrome II
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false
 */
package leetcode_twopointer;

public class ValidPalindromeII {

	public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                if (helper (s, start, end - 1)) {
                    return true;
                }
                if (helper (s, start + 1, end)) {
                    return true;
                }
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
    
    public static boolean helper (String string, int start, int end) {
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
