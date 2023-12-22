/*
 * 128. Longest Consecutive Sequence
 * Medium
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 * Ref: https://www.youtube.com/watch?v=sHrb6phW3IA&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=186
 */

package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence_128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for(int num : nums) {
            numSet.add(num);
        }

        int longestLength = 0;

        for(int num : numSet) {
            int currentNum = num;
            int currentStreak = 1;

            if(!numSet.contains(currentNum - 1)) {
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak++;
                }
            }

            longestLength = Math.max(longestLength, currentStreak);
        }
        return longestLength;
    }
}
