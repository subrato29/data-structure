package company.amazon;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue < Integer > maxHeap = new PriorityQueue < Integer > ((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        int i = 0;
        while (i < k - 1) {
            maxHeap.poll();
            i++;
        }
        return maxHeap.poll();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {
            3,
            2,
            1,
            5,
            6,
            4
        };
        System.out.println(findKthLargest(nums, 3));
    }

}