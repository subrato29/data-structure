package vonage;

public class MinSwap {

	public static int minSwaps(String S, String T) { 
        int count = 0; 
        for (int i = 0; i < S.length(); i++) { 
            if (S.charAt(i) != T.charAt(i)) 
                count++; 
        }
        if (count % 2 == 0) 
            return count / 2; 
        else
            return -1;
    } 
	
	
	
	public static void main(String[] args) {
		System.out.println(minSwaps ("XXYYXYXYXX", "XYYXYXXXYX"));

	}

}
