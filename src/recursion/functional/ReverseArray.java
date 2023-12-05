package recursion.functional;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray (int[] arr, int left, int right) {
        if (left == right) {
            return null;
        }
        swap(arr, left, right);
        reverseArray(arr,left + 1,right - 1);
        return arr;
    }

    public static void swap (int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(reverseArray (arr, 0, arr.length - 1)));
    }
}
