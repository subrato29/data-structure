/**
 * Given a sequence of words, check whether it forms a valid word square.

A sequence of words forms a valid word square if the kth row and column read the exact same string, where 0 ≤ k < max(numRows, numColumns).

Note: The number of words given is at least 1 and does not exceed 500. Word length will be at least 1 and does not exceed 500. Each word contains only lowercase English alphabet a-z. Example 1:

Input:
[
  "abcd",
  "bnrt",
  "crmy",
  "dtye"
]

Output:
true

Explanation:
The first row and first column both read "abcd".
The second row and second column both read "bnrt".
The third row and third column both read "crmy".
The fourth row and fourth column both read "dtye".

Therefore, it is a valid word square.
Example 2:

Input:
[
  "abcd",
  "bnrt",
  "crm",
  "dt"
]

Output:
true

Explanation:
The first row and first column both read "abcd".
The second row and second column both read "bnrt".
The third row and third column both read "crm".
The fourth row and fourth column both read "dt".

Therefore, it is a valid word square.
Example 3:

Input:
[
  "ball",
  "area",
  "read",
  "lady"
]

Output:
false

Explanation:
The third row reads "read" while the third column reads "lead".

Therefore, it is NOT a valid word square.
 */

package leetcode_string;
import java.util.Arrays;
import java.util.List;

public class ValidWordSquare {

    public static boolean solution(List < String > words) {
        for (int row = 0; row < words.size(); row++) {
            String rowWiseWord = words.get(row);
            if (!rowWiseWord.equals(helper(words, row))) {
                return false;
            }
        }
        return true;
    }

    public static String helper(List < String > words, int col) {
        String colWiseWord = "";
        for (int row = 0; row < words.size(); row++) {
            String word = words.get(row);
            if (word.length() > col) {
                colWiseWord += word.charAt(col);
            }
        }
        return colWiseWord;
    }

    public static void main(String[] args) {
        String[] array = {
            "ball",
            "area",
            "read",
            "lady"
        };
        System.out.println(solution(Arrays.asList(array)));
    }

}