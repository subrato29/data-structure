/**
 * Created by gouthamvidyapradhan on 04/07/2017. Given an array containing n distinct numbers taken
 * from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * <p>For example, Given nums = [0, 1, 3] return 2.
 *
 * <p>Note: Your algorithm should run in linear runtime complexity. Could you implement it using
 * only constant extra space complexity?
 */
package leetcode_array;

import java.util.Arrays;

public class MissingNumber {
	
	public static int solution(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				return arr[i] + 1;
			}
		}
		return 0;
	}
	
	public static int binarySearch (int nums[]) {
		Arrays.sort(nums);
		int low = 0, high = nums.length;
		   while(low < high){
		       int mid = low + (high - low)/2;
		       if(nums[mid] > mid){
		           high = mid;
		       }else{
		           low = mid + 1;
		       }
		   }
		return high;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 5, 6, 7};
		System.out.println(binarySearch(arr));
	}

}
