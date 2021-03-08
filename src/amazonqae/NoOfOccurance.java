//Write a script to count the number of occurrences of the given element in an array.

package amazonqae;

public class NoOfOccurance {
	
	private int binarySearch(int[] arr, int target, boolean leftmost) {
	    int low = 0;
	    int high = arr.length - 1;
	    int count = 0;
	    
	    while (low <= high) {
	    	int mid = low + (high - low) / 2;
	    	
	    	if (arr[mid] == target) {
	    		count = mid;
	    		if (leftmost) {
	    			high = mid - 1;
	    		} else {
	    			low = mid + 1;
	    		}
	    	}else {
	    		if (arr[mid] < target) {
	    			low = mid + 1;
	    		} else {
	    			high = mid - 1;
	    		}
	    	}
	    }
	    return count;
	}
	
	public int count(int[] arr, int target) {
	    int left = binarySearch(arr, target, true);
	    if (left < 0) 
	    	return 0;
	    int right = binarySearch(arr, target, false);
	    return right - left + 1;
	}
	
	public static void main(String[] args) {
		
		int array[] = {2, 3, 3, 9, 9, 45};
		
		System.out.println(new NoOfOccurance().count(array, 3));

	}

}
