package leetcode_twopointer;

public class LongestPeak {

	public static int longestPeak(int[] array) {
	    int longest = 0;
		int i = 1;
		while (i < array.length - 1) {
			boolean isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
			if (!isPeak) {
				i++;
				continue;
			}
			
			int left = i - 2;
			while (left >= 0 && array[left] < array[left + 1]) {
				left--;
			}
			int right =  i + 2;
			while (right < array.length && array[right] < array[right - 1]) {
				right++;
			}
			int currentPeakLength = right - left - 1;
			if (currentPeakLength > longest) {
				longest = currentPeakLength;
			}
			i = right;
		}
		return longest;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
