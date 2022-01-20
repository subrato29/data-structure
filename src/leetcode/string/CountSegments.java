/**
 * 434. Number of Segments in a String
Easy

396

955

Add to List

Share
Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

Example 2:
Input: s = "Hello"
Output: 1
 

Constraints:

0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
The only space character in s is ' '.
 */
package leetcode.string;

public class CountSegments {

    public int countSegments(String s) {
        int segment = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segment++;
            }
        }
        return segment;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}