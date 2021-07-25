/*
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]

		Example 1:

			Input: [2,1]
			Output: false
			Example 2:

			Input: [3,5,5]
			Output: false
			Example 3:

			Input: [0,3,2,1]
			Output: true
*/
package leetcode_array;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) return false;
        int n = A.length;
        int i;
        for (i = 1; i < n && A[i] > A[i - 1]; i++);
        if (i == 1 || i == n) return false;
        for (; i < n && A[i] < A[i - 1]; i++);
        if (i != n) return false;

        return true;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}