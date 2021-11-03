/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:

Input: s = "a"
Output: 1
Example 3:

Input: s = "bb"
Output: 2
 

Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
 */
package leetcode.string;

public class LongestPalindrome {

    public static String solution(String input) {
        if (input.isEmpty()) {
            return null;
        }
        if (input.length() == 1) {
            return input;
        }
        String longest = input.substring(0, 1);
        for (int i = 1; i < input.length(); i++) {
            String temp = helper(input, i - 1, i + 1);
            if (temp.length() > longest.length()) {
                longest = temp;
            }

            temp = helper(input, i - 1, i);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest;
    }

    public static String helper(String input, int left, int right) {
        while (left >= 0 && right < input.length()) {
            if (input.charAt(left) != input.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return input.substring(left + 1, right);
    }

    public static void main(String[] args) {
        System.out.println(solution("abaxyzzyxf"));
    }

}