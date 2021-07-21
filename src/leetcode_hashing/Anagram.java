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
package leetcode_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public static List < Integer > solution(String input, String string) {
        List < Integer > list = new ArrayList < Integer > ();
        if (input.length() < string.length()) {
            return list;
        }
        if (string == "" || input == "") {
            return list;
        }
        int i = 0;
        int limitOfIteration = input.length() - string.length() + 1;
        while (i < limitOfIteration) {
            char[] ch = input.substring(i, i + string.length()).toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            ch = string.toCharArray();
            Arrays.sort(ch);
            string = new String(ch);
            if (sorted.equals(string)) {
                list.add(i);
            }
            i++;
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(solution("cbaebabac", "abc"));
    }

}