package leetcode.misc1;

import java.util.Arrays;

public class SearchForARange {

	public static int binarySearch (int [] arr, int ele, boolean isLowerIndex) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		
		int result = -1;
		
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (arr[mid] == ele) {
				result = mid ;
				if (isLowerIndex) {
					low = mid + 1;
				} else {	
					high = mid - 1;
				}
			} else {
				if (arr[mid] > ele) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
	
		int[] arr = {
			      2, 3, 4, 5, 6, 6, 6, 6, 7
			    };
		
		System.out.println(binarySearch (arr, 6, false));
		System.out.println(binarySearch (arr, 6, true));
	}

}
