/**
 * 415. Add Strings Easy
 *
 * 2276
 *
 * 442
 *
 * Add to List
 *
 * Share Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a
 * string.
 *
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You
 * must also not convert the inputs to integers directly.
 *
 * Example 1: Input: num1 = "11", num2 = "123" Output: "134"
 *
 * Example 2: Input: num1 = "456", num2 = "77" Output: "533"
 *
 * Example 3: Input: num1 = "0", num2 = "0" Output: "0"
 */

package leetcode.twopointer;

public class AddStrings {

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse()
                .toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char num = '7';
        System.out.println(num - '0' - 8);
    }

}