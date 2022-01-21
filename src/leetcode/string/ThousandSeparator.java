/**
 * 1556. Thousand Separator
Easy

300

10

Add to List

Share
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

Example 1:
Input: n = 987
Output: "987"

Example 2:
Input: n = 1234
Output: "1.234"
 */
package leetcode.string;

public class ThousandSeparator {

    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for (int i = sb.length() - 3; i >= 1; i = i - 3) {
            sb.insert(i, ".");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}