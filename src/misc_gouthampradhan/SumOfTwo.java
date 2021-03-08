package misc_gouthampradhan;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
	
	public static int [] twoSum (int [] arr, int sum) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			temp = sum - arr[i];
			if (map.containsKey(temp)) {
				return new int [] {map.get(temp), i};
			} else {
				map.put (arr[i], i);
			}
		}
		return new int [] {};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
