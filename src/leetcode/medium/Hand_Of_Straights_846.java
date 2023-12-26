/**
 * 846. Hand of Straights
 * Medium
 *
 * Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
 *
 * Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.
 *
 * Example 1:
 * Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
 * Output: true
 * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
 *
 *
 * Example 2:
 * Input: hand = [1,2,3,4,5], groupSize = 4
 * Output: false
 * Explanation: Alice's hand can not be rearranged into groups of 4.
 */

package leetcode.medium;

import java.util.TreeMap;

public class Hand_Of_Straights_846 {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> countMap = new TreeMap<>();

        for(int value : hand) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        while (countMap.size() > 0) {
            int minValue = countMap.firstKey();

            for(int value = minValue; value < minValue + groupSize; value++) {
                if(!countMap.containsKey(value)) {
                    return false;
                }
                int count = countMap.get(value);
                if(count == 1) {
                    countMap.remove(value);
                }else {
                    countMap.put(value, count - 1);
                }
            }
        }
        return true;
    }
}
