package leetcode_string;

public class ReplaceVowelsWithNextConsonant {

    public static String solution(String string) {
        String result = "";
        String lastVistedNonVowel = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            char ch = string.charAt(i);
            if (isVowel(ch)) {
                result = lastVistedNonVowel + result;
            } else {
                lastVistedNonVowel = String.valueOf(ch);
                result = lastVistedNonVowel + result;
            }
        }
        return result;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("aaaabccceee"));
    }

}