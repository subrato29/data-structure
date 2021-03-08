package misc_gouthampradhan;

public class Armstrong {
	
	public boolean isArmstrong (int num) {
		int resultant = num;
		int temp = 0;
		int sum = 0;
		int countOfDigits = String.valueOf(num).length();
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			sum = sum + (int) Math.pow(temp, countOfDigits);;
		}
		if (sum == resultant) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong obj = new Armstrong ();
		System.out.println(obj.isArmstrong (1634));
	}

}
