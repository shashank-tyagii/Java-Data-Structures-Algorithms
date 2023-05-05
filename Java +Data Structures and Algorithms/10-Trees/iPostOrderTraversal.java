package kTrees;

public class iPostOrderTraversal {

	public static void printPostOrder(TreeNode<Integer> root){
		if(root == null) {
			return;
		}
		
		for (int i =0; i <root.children.size(); i++) {
			printPostOrder(root.children.get(i));
		}
		
		System.out.println(root.data +" ");
}
}
