package fLinkedList;

public class dPrintIthNode {


	public static void printIthNode(Node<Integer> head, int i){

		if (head == null ) {
			return;
		}
		Node<Integer> temp = head;
		for (int j =0; j <i; j++) {
            if (temp == null){              // i is greater than the LinkedList Size
                return;
            }
			temp= temp.next;
		}
		System.out.println(temp.data);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
