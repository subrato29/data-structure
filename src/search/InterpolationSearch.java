package search;

public class InterpolationSearch {
	
	public static int interpolationSearch(int[] arr, int element) {
	    int low = 0;
	    int high = arr.length - 1;
	    int position = 0;
	    int index = -1;
	    while (low <= high) {
	    	position = low + ((high - low) * (element - arr[low])) / (arr[high] - arr[low]);
	        if (arr[position] == element) {
	            index = position;
	            break;
	        }
	        if (arr[position] < element) {
	            low = position + 1;
	        } else {
	            high = position - 1;
	        }
	    }
	    return index;
	}
	public static void main(String[] args) {
		int [] arr = {2,4, 6, 8, 10, 12, 14};
		System.out.println(interpolationSearch(arr, 12));
		

	}

}
