package bBinaryTrees;

public class sConstructTreeFromPostOrderInOrder {

	 private static BinaryTreeNode<Integer> buildTreeHelper( int[] postOrder, int postOrderStart, int postOrderEnd,  int[] inOrder, int inOrderStart, int inOrderEnd) {
	        
         if (postOrderStart > postOrderEnd || inOrderStart > inOrderEnd) {
             return null;
         } 

        int rootValue = postOrder[postOrderEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootValue);

//        Find root element index from inOrder[]
        int k = 0;
        for (int i = inOrderStart; i <= inOrderEnd; i++) {
         
            if (rootValue == inOrder[i]) {
                k = i;
                break;
            }
        }
         
//        Recursion: Handling later on
        root.left = buildTreeHelper(postOrder, postOrderStart, (postOrderStart + k - inOrderStart) - 1, inOrder, inOrderStart, k - 1);
        root.right = buildTreeHelper(postOrder, postOrderStart + k - inOrderStart, postOrderEnd - 1, inOrder, k + 1, inOrderEnd);

        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        return buildTreeHelper(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

}
