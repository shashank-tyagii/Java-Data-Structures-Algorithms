// 

package hLinkedList2;

public class dInsertRecursion {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int data, int pos){
		
		if (head == null) {
			return head;
		}
		
		if (pos ==0) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			newNode.next = head;
			return newNode;			
		}
		
		head.next = insert(head.next, data, pos-1);
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
