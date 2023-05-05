package hLinkedList2;

public class eDeleteNode {

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
		
		if (head == null) {
			return head;
		}
		
		if (pos==0) {
			return head.next;
		}

		head.next = deleteNodeRec(head.next, pos-1);
		return head;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
