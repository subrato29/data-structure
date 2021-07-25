/**
 * Created by gouthamvidyapradhan on 04/05/2017.
 *
 * <p>Given an array of n integers where n > 1, nums, return an array output such that output[i] is
 * equal to the product of all the elements of nums except nums[i].
 *
 * <p>Solve it without division and in O(n).
 *
 * <p>For example, given [1,2,3,4], return [24,12,8,6].
 *
 * <p>Follow up: Could you solve it with constant space complexity? (Note: The output array does not
 * count as extra space for the purpose of space complexity analysis.)
 */

package leetcode_array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int mul = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = mul;
            mul *= nums[i];
        }
        mul = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= mul;
            mul *= nums[i];
        }
        return ans;
    }
    /**
    [1, 2, 3, 4] - nums
    [1, 1, 2, 6] -- ans

    mul => 1

    ans[4] => [, 1 * 6]
    mul => 1 * 4 = 4

    ans[3] => [4 * 2, 6]
    mul => 4 * 3 = 12

    ans[2] => [12 * 1, 8, 6]
    mul => 12 * 2

    ans[2] => [24 * 1, 8, 6]
    mul => 24
	*/

    public static void main(String[] args) {
        int[] arr = {
            1,
            2,
            3,
            4
        };
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

}