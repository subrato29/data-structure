package leetcode_aug;

public class PowerOfFour {

	public static boolean isPowerOfFour(int num) {
	   if(num==0) 
		   return false;
	 
	   int pow = (int) (Math.log(num) / Math.log(4));
	   
	   if(num==Math.pow(4, pow)){
	       return true;
	   }else{
	       return false;
	   }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour (64));
	}

}
