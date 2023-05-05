package hLinkedList2;

public class mBubbleSortIterative {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		
		int n = listLength(head); // Calculate the size of list
		
        for (int i = 0; i < (n - 1); i++) {
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> current = head;
            for (int j = 0; j < (n - i - 1); j++) {
                if (current.data <= current.next.data) {  // No need of swap
                    prev = current;
                    current = current.next;
                } else {                                 // Swap the adjacent elements
                    if (prev == null) {                   
                        LinkedListNode<Integer> fwd = current.next;
                        head = head.next;
                        current.next = fwd.next;
                        fwd.next = current;
                        prev = fwd;
                    } else {
                        LinkedListNode<Integer> fwd = current.next;
                        prev.next = fwd;
                        current.next = fwd.next;
                        fwd.next = current;
                        prev = fwd;
                    }
                }
            }
        }
        return head;
	}
    public static int listLength(LinkedListNode<Integer> head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

}
