/**
 * 771. Jewels and Stones
Easy

2791

432

Add to List

Share
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
 */
package leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {

    public int numJewelsInStones(String jewels, String stones) {
        Set < Character > set = new HashSet < Character > ();
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            set.add(ch);
        }
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (set.contains(ch)) {
                counter++;
            }
        }
        return counter++;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}