package misc_gouthampradhan;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
	
	public static int solution(int[] nums) {
		
	    if(nums == null || nums.length==0)
	        return 0;
	 
	    ArrayList<Integer> list = new ArrayList<>(); 
	 
	    for(int num: nums){
	        if(list.size()==0 || num>list.get(list.size()-1)){
	            list.add(num);
	        }else{
	            int low = 0; 
	            int high = list.size()-1;
	 
	            while(low < high){
	                
	            	int mid = low + (high - low)/2;
	                
	                if(num > list.get(mid)){
	                    low = mid + 1;
	                }else{
	                    high = mid;
	                }
	            }
	            list.set(high, num);
	        }
	    }
	    System.out.println(list);
	    return list.size();
	}
	
	public static void main(String[] args) {
		int [] arr = {1,3,5,4,7};
		System.out.println(solution (arr));
	}

}
