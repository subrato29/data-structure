/**
 * 242. Valid Anagram
 *
 * Easy
 * Topics
 * Companies
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */

package src.leetcode.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean solution(String string1, String string2) {
        char[] ch = string1.toCharArray();
        Arrays.sort(ch);
        String sorted1 = new String(ch);

        ch = string2.toCharArray();
        Arrays.sort(ch);
        String sorted2 = new String(ch);
        return sorted1.equals(sorted2);
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()) {
            if(map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            }else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("anagram", "nagaram"));
    }

}