package fLinkedList;

public class gLengthOfLL {

	public static int length(Node<Integer> head){
		
		int size =0;
		if (head == null) {
			return size;
		}
		Node <Integer> temp = head;
		
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		
		return size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
