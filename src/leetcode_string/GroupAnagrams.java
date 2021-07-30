/**
 * 49. Group Anagrams
Medium

6163

247

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

package leetcode_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List < List < String >> groupAnagrams(String[] strs) {
        HashMap < String, List < String >> map = new HashMap < String, List < String >> ();
        for (int i = 0; i < strs.length; i++) {
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String sorted = new String(strArr);

            if (map.keySet().contains(sorted)) {
                map.get(sorted).add(strs[i]);
            } else {
                map.put(sorted, new ArrayList < String > (Arrays.asList(strs[i])));
            }
        }
        return new ArrayList < > (map.values());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}