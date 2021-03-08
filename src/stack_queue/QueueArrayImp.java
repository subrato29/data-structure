package stack_queue;
import java.util.Arrays;

public class QueueArrayImp {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize = 0;

	public QueueArrayImp(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full, data insertion is not possible");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " is inserted into the queue");
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty, hence removal of data is not possible");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from the queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the queue");
			}
			currentSize--;
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

	public static void main(String[] args) {

		QueueArrayImp obj = new QueueArrayImp(7);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);

		System.out.println(obj.currentSize);
		obj.queueDisplay();
		
		obj.dequeue();
		obj.dequeue();
		System.out.println(obj.currentSize);

	}

}