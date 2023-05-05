package fLinkedList;

public class nReverseLL {

	// This code will change the head and make the list in reverse Orders
	 public static void reverse(Node<Integer> head)
	    {
		 Node<Integer> prev = null;
		 Node<Integer> current = head;
		 Node<Integer> next;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	    }
}
