package fLinkedList;

public class iFindNode {

	public static int findNode(LinkedListNode<Integer> head, int n) {
		
		if (head == null) {
			return -1;
		}

		LinkedListNode<Integer> temp = head;
		int i =0;
		
		while (temp !=null) {
			if (temp.data == n) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
