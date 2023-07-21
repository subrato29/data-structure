/**
 * 680. Valid Palindrome II
 *
 * Easy 7.4K 379 Companies
 *
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 * Example 1: Input: s = "aba" Output: true
 *
 * Example 2: Input: s = "abca" Output: true Explanation: You could delete the character 'c'.
 *
 * Example 3: Input: s = "abc" Output: false
 */
package leetcode.string;

public class ValidPalindromeII {

    public static boolean solution(String string) {
        int start = 0;
        int end = string.length() - 1;
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                if (helper(string, start, end - 1)) {
                    return true;
                }
                return helper(string, start + 1, end);
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static boolean helper(String string, int start, int end) {
        while (start <= end) {
            char left = string.charAt(start);
            char right = string.charAt(end);
            if (left != right) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String string = "abbcbbbbbba";
        System.out.println(solution(string));
    }

}