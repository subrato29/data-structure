package ebay;

public class BinarySearch {

	public static int solution(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		
		while (low <= high) {
			mid = low + (high - low) / 2;
			
			if (ele == arr[mid]) {
				return mid;
			}
			if (arr[mid] < ele) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 6, 7, 8, 9};
		System.out.println(solution(arr, 6));
	}

}
