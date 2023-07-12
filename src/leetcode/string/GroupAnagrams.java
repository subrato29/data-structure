/**
 * 49. Group Anagrams Medium
 *
 * 6163
 *
 * 247
 *
 * Add to List
 *
 * Share Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all
 * the original letters exactly once.
 *
 * Example 1: Input: strs = ["eat","tea","tan","ate","nat","bat"] Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2: Input: strs = [""] Output: [[""]]
 *
 * Example 3: Input: strs = ["a"] Output: [["a"]]
 */

package leetcode.string;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr)
                    .add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}