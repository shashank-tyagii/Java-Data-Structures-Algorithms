package hLinkedList2;

public class fReverseLLrecursive {

	// Order ==  n^2
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		
		LinkedListNode<Integer> newHead = 	reverseLinkedListRec(head.next);
		LinkedListNode<Integer> temp = newHead;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return newHead;
	}
	
	// We will store both head and tail in a seperate doubleNode
public static DoubleNode reverseLinkedList(LinkedListNode<Integer> head) {
		
		if (head == null || head.next == null) {
			DoubleNode temp = new DoubleNode();
			temp.head = head;
			temp.tail = head;
		}
		
		DoubleNode smallAns = reverseLinkedList(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		DoubleNode output = new DoubleNode();
		output.head = smallAns.head;
		output.tail = head;
		return output;		
}

// Best method with order 1
	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {
	
		if (head == null || head.next == null) {
			return head;
		}
		
		LinkedListNode<Integer> reversedtail = head.next;  // This element will reach at end after recursion
		LinkedListNode<Integer> newHead = 	reverseLL(head.next);
		reversedtail.next = head;
		head.next = null;
		return newHead;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class DoubleNode {
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}