package leetcode.misc1;

public class IsArmstrong {
	
	public static boolean isArmstrong (int num) {
		int len = String.valueOf(num).length();
		int resultant = num;
		int temp = 0;
		int sum = 0;
		
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			sum = sum +(int) Math.pow(temp, len);
		}
		
		if (num == sum) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
