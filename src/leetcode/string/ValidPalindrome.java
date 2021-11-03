/**
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
package leetcode.string;

public class ValidPalindrome {

    public static boolean solution(String string) {
        if (string.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = string.length() - 1;
        while (left <= right) {
            char leftChar = string.charAt(left);
            char rightChar = string.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("A man, a plan, a canal: Panama"));
    }

}