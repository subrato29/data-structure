/**
 * 767. Reorganize String
Medium

3749

162

Add to List

Share
Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.

Example 1:
Input: s = "aab"
Output: "aba"

Example 2:
Input: s = "aaab"
Output: ""
 */
package leetcode.string;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {

    public String reorganizeString(String s) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        @SuppressWarnings({
            "unchecked",
            "rawtypes"
        })
        PriorityQueue < Character > maxHeap = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while (maxHeap.size() > 1) {
            char curr = maxHeap.remove();
            char next = maxHeap.remove();
            sb.append(curr);
            sb.append(next);
            map.put(curr, map.get(curr) - 1);
            map.put(next, map.get(next) - 1);
            if (map.get(curr) > 0) {
                maxHeap.add(curr);
            }
            if (map.get(next) > 0) {
                maxHeap.add(next);
            }
        }
        while (!maxHeap.isEmpty()) {
            char last = maxHeap.remove();
            if (map.get(last) > 1) {
                return "";
            }
            sb.append(last);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}