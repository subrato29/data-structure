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

package leetcode.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List < List < String >> groupAnagrams(String[] strs) {
        HashMap < String, ArrayList < String >> map = new HashMap < String, ArrayList < String >> ();
        for (String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if (map.keySet().contains(sorted)) {
                map.get(sorted).add(str);
            } else {
                map.put(sorted, new ArrayList < String > (Arrays.asList(str)));
            }
        }
        return new ArrayList < > (map.values());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}