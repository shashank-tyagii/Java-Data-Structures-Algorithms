package iStacks;


public class bStackUsingLL {

	private int top;
	private LinkedListNode<Integer> head;;
	
	public bStackUsingLL(){
		head = null;
		top =-1;
	}
		
	public int size() {
		return top+1;
	}
	
	public void push(int elem){
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(elem);
		newNode.next = head;
		head= newNode;
		top++;
	}
	
	public int pop() throws StackEmptyException{
		if (head == null) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int out = head.data;
		head = head.next;
		top--;
		return out;
	}
	
	public int top() throws StackEmptyException{
		if (head == null) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
}
