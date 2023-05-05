package fLinkedList;

import java.util.Scanner;

public class eInsertNode {

	public static Node<Integer> insert(Node<Integer> head , int data, int pos){
		
		Node<Integer> newNode = new Node<>(data);
		if (pos == 0) {
			newNode.next = head;
			head = newNode;
			return head;                  // This element will become the head
		}
		
		Node<Integer> temp = head;
		
		for (int i =0; i <pos-1; i++) {
			temp = temp.next;
		}
		
		newNode.next= temp.next;
		temp.next = newNode;
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
		node = insert(node,80,3);
		print(node);
		

	}

}
