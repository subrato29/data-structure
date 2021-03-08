/**
 * Pascal's Triangle Oct 28 '12
	Given numRows, generate the first numRows of Pascal's triangle.
	
	For example, given numRows = 5,
	Return
	
	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
 */

package leetcode_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static List<Integer> solution (int row) {
		Integer[] result = new Integer[row + 1];
		int prev = 0;
		
		for (int i = 1; i <= row + 1; i++) {
			for (int j = 0; j < i ; j++) {
				if (j == 0 || j == i - 1) {
					result[j] = 1;
					prev = 1;
				} else {
					int temp = result[j];
					result[j] = prev + result[j];
					prev = temp;
				}
			}
		}		
		return Arrays.asList(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution (4));
	}

}
