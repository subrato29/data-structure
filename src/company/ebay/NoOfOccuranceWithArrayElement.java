package company.ebay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NoOfOccuranceWithArrayElement {

	public static Map<Integer, Integer> solution (int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
		}
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			int value = map.get(key);
			if (value < 2) {
				map.remove(key);
				itr = map.keySet().iterator();
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 2, 2, 3, 3, 4, 5, 4, 7, 8};
		System.out.println(solution(nums).values().toArray());
	}

}
