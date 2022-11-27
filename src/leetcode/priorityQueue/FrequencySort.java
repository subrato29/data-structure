/**
 * 451. Sort Characters By Frequency
Medium

2913

157

Add to List

Share
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

Example 1:
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */

package leetcode.priorityQueue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {

    public String frequencySort(String s) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue < Character > maxHeap = new PriorityQueue < Character > ((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            for (int i = 0; i < map.get(current); i++) {
                sb.append(current);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}