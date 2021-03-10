package leetcode_array;

public class IncreasingTripletSubsequence {

	public static boolean increasingTriplet (int[] nums) {
		if (nums == null || nums.length < 3) {
			return false;
		}
		
		int smallest = Integer.MAX_VALUE;
		int middle = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if (smallest >= nums[i]) {
				smallest = nums[i];
			} else if (middle >= nums[i]) {
				middle = nums[i];
			} else {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,1,5,0,4,6};
		System.out.println(increasingTriplet(nums));
	}

}
