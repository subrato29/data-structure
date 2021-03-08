//How to reverse an array in the subset of N? e.g. Input: [1,3,5,7,9,11,15,17,19], Output: [5,3,1,11,9,7,19,17,15].

package amazonqae;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraySubsetN {

	public static List solution (int [] nums, int subset) {
		
		List<Integer> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		int i = 0;
		int temp = subset;
		
		while (i < subset && i < nums.length) {
			list.add (nums[i]);
			i++;
			if (list.size () == temp) {
				Collections.reverse(list);
				for (int j = 0 ; j < list.size(); j++) {
					result.add(list.get(j));
				}
				subset = subset + i;
				list = new ArrayList<>();
			}
		}
		if (list.size() != 0) {
			Collections.reverse(list);
			result.addAll(list);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,3,5,7,9,11,15,17,19, 20, 21};
		System.out.println(solution (nums, 4));

	}

}
