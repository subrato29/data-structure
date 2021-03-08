

package leetcode_july;

public class ArrangingCoins {
	
	public int arrangeCoins_1(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
	
	public int arrangeCoins_2(int n) {
        int count = 0;
        int i = 1;
        while(n>=0){            
            n = n - i;
            count++;
            i++;
        }
        return count-1;
    }
	
	public static void main(String[] args) {
		System.out.println(new ArrangingCoins ().arrangeCoins_2(9));

	}

}
