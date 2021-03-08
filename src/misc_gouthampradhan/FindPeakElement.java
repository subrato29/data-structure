package misc_gouthampradhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindPeakElement {
	
	public static int getPeakElement (int [] arr) {
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add (arr[i]);
		}
		List<Integer> list = new ArrayList<>(set);
		return list.get(list.size() - 1);
	}
	
	public static int binarySearch (int [] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		
		while (low <= high) {
			mid = low + (high - low)/2;
			if (ele == arr[mid]) {
				return mid;
			} else {
				if (arr [mid] < ele) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int [] arr = {6, 7, 8, 9, 10, 2};
		System.out.println(getPeakElement (arr));
		
		//System.out.println(binarySearch (arr, getPeakElement (arr)));

	}

}
