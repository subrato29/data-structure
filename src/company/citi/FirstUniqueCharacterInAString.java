/**
 * 387. First Unique Character in a String
Easy

4683

188

Add to List

Share
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 */
package company.citi;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar1(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}