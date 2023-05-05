package jQueues;

public class DynamicQueue {


	int[] data;
	int front;
	int rear;
	int size;
	
	DynamicQueue(){
		data = new int[10];
		size = 0;
		front = -1;
		rear = -1;
	}
	DynamicQueue(int capacity){
		data = new int[capacity];
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
			doubleSize();
		}
		if (size == 0) {    // Inserting First Element
			front = 0;
		}
		rear ++;
		rear = rear % data.length;  // Circular Queue
		data[rear] = element;
		size++;
	}
	
	private void doubleSize() {
		
		int[] temp = data;
		int[] data = new int[2 * temp.length];
		
		int index = 0;
		// Copying is not straight forward, as data was in circular way
		// Need to arrange this data in new Array
		
		for (int i = front; i < temp.length; i++) {
			data[index] = temp[i];
			index++;
		}
		
		for (int i = 0; i<= front-1; i++) {
			data[index ] = temp[i];
			index++;
		}
		
		front =0;
		rear = data.length-1;
		
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
