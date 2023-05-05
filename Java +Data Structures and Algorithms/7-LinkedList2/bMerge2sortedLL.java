// You have been given two sorted(in ascending order) singly linked lists of integers.
// Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
package hLinkedList2;

public class bMerge2sortedLL {

	 public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	      
			LinkedListNode<Integer> temp1   = head1;
			LinkedListNode<Integer> temp2   = head2;
			LinkedListNode<Integer> newHead = null;
			LinkedListNode<Integer> newTail = null;
			
	       if (head2== null){
	           return head1;
	       } else if (head1 == null){
	           return head2;
	       }
			
			while (temp1 !=null && temp2 !=null) {
				if (newHead == null) {
					if (temp1.data <= temp2.data) {
						newHead = temp1;
						newTail = temp1;
						temp1 = temp1.next;
					} else if (temp2.data < temp1.data) {
						newHead = temp2;
						newTail = temp2;
						temp2 = temp2.next;
					}
				}
				
				if (temp1.data <= temp2.data) {
					newTail.next = temp1;
					newTail = temp1;
					temp1 = temp1.next;
				} else if (temp2.data < temp1.data) {
					newTail.next = temp2;
					newTail = temp2;
					temp2 = temp2.next;	
				}
			}
			
			if (temp1 !=null) {
				newTail.next = temp1;
				temp1= temp1.next;
			}
			if (temp2 !=null) {
				newTail.next = temp2;
				temp2= temp2.next;
			}
					
			return newHead;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
