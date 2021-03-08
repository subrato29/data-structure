package practice;

import java.util.Arrays;

public class PracticeQueueArrayImp {

	int capacity = 0;
	int queueArr[];
	int front;
	int rear;
	int currentSize = 0;
	
	public PracticeQueueArrayImp (int sizeOfArr) {
		this.capacity = sizeOfArr;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}
	
	public boolean isFull() {
		if (capacity == currentSize) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty () {
		if (currentSize == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enqueue (int data) {
		if (isFull()) {
			System.out.println("The array is full, enqueue is not possible");
		}else {
			rear ++;
			queueArr[rear] = data;
			currentSize ++;
			System.out.println(data + " is inserted into the array");
		}
	}
	
	public void dequeue () {
		if (isEmpty ()) {
			System.out.println("The array is empty, dequeue is not possible");
		}else {
			front ++;
			System.out.println(queueArr[front - 1] + " removed from the array");
			queueArr[front - 1] = 0;
			currentSize --;
		}
	}
	
	
	public void queueDisplay() {
		for (int i = 0; i < capacity ; i++) {
				System.out.print(queueArr[i]);
				if (i != capacity - 1) {
					System.out.print("====");
				}
		}
		System.out.println();
	}
	
	public void sizeOfQueue() {
		System.out.println(currentSize);
	}
	
	public static void main(String[] args) {
		
		PracticeQueueArrayImp obj = new PracticeQueueArrayImp(6);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.enqueue(60);
		
		obj.queueDisplay();
		obj.sizeOfQueue();
		
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		
		obj.queueDisplay();
		obj.sizeOfQueue();
	}

}
