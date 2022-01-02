/**
 * 693. Binary Number with Alternating Bits
Easy

804

98

Add to List

Share
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

Example 1:
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

Example 2:
Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.

Example 3:
Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
 */
package leetcode.math;

public class HasAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        String string = Integer.toBinaryString(n);
        int i = 0;
        while (i < string.length() - 1) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}