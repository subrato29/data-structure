package leetcode.misc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PermutationInString {

	public static boolean solution(String s1, String s2) {
        int[] map = new int[128];
        for (char c : s1.toCharArray()) {
            map[c]++;
        }
        int count = s1.length();
        char[] arr_s2 = s2.toCharArray();
        int left = 0, right = 0;
        while (right < arr_s2.length) {
            if (map[arr_s2[right++]]-- > 0) 
            	count--;
            while (count == 0) {
                if (right - left == s1.length()) 
                	return true;
                if (++map[arr_s2[left++]] > 0) 
                	count++;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("eidbaooo", "aa"));
	}

}
