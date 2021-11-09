package company.vonage;

import java.util.Stack;

public class Comets {
	
	public static int[] solution(int[] A) {
        Stack<Integer> stack = new Stack();
        for (int comet: A) {
            collision: {
                while (!stack.isEmpty() && comet < 0 && 0 < stack.peek()) {
                    if (stack.peek() < -comet) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -comet) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(comet);
            }
        }

        int[] ans = new int[stack.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = stack.pop();
        }
        return ans;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2, -1, 1, 2};
		int [] arr1 = solution (arr);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		

	}

}
