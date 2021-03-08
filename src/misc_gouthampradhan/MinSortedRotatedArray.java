package misc_gouthampradhan;

public class MinSortedRotatedArray {

	public static int solution(int[] nums) {
	    if (nums.length == 0) 
	    	return 0;
	    else if (nums.length == 1) 
	    	return nums[0];
	    
	    int low = 0, high = nums.length - 1;
	    
	    while (low < high) {
	      int mid = (low + high) / 2;
	      
	      if (mid > 0 && nums[mid] < nums[mid - 1]) 
	    	  return nums[mid];
	      if (nums[low] > nums[mid]) 
	    	  high = mid - 1;
	      else if (nums[high] < nums[mid]) 
	    	  low = mid + 1;
	      else 
	    	  high = mid - 1;
	    }
	    return nums[low];
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5, 1, 2, 3, 4};
	    System.out.println(solution(A));
	}

}
