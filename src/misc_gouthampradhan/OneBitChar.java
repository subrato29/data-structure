package misc_gouthampradhan;

public class OneBitChar {
	
	public static boolean isOneBitCharacter(int[] bits) {
	    int idx = 0;
	    int n = bits.length; 
	    while (idx < n) {
	      if (bits[idx] == 1) {
	        if (idx + 1 == n - 1) {
	          return false;
	        }
	        else {
	          idx += 2;
	        }
	      }
	      else {
	        idx++;
	      }
	    }
	    return true;
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] bit = {34, 454, 34, 23, 20, 98, 76};
		//System.out.println(isOneBitCharacter(bit));

	}

}
