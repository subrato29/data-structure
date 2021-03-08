package misc_gouthampradhan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfLetters {
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
	    for (int i = 0; i < nums.length; i++) {
	      int newIdx = Math.abs(nums[i]) - 1;
	      if (nums[newIdx] > 0) {
	        nums[newIdx] *= -1;
	      }
	    }
	    List<Integer> list = new ArrayList<>();
	    for (int i = 1; i <= nums.length; i++) {
	      if (nums[i - 1] > 0) {
	        list.add(i);
	      }
	    }
	    return list;
	  }
	
	public static void main(String[] args) {
		int [] arr = {2, 3, 5, 4, 7};
		System.out.println(findDisappearedNumbers(arr));

	}

}
