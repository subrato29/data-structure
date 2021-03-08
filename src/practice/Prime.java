package practice;

import misc_gouthampradhan.CountPrimes;

public class Prime {

	public int solution (int num) {
		boolean[] isComp = new boolean[num];
		
		for (int i = 2; i * i<num; i++) {
			for (int j = 2; i * j<num; j++) {
				isComp[i * j] = true;
			}
		}
		
		int count = 0;
		
		for (int i = 2; i<num; i++) {
			if (isComp[i] == false) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountPrimes().countPrimes(16));
	}

}
