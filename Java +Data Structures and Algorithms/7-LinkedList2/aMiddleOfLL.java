// For a given singly linked list of integers, find and return the node present at the middle of the list.
package hLinkedList2;

public class aMiddleOfLL {
	
	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        if (head ==  null) {
			return null;
		}
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		
		while (fast.next !=null && fast.next.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
    }

}
