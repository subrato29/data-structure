package misc_gouthampradhan;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
	
	public static String solution(String str) {
		
		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");
		
		for (int i = arr.length - 1 ; i >= 0; i--) {
			sb.append (arr[i]);
			sb.append (" ");
		}
		
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the sky is blue";
		System.out.println(solution(str));
	}

}
