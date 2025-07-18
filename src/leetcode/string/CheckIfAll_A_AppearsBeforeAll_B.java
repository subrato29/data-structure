/**
 * 2124. Check if All A's Appears Before All B's Easy
 *
 * 165
 *
 * 1
 *
 * Add to List
 *
 * Share Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every
 * 'b' in the string. Otherwise, return false.
 *
 * Example 1: Input: s = "aaabbb" Output: true Explanation: The 'a's are at indices 0, 1, and 2, while the 'b's are at
 * indices 3, 4, and 5. Hence, every 'a' appears before every 'b' and we return true.
 *
 * Example 2: Input: s = "abab" Output: false Explanation: There is an 'a' at index 2 and a 'b' at index 1. Hence, not
 * every 'a' appears before every 'b' and we return false.
 *
 * Example 3: Input: s = "bbb" Output: true Explanation: There are no 'a's, hence, every 'a' appears before every 'b'
 * and we return true.
 */
package src.leetcode.string;

public class CheckIfAll_A_AppearsBeforeAll_B {

    public boolean checkString(String s) {
        int indexOfFirstAppearanceOfB = s.indexOf('b');
        if (indexOfFirstAppearanceOfB == -1) {
            return true;
        }
        String substr = s.substring(indexOfFirstAppearanceOfB);
        return substr.indexOf('a') == -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}