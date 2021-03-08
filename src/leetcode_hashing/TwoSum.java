/**
 * Given an array of integers, return indices of the
 * two numbers such that they add up to a specific target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>Example: Given nums = [2, 7, 11, 15], target = 9,
 *
 * <p>Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */

package leetcode_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] solution (int[] array, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], i);
		}
		for (int i = 0; i < array.length; i++) {
			int complement = sum - array[i];
			if (map.containsKey(complement)) {
				return new int[] {i, map.get(complement)};
			}
		}
		return new int[] {};
	}
	
	public static int[] solution1 (int[] array, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int complement = sum - array[i];
			if (map.containsKey(complement)) {
				return new int[] {i, map.get(complement)};
			} else {
				map.put(array[i], i);
			}
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int[] array = {2, 7, 11, 15};
		System.out.println(Arrays.toString(solution (array, 22)));
	}

}
