package skillTest3;

public class DivideLinkedlistInto2 {

	public static void make2List(ListNode<Integer> head) {
		alternatingSplit(head);

	}
	
	public static void alternatingSplit(ListNode<Integer> source)
    {
        // Split the nodes into `a` and `b` lists
		ListNode<Integer> a = null;
		ListNode<Integer> b = null;
		ListNode<Integer> current = source;
 
        while (current != null)
        {
            // Move a node to `a`
 
        	ListNode<Integer> newNode = current;         // the front source node
            current = current.next;         // advance the source
 
            newNode.next = a;               // link the old dest off the new node
            a = newNode;                    // move dest to point to the new node
 
            if (current != null)
            {
                // Move a node to `b`
 
                newNode = current;          // the front source node
                current = current.next;     // advance the source
 
                newNode.next = b;           // link the old dest off the new node
                b = newNode;                // move dest to point to the new node
            }
        }
        printReverse(a);
        System.out.println();
        printReverse(b);
        
    }
	static void printReverse(ListNode<Integer> head)
    {
        if (head == null) return;
 
     // After everything else is printed
        System.out.print(head.data+" ");
        // print list of head node
        printReverse(head.next);
 
        
    }
}

class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}
