package company.amazonqae;

public class RemoveDuplicateFromArrayWithoutUsingExtraSpace {

	public static int removeDuplicates(int[] A) {
		if (A.length < 2)
			return A.length;
	 
		int j = 0;
		int i = 0;
	 
		while (i < A.length) {
			if (A[i] != A[j]) {
				j++;
				A[j] = A[i];
			}
	        i++;
		}
		return j + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,1,1,1,2,2,3,3,6,6,6, 8, 8, 9, 9};
		System.out.println(removeDuplicates(arr));
	}

}
