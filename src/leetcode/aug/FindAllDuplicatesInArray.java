package leetcode.aug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindAllDuplicatesInArray {

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums.length == 0) {
			return list;
		}
        Arrays.sort (nums);
        for (int i = 0; i < nums.length - 1; i++) {
        	if(nums[i] == nums[i+1]) {
        		list.add (nums[i]);
        	}
        }
		return list;
    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {};
		System.out.println(findDuplicates (arr));
	}

}
