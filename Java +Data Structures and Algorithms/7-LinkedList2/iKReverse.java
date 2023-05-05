// Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
// 'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
package hLinkedList2;

public class iKReverse {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		 if (k == 0 || k == 1) {
	            return head;
	        }

	        LinkedListNode<Integer> currentNode = head;
	        LinkedListNode<Integer> nextNode = null;
	        LinkedListNode<Integer> prevNode = null;

	        int count = 0;

//	        reverse first k nodes of linked list
	        while (count < k && currentNode != null) {
	            nextNode = currentNode.next;
	            currentNode.next = prevNode;
	            prevNode = currentNode;
	            currentNode = nextNode;
	            count++;
	        }

	        if (nextNode != null) {
	            head.next = kReverse(nextNode, k);   // add next reversed list to the pevious head
	        }
	        return prevNode;	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
