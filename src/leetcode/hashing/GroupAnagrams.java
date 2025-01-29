/**
 * 49. Group Anagrams
Medium

7653

275

Add to List

Share
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */

package src.leetcode.hashing;

import java.util.*;

public class GroupAnagrams {

    public List < List < String >> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedString = new String(strArray);

            if(map.containsKey(sortedString)) {
                map.get(sortedString).add(str);
            }else {
                map.put(sortedString, new ArrayList<>(List.of(str)));
            }
        }

        return new ArrayList<> (map.values());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}