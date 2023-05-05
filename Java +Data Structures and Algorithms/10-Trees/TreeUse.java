package kTrees;
import java.util.Scanner;
public class TreeUse {

	// Code for taking an Input Recursively
	public static TreeNode<Integer> takeInput(Scanner scn){  // so that if we give all input in one line, we use the same scanner
		// Scanner scn = new Scanner(System.in);
		System.out.println("Enter the node data");
		int data = scn.nextInt();
		
		TreeNode<Integer> root = new TreeNode<Integer>(data);  // Created root node
	
		System.out.println("Enter the number of children for : " + data);
		int n = scn.nextInt();
		
		for (int i =0; i <n; i++) {
			TreeNode<Integer> child = takeInput(scn);            // Every child is itself a tree
			root.children.add(child);
		}
		return root;
	}
	
	// Code for printing a tree Recursively
	
	public static void print(TreeNode<Integer> root) {
		String str = root.data + " : ";
		
		for (int i =0; i <root.children.size(); i++) {
			str = str + root.children.get(i).data + ",";
		}
		System.out.println(str);
		
		for (int i =0 ; i <root.children.size(); i++) {
			print(root.children.get(i));                  // Recursive call for all child
		}
	}
	
	public static void main(String[] args) {
		
//		TreeNode<Integer> root = new TreeNode<Integer>(1);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(4);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(5);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
		Scanner scn = new Scanner(System.in);
		TreeNode<Integer> root = takeInput(scn);
		print(root);

	}

}
