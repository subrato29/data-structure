/**
 * 1941. Check if All Characters Have Equal Number of Occurrences Easy
 *
 * 56
 *
 * 2
 *
 * Add to List
 *
 * Share Given a string s, return true if s is a good string, or false otherwise.
 *
 * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same
 * frequency).
 *
 * Example 1: Input: s = "abacbc" Output: true Explanation: The characters that appear in s are 'a', 'b', and 'c'. All
 * characters occur 2 times in s.
 *
 * Example 2: Input: s = "aaabb" Output: false Explanation: The characters that appear in s are 'a' and 'b'. 'a' occurs
 * 3 times while 'b' occurs 2 times, which is not the same number of times.
 */
package leetcode.string;

import java.util.*;

public class AreOccurrencesEqual {

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == 1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}