package fLinkedList;

public class lReverseLL {

public static void printReverse(LinkedListNode<Integer> root) {
		
        if (root ==  null){
            return;
        }
        
        printReverse(root.next);
        System.out.print(root.data + " ");
        
	}
}
