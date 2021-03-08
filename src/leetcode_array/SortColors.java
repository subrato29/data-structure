/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

Example 3:
Input: nums = [0]
Output: [0]

xample 4:
Input: nums = [1]
Output: [1]
 */
package leetcode_array;

import java.util.Arrays;

public class SortColors {
	public static void sortColors(int[] nums) {
        int zeroPos = 0, twoPos = nums.length - 1;
        int i = 0;
        while(i <= twoPos){
            if(nums[i] == 0){
            	swap(nums, i, zeroPos);
            	zeroPos++;
                i++;
            } else if(nums[i] == 2){
                swap(nums, i, twoPos);
                twoPos--;
            } else {
            	i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

	
	public static void swap (int[] array, int index1, int index2) {
		int temp = array[index2];
		array[index2] = array[index1];
		array[index1] = temp;
	}

	
	public static void main(String[] args) {
		int[] array = {2, 0, 2, 1, 0, 2, 0, 1};
		//int[] array = {2, 0, 1};
		sortColors(array);
	}

}
