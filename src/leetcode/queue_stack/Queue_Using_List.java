package leetcode.queue_stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue_Using_List {
    public List < Integer > list = new ArrayList < > ();
    public int index = 0;

    public void enqueue(int data) {
        list.add(data);
        index++;
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted element is " + list.get(0));
            list.remove(0);
            index--;
        }

    }

    public int front() {
        if (isEmpty()) {
            return 0;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Queue_Using_List obj = new Queue_Using_List();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        System.out.println(obj.list);
        System.out.println(obj.front());

        obj.dequeue();
        obj.dequeue();

        System.out.println(obj.list);
        System.out.println(obj.front());
    }
}