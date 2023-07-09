/**
 * 1684. Count the Number of Consistent Strings Easy 1.5K 59 Companies You are given a string allowed consisting of
 * distinct characters and an array of strings words. A string is consistent if all characters in the string appear in
 * the string allowed.
 *
 * Return the number of consistent strings in the array words.
 *
 * Example 1: Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"] Output: 2 Explanation: Strings "aaab" and
 * "baa" are consistent since they only contain characters 'a' and 'b'.
 *
 * Example 2: Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"] Output: 7 Explanation: All strings are
 * consistent.
 *
 * Example 3: Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"] Output: 4 Explanation: Strings
 * "cc", "acd", "ac", and "d" are consistent.
 */

package leetcode.string;

public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String word : words) {
            if (validateWordConsistOfAllow(allowed, word)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean validateWordConsistOfAllow(String allowed, String word) {
        for (char ch : word.toCharArray()) {
            if (allowed.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}