package leetcode_array;

public class MaximumSwap_NotReady {

	public static int maximumSwap (int num) {
		int resultNum = 0;
		int maxInt = 0;
		int actualNum = num;
		int index = checkDescending(num);
		String string = "" + actualNum;
		maxInt = getMaxInt(Integer.parseInt
				(string.substring(index, string.length())));

		int indexOfMaxInt = string.indexOf("" + maxInt);
		if (indexOfMaxInt > 0) {
			resultNum = switcher (string.toCharArray(), 0, indexOfMaxInt);
		} else {
			resultNum = num;
		}
		return resultNum;
	}
	
	public static int switcher(char[] nums, int index1, int index2) {
		if (nums[index1] == nums[index2]) {
			return Integer.parseInt(new String(nums));
		}
		char temp = nums[index2];
		nums[index2] = nums[index1];
		nums[index1] = temp;
		return Integer.parseInt(new String(nums));
	}
	
	public static int checkDescending (int nums) {
		char[] ch = ("" + nums).toCharArray();
		if (ch.length == 1) {
			return 0;
		}
		for (int i = 1; i < ch.length - 1; i++) {
			if (!(ch[i] <= ch[i - 1] && ch[i] >= ch[i + 1])) {
				return i;
			}
		}
		return 0;
	}
	
	public static int getMaxInt(int num) {
		int maxInt = 0;
		while (num > 0) {
			int temp = num % 10;
			num = num / 10;
			maxInt = Math.max(maxInt, temp);
		}
		return maxInt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 98368;
		//num = 2736;
//		while (num > 0) {
//			int temp = num % 10;
//			num = num / 10;
//			System.out.println(temp);
//		}
		//System.out.println(maximumSwap(num));
		System.out.println(maximumSwap(num));
	}

}
