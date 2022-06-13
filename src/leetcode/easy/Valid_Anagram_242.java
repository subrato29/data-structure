/**
 * 242. Valid Anagram
Easy

5145

218

Add to List

Share
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */
package leetcode.easy;

import java.util.HashMap;

public class Valid_Anagram_242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch: t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}