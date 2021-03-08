package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static String bubbleSort (int [] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return Arrays.toString(arr);
	}
	
	public static void main(String[] args) {
		int [] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
		System.out.println(bubbleSort (arr));
	}

}
