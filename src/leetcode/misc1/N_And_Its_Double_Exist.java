package leetcode.misc1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class N_And_Its_Double_Exist {
	
	public static boolean checkIfExist(int [] arr) {
		Set<Integer> set = new TreeSet<>();
	    for (int i = 0; i< arr.length; i++) {
	    	if (set.contains(arr[i] * 2) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
	    		return true;
	    	}
	    	set.add (arr[i]);
	    }
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 7, 8, 6, 13};
		System.out.println(checkIfExist(arr));
		
		
	}

}
