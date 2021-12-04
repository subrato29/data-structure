package leetcode.misc1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static boolean solution (String str, List<String> wordDict) {
		Set<String> set = new HashSet<>();
		set.addAll(wordDict);
		
		if (set.contains(str)) {
			return true;
		}
		
		boolean[] dp = new boolean[str.length() + 1];
		dp[0] = true;
		
		for (int i = 1; i<=str.length(); i++) {
			for (int j = 0; j<i; j++) {
				if (dp[j] && set.contains(str.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[str.length()];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordDict = new ArrayList<>();
		wordDict.add ("leet");
		wordDict.add ("code");
		System.out.println(solution ("leetcode", wordDict));
	}

}
