/**
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
	'A' : Absent.
	'L' : Late.
	'P' : Present.
	A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
	
	You need to return whether the student could be rewarded according to his attendance record.
	
	Example 1:
	Input: "PPALLP"
	Output: True
	
	Example 2:
	Input: "PPALLL"
	Output: False
 */
package leetcode_string;

public class StudentAttendanceRecordI {

    public static boolean solution(String string) {
        if (string == "") {
            return true;
        }
        string = string.toUpperCase();
        boolean presence_of_L = false, presence_of_A = false;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (presence_of_L) {
                if (ch == 'L') {
                    return false;
                } else {
                    presence_of_L = false;
                }
            }
            if (presence_of_A) {
                if (ch == 'A') {
                    return false;
                }
            }
            if (ch == 'A') {
                presence_of_A = true;
            } else if (ch == 'L') {
                if (i + 1 < string.length()) {
                    if (string.charAt(i + 1) == 'L') {
                        i = i + 1;
                        presence_of_L = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("PPALLL"));
    }

}