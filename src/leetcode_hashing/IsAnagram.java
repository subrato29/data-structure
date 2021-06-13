/**
 * 242. Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 
Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
package leetcode_hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IsAnagram {

	public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        sMap = charWiseCount(s);
        tMap = charWiseCount(t);
 
        Iterator<Character> itr = sMap.keySet().iterator();
        while (itr.hasNext()) {
            char key = itr.next();
            if (tMap.keySet().contains(key)) {
                if (!sMap.get(key).equals(tMap.get(key))) {
                    return false;
                }   
            } else {
                return false;
            }
        }
        return true;
    }
    
    public Map<Character, Integer> charWiseCount(String string) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
