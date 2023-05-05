package jQueues;

public class QueueUsingArray {

	int[] data;
	int front;
	int rear;
	int size;
	
	QueueUsingArray(){
		data = new int[10];
		size = 0;
		front = -1;
		rear = -1;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size ==0;
	}
	
	int front() throws ArrayEmptyException {
		if (size ==0) {
			// ArrayEmptyException
			ArrayEmptyException e = new ArrayEmptyException();
			throw e;
		}
		return data[front];
	}
	
	void enqueue(int element) throws ArrayFullException {
		if (size == data.length) {
			throw new ArrayFullException();
		}
		if (size == 0) {    // Inserting First Element
			front = 0;
		}
		rear ++;
		rear = rear % data.length;  // Circular Queue
		data[rear] = element;
		size++;
	}
	
	int dequeue() throws ArrayEmptyException {
		if (size == 0) {
			throw new ArrayEmptyException();
		}
		
		int temp = data[front];
		front ++;
		front = front % data.length;
		size--;
		
		if (size == 0) {
			front = -1;
			rear = -1;
		}
		
		return temp;
		
	}
	
}
