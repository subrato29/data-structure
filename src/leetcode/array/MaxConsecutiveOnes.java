package leetcode.array;

public class MaxConsecutiveOnes {

	public static int maxConsecutiveOnes(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int counter = 0;
		int maxCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				counter++;
			} else {
				counter = 0;
			}
			maxCount = Math.max(maxCount, counter);
		}
		return maxCount;
	}

	public static void main(String[] args) {
		// int [] nums = {1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1};
		int[] nums = null;
		System.out.println(maxConsecutiveOnes(nums));
	}

}