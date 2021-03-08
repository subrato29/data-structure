package misc_gouthampradhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class KthLargestElementInAnArray {
	
	public static int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	    for(int i: nums){
	        q.add(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	    return q.peek();
	}
	
	// Another way of implementation
	public static int solution (int[] nums, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i<nums.length; i++) {
			list.add(nums[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		return list.get(list.size()-k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 1, 5, 6, 4};
		System.out.println(solution(nums, 3));
	}

}
