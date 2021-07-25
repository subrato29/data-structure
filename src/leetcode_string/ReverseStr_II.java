/**
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 */
package leetcode_string;

public class ReverseStr_II {

    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return "";
        }
        int i = 0;
        StringBuilder sb = new StringBuilder(s);
        while (i < s.length()) {
            int left = i;
            int right = Math.min(i + k - 1, s.length() - 1);
            while (left < right) {
                char a = sb.charAt(left);
                char b = sb.charAt(right);
                sb.setCharAt(left, b);
                sb.setCharAt(right, a);
                left++;
                right--;
            }
            i = i + 2 * k;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}