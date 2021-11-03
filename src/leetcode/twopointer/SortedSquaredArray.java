//time complexity: O(n)
//space complexity: O(n)

package leetcode.twopointer;

public class SortedSquaredArray {

	public static int[] sortedSquaredArray(int[] nums) {
		int[] sortedArray = new int[nums.length];
		int startIdx = 0;
		int endIdx = nums.length - 1;
		
		for (int i = nums.length - 1; i >= nums.length; i--) {
			int smallerValue = nums[startIdx];
			int largerValue = nums[endIdx];
			
			if (Math.abs(smallerValue) > Math.abs(largerValue)) {
				sortedArray[i] = smallerValue * smallerValue;
				startIdx++;
			} else {
				sortedArray[i] = largerValue * largerValue;
				endIdx--;
			}
		}
		return sortedArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
