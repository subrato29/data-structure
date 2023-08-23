/**
 * 283. Move Zeroes
 *
 * Easy
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero
 * elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 *
 * Example 2: Input: nums = [0] Output: [0]
 */
package leetcode.twopointer;

public class MoveAllZeroEnd {

    public void moveZeroes(int[] nums) {
        int indexOfNonZero = 0;
        int index = 0;

        while (index < nums.length) {
            if (nums[index] != 0) {
                nums[indexOfNonZero] = nums[index];
                indexOfNonZero++;
            }
            index++;
        }
        while (indexOfNonZero < nums.length) {
            nums[indexOfNonZero] = 0;
            indexOfNonZero++;
        }
    }

    public static void main(String[] args) {

    }

}
