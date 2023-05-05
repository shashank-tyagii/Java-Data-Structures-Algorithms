package jQueues;

public class QueueUsingLL {

	//Define the data members
    private Node front;
	private Node rear;
	private int size;

	public QueueUsingLL() {
		//Implement the Constructor
        front = null;
		rear = null;
		size = 0;
	}

	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size ==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node newData = new Node(data);
		if (size ==0) {
			front = newData;
			rear = newData;
            size++;
			return;
		}
		
		rear.next = newData;
		rear = rear.next;
		size++;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if (size ==0) {
			return -1;
		}
		int data = front.data;
		front = front.next;
		size--;
		return data;
    }


    public int front() {
    	//Implement the front() function
        if (size ==0) {
			return -1;
		}
		return front.data;
    }
}
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}
