package bBinaryTrees;

public class rConstructTreeFromPreOrderInOrder {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length -1);
		return root;
	}
	
	// Pre-order start index (psi)
	// Pre-order end index (pei)
	// Inorder start index (isi)
	// Inorder end index (iei)
	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int psi, int pei, int isi, int iei) {
		
        if ( psi  > pei || isi > iei) {
			return null;
		}
        
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[psi]);
		
        int rootIndex = 0;
		for (int i = isi ; i <= iei ; i++) {    // From start until we find that element
			if (inOrder[i] == preOrder[psi]){
				rootIndex = i;
                break;
            }
		}
        // length = rootIndex - isi
		root.left = buildTree(preOrder, inOrder, psi +1, psi + rootIndex - isi , isi , rootIndex -1);
		root.right = buildTree(preOrder, inOrder, psi + rootIndex - isi + 1, pei , rootIndex +1 , iei);
		
		return root;
	}
	
}
