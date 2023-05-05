// You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions
package hLinkedList2;

public class jSwapNodes {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {

		 if (i == j || head == null || head.next == null) {
	            return head;
	        }

	        LinkedListNode<Integer> currentNode = head, 
	        							prev = null;
	        LinkedListNode<Integer> firstNode = null, 
	        						secondNode = null, 
	        						firstNodePrev = null, 
	        						secondNodePrev = null;

	        int position = 0;

	        while (currentNode != null) {
	            if (position == i) {
	                firstNodePrev = prev;
	                firstNode = currentNode;
	            } else if (position == j) {
	                secondNodePrev = prev;
	                secondNode = currentNode;
	            }
	            prev = currentNode;
	            currentNode = currentNode.next;
	            position++;

	        }

	        if (firstNodePrev != null) {
	            firstNodePrev.next = secondNode;
	        } else {
	            head = secondNode;
	        }

	        if (secondNodePrev != null) {
	            secondNodePrev.next = firstNode;
	        } else {
	            head = firstNode;
	        }

	        LinkedListNode currentFirstNode = secondNode.next;
	        secondNode.next = firstNode.next;
	        firstNode.next = currentFirstNode;

	        return head;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
