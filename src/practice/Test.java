package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static int [] solution(int [] nums, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = sum - nums[i];
			
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			} else {
				map.put (nums[i], i);
			}
		}
		return new int [] {};
	}
	
	public static int solution (String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		int len = str.length();
		
		for (int i = 0; i<len; i++) {
			char curr = str.charAt(i);
			map.put (curr, map.getOrDefault(curr, 0) + 1);
		}
		
		for (int i = 0; i<len; i++) {
			if (map.get(str.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] arr = {3, 2, 11, 7};
		
		int [] result = solution (arr, 9);
		for (int i = 0 ; i < 2; i++) {
			System.out.println(result[i]);
		}
	}

}
