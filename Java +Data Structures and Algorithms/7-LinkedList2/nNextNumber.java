package hLinkedList2;

public class nNextNumber {

public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		
	LinkedListNode<Integer> temp = head;
	String num = "";
	while(temp != null) {
		num = num+temp.data;
	}
	
	int n = Integer.parseInt(num);
	n = n+1;
	
	LinkedListNode<Integer> output = new LinkedListNode<Integer>(null);
	
	while (n !=0) {
		int digit = n%10;
		n = n/10;
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(digit);
		newNode.next = output;
		output = newNode;
	}
	
	 
	 return output;
	
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
