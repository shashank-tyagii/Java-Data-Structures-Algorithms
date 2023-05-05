package fLinkedList;

public class kAppendLastNFirst {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		  if (n == 0 || head == null) {
          return head;
      }

      LinkedListNode<Integer> nextNode = head;
      LinkedListNode<Integer> previousNode = head;
//      making point the nextNode to the n-th node of the list
      for (int i = 0; i < n; i++) {
          nextNode = nextNode.next;
      }

//      making the previous node to point just before the previous the nextNode
      while (nextNode.next != null) {
          previousNode = previousNode.next;
          nextNode = nextNode.next;
      }

      LinkedListNode<Integer> tmp = previousNode.next;
//      assigning the last node to be null
      previousNode.next = null;
//      (n-th) connecting to the(n-th + 1) node
      nextNode.next = head;
//      returning the new head of the list as tmp
      return tmp;
	}
	
	
}
