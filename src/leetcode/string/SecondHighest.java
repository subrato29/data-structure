/**
 * 1796. Second Largest Digit in a String
Easy

211

65

Add to List

Share
Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1:
Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

Example 2:
Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 */
package leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;

public class SecondHighest {

    public int secondHighest(String s) {
        HashSet < Integer > set = new HashSet < Integer > ();
        for (char ch: s.toCharArray()) {
            if (Character.isDigit(ch)) {
                set.add(ch - '0');
            }
        }
        if (set.size() == 1 || set.size() == 0) {
            return -1;
        }
        ArrayList < Integer > list = new ArrayList < > (set);
        return list.get(list.size() - 2);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}