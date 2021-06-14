/**
 * 884. Uncommon Words from Two Sentences

 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Example 2:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
 */
package leetcode_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {

	public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map = helper(s1, map);
        map = helper(s2, map);
        List<String> list = new ArrayList<String>();
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            if (map.get(key) == 1) {
                list.add(key);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    public Map<String, Integer> helper (String S, Map<String, Integer> map) {
        String[] string = S.split(" ");
        for (int i = 0; i < string.length; i++) {
            map.put (string[i], map.getOrDefault(string[i], 0) + 1);
        }
        return map;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
