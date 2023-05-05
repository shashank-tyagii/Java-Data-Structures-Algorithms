package iStacks;

public class aStacksUsingArray {

	private int top;
	private int[] data;
	
	public aStacksUsingArray(){
		data = new int[10];
		top =-1;
	}
	public aStacksUsingArray(int capacity){
		data = new int[capacity];
		top =-1;
	}
	
	public int size() {
		return top+1;
	}
	
	public void push(int elem) throws StackFullException {
		if (size() == data.length) {
//			StackFullException e = new StackFullException();
//			throw e;
			int[] temp = data;
			data = new int[ 2 * temp.length];
			for (int i =0; i < temp.length; i++) {
				data[i] = temp[i];
			}
			
		}
		top++;
		data[top] = elem;
	}
	
	public int pop() throws StackEmptyException{
		if (size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int topElement = data[top];
		top--;
		return topElement;
	}
	
	public int top() throws StackEmptyException{
		if (top == -1) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
}
