package leetcode.misc1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ThirdMaximumNumber {

	public static int thirdMax (int [] arr) {
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0 ;i < arr.length; i++) {
			set.add (arr[i]);
		}
		
		List<Integer> al = new ArrayList<>(set); 
		
		System.out.println(al);
		return al.get(al.size() - 3);
		
	}
	
	public static void main(String[] args) {
		int [] arr = {3, 5, 2, 7, 5, 9, 12, 6};
		System.out.println(thirdMax (arr));
	}

}
