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
package src.leetcode.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountCharacters {

    public int countCharacters(String[] words, String chars) {
        int length = 0;

        for (String word : words) {
            if(isCharFormedByWord(word, chars)) {
                length += word.length();
            }
        }

        return length;
    }

    public Map<Character, Integer> charWiseCount(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }

    public boolean isCharFormedByWord (String word, String chars) {
        Map<Character, Integer> mapOfWord = charWiseCount(word);
        Map<Character, Integer> mapOfChars = charWiseCount(chars);

        for(char ch : word.toCharArray()) {
            if(mapOfChars.containsKey(ch)) {
                if(mapOfWord.get(ch) > mapOfChars.get(ch)) {
                    return false;
                }
            }else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

}