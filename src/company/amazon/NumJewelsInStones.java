/**
 * 771. Jewels and Stones
Easy

3109

463

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

package company.amazon;

import java.util.HashMap;

public class NumJewelsInStones {

    public int numJewelsInStones(String jewels, String stones) {
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if (map.keySet().contains(ch)) {
                counter += map.get(ch);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}