/**
 * 451. Sort Characters By Frequency
Medium

2681

157

Add to List

Share
Given a string s, sort it in decreasing order based on the frequency of characters, and return the sorted string.

Example 1:
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */
package leetcode_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class FrequencySort {

    public String frequencySort(String s) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        ArrayList < Integer > list = new ArrayList < Integer > (map.values());
        Collections.sort(list, Collections.reverseOrder());
        Iterator < Character > itr = map.keySet().iterator();
        for (int i = 0; i < list.size(); i++) {
            while (itr.hasNext()) {
                char key = itr.next();
                int value = map.get(key);
                if (value == list.get(i)) {
                    for (int j = 0; j < value; j++) {
                        sb.append(key);
                    }
                    map.remove(key);
                    if (list.size() > 1) {
                        list.remove(i);
                    }
                    i = 0;
                    itr = map.keySet().iterator();
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}