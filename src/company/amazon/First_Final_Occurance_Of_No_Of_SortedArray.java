//Print the first and final occurrence of a number in a sorted array of integers.
//e.g. int[] list = {1,2,3,4,5,5,7,8}

package company.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class First_Final_Occurance_Of_No_Of_SortedArray {

	public static int[] solution (int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int [] result = new int[2];
		int firstOccu = 0;
		boolean isPresent = false;
		
		for (int i = 0; i<arr.length; i++) {
			if (map.containsKey(target) && !isPresent) {
				firstOccu = i - 1;
				isPresent = true;
			}
			if (target < arr[i]) {
				break;
			}
			map.put (arr[i], i);
		}
		if (map.get(target) == null) {
			result = new int[1];
			result[0] = -1;
			return result;
		}
		result[0] = firstOccu;
		if (map.get(target) > firstOccu) {
			result[1] = map.get(target);
		}
		if (result[0] == 0 || result[1] == 0) {
			result = new int[1];
			result[0] = firstOccu;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,5,5,5,7,8};
		System.out.println(Arrays.toString(solution(arr, 1)));
	}

}
