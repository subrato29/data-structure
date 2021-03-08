package misc_gouthampradhan;

import java.util.TreeSet;

public class MaxConsecutiveOnes {
	
	public static int maxConsecutiveOnes (int [] arr) {
		int count = 0;
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count ++;
			} else {
				set.add (count);
				count = 0;
			}
		}
		set.add(count);
		return set.last();
	}
	
	public static void main(String[] args) {
		int [] arr = {1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1};
		System.out.println(maxConsecutiveOnes(arr));
	}

}
