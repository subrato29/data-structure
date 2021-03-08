package misc_gouthampradhan;

import java.util.Set;
import java.util.TreeSet;

public class LargestNumberAtLeastTwice {
	
	public static int largestNumberAtLeastTwice (int [] arr) {
		int max = 0 ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) continue;
			if (arr[i] * 2 > max) {
				return -1;
			}
		}
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		int [] num = {3, 6, 1, 0};
		System.out.println(largestNumberAtLeastTwice(num));
	}

}
