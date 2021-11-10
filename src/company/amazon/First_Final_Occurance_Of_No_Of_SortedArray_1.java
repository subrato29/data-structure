package company.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First_Final_Occurance_Of_No_Of_SortedArray_1 {

	public static int[] solution (int[] arr, int target) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == target) {
				list.add(i);
			}
			if (target < arr[i]) {
				break;
			}
		}
		if (list.size() == 0) {
			return new int[] {-1};
		}
		if (list.size() == 1) {
			return new int[] {list.get(0)};
		}
		return new int[] {list.get(0), list.get(list.size() - 1)};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,5,5,5,7,8};
		System.out.println(Arrays.toString(solution(arr, 5)));
	}

}
