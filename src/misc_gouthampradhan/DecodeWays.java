/**
 * A message containing letters from A-Z is being
 * encoded to numbers using the following mapping:
 *
 * <p>'A' -> 1 'B' -> 2 ... 'Z' -> 26 Given an encoded message containing digits, determine the
 * total number of ways to decode it.
 *
 * <p>For example, Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 *
 * <p>The number of ways decoding "12" is 2.
 */

package misc_gouthampradhan;

public class DecodeWays {

	public static int solution(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        
        for(int i = 1; i <= s.length(); ++i) {
            if(s.charAt(i - 1) != '0') 
            	dp[i] = dp[i-1];
            if(i > 1 && s.charAt(i - 2) != '0' && Integer.valueOf(s.substring(i - 2, i)) < 27) 
                dp[i] += dp[i-2];
        }
        return dp[s.length()];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution ("34"));
	}

}
