package company.amazonqae;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {

	public static Object[] solution (int [] arr) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i<arr.length; i++) {
			set.add (arr[i]);
		}
		return set.toArray();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,1,1,1,2,2,3,3,6,6,6, 8, 8, 9, 9};
		System.out.println(Arrays.toString(solution(arr)));
	}

}
