package leetcode.misc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	
	public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
	
	public static void main(String[] args) {
		int [] arr = {3, 2, 11, 7};
		
		int [] result = findTwoSum (arr, 9);
		for (int i = 0 ; i < 2; i++) {
			System.out.println(result[i]);
		}
		
	    
	}

}
