/**
 * 9. Palindrome Number
Easy

6496

2227

Add to List

Share
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
package leetcode.nickWhite;

public class Palindrome_Number_9 {

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int actual = x;
        int reverse = 0;
        while (x > 0) {
            int remainder = x % 10;
            x = x / 10;
            reverse = (reverse * 10) + remainder;
        }
        return actual == reverse;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}