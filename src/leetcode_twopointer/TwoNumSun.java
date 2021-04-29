package leetcode_twopointer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumSun {
	
	// time complexity: O(n);
	// space complexity: O(n);
	public static int[] twoNumberSum(int[] array, int targetSum) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			int resultant = targetSum - array[i];
			if (set.contains(resultant)) {
				return new int[] {array[i], resultant};
			} else {
				set.add (array[i]);
			}
		}
		return new int[] {};
	}
	
	// time complexity: O(nlogn);
	// space complexity: O(1);
	public static int[] twoNumberSum1(int[] array, int targetSum) {
		Arrays.sort(array);
	    int left = 0;
			int right = array.length - 1;
			while (left < right) {
				int currentSum = array[left] + array[right];
				if (currentSum == targetSum) {
					return new int[] {array[left], array[right]};
				} else if (currentSum > targetSum){
					right--;
				} else if (currentSum < targetSum){
					left++;
				}
			}
			return new int[] {};
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 5, -2, 7, 6, 3};
		System.out.println(Arrays.toString(twoNumberSum(arr, 4)));
	}

}
