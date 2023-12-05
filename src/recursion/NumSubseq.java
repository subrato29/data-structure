package recursion;

import java.util.ArrayList;

public class NumSubseq {
    public int numSubseq(int[] nums, int target) {
        return helper (nums, target, 0, new ArrayList<Integer>(), 0);
    }

    public int helper (int[] nums, int target, int index, ArrayList<Integer> seq, int counter) {
        if (index == nums.length) {
            if (seq.size() > 0 && sumOfMinMax (seq) <= target) {
                System.out.println(seq);
                return 1;
            }
            return 0;
        }
        seq.add (nums[index]);
        int addCounter = helper (nums, target, index + 1, seq, counter);
        seq.remove (Integer.valueOf(nums[index]));
        int removeCounter = helper (nums, target, index + 1, seq, counter);
        return addCounter + removeCounter;
    }

    public int sumOfMinMax (ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size () == 1) {
            return list.get (0);
        }
        return list.get (0) + list.get (list.size () - 1);
    }

    public static void main (String[] args) {
        NumSubseq obj = new NumSubseq();
        int[] arr = {3,5,6,7};
        System.out.println(obj.numSubseq (arr, 9));
    }

}
