/**
 * 819. Most Common Word
Easy

1094

2284

Add to List

Share
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Example 1:
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.

Example 2:
Input: paragraph = "a.", banned = []
Output: "a"
 */

package leetcode.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet < String > bannedWords = new HashSet < String > ();
        for (int i = 0; i < banned.length; i++) {
            bannedWords.add(banned[i]);
        }
        HashMap < String, Integer > paraWords = new HashMap < String, Integer > ();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
        String[] array = paragraph.split(" ");
        for (int i = 0; i < array.length; i++) {
            String string = array[i].trim();
            if (!bannedWords.contains(string) && string.length() != 0) {
                paraWords.put(string, paraWords.getOrDefault(string, 0) + 1);
            }
        }
        int maxCount = 0;
        String result = "";
        Iterator < String > itr = paraWords.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            int value = paraWords.get(key);
            if (value > maxCount) {
                maxCount = value;
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}