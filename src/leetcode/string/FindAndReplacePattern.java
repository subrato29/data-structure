/**
 * 890. Find and Replace Pattern
Medium

1742

115

Add to List

Share
Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.

Example 1:
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.

Example 2:
Input: words = ["a","b","c"], pattern = "a"
Output: ["a","b","c"]
 */
package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {

	public List<String> findAndReplacePattern(String[] words, String pattern) {
        List <String> list = new ArrayList <String> ();
        for (String word : words) {
            if (matcher (word, pattern)) {
                list.add (word);
            }
        }
        return list;
    }
    
    public boolean matcher (String word, String pattern) {
        HashMap <Character, Character> wordMap = new HashMap <Character, Character> ();
        HashMap <Character, Character> patternMap = new HashMap <Character, Character> ();
        for (int i = 0; i < word.length (); i++) {
            char w = word.charAt (i);
            char p = pattern.charAt (i);
            if (!wordMap.containsKey (w)) {
                wordMap.put (w, p);
            }
            if (!patternMap.containsKey (p)) {
                patternMap.put (p, w);
            }
            if (wordMap.get (w) != p || patternMap.get (p) != w) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
