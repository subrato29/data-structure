/**
 * 49. Group Anagrams
 * Medium
 * 13.6K
 * 402
 * Companies
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
package leetcode.topInterviewQuestions;

import java.util.*;

public class GroupAnagrams_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort (arr);
            String sorted = new String(arr);
            if (map.keySet().contains(sorted)) {
                map.get(sorted).add (str);
            } else {
                map.put (sorted, new ArrayList<>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(map.values());
    }

}
