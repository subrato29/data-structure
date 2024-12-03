/*
 * Given a string s and a non-empty string p, find all
 * the start indices of p's anagrams in s.
 *
 * <p>Strings consists of lowercase English letters only and the length of both strings s and p will
 * not be larger than 20,100.
 *
 * <p>The order of output does not matter.
 *
 * <p>Example 1:
 *
 * <p>Input: s: "cbaebabacd" p: "abc"
 *
 * <p>Output: [0, 6]
 *
 * <p>Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc". The
 * substring with start index = 6 is "bac", which is an anagram of "abc". Example 2:
 *
 * <p>Input: s: "abab" p: "ab"
 *
 * <p>Output: [0, 1, 2]
 *
 * <p>Explanation: The substring with start index = 0 is "ab", which is an anagram of "ab". The
 * substring with start index = 1 is "ba", which is an anagram of "ab". The substring with start
 * index = 2 is "ab", which is an anagram of "ab".
 */

package src.leetcode.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramStartingIndex = new ArrayList<>();

        char[] smallerStringArray = p.toCharArray();
        Arrays.sort(smallerStringArray);
        String smallerStringSorted = new String(smallerStringArray);

        int index = 0;
        int highestTraversalIndex = s.length() - p.length() + 1;

        while (index < highestTraversalIndex) {
            String potentialAnagram = s.substring(index, index + p.length());

            char[] potentialAnagramArray = potentialAnagram.toCharArray();
            Arrays.sort(potentialAnagramArray);
            String potentialAnagramSorted = new String(potentialAnagramArray);

            if(smallerStringSorted.equals(potentialAnagramSorted)) {
                anagramStartingIndex.add (index);
            }

            index++;
        }

        return anagramStartingIndex;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabac", "abc"));
    }

}