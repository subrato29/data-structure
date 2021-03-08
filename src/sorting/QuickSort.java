package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] quickSort(int[] arr, int start, int end) {

        int partition = getPartition(arr, start, end);

        if (partition - 1 > start) {
            quickSort(arr, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSort(arr, partition + 1, end);
        }
        return arr;
    }

    public static int getPartition(int[] arr, int start, int end) {

        int temp = 0;
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;

    }


    public static void main(String[] args) {
        int[] arr = {
            10,
            9,
            7,
            101,
            23,
            44,
            12,
            78,
            34,
            23
        };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}