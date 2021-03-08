package search;

public class BinarySearch {

	public static int binarySearch (int arr[], int elementToBeSearched) {
		
		int low = 0;
		int high = arr.length - 1 ;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (arr[mid] == elementToBeSearched) {
				return mid;
			}else { 
				if (arr[mid] < elementToBeSearched) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			}
			
		}
		return -1;		
	}
	
	public static void main(String[] args) {
		
		int array[] = {2, 3, 4, 6, 9, 34, 45};
		int x = 9;
		int result = binarySearch (array, x);
		if (result == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index: " +result);
		}
		
	}

}
