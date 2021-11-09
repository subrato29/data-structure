package company.yum;

import java.util.HashMap;
import java.util.Map;

public class FindNonDuplicateInArray {

	public static int solution(int[] a) {
	    if (a.length == 0) {
	        return 0;
	    }
	    if (a.length == 1) {
	        return a[0];
	    }
	    int count = 0;
	    int temp = 0;
	    for (int i = 0; i < a.length; i++) {
	        count = 0;
	        for (int j = 0; j < a.length; j++) {
	            if (a[i] == a[j] && i != j)
	                count++;
	        }
	        if (count == 0)
	            temp = a[i];
	    }
	    return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 2, 4, 1};
		System.out.println(solution (arr));
	}

}
