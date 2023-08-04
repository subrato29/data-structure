/**
 * 125. Valid Palindrome Easy
 *
 * 2425
 *
 * 4315
 *
 * Add to List
 *
 * Share Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring
 * cases.
 *
 * Example 1: Input: s = "A man, a plan, a canal: Panama" Output: true Explanation: "amanaplanacanalpanama" is a
 * palindrome.
 *
 * Example 2: Input: s = "race a car" Output: false Explanation: "raceacar" is not a palindrome.
 */

package leetcode.twopointer;

public class IsPalindrome_125 {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}