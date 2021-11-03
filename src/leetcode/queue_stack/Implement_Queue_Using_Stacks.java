package leetcode.queue_stack;

import java.util.Stack;

public class Implement_Queue_Using_Stacks {

    Stack < Integer > stack;
    int index;

    /** Initialize your data structure here. */
    public Implement_Queue_Using_Stacks() {
        stack = new Stack < > ();
        index = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
        index++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (empty()) {
            return 0;
        }
        int val = peek();
        stack.remove(0);
        index--;
        return val;
    }

    /** Get the front element. */
    public int peek() {
        if (empty()) {
            return 0;
        }
        return stack.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Implement_Queue_Using_Stacks obj = new Implement_Queue_Using_Stacks();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.stack);

        obj.pop();
        obj.pop();

        System.out.println(obj.stack);

        System.out.println(obj.peek());
    }

}