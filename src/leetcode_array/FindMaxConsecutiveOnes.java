package leetcode_array;

import java.util.TreeSet;

public class FindMaxConsecutiveOnes {
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		TreeSet<Integer> set = new TreeSet<>();
		int count = 0;
		
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
        	count++;
        } else {
	        set.add (count);
	        count = 0;
           }
        }
        set.add (count);
        return set.last();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
