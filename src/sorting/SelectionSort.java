package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static String selectionSort (int [] arr) {
		int min = 0, temp = 0;
		
		for (int i = 0; i<arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j<arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		return Arrays.toString(arr);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
		System.out.println(selectionSort (arr));

	}

}
