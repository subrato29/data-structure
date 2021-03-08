/**
 * Created by gouthamvidyapradhan on 02/04/2017. Find the contiguous subarray within an array
 * (containing at least one number) which has the largest product.
 *
 * <p>For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product
 * = 6.
 */

package misc_gouthampradhan;

public class MaximumProductSubarray {

	public static int maxProduct(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int maxProduct = nums[0];
        int max_temp = nums[0];
        int min_temp = nums[0];
        
        for(int i=1;i<nums.length;i++) {
            int a = nums[i]*max_temp;
            int b = nums[i]*min_temp;
            
            max_temp = Math.max(Math.max(a,b), nums[i]);
            min_temp = Math.min(Math.min(a,b), nums[i]);
            maxProduct = Math.max(maxProduct, max_temp);
        }
        return maxProduct;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,-2,4};
		System.out.println(maxProduct (arr));
	}

}
