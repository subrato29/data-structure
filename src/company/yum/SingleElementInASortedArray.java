package company.yum;

public class SingleElementInASortedArray {

	public static int singleElementInASortedArray (int [] arr) {
		int low = 0;
		int high = arr.length - 1;
		int count = 0;
		int result = -1;
		
		while (low < high) {
			low = count;
			if (count == 0) {
				if (arr[count] == arr[count + 1]) {
					result = -1;
				}
			} else {
				if (arr[count] == arr[count - 1] || arr[count] == arr[count + 1]) {
					result = -1;
				} else {
					result = arr[count];
					break;
				}
			}
			count ++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 3, 7, 7, 10, 11, 11};
		System.out.println(singleElementInASortedArray (arr));

	}

}
