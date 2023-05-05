package fLinkedList;

public class LinkedListUse {

	public static void main(String[] args) {
		
		Node<Integer> node1 = new Node <>(10);
		//System.out.println(node1.data);
		//System.out.println(node1.next);
		
		Node<Integer> node2 = new Node <>(20);
		node1.next = node2;
		
		Node<Integer> node3 = new Node <>(30);
		node2.next = node3;
		
		
		Node<Integer> head = node1;
		
		// Print the data of all nodes
		
		while (head !=null) {
			System.out.print(head.data + " ");
			head= head.next;
		}

	}

}
