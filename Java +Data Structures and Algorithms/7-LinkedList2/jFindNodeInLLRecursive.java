// Given a singly linked list of integers and an integer n, find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.
// Follow a recursive approach to solve this.
package hLinkedList2;

public class jFindNodeInLLRecursive {

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	
		 if (head == null) {
				return -1;
			}
			if (head.data == n) {
				return 0;
			}
			
			int idx = findNodeRec(head.next, n);
			if (idx == -1){
	            return -1;
	        } else {
	           return idx+1; 
	        }
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
