//time complexity: O(nlogn) + O(n2) => O(n2)
//space complexity: O(n)

package leetcode.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		Arrays.sort (array);
		List<Integer[]> list = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length - 2; i++) {
			int left = i + 1;
			int right = array.length - 1;
			while (left < right) {
				int currSum = array[i] + array[left] + array[right];
				if (currSum == targetSum) {
					Integer[] newTriplet = {array[i], array[left], array[right]};
					list.add (newTriplet);
					left ++;
					right --;
				} else if (currSum < targetSum) {
					left ++;
				} else if (currSum > targetSum) {
					right --;
				}
			}
		}
		return list;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
