package misc_gouthampradhan;

public class RepeatedSubstringPattern {

	public static boolean solution(String str) {
		int l = str.length();
		for(int i = l/2; i >= 1;i--) {
			if(l%i == 0) {
				int m = l/i;
				String subStr = str.substring(0,i);
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<m;j++) {
					sb.append(subStr);
				}
				if(sb.toString().equals(str)) return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abcabc"));
	}

}
