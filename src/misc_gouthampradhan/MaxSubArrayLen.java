package misc_gouthampradhan;

import java.util.HashMap;

public class MaxSubArrayLen {
	
	public static int maxSubArrayLen(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    map.put(0, -1);
	    int maxLength = 0;
	    int sum = 0;
	    int temp = 0;
	 
	    for(int i=0; i<nums.length; i++){
	        sum = sum + nums[i];
	        temp = sum - target;
	        if(map.containsKey(temp)){
	        	maxLength = Math.max(maxLength, i - map.get(temp));
	        }
	        map.putIfAbsent(sum, i);
	    }
	    return maxLength;
	}
	
	public static void main(String[] args) {
		
		int [] nums = {1, -1, 5, -2, 3};
		System.out.println(maxSubArrayLen (nums, 3));

	}

}
