/**
 * 438. Find All Anagrams in a String
 *
 * Medium
 * Topics
 * Companies
 * Given two strings s and p, return an array of all the start indices of p's
 * anagrams
 *  in s. You may return the answer in any order.
 *
 * Example 1:
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 * Example 2:
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

package src.leetcode.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramStartingIndex = new ArrayList<>();

        String smallerStringSorted = sortString(p);

        int index = 0;
        int highestTraversalIndex = s.length() - p.length() + 1;

        while (index < highestTraversalIndex) {
            String potentialAnagram = s.substring(index, index + p.length());
            String potentialAnagramSorted = sortString(potentialAnagram);

            if(smallerStringSorted.equals(potentialAnagramSorted)) {
                anagramStartingIndex.add (index);
            }

            index++;
        }

        return anagramStartingIndex;
    }

    public String sortString(String string) {
        char[] smallerStringArray = string.toCharArray();
        Arrays.sort(smallerStringArray);
        return new String(smallerStringArray);
    }

    public static void main(String[] args) {

    }

}