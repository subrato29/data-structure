package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gouthamvidyapradhan on 11/07/2017. Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 *
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 *
 * <p>
 * Example: Given nums = [2, 7, 11, 15], target = 9,
 *
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * <p>
 * Solution: O(n log n). Wrap index and element in a class and sort in
 * increasing order. Do a two pointer sum and compare. An alternative solution
 * is to use hashing which is a O(n) solution - For each element e check if
 * element (target - e) is already found in hashset, if yes return their index,
 * else add this to hash-set and continue.
 */

public class TwoSum {

	public static int[] solution(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = sum - arr[i];
			if (map.containsKey(result)) {
				return new int[] { map.get(result), i };
			} else {
				map.put(arr[i], i);
			}
		}
		return new int[] { 0, 0 };
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 11, 7 };
		System.out.println(Arrays.toString(solution(arr, 10)));
	}

}