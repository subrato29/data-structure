/**
 * 767. Reorganize String Medium
 *
 * 3749
 *
 * 162
 *
 * Add to List
 *
 * Share Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 *
 * Return any possible rearrangement of s or return "" if not possible.
 *
 * Example 1: Input: s = "aab" Output: "aba"
 *
 * Example 2: Input: s = "aaab" Output: ""
 */
package leetcode.twopointer;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {

    public String reorganizeString(String s) {
        HashMap<Character, Integer> charWiseFreq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charWiseFreq.put(ch, charWiseFreq.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue((a, b) -> charWiseFreq.get(b) - charWiseFreq.get(a));
        maxHeap.addAll(charWiseFreq.keySet());

        StringBuilder sb = new StringBuilder();
        while (maxHeap.size() >= 2) {
            char curr = maxHeap.remove();
            char next = maxHeap.remove();

            sb.append(curr);
            sb.append(next);

            charWiseFreq.put(curr, charWiseFreq.get(curr) - 1);
            charWiseFreq.put(next, charWiseFreq.get(next) - 1);

            if (charWiseFreq.get(curr) > 0) {
                maxHeap.add(curr);
            }
            if (charWiseFreq.get(next) > 0) {
                maxHeap.add(next);
            }
        }
        while (!maxHeap.isEmpty()) {
            char last = maxHeap.remove();
            if (charWiseFreq.get(last) > 1) {
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