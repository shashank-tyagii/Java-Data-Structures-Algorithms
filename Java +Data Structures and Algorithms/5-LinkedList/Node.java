package fLinkedList;

public class Node<T> {   // Generic data input
	T data;
	Node<T> next;
	
	Node (T data){
		this.data = data;
		this.next = null;
	}
}
