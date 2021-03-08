package practice;

public class DuplicateArray {

	static boolean hasDuplicate(int [] arr) {
		boolean bool = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i] == arr[j]) {
					bool = true;
					break;
				}
			}
		}
		return bool;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,5,6,98,8,7};
		System.out.println(hasDuplicate (arr));

	}

}
