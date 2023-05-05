package fLinkedList;

import java.util.Scanner;

public class fDeleteNode {

public static Node<Integer> delete(Node<Integer> head , int pos){
			
	 // If linked list is empty
    if (head == null) {
    	return head;
    }

    // Store head node
    Node temp = head;

    // If head needs to be removed
    if (pos == 0) {
        head = temp.next; // Change head
        return head;
    }

    // Find previous node of the node to be deleted
    for (int i = 0; temp != null && i < pos - 1;  i++){
    	temp = temp.next;
    	}

    // If position is more than number of nodes
    if (temp == null || temp.next == null) { 
    	return head; 
    	}

    // Node temp->next is the node to be deleted
    // Store pointer to the next of node to be deleted
    Node next = temp.next.next;
    temp.next = next; // Unlink the deleted node from list
    
    return head;
}

		
	
	// Code to take Input from user
public static Node <Integer> takeInput() {
		Scanner scn = new Scanner(System.in);
		int data = scn.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while (data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = scn.nextInt();
		}
		return head;
		
	}
// Code to print the LinkedList
public static <T> void print(Node<T> head) {             // Generic function
	
	while (head !=null) {
		System.out.print(head.data + " ");
		head = head.next;
	}
	
}
	public static void main(String[] args) {
		
		Node<Integer> node = takeInput();
		node = delete(node,3);
		print(node);
		

	}

}

