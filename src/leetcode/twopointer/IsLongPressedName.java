/**
 * 925. Long Pressed Name Easy
 *
 * 1527
 *
 * 234
 *
 * Add to List
 *
 * Share Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long
 * pressed, and the character will be typed 1 or more times.
 *
 * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with
 * some characters (possibly none) being long pressed.
 *
 * Example 1: Input: name = "alex", typed = "aaleex" Output: true Explanation: 'a' and 'e' in 'alex' were long pressed.
 *
 * Example 2: Input: name = "saeed", typed = "ssaaedd" Output: false Explanation: 'e' must have been pressed twice, but
 * it was not in the typed output.
 */
package leetcode.twopointer;

import java.util.HashMap;
import java.util.Map;

public class IsLongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        int nameIndex = 0;
        int typedIndex = 0;

        while (typedIndex < typed.length()) {
            if (nameIndex < name.length() && name.charAt(nameIndex) == typed.charAt(typedIndex)) {
                nameIndex++;
                typedIndex++;
            }
            else if (typedIndex > 0 && typed.charAt(typedIndex) == typed.charAt(typedIndex - 1)) {
                typedIndex++;
            }
            else {
                return false;
            }
        }
        return nameIndex == name.length();
    }

    public static void main(String[] args) {
    }

}