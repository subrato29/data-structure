package leetcode.queue_stack;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Using_Queues {

    Queue < Integer > queue;
    LinkedList < Integer > lls;
    int index;

    public Implement_Stack_Using_Queues() {
        queue = new LinkedList();
        lls = new LinkedList();
        index = 0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        lls.add(x);
        index++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()) {
            return 0;
        }
        int val = top();
        queue.remove(val);
        lls.removeLast();
        index--;
        return val;
    }

    /** Get the top element. */
    public int top() {
        if (empty()) {
            return 0;
        }
        return lls.getLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (queue.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Implement_Stack_Using_Queues obj = new Implement_Stack_Using_Queues();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.queue);

        System.out.println(obj.top());

        obj.pop();
        System.out.println(obj.queue);
        System.out.println(obj.top());

        obj.pop();
        System.out.println(obj.queue);
        System.out.println(obj.top());
    }

}