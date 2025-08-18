/**
 * 242. Valid Anagram Easy
 *
 * 3191
 *
 * 176
 *
 * Add to List
 *
 * Share Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1: Input: s = "anagram", t = "nagaram" Output: true
 *
 * Example 2: Input: s = "rat", t = "car" Output: false
 */

package src.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}