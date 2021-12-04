package leetcode.misc2;

public class AddDigits {

	public static int solution(int num) {
		if (String.valueOf(num).length() == 1) {
			return num;
		}
		
		int temp = 0, sum = 0;
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			sum = sum + temp;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution (5623));
	}

}
