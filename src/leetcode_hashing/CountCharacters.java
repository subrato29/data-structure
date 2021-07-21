/**
 * 1160. Find Words That Can Be Formed by Characters
 * 
 * You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: 
The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: 
The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */
package leetcode_hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountCharacters {

    public int countCharacters(String[] words, String chars) {
        Map < Character, Integer > targetWord = new HashMap < Character, Integer > ();
        targetWord = charWiseCount(chars);
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (wordsFormedByChars(charWiseCount(word), charWiseCount(chars))) {
                sum += word.length();
            }
        }
        return sum;
    }

    public Map < Character, Integer > charWiseCount(String string) {
        Map < Character, Integer > map = new HashMap < Character, Integer > ();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public boolean wordsFormedByChars(Map < Character, Integer > word, Map < Character, Integer > targetWord) {
        Iterator < Character > itr = word.keySet().iterator();
        while (itr.hasNext()) {
            char key = itr.next();
            if (targetWord.keySet().contains(key)) {
                if (word.get(key) > targetWord.get(key)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

}