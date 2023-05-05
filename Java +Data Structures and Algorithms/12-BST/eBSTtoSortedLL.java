package cBST;

public class eBSTtoSortedLL {

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
			Pair temp = constructLinkedList(root, 0);
			return temp.head;
	}
	
	public static Pair constructLinkedList(BinaryTreeNode<Integer> root, int a ) {

		if (root ==  null) {
			return new Pair();
		}
		
		LinkedListNode<Integer> mid = new LinkedListNode();
		mid.data = root.data;
		
		Pair left = constructLinkedList(root.left , 0);
		Pair right = constructLinkedList(root.right , 0);
		
		Pair ans = new Pair();
		
		if (right.head != null) {
			mid.next = right.head;
			ans.tail = right.tail;
		} else {
			ans.tail = mid;
		}
		if (left.tail != null) {
			left.tail.next = mid;
			ans.head = left.head;
		} else {
			ans.head = mid;
		}
		
		return ans;
		
	}
	
	
}

class Pair{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
	
}

class LinkedListNode<T> { 
	T data; 
	LinkedListNode<T> next; 
	}
