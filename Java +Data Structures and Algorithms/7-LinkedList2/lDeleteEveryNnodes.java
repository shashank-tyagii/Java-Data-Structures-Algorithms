// You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
// To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
package hLinkedList2;

public class lDeleteEveryNnodes {

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {

		 if (M == 0 || head == null) {
	            return null;
	        }
	        if (N == 0) {
	            return head;
	        }

	        LinkedListNode<Integer> currentNode = head;
	        LinkedListNode<Integer> temp = null;

	        while (currentNode != null) {
	            
	            for (int take =0; currentNode != null && take < M; take++) {
	                if (temp == null) {
	                	temp = currentNode;
	                } else {
	                	temp.next = currentNode;
	                	temp = currentNode;
	                }
	                currentNode = currentNode.next;
	            }

	            for  (int skip = 0; currentNode != null && skip < N ; skip ++) {
	                currentNode = currentNode.next;
	            }
	        }
	        
	        if (temp != null) {
	            temp.next = null;
	        }
	        return head;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
