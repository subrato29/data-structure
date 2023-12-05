/**
 * 46. Permutations
 * Medium
 * 14K
 * 237
 * Companies
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 *
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 */
package recursion.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        doPermute (0, result, nums);
        return result;
    }

    public void doPermute (int index, List<List<Integer>> result, int[] nums) {
        if (index == nums.length) {
            result.add (Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toList()));
        }
        for (int i = index; i < nums.length; i++) {
            swap (i, index, nums);
            doPermute (index + 1, result, nums);
            swap (i, index, nums);
        }
    }

    public void swap (int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
