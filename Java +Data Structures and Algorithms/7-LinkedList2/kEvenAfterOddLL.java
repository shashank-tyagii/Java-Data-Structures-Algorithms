// For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
package hLinkedList2;

public class kEvenAfterOddLL {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		
		   if (head == null || head.next == null){
	            return head;
	        }
			LinkedListNode<Integer> oddH = null;
			LinkedListNode<Integer> oddT = null;
			LinkedListNode<Integer> evenH = null;
			LinkedListNode<Integer> evenT = null;
			
			LinkedListNode<Integer> temp = head;
			
			while (temp != null) {
				
				if (temp.data %2 !=0) {     // Number is odd				
					if (oddH == null) {     // odd list is empty
						oddH = temp;
						oddT = temp;
					} else {
						oddT.next = temp;
						oddT= oddT.next;
					}		
				} else {                    // Number is even
					
					if (evenH == null) {    // Even list is empty
						evenH= temp;
						evenT= temp;
					} else {
						evenT.next = temp;
						evenT = evenT.next;
					}	
				}
				temp = temp.next;
			}
	        
			 if (oddH == null) {
	            return evenH;
	        } else {
	            oddT.next = evenH;
	        }

	        if (evenH != null) {
	            evenT.next = null;
	        }
	        return oddH;

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
