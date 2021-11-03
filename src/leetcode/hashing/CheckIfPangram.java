/**
 * 1832. Check if the Sentence Is Pangram
Easy

274

8

Add to List

Share
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
Input: sentence = "leetcode"
Output: false
 */
package leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {

    public boolean checkIfPangram(String sentence) {
        Set < Character > set = new HashSet < Character > ();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}