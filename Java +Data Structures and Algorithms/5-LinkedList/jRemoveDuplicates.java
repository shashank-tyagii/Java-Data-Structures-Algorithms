package fLinkedList;

public class jRemoveDuplicates {

	
		public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
			if (head == null) {
	            return head;
	        }
	        LinkedListNode<Integer> currentNode = head;

	        while (currentNode.next != null) {
	            if (currentNode.data.equals(currentNode.next.data)) {
	                currentNode.next = currentNode.next.next;
	            } else {
	                currentNode = currentNode.next;
	            }
	        }
	        return head;
			
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
