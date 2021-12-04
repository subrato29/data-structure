package leetcode.misc1;

public class AddDigits {
	
	public int addDigits(int num) {
		while (!isDigitCountGreaterThanOne(num)) {
			num = getDigitSum(num);
		}
		return num;
	}
	
	public int getDigitSum (int num) {
		int sum = 0;
	    int temp = 0;
	    while (num > 0) {
	    	temp = num % 10;
			num = num / 10;
			sum = sum + temp;
	    }
	    return sum;
	}
	
	public boolean isDigitCountGreaterThanOne (int num) {
		if (String.valueOf(num).length() == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		AddDigits obj = new AddDigits();
		System.out.println(obj.addDigits(1234534534));
	}

}
