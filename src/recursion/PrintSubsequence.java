package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubsequence {

    public static List<List<Integer>> printSubsequence (List<Integer> nums, int index, List<List<Integer>> result, List<Integer> seq) {
        if (index == nums.size()) {
            result.add(seq);
            System.out.println(seq);
            return null;
        }
        seq.add(nums.get(index));
        printSubsequence(nums, index + 1, result, seq);
        seq.remove(nums.get(index));
        printSubsequence(nums, index + 1, result, seq);
        return result;
    }

    public static void main (String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 4, 8));
        List<List<Integer>> result = new ArrayList<> ();
        List<Integer> seq = new ArrayList<> ();
        printSubsequence(nums, 0, result, seq);
    }

}
