/**
 * 1189. Maximum Number of Balloons
Easy

616

50

Add to List

Share
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:
Input: text = "nlaebolko"
Output: 1

Example 2:
Input: text = "loonbalxballpoon"
Output: 2

Example 3:
Input: text = "leetcode"
Output: 0
 */
package leetcode_string;

import java.util.HashMap;

public class MaxNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int counter = Integer.MAX_VALUE;

        counter = Math.min(counter, map.getOrDefault('b', 0));
        counter = Math.min(counter, map.getOrDefault('a', 0));
        counter = Math.min(counter, map.getOrDefault('l', 0) / 2);
        counter = Math.min(counter, map.getOrDefault('o', 0) / 2);
        counter = Math.min(counter, map.getOrDefault('n', 0));

        return counter;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}