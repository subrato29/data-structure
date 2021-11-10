//Given a number in an array form. Write a program to move all zeros to the end.

package company.amazon;

import java.util.Arrays;

public class MoveAllZeroEnd {

	public static int[] solution (int [] arr) {
		if (arr == null) {
			return new int[] {};
		}
		
		int i = 0;
		int j = 0;
		
		while (i < arr.length) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
			i++;
		}
		
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 0, 4, 6, 0, 1, 3};
		System.out.println(Arrays.toString(solution (arr)));
 
	}

}
