package fLinkedList;
import java.util.Stack;

public class mPalindromeLL {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		 LinkedListNode<Integer> currentNode = head;
       boolean isPalindrome = true;
       Stack<Integer> stack = new Stack<>();

//       Traverse the given list from head to tail and push every visited node to stack.
       while (currentNode != null) {
           stack.push((Integer) currentNode.data);
           currentNode = currentNode.next;
       }
//       Traverse the list again. For every visited node, pop a node from the stack and compare data of popped node with the currently visited node.
//       If all nodes matched, then return true, else false.
       while (head != null) {
           int poppedNode = stack.pop();
           if (head.data == poppedNode) {
               isPalindrome = true;
           } else {
               isPalindrome = false;
               break;
           }
           head = head.next;
       }
       return isPalindrome;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
