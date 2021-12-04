package leetcode.misc1;

public class SearchInsertPosition {
	  public static void main(String[] args) throws Exception {
	    int[] A = {1, 3, 5, 6};
	    System.out.println(new SearchInsertPosition().searchInsert(A, 3));
	  }

	  public int searchInsert(int[] nums, int target) {
	    int pos = nums.length;
	    int s = 0, e = nums.length - 1;
	    while (s <= e) {
	      int m = s + (e - s) / 2;
	      if (nums[m] >= target) {
	        pos = m;
	        e = m - 1;
	      } else s = m + 1;
	    }
	    return pos;
	  }
	}
