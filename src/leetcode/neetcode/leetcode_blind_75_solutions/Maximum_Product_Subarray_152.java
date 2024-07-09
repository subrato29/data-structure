/**
 * 152. Maximum Product Subarray
 *
 * Given an integer array nums, find a subarray that has the largest product, and return the product.
 *
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * Example 1:
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 *
 * Example 2:
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

/**
 * Initialization: We initialize maxProduct, minProduct, and result with the first element of the array. These variables represent the maximum product subarray, the minimum product subarray, and the final result, respectively.
 *
 * Iteration: We iterate through the array starting from the second element.
 *
 * Swap for Negatives: If the current element is negative, we swap maxProduct and minProduct because multiplying by a negative number flips the maximum and minimum.
 *
 * Update maxProduct and minProduct: We update maxProduct and minProduct by comparing the current element and the product of the current element with the previous maxProduct and minProduct.
 *
 * Update Result: We update the result with the maximum value of maxProduct.
 *
 * This approach ensures that we always keep track of the maximum and minimum products up to the current element, leading to a time complexity of O(n) and a space complexity of 𝑂(1)
 */



package leetcode.neetcode.leetcode_blind_75_solutions;

public class Maximum_Product_Subarray_152 {

    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int res = maxProduct;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], nums[i] * maxProduct);
            minProduct = Math.min(nums[i], nums[i] * minProduct);

            res = Math.max(res, maxProduct);
        }

        return res;
    }
}
